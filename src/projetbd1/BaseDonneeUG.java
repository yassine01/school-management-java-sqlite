package projetbd1;

import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class BaseDonneeUG {
    

    public static void metDansJTable(String requete,JTable jTable, int ligne, int colonne){
        Connection c = null;
        Statement stmt = null;
        try {
            c = DriverManager.getConnection("jdbc:sqlite:UnivGestion.db");
            c.setAutoCommit(false);
            stmt = c.createStatement();
      	    ResultSet rs = stmt.executeQuery( requete );
      	    ResultSetMetaData metadonnee = rs.getMetaData();

      	    Object[] nomColonne = new Object[colonne];
            for (int j = 1; j <= colonne; j++) {
                nomColonne[j-1] = metadonnee.getColumnName(j);
            }

      	    Object[][] donnee = new Object[ligne][colonne];
            int i =0;
      	    while (rs.next() && i<ligne){
                Object[] l_enCours = new Object[colonne];
                for (int j=1; j<=colonne; j++){
                    l_enCours[j-1] = rs.getObject(j);
                }
                donnee[i]= l_enCours;
                i++;
      	    }
      	    DefaultTableModel tm = new DefaultTableModel(donnee, nomColonne){
                @Override
                public boolean isCellEditable(int row,int col){
                    return false;
                }
            };
            jTable.setModel(tm);
          
            c.close();
        } catch ( SQLException e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }  
    
    public static void metDansJTablePlanning(JTable jTable, int numEtu,int ligne, int colonne){
        metDansJTablePlanningEleve(jTable, numEtu,ligne, colonne,"2018-01-01");
    }

    
    public static void metDansJTablePlanningEleve(JTable jTable, int numEtu,int ligne, int colonne,String date){
        Connection c = null;
        
        try {
            c = DriverManager.getConnection("jdbc:sqlite:UnivGestion.db");
            c.setAutoCommit(false);
            
            String[] nomColonne = {"Date","8h - 10h","10h - 12h","14h - 16h","16h - 18h"};

            Object[][] donnee = new Object[ligne][colonne];
            int i =0;
               
            String requete = "select distinct dateSeance from Seance natural join Avoir where idGroupe = (select idGroupe from Eleve where numEtu ="+numEtu+") and dateSeance >='"+date+"' order by dateSeance;";
            ResultSet rs = c.createStatement().executeQuery(requete);
            while (rs.next() && i<ligne){
                donnee[i][0] = rs.getObject(1);
                i++;
            }
            for (int j=0;j<i;j++) {
                String requete0 = "select nomMatiere,idSalle,nomProf,sexeProf from Professeur natural join Matiere natural join Seance natural join Avoir where idGroupe = (select idGroupe from Eleve where numEtu ="+numEtu+") and dateSeance = '" + donnee[j][0] + "' and debutSeance = 8;";
                String requete1 = "select nomMatiere,idSalle,nomProf,sexeProf from Professeur natural join Matiere natural join Seance natural join Avoir where idGroupe = (select idGroupe from Eleve where numEtu ="+numEtu+") and dateSeance = '" + donnee[j][0] + "' and debutSeance = 10;";
                String requete2 = "select nomMatiere,idSalle,nomProf,sexeProf from Professeur natural join Matiere natural join Seance natural join Avoir where idGroupe = (select idGroupe from Eleve where numEtu ="+numEtu+") and dateSeance = '" + donnee[j][0] + "' and debutSeance = 14;";
                String requete3 = "select nomMatiere,idSalle,nomProf,sexeProf from Professeur natural join Matiere natural join Seance natural join Avoir where idGroupe = (select idGroupe from Eleve where numEtu ="+numEtu+") and dateSeance = '" + donnee[j][0] + "' and debutSeance = 16;";
                ResultSet rs0 = c.createStatement().executeQuery(requete0);
                String deter;
                if (rs0.next()){
                    if (rs0.getObject(4).toString().equals("f")){
                        deter = " Mme. ";
                    } else {
                        deter = " Mr. ";
                    }
                    donnee[j][1] = rs0.getObject(1).toString() +" "+ rs0.getObject(2).toString()+deter+ rs0.getObject(3).toString();
                } else {
                    donnee[j][1] = "Rien";
                }
                
                ResultSet rs1 = c.createStatement().executeQuery(requete1);
                if (rs1.next()){
                    if (rs1.getObject(4).toString().equals("f")){
                        deter = " Mme. ";
                    } else {
                        deter = " Mr. ";
                    }
                    donnee[j][2] = rs1.getObject(1).toString() +" "+ rs1.getObject(2).toString()+deter+ rs1.getObject(3).toString();
                } else {
                    donnee[j][2] = "Rien";
                }
                
                ResultSet rs2 = c.createStatement().executeQuery(requete2);
                
                if (rs2.next()){
                    if (rs2.getObject(4).toString().equals("f")){
                        deter = " Mme. ";
                    } else {
                        deter = " Mr. ";
                    }
                    donnee[j][3] = rs2.getObject(1).toString() +" "+ rs2.getObject(2).toString()+deter+ rs2.getObject(3).toString();
                } else {
                    donnee[j][3] = "Rien";
                }
                
                ResultSet rs3 = c.createStatement().executeQuery(requete3);
                
                if (rs3.next()){
                    if (rs3.getObject(4).toString().equals("f")){
                        deter = " Mme. ";
                    } else {
                        deter = " Mr. ";
                    }
                    donnee[j][4] = rs3.getObject(1).toString() +" "+ rs3.getObject(2).toString()+deter+ rs3.getObject(3).toString();
                } else {
                    donnee[j][4] = "Rien";
                }
            }
            
            DefaultTableModel tm = new DefaultTableModel(donnee, nomColonne){
                @Override
                public boolean isCellEditable(int row,int col){
                    return false;
                }
            };
            jTable.setModel(tm);
            
            c.close();
        } catch ( SQLException e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }  

    public static void metDansJTablePlanningProf(JTable jTable, int numProf,int ligne, int colonne,String date){
        Connection c = null;   
        try {
            c = DriverManager.getConnection("jdbc:sqlite:UnivGestion.db");
            c.setAutoCommit(false);
            
            String[] nomColonne = {"Date","8h - 10h","10h - 12h","14h - 16h","16h - 18h"};

            Object[][] donnee = new Object[ligne][colonne];
            int i =0;
               
            String requete = "select distinct dateSeance from Seance natural join Matiere where numProf = "+numProf+" and dateSeance >='"+date+"' order by dateSeance;";
            ResultSet rs = c.createStatement().executeQuery(requete);
            while (rs.next() && i<ligne){
                donnee[i][0] = rs.getObject(1);
                i++;
            }
            for (int j=0;j<i;j++) {
                String requete0 = "select nomMatiere,idSalle, nomGroupe from Professeur natural join Matiere natural join Seance natural join Avoir natural join Groupe where numProf ="+numProf+" and dateSeance = '" + donnee[j][0] + "' and debutSeance = 8;";
                String requete1 = "select nomMatiere,idSalle, nomGroupe from Professeur natural join Matiere natural join Seance natural join Avoir natural join Groupe where numProf ="+numProf+" and dateSeance = '" + donnee[j][0] + "' and debutSeance = 10;";
                String requete2 = "select nomMatiere,idSalle, nomGroupe from Professeur natural join Matiere natural join Seance natural join Avoir natural join Groupe where numProf ="+numProf+" and dateSeance = '" + donnee[j][0] + "' and debutSeance = 14;";
                String requete3 = "select nomMatiere,idSalle, nomGroupe from Professeur natural join Matiere natural join Seance natural join Avoir natural join Groupe where numProf ="+numProf+" and dateSeance = '" + donnee[j][0] + "' and debutSeance = 16;";
                ResultSet rs0 = c.createStatement().executeQuery(requete0);
                if (rs0.next()){
                    donnee[j][1] = rs0.getObject(1).toString() +" "+ rs0.getObject(2).toString()+" ("+ rs0.getObject(3).toString();
                    while(rs0.next()){
                        donnee[j][1] += " + " + rs0.getObject(3).toString();
                    }
                    donnee[j][1] += ")";
                } else {
                    donnee[j][1] = "Rien";
                }
                
                ResultSet rs1 = c.createStatement().executeQuery(requete1);
                if (rs1.next()){
                    donnee[j][2] = rs1.getObject(1).toString() +" "+ rs1.getObject(2).toString()+" ("+ rs1.getObject(3).toString();
                    while(rs1.next()){
                        donnee[j][2] += " + " + rs1.getObject(3).toString();
                    }
                    donnee[j][2] += ")";
                } else {
                    donnee[j][2] = "Rien";
                }
                
                ResultSet rs2 = c.createStatement().executeQuery(requete2);
                
                if (rs2.next()){
                    donnee[j][3] = rs2.getObject(1).toString() +" "+ rs2.getObject(2).toString()+" ("+ rs2.getObject(3).toString();
                    while(rs2.next()){
                        donnee[j][3] += " + " + rs2.getObject(3).toString();
                    }
                    donnee[j][3] += ")";
                } else {
                    donnee[j][3] = "Rien";
                }
                
                ResultSet rs3 = c.createStatement().executeQuery(requete3);
                
                if (rs3.next()){
                    donnee[j][4] = rs3.getObject(1).toString() +" "+ rs3.getObject(2).toString()+" ("+ rs3.getObject(3).toString();
                    while(rs3.next()){
                        donnee[j][4] += " + " + rs3.getObject(3).toString();
                    }
                    donnee[j][4] += ")";
                } else {
                    donnee[j][4] = "Rien";
                }
            }
            
            DefaultTableModel tm = new DefaultTableModel(donnee, nomColonne){
                @Override
                public boolean isCellEditable(int row,int col){
                    return false;
                }
            };
            jTable.setModel(tm);
           
            c.close();

        } catch ( SQLException e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }
    
    public static void metDansJLabel(String requete, JLabel label){
        Connection c = null;
        Statement stmt = null;
        try {
            c = DriverManager.getConnection("jdbc:sqlite:UnivGestion.db");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            String textLbl;
            
      	    ResultSet rs = stmt.executeQuery( requete );
            
            while (rs.next()){
                label.setText(rs.getObject(1).toString());
            }
            c.close();
        } catch ( SQLException e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        } catch ( NullPointerException e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
        
    }
    
    public static void metDansJText(String requete, JTextArea label,int colonne){
        Connection c = null;
        Statement stmt = null;
        try {
            c = DriverManager.getConnection("jdbc:sqlite:UnivGestion.db");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            String textLbl;
            
      	    ResultSet rs = stmt.executeQuery( requete );
           
            label.setText(label.getText()+rs.getObject(1).toString()+"\n");
            c.close();
        } catch ( SQLException e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }

    public static void metDansComboBox(String requete,JComboBox jCB) {
        Connection c = null;
        Statement stmt = null;
        try {
            c = DriverManager.getConnection("jdbc:sqlite:UnivGestion.db");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            String textLbl;
            
      	    ResultSet rs = stmt.executeQuery( requete );
            jCB.removeAllItems();
            while(rs.next()){
                
                jCB.addItem(rs.getString(1));
            }
            c.close();
        } catch ( SQLException e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }

    static int[] cherche(String usr) {
        Connection c = null;
        Statement stmt = null;
        try {
            c = DriverManager.getConnection("jdbc:sqlite:UnivGestion.db");
            c.setAutoCommit(false);
            usr = metEnMaj(usr);
            stmt = c.createStatement();
            String requete = "select numEtu from Eleve where userEtu ='"+usr+"';";
      	    ResultSet rs = stmt.executeQuery( requete );
           
            if (rs.next()){
                int[] res = {1,rs.getInt(1)};
                c.close();
                return res;
            }
            requete = "select numProf from Professeur where userProf ='"+usr+"';";
            rs = stmt.executeQuery( requete );
            if (rs.next()){
                int[] res = {2,rs.getInt(1)};
                c.close();
                return res;
            } 
            requete = "select numPerso from Personnel where userPerso ='"+usr+"';";
            rs = stmt.executeQuery( requete );
            if (rs.next()){
                int[] res = {3,rs.getInt(1)};
                c.close();
                return res;
            }
            c.close();
        } catch ( SQLException e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        return new int[2];
    }

    private static String metEnMaj(String usr) {
        String[] username = usr.split("_");
        if (username.length == 2){
            char[] nom = username[0].toCharArray();
            char[] prenom = username[1].toCharArray();
            nom[0] = Character.toUpperCase(nom[0]);
            prenom[0] = Character.toUpperCase(prenom[0]);
            username[0] = new String(nom);
            username[1] = new String(prenom);
            usr = username[0]+"_"+username[1];
        }
        return usr;
    }

    public static boolean verifieEleve(int num,String pwd) {
        Connection c = null;
        Statement stmt = null;
        try {
            c = DriverManager.getConnection("jdbc:sqlite:UnivGestion.db");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            String requete = "select mdpEtu from Eleve where numEtu ='"+num+"';";
      	    ResultSet rs = stmt.executeQuery( requete );
           
            if (rs.getString(1).equals(pwd)){
                c.close();
                return true;
            }
            c.close();
        } catch ( SQLException e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        return false;
    }
    
    public static boolean verifieProf(int num,String pwd) {
        Connection c = null;
        Statement stmt = null;
        try {
            c = DriverManager.getConnection("jdbc:sqlite:UnivGestion.db");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            String requete = "select mdpProf from Professeur where numProf ='"+num+"';";
      	    ResultSet rs = stmt.executeQuery( requete );
           
            if (rs.getString(1).equals(pwd)){
                c.close();
                return true;
            }
            c.close();
        } catch ( SQLException e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        return false;
    }
    
    public static boolean verifiePersonnel(int num,String pwd) {
        Connection c = null;
        Statement stmt = null;
        try {
            c = DriverManager.getConnection("jdbc:sqlite:UnivGestion.db");
            c.setAutoCommit(false);
            stmt = c.createStatement();
            String requete = "select mdpPerso from Personnel where numPerso ='"+num+"';";
      	    ResultSet rs = stmt.executeQuery( requete );
           
            if (rs.getString(1).equals(pwd)){
                c.close();
                return true;
            }
            c.close();
        } catch ( SQLException e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        return false;
    }

    public static int recupere(String requete) {
        Connection c = null;
        Statement stmt = null;
        try {
            c = DriverManager.getConnection("jdbc:sqlite:UnivGestion.db");
            c.setAutoCommit(false);
            stmt = c.createStatement();
      	    ResultSet rs = stmt.executeQuery( requete );
            int res = rs.getInt(1);
            c.close();
            return res;
        } catch ( SQLException e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        return -1;
    }

    public static void executeDansDB(String requete) throws SQLException {
        Connection c = null;
        Statement stmt = null;
        
        c = DriverManager.getConnection("jdbc:sqlite:UnivGestion.db");
        c.setAutoCommit(false);
        stmt = c.createStatement();
        stmt.executeUpdate(requete);
        stmt.close();
        c.commit();
        c.close();
        
    }

    

    static String recupereMDP(int numero, int type) {
        Connection c = null;
        Statement stmt = null;
        try {
            switch (type) {
                case 0:
                {
                    c = DriverManager.getConnection("jdbc:sqlite:UnivGestion.db");
                    c.setAutoCommit(false);
                    stmt = c.createStatement();
                    ResultSet rs = stmt.executeQuery("select strftime('%Y',dateNaisEtu)||strftime('%Y',dateNaisEtu) from Eleve where numEtu ="+numero+";");
                    String res = rs.getString(1);
                    c.close();
                    return res;
                }
                case 1:
                {
                    c = DriverManager.getConnection("jdbc:sqlite:UnivGestion.db");
                    c.setAutoCommit(false);
                    stmt = c.createStatement();
                    ResultSet rs = stmt.executeQuery("select strftime('%Y',dateNaisProf)||strftime('%Y',dateNaisProf) from Professeur where numProf ="+numero+";");
                    String res = rs.getString(1);
                    c.close();
                    return res;
                }
                default:
                {
                    c = DriverManager.getConnection("jdbc:sqlite:UnivGestion.db");
                    c.setAutoCommit(false);
                    stmt = c.createStatement();
                    ResultSet rs = stmt.executeQuery("select strftime('%Y',dateNaisPerso)||strftime('%Y',dateNaisPerso) from Personnel where numPerso ="+numero+";");
                    String res = rs.getString(1);
                    c.close();
                    return res;
                }
            }
        } catch ( SQLException e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        
        return "";
    }
    
}
