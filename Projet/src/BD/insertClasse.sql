insert into Eleve 
values 
(4,"Martin","Lucas","h","1998-04-01",null,null,null,0,0),
(1,"Richard","Jade","f","1996-07-21",null,null,null,1,0),
(2,"Durand","Julien","h","1997-05-10",null,null,null,2,1),
(3,"Dubois","Manon","f","1998-03-20",null,null,null,3,1),
(0,"Etudiant","Etudiant","h","2000-01-01",null,null,null,0,0);


insert into Classe
values
(0,"Licence Informatique",2,1,0),
(1,"Licence Informatique",2,2,0),
(2,"Licence Informatique",2,3,0),
(3,"Licence Physique",2,1,1),
(4,"Licence Physique",2,2,1),
(5,"Licence Physique",2,3,1);

insert into Professeur 
values 
(0,"Legrand","Marc","h","1977-03-02",null,null,null),
(1,"Lefebvre","Michel","h","1977-03-02",null,null,null),
(2,"Leroy","Paul","h","1977-03-02",null,null,null),
(3,"Leroux","Thierry","h","1977-03-02",null,null,null),
(4,"Morel","Samuel","h","1977-03-02",null,null,null),
(5,"Fournier","Jean-Louis","h","1977-03-02",null,null,null);

insert into Groupe
values 
(0, "LI1-1",0),
(1, "LI1-2",0),
(2, "LI2-1",1),
(3, "LI2-2",1);


insert into Enseigner
values 
(0,"Algo1"),
(1,"Algo1"),
(0,"Math1"),
(1,"Math1"),
(0,"Bio1"),
(1,"Phy1"),
(0,"BD1"),
(1,"BD1"),
(2,"Algo2"),
(3,"Algo2");

insert into Controle
values 
(0,"Examen Session 1", "Algo1", "A12","2018-04-02","8:15","10:15"),
(1,"Examen Session 2", "Algo1", "A24","2018-05-12","8:30","11:30"),
(2,"Examen Session 1", "Math1", "B05","2018-04-14","9:00","12:00"),
(3,"Examen Session 2", "Math1", "B07","2018-05-11","14:00","16:00"),
(4,"Controle Continu", "Bio1", "C07","2018-05-07","14:15","17:15"),
(5,"Controle Continu", "Phy1", "A12","2018-04-20","8:00","10:00"),
(6,"Examen Session 1", "BD1", "B14","2018-06-25","8:15","10:15"),
(7,"Examen Session 2", "BD1", "C24","2018-06-04","9:00","11:30"),
(8,"Examen Session 1", "Algo2", "A12","2018-06-25","8:15","10:15"),
(9,"Examen Session 2", "Algo2", "A12","2018-06-04","9:00","11:30");

insert into Note
values 
(0,0,15),
(1,0,8),
(2,0,13),
(0,1,5),
(1,1,4),
(2,1,10),
(8,2,18),
(9,2,19),
(8,3,11),
(9,3,13);

insert into Passer
values 
(0,0),
(0,1),
(1,0),
(1,1),
(2,0),
(2,1),
(3,0),
(3,1),
(4,0),
(5,1),
(6,0),
(6,1),
(7,0),
(7,1),
(8,2),
(8,3),
(9,2),
(9,3);

insert into Salle
values 
("A12",100),
("A24",70),
("B05",30),
("B07",60),
("C07",50),
("C24",25),
("B14",120);

insert into Seance
values 
(0,"2018-04-08",8,"A12","Algo1"),
(1,"2018-04-08",10,"A12","Math1"),
(2,"2018-04-08",14,"A12","Bio1"),
(3,"2018-04-08",16,"A12","BD1"),
(4,"2018-04-08",8,"B14","Math1"),
(5,"2018-04-08",10,"A24","Algo1"),
(6,"2018-04-08",14,"C24","Phy1"),
(7,"2018-04-09",8,"B05","Math1"),
(8,"2018-04-09",10,"B05","BD1"),
(9,"2018-04-09",14,"B05","BD1"),
(10,"2018-04-08",14,"B14","Algo2");

insert into Matiere
values 
("Algo1", 0),
("BD1", 1),
("Phy1", 2),
("Bio1", 3),
("Math1", 4),
("Algo2", 0);

insert into Avoir
values 
(0,0),
(0,1),
(0,2),
(0,3),
(1,4),
(1,5),
(1,6),
(0,7),
(1,7),
(0,8),
(1,8),
(0,9),
(1,9),
(2,10),
(3,10);

insert into Materiel
values
("Retroprojecteur",6),
("Marqueur",40),
("Ordinateur",5);

insert into Reserver
values 
(0,"Retroprojecteur",1,"2018-04-10",1),
(1,"Marqueur",1,"2018-04-09",4);

insert into Personnel
values
(0,"Verand","Monique","f","1977-10-20",null,null),
(1,"Francat","Serge","h","1980-07-01",null,null);
