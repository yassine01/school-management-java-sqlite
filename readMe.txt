/*
Auteur  : Yassine MJARDI
Projet  : UNIVGESTION
LANGAGE : JAVA
BD      : sqlite3
*/


Compilation : java -jar UNIVGESTION.jar

Instructions concernant le programme :

Notre projet contient un systeme de connexion, il faut donc un nom de compte et un mot de passe afin de se connecter.

Voici des usernames/passwords afin d'acceder au differentes pages :) 

* Page etudiante : 
	username : etudiant_etudiant password: etudiant 
	username : jade_richard	password : 19961996     (pour tester la fonctionnalit� qui permet de changer le mdp)
  
* Page professeur : 
	username : marc_legrand 
  password: professeur
  
* Page personnel : 
	username : monique_verand password: personnel

le username du compte initial de chaque nouvelle personne cr�e est prenom_nom
le mot de passe initial de chaque nouvelle personne cr�e est l'ann�e de naissance x2

 (g�n�r�s automatiquement par des triggers. IDEM  pour l'email )
 
Exemple :
nom = Naji prenom = Ali date de naissance = 1995-04-07
alors username = Ali_Naji et password = 19951995

Les fichiers .java se trouve dans ./src/projetBD1
Les fichiers .sql ayant permis de creer un d�but de donn�e se trouve dans ./src/BD/