.mode column 

.headers on

create table Eleve (
	numEtu integer primary key,
	nomEtu String,
	prenomEtu String,
	sexeEtu String check(sexeEtu in ('f','h')),
	dateNaisEtu String,
	mailEtu String,
	userEtu String,
	mdpEtu String,
	idGroupe integer references Groupe(idGroupe),
	idClasse integer references Classe(idClasse)
);

create table Classe (
	idClasse integer primary key,
	nomClasse String,
	nbGroupe integer,
	anneeClasse integer,
	numPerso integer references Personnel(numPerso)
);

create table Professeur (
	numProf integer primary key,
	nomProf String,
	prenomProf String,
	sexeProf String check(sexeProf in ('f','h')),
	dateNaisProf String,
	userProf String,
	mdpProf String,
	mailProf String
);

create table Groupe (
	idGroupe integer primary key,
	nomGroupe String,
	idClasse int references Classe(idClasse) on delete cascade
);

create table Enseigner (
	idGroupe integer references Groupe(idGroupe) on delete cascade,
	nomMatiere integer references Matiere(nomMatiere) on delete cascade,
	primary key(idGroupe, nomMatiere)
);

create table Controle (
	idControle integer primary key,
	intitule String,
	nomMatiere integer references Matiere(nomMatiere) on delete cascade,
	idSalle String references Salle(idSalle),
	dateControle String,
	heureDebutCont String,
	heureFinCont String
);

create table Note (
	idControle integer references Controle(idControle),
	numEtu integer references Eleve(numEtu),
	note real check(note<=20 and note >= 0),
	primary key(idControle, numEtu)
);

create table Passer (
	idControle integer references Controle(idControle),
	idGroupe integer references Groupe(idGroupe),
	primary key (idControle,idGroupe)
);

create table Salle (
	idSalle String primary key,
	capacite String
);

create table Seance (
	idSeance integer primary key,
	dateSeance String,
	debutSeance integer check (debutSeance in (8,10,14,16)),
	idSalle integer references Salle(idSalle),
	nomMatiere integer references Matiere(nomMatiere)
);

create table Matiere (
	nomMatiere String primary key,
	numProf integer references Professeur(numProf) on delete cascade
);

create table Avoir (
	idGroupe integer references Groupe(idGroupe) on delete cascade,
	idSeance integer references Seance(idSeance) on delete cascade,
	primary key(idGroupe, idSeance)
);

create table Materiel (
	nomMateriel String primary key,
	quantite integer
);

create table Reserver (
	idReservation integer primary key,
	nomMateriel String references Materiel(nomMateriel),
	numProf integer references Professeur(numProf),
	dateReservation String,
	quantReser integer
);

create table Personnel (
	numPerso integer primary key,
	nomPerso String,
	prenomPerso String,
	sexePerso String check(sexePerso in ('f','h')),
	dateNaisPerso String,
	userPerso String,
	mdpPerso String
);

create trigger creeMailEleve
after insert on Eleve
begin
    update Eleve set mailEtu = new.prenomEtu||"_"||new.nomEtu||"@etudiant.fr" where numEtu = new.numEtu;
end;

create trigger creeMailProf
after insert on Professeur
begin
    update Professeur set mailProf = new.prenomProf||"_"||new.nomProf||"@professeur.fr" where numProf = new.numProf;
end;

create trigger creeCompteEleve
after insert on Eleve
begin
	update Eleve set userEtu = new.prenomEtu||"_"||new.nomEtu where numEtu = new.numEtu;
	update Eleve set mdpEtu = strftime('%Y',new.dateNaisEtu)||strftime('%Y',new.dateNaisEtu) where numEtu = new.numEtu;
end;

create trigger creeCompteProfesseur
after insert on Professeur
begin
	update Professeur set userProf = new.prenomProf||"_"||new.nomProf where numProf = new.numProf;
	update Professeur set mdpProf = strftime('%Y',new.dateNaisProf)||strftime('%Y',new.dateNaisProf) where numProf = new.numProf;
end;

create trigger creeComptePerso
after insert on Personnel
begin
	update Personnel set userPerso = new.prenomPerso||"_"||new.nomPerso where numPerso = new.numPerso;
	update Personnel set mdpPerso = strftime('%Y',new.dateNaisPerso)||strftime('%Y',new.dateNaisPerso) where numPerso = new.numPerso;
end;

create trigger enleveQuantite
after insert on Reserver
begin 
	delete from Reserver where idReservation = new.idReservation and (select quantite from Materiel where nomMateriel = new.nomMateriel) < new.quantReser;
	update Materiel set quantite = quantite - new.quantReser where nomMateriel = new.nomMateriel;	
end;

create trigger ajouteQuantite
before delete on Reserver
begin 
	update Materiel set quantite = quantite + old.quantReser where nomMateriel = old.nomMateriel;
end;

create trigger modifieQuantite
after update on Reserver
begin 
	update Reserver set quantReser = old.quantReser where idReservation = old.idReservation and (select quantite from Materiel where nomMateriel = new.nomMateriel) < (new.quantReser-old.quantReser);
	update Materiel set quantite = quantite - (new.quantReser-old.quantReser) where nomMateriel = new.nomMateriel and quantite >= (new.quantReser-old.quantReser);
end;	

create trigger supprimeQuantite
after update on Reserver
when new.quantReser = 0
begin 
	delete from Reserver where idReservation = old.idReservation;
end;

create trigger tropDeGroupe
after insert on Groupe
begin
	delete from Groupe where idGroupe = new.idGroupe and (select nbGroupe from Classe natural join Groupe where idGroupe = new.idGroupe) < (select count(idGroupe) from Groupe group by idClasse having idClasse in (select distinct idClasse from Groupe natural join Classe where idGroupe =new.idGroupe));
end;