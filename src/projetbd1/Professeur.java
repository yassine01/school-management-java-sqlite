//Package
package projetbd1;

//Import
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.Timer;


/*
Projet BD1 par Pouilly Christopher et Mjardi Yassine
*/

public class Professeur extends javax.swing.JFrame {
    /*
    Cette classe définit la page personnel d'un professeur
    */
    
    //Paramètre contenant le numProf associé au Professeur
    private final int numProf;
    
    public Professeur(int num) {
        /*
        Constructeur de Professeur, il prend l'identifiant (sous forme int) du Professeur qui s'est connecté
        */
        initComponents();   
        numProf = num;
        afficheAccueilPlanning();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        dateChooserDialog2 = new datechooser.beans.DateChooserDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        accueil = new javax.swing.JLabel();
        notes = new javax.swing.JLabel();
        planning = new javax.swing.JLabel();
        materiel = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        mainPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        accueilPane = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        accueilTab = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        notesPane = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        notesCBControle = new javax.swing.JComboBox<>();
        notesCBGroupe = new javax.swing.JComboBox<>();
        notesCBEleve = new javax.swing.JComboBox<>();
        notesTF = new javax.swing.JTextField();
        notesAjouter = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        notesTab = new javax.swing.JTable();
        notesTFRecherche = new javax.swing.JTextField();
        notesSupprimer = new javax.swing.JButton();
        notesErreur = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        planningPane = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        planningTab = new javax.swing.JTable();
        jLabel39 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        materielPane = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        materielCB = new javax.swing.JComboBox<>();
        materielAjouter = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        materielTab = new javax.swing.JTable();
        materielSupprimerUnique = new javax.swing.JButton();
        materielSupprimer = new javax.swing.JButton();
        materielAjouterUnique = new javax.swing.JButton();
        materielJS = new javax.swing.JSpinner();
        materielDate = new datechooser.beans.DateChooserCombo();
        jPanel10 = new javax.swing.JPanel();
        contactPane = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        contactJTF = new javax.swing.JTextField();
        recherche = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        contactTabProf = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        contactTabEleve = new javax.swing.JTable();
        jPanel19 = new javax.swing.JPanel();
        contactJTF1 = new javax.swing.JTextField();
        recherche1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/profImages/logoM.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 207, 21)));

        accueil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/profImages/accueilClicked.png"))); // NOI18N
        accueil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 207, 21)));
        accueil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accueilMouseClicked(evt);
            }
        });

        notes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/profImages/gestionNotes.png"))); // NOI18N
        notes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 207, 21)));
        notes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notesMouseClicked(evt);
            }
        });

        planning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/profImages/gestionPlanning.png"))); // NOI18N
        planning.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 207, 21)));
        planning.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                planningMouseClicked(evt);
            }
        });

        materiel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/profImages/gestionMateriels.png"))); // NOI18N
        materiel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 207, 21)));
        materiel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                materielMouseClicked(evt);
            }
        });

        contact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/profImages/contact.png"))); // NOI18N
        contact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 207, 21)));
        contact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(accueil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notes)
                    .addComponent(planning)
                    .addComponent(materiel)
                    .addComponent(contact))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(accueil)
                .addGap(0, 0, 0)
                .addComponent(notes)
                .addGap(0, 0, 0)
                .addComponent(planning)
                .addGap(0, 0, 0)
                .addComponent(materiel)
                .addGap(0, 0, 0)
                .addComponent(contact)
                .addGap(0, 0, 0))
        );

        mainPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainPaneMouseClicked(evt);
            }
        });

        accueilPane.setBackground(new java.awt.Color(39, 26, 54));

        jPanel14.setBackground(new java.awt.Color(249, 207, 21));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/images/titre1.png"))); // NOI18N

        accueilTab.setBackground(new java.awt.Color(39, 26, 54));
        accueilTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 207, 21)));
        accueilTab.setForeground(new java.awt.Color(249, 207, 21));
        accueilTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Date", "8h - 10h", "10h - 12h", "14h - 16h", "16h - 18h"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        accueilTab.setGridColor(new java.awt.Color(249, 207, 21));
        jScrollPane6.setViewportView(accueilTab);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/images/welcome.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/images/logout2.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout accueilPaneLayout = new javax.swing.GroupLayout(accueilPane);
        accueilPane.setLayout(accueilPaneLayout);
        accueilPaneLayout.setHorizontalGroup(
            accueilPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(accueilPaneLayout.createSequentialGroup()
                .addGroup(accueilPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accueilPaneLayout.createSequentialGroup()
                        .addGroup(accueilPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(accueilPaneLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(accueilPaneLayout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(jLabel7))
                            .addGroup(accueilPaneLayout.createSequentialGroup()
                                .addGap(274, 274, 274)
                                .addComponent(jLabel38)))
                        .addGap(0, 55, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accueilPaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        accueilPaneLayout.setVerticalGroup(
            accueilPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accueilPaneLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(accueilPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(accueilPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPane.addTab("Accueil", jPanel2);

        notesPane.setBackground(new java.awt.Color(39, 26, 54));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/images/notes100px.png"))); // NOI18N

        jPanel15.setBackground(new java.awt.Color(249, 207, 21));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        notesCBControle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        notesCBControle.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                notesCBControleItemStateChanged(evt);
            }
        });

        notesCBGroupe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        notesCBGroupe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                notesCBGroupeItemStateChanged(evt);
            }
        });

        notesCBEleve.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        notesTF.setForeground(new java.awt.Color(204, 204, 255));
        notesTF.setText("Inserer une note");
        notesTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                notesTFFocusGained(evt);
            }
        });

        notesAjouter.setText("Ajouter");
        notesAjouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notesAjouterMouseClicked(evt);
            }
        });

        notesTab.setBackground(new java.awt.Color(39, 26, 54));
        notesTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        notesTab.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        notesTab.setForeground(new java.awt.Color(249, 207, 21));
        notesTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Identifiant", "Intitule", "Matiere", "Num. Etudiant", "Nom", "Prenom", "Note"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        notesTab.setGridColor(new java.awt.Color(249, 207, 21));
        jScrollPane4.setViewportView(notesTab);
        if (notesTab.getColumnModel().getColumnCount() > 0) {
            notesTab.getColumnModel().getColumn(1).setPreferredWidth(30);
            notesTab.getColumnModel().getColumn(4).setPreferredWidth(30);
            notesTab.getColumnModel().getColumn(7).setPreferredWidth(30);
        }

        notesTFRecherche.setForeground(new java.awt.Color(204, 204, 255));
        notesTFRecherche.setText("Ex : paul martin");
        notesTFRecherche.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                notesTFRechercheFocusGained(evt);
            }
        });
        notesTFRecherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                notesTFRechercheKeyReleased(evt);
            }
        });

        notesSupprimer.setText("Supprimer");
        notesSupprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notesSupprimerMouseClicked(evt);
            }
        });

        notesErreur.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        notesErreur.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout notesPaneLayout = new javax.swing.GroupLayout(notesPane);
        notesPane.setLayout(notesPaneLayout);
        notesPaneLayout.setHorizontalGroup(
            notesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, notesPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addGap(334, 334, 334))
            .addGroup(notesPaneLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(notesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notesErreur)
                    .addGroup(notesPaneLayout.createSequentialGroup()
                        .addComponent(notesCBControle, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(notesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(notesPaneLayout.createSequentialGroup()
                                .addComponent(notesCBGroupe, 0, 90, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(notesCBEleve, 0, 90, Short.MAX_VALUE))
                            .addComponent(notesTFRecherche))
                        .addGap(18, 18, 18)
                        .addComponent(notesTF, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(notesAjouter))
                    .addGroup(notesPaneLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(notesSupprimer)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        notesPaneLayout.setVerticalGroup(
            notesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notesPaneLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel30)
                .addGap(35, 35, 35)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(notesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notesCBControle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notesCBGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notesCBEleve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notesTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notesAjouter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(notesErreur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(notesTFRecherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(notesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(notesPaneLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, notesPaneLayout.createSequentialGroup()
                        .addComponent(notesSupprimer)
                        .addGap(169, 169, 169))))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(notesPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(notesPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPane.addTab("Gestion des Notes", jPanel4);

        planningPane.setBackground(new java.awt.Color(39, 26, 54));

        jLabel10.setForeground(new java.awt.Color(249, 207, 21));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/images/planningttle2.png"))); // NOI18N

        jPanel16.setBackground(new java.awt.Color(249, 207, 21));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 797, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        planningTab.setBackground(new java.awt.Color(39, 26, 54));
        planningTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 207, 21)));
        planningTab.setForeground(new java.awt.Color(249, 207, 21));
        planningTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Date", "8h - 10h", "10h - 12h", "14h - 16h", "16h - 18h"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        planningTab.setGridColor(new java.awt.Color(249, 207, 21));
        jScrollPane7.setViewportView(planningTab);

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/images/titre1.png"))); // NOI18N

        javax.swing.GroupLayout planningPaneLayout = new javax.swing.GroupLayout(planningPane);
        planningPane.setLayout(planningPaneLayout);
        planningPaneLayout.setHorizontalGroup(
            planningPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, planningPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addGap(292, 292, 292))
            .addGroup(planningPaneLayout.createSequentialGroup()
                .addGroup(planningPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(planningPaneLayout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel10))
                    .addGroup(planningPaneLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        planningPaneLayout.setVerticalGroup(
            planningPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planningPaneLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel39)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(planningPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(planningPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPane.addTab("Gestion du Planning", jPanel6);

        materielPane.setBackground(new java.awt.Color(39, 26, 54));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/profImages/gestionMaterielsTitre.png"))); // NOI18N

        jPanel17.setBackground(new java.awt.Color(249, 207, 21));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        materielCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        materielCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                materielCBItemStateChanged(evt);
            }
        });

        materielAjouter.setText("Ajouter");
        materielAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materielAjouterActionPerformed(evt);
            }
        });

        materielTab.setBackground(new java.awt.Color(39, 26, 54));
        materielTab.setForeground(new java.awt.Color(249, 207, 21));
        materielTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Date", "Materiel", "Quantite"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        materielTab.setGridColor(new java.awt.Color(249, 207, 21));
        jScrollPane2.setViewportView(materielTab);

        materielSupprimerUnique.setText("Retirer un exemplaire");
        materielSupprimerUnique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materielSupprimerUniqueActionPerformed(evt);
            }
        });

        materielSupprimer.setText("Annuler la reservation");
        materielSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materielSupprimerActionPerformed(evt);
            }
        });

        materielAjouterUnique.setText("Ajouter un exemplaire");
        materielAjouterUnique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materielAjouterUniqueActionPerformed(evt);
            }
        });

        materielDate.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    materielDate.setWeekStyle(datechooser.view.WeekDaysStyle.SHORT);
    try {
        materielDate.setDefaultPeriods(new datechooser.model.multiple.PeriodSet(new datechooser.model.multiple.Period(new java.util.GregorianCalendar(2018, 3, 8),
            new java.util.GregorianCalendar(2018, 3, 8))));
} catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
    e1.printStackTrace();
    }
    materielDate.setMinDate(new java.util.GregorianCalendar(2018, 3, 8));

    javax.swing.GroupLayout materielPaneLayout = new javax.swing.GroupLayout(materielPane);
    materielPane.setLayout(materielPaneLayout);
    materielPaneLayout.setHorizontalGroup(
        materielPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, materielPaneLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel11)
            .addGap(184, 184, 184))
        .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(materielPaneLayout.createSequentialGroup()
            .addContainerGap(52, Short.MAX_VALUE)
            .addGroup(materielPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, materielPaneLayout.createSequentialGroup()
                    .addComponent(materielCB, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(44, 44, 44)
                    .addComponent(materielJS, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(56, 56, 56)
                    .addComponent(materielDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(37, 37, 37)
                    .addComponent(materielAjouter))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(46, 46, 46)
            .addGroup(materielPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(materielSupprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(materielSupprimerUnique, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(materielAjouterUnique, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap(11, Short.MAX_VALUE))
    );
    materielPaneLayout.setVerticalGroup(
        materielPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(materielPaneLayout.createSequentialGroup()
            .addGap(32, 32, 32)
            .addGroup(materielPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(materielPaneLayout.createSequentialGroup()
                    .addComponent(jLabel11)
                    .addGap(33, 33, 33)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(61, 61, 61)
                    .addComponent(materielAjouter))
                .addComponent(materielDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(materielPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(materielJS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(materielCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(35, 35, 35)
            .addGroup(materielPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(materielPaneLayout.createSequentialGroup()
                    .addComponent(materielAjouterUnique)
                    .addGap(22, 22, 22)
                    .addComponent(materielSupprimerUnique)
                    .addGap(29, 29, 29)
                    .addComponent(materielSupprimer))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(101, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
    jPanel8.setLayout(jPanel8Layout);
    jPanel8Layout.setHorizontalGroup(
        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(materielPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    jPanel8Layout.setVerticalGroup(
        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(materielPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    mainPane.addTab("Gestion du Materiel", jPanel8);

    contactPane.setBackground(new java.awt.Color(39, 26, 54));

    jPanel18.setBackground(new java.awt.Color(249, 207, 21));

    javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
    jPanel18.setLayout(jPanel18Layout);
    jPanel18Layout.setHorizontalGroup(
        jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 0, Short.MAX_VALUE)
    );
    jPanel18Layout.setVerticalGroup(
        jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 2, Short.MAX_VALUE)
    );

    jLabel12.setForeground(new java.awt.Color(249, 207, 21));
    jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/images/contacter2.png"))); // NOI18N

    jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/images/mesCollegues2.png"))); // NOI18N

    contactJTF.setBackground(new java.awt.Color(39, 26, 54));
    contactJTF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    contactJTF.setForeground(new java.awt.Color(249, 207, 21));
    contactJTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 207, 21)));
    contactJTF.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            contactJTFKeyReleased(evt);
        }
    });

    recherche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/images/searchIcon3.png"))); // NOI18N
    recherche.setText("jLabel43");

    contactTabProf.setBackground(new java.awt.Color(39, 26, 54));
    contactTabProf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 207, 21)));
    contactTabProf.setForeground(new java.awt.Color(249, 207, 21));
    contactTabProf.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null}
        },
        new String [] {
            "Nom", "Prénom", "Email"
        }
    ));
    contactTabProf.setGridColor(new java.awt.Color(249, 207, 21));
    jScrollPane8.setViewportView(contactTabProf);

    jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/profImages/mesEtudiants.png"))); // NOI18N

    contactTabEleve.setBackground(new java.awt.Color(39, 26, 54));
    contactTabEleve.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 207, 21)));
    contactTabEleve.setForeground(new java.awt.Color(249, 207, 21));
    contactTabEleve.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null}
        },
        new String [] {
            "Nom", "Prénom", "Email"
        }
    ));
    contactTabEleve.setGridColor(new java.awt.Color(249, 207, 21));
    jScrollPane9.setViewportView(contactTabEleve);

    jPanel19.setBackground(new java.awt.Color(249, 207, 21));

    javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
    jPanel19.setLayout(jPanel19Layout);
    jPanel19Layout.setHorizontalGroup(
        jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 0, Short.MAX_VALUE)
    );
    jPanel19Layout.setVerticalGroup(
        jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 2, Short.MAX_VALUE)
    );

    contactJTF1.setBackground(new java.awt.Color(39, 26, 54));
    contactJTF1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    contactJTF1.setForeground(new java.awt.Color(249, 207, 21));
    contactJTF1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 207, 21)));
    contactJTF1.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            contactJTF1KeyReleased(evt);
        }
    });

    recherche1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/images/searchIcon3.png"))); // NOI18N
    recherche1.setText("jLabel43");

    javax.swing.GroupLayout contactPaneLayout = new javax.swing.GroupLayout(contactPane);
    contactPane.setLayout(contactPaneLayout);
    contactPaneLayout.setHorizontalGroup(
        contactPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(contactPaneLayout.createSequentialGroup()
            .addGroup(contactPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contactPaneLayout.createSequentialGroup()
                    .addGap(333, 333, 333)
                    .addComponent(jLabel42))
                .addGroup(contactPaneLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(74, Short.MAX_VALUE))
        .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contactPaneLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contactPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contactPaneLayout.createSequentialGroup()
                    .addComponent(jLabel13)
                    .addGap(316, 316, 316))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contactPaneLayout.createSequentialGroup()
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(304, 304, 304))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contactPaneLayout.createSequentialGroup()
                    .addComponent(recherche1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(contactJTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(336, 336, 336))))
        .addGroup(contactPaneLayout.createSequentialGroup()
            .addGroup(contactPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contactPaneLayout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(contactPaneLayout.createSequentialGroup()
                    .addGap(275, 275, 275)
                    .addComponent(recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(contactJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(0, 0, Short.MAX_VALUE))
    );
    contactPaneLayout.setVerticalGroup(
        contactPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(contactPaneLayout.createSequentialGroup()
            .addGap(23, 23, 23)
            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(15, 15, 15)
            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(contactPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(contactJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(29, 29, 29)
            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(7, 7, 7)
            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(contactPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(contactJTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(recherche1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(17, 17, 17)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
    jPanel10.setLayout(jPanel10Layout);
    jPanel10Layout.setHorizontalGroup(
        jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(contactPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    jPanel10Layout.setVerticalGroup(
        jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(contactPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    mainPane.addTab("Contact", jPanel10);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(mainPane))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(mainPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainPaneMouseClicked
                                      
        switch (mainPane.getSelectedIndex()) {
            case 0:
                metOngletAccueil();
                break;
            case 1:
                metOngletNotes();
                break;
            case 2:
                metOngletPlanning();
                break;
            case 3:
                metOngletMateriel();
                break;
            default:
                metOngletContact();
                break;
        }
    }//GEN-LAST:event_mainPaneMouseClicked
    private void metOngletAccueil(){
        contact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/images/contact.png")));
        accueil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/images/Clicked/accueilClicked.png")));
        materiel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/persoImages/gestionMateriels.png")));
        notes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/profImages/gestionNotes.png")));
        planning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/profImages/gestionPlanning.png")));
        afficheAccueilPlanning();
    }
    
    private void metOngletNotes(){
        contact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/images/contact.png")));
        accueil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/images/accueil.png")));
        materiel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/persoImages/gestionMateriels.png")));
        notes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/profImages/gestionNotesClicked.png")));
        planning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/profImages/gestionPlanning.png")));
        afficheNotesTab();
        String requete = "select distinct strftime('%Y',DateControle)||' '||intitule||' de '||nomMatiere from Controle where nomMatiere in (select nomMatiere from Matiere where numProf = "+numProf+");";
        BaseDonneeUG.metDansComboBox(requete,notesCBControle);
    }
    
    private void metOngletMateriel(){
        contact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/images/contact.png")));
        accueil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/images/accueil.png")));
        materiel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/persoImages/gestionMaterielsClicked.png")));
        notes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/profImages/gestionNotes.png")));
        planning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/profImages/gestionPlanning.png")));
        String requete = "select nomMateriel from Materiel where quantite > 0";
        BaseDonneeUG.metDansComboBox(requete , materielCB);
        afficheMaterielTab();
    }
    
    private void metOngletPlanning(){
        contact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/images/contact.png")));
        accueil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/images/accueil.png")));
        materiel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/persoImages/gestionMateriels.png")));
        notes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/profImages/gestionNotes.png")));
        planning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/persoImages/gestionPlanningClicked.png")));
        String dateDuJour = "2018-04-08";
        BaseDonneeUG.metDansJTablePlanningProf(planningTab,numProf,18,5,dateDuJour);
    }
    
    private void metOngletContact(){
        contact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/images/Clicked/contactClicked.png")));
        accueil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/images/accueil.png")));
        materiel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/persoImages/gestionMateriels.png")));
        notes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/profImages/gestionNotes.png")));
        planning.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetbd1/profImages/gestionPlanning.png")));
        String requete = "select distinct nomProf as Nom, prenomProf as Prenom, mailProf as Mail from Professeur where numProf != "+ numProf + ";" ;
        BaseDonneeUG.metDansJTable(requete, contactTabProf, 20 ,3);
        requete = "select distinct nomEtu as Nom, prenomEtu as prenomEtu, nomGroupe as Groupe, mailEtu as Mail from Eleve natural join Groupe natural join Matiere natural join Professeur where numProf = "+numProf+" order by nomGroupe;";
        BaseDonneeUG.metDansJTable(requete, contactTabEleve, 40 ,4);
    }
    
    private void afficheAccueilPlanning(){
        String dateDuJour = "2018-04-08";
        BaseDonneeUG.metDansJTablePlanningProf(accueilTab,numProf,10,5,dateDuJour);
    }
    
    private void afficheNotesTab(){
        String requete =  "select dateControle as Date,idControle as Identifiant, intitule as Intitule, nomMatiere as Matiere,numEtu as ID, nomEtu as Nom, prenomEtu as Prenom,note as Note from Controle natural join Note natural join Eleve where nomMatiere in (select nomMatiere from Matiere where numProf = "+numProf+");";
        BaseDonneeUG.metDansJTable(requete, notesTab, 18,8);
    }
    
    private void afficheMaterielTab(){
        String requete = "select idReservation as ID, dateReservation as Date, nomMateriel as Materiel, quantReser as Quantite from Reserver where numProf ="+numProf+";";
        BaseDonneeUG.metDansJTable(requete, materielTab, 15,4);
    }
    
    private void refaitMaterielJS(){
        String choisi = materielCB.getSelectedItem().toString();
        int quantite = BaseDonneeUG.recupere("select quantite from Materiel where nomMateriel = '"+choisi+"';"); 
        SpinnerNumberModel model = new SpinnerNumberModel(1, 1, quantite, 1);
        materielJS.setModel(model);
    }
    
    private void notesCBControleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_notesCBControleItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED){
            String choisi = notesCBControle.getSelectedItem().toString();
            String requete = "select distinct nomGroupe from Controle natural join Passer natural join Groupe where strftime('%Y',DateControle)||' '||intitule||' de '||nomMatiere='"+choisi+"';"; 
            BaseDonneeUG.metDansComboBox(requete,notesCBGroupe);
        }
    }//GEN-LAST:event_notesCBControleItemStateChanged

    private void notesCBGroupeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_notesCBGroupeItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED){
            String choisi = notesCBGroupe.getSelectedItem().toString();
            String requete = "select distinct numEtu||' '||nomEtu||' '||prenomEtu from Eleve natural join Groupe where nomGroupe ='"+choisi+"';"; 
            BaseDonneeUG.metDansComboBox(requete,notesCBEleve);
        }
    }//GEN-LAST:event_notesCBGroupeItemStateChanged

    private void notesTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_notesTFFocusGained
        notesTF.setText("");
        notesTF.setForeground(Color.black);
    }//GEN-LAST:event_notesTFFocusGained

    private void notesAjouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notesAjouterMouseClicked
        String elmt = notesCBEleve.getSelectedItem().toString();
        String requete = "select numEtu from Eleve where numEtu||' '||nomEtu||' '||prenomEtu = '"+elmt+"';";
        int numeroEtu = BaseDonneeUG.recupere(requete);
        elmt = notesCBControle.getSelectedItem().toString();
        requete = "select idControle from Controle where strftime('%Y',DateControle)||' '||intitule||' de '||nomMatiere='"+elmt+"';"; 
        int idControle = BaseDonneeUG.recupere(requete);
        try{
            double note = Double.parseDouble(notesTF.getText());
            
            if (note<=20 && note>=0){
                requete = "insert into Note values("+idControle+","+numeroEtu+","+note+");" ;
                BaseDonneeUG.executeDansDB(requete);
                afficheNotesTab();
            } else {
                throw new NumberFormatException(); 
            }    
        } catch (NumberFormatException|SQLException ex){
            notesErreur.setText("Impossible de rentrer la note donnée (note erroné ou note déjà présente)");
            ActionListener effaceMessage = (ActionEvent evt1) -> {
                notesErreur.setText("");
            };
            Timer timer = new Timer(2000, effaceMessage);
            timer.setRepeats(false);
            timer.start();
        }
       
    }//GEN-LAST:event_notesAjouterMouseClicked

    private void notesTFRechercheFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_notesTFRechercheFocusGained
        notesTFRecherche.setText("");
        notesTFRecherche.setForeground(Color.black);
    }//GEN-LAST:event_notesTFRechercheFocusGained

    private void notesTFRechercheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_notesTFRechercheKeyReleased
        String lettres = notesTFRecherche.getText();
        String requete = "select dateControle as Date,idControle as Identifiant, intitule as Intitule, nomMatiere as Matiere,numEtu as ID, nomEtu as Nom, prenomEtu as Prenom,note as Note  from Controle natural join Note natural join Eleve where nomMatiere in (select nomMatiere from Matiere where numProf = "+numProf+") and (nomEtu like '"+lettres+"%' or prenomEtu like '"+lettres+"%');";
        BaseDonneeUG.metDansJTable(requete, notesTab,18,8);
    }//GEN-LAST:event_notesTFRechercheKeyReleased

    private void notesSupprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notesSupprimerMouseClicked
        int ligne = notesTab.getSelectedRow();
        String idControle = notesTab.getValueAt(ligne,1).toString();
        String numEtu = notesTab.getValueAt(ligne,4).toString();
        String requete = "delete from Note where idControle="+idControle+" and numEtu="+numEtu+";";
        try{
            BaseDonneeUG.executeDansDB(requete);
            afficheNotesTab();
        } catch ( SQLException e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }//GEN-LAST:event_notesSupprimerMouseClicked

    private void materielAjouterUniqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materielAjouterUniqueActionPerformed
        int ligne = materielTab.getSelectedRow();
        String idReservation = materielTab.getValueAt(ligne, 0).toString();
        String requete = "update Reserver set quantReser = quantReser+1 where idReservation = "+idReservation+";";
        try {
            BaseDonneeUG.executeDansDB(requete);
            afficheMaterielTab();
        } catch (SQLException e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }//GEN-LAST:event_materielAjouterUniqueActionPerformed

    private void materielCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_materielCBItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED){
            refaitMaterielJS();
        }
    }//GEN-LAST:event_materielCBItemStateChanged

    private void materielAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materielAjouterActionPerformed
        String mat = materielCB.getSelectedItem().toString();
        String quantite = materielJS.getValue().toString();
        Calendar date = materielDate.getSelectedDate();
        String mois;
        if (date.get(Calendar.MONTH)+1<10){
            mois = "0"+(date.get(Calendar.MONTH)+1);
        } else {
            mois = ""+(date.get(Calendar.MONTH)+1);
        }
        String jour;
        if (date.get(Calendar.DAY_OF_MONTH)<10){
            jour = "0"+date.get(Calendar.DAY_OF_MONTH);
        } else {
            jour = ""+date.get(Calendar.DAY_OF_MONTH);
        }
        String dateReel= ""+date.get(Calendar.YEAR)+"-"+mois+"-"+jour;
        String requete="select max(idReservation) from Reserver;";
        int idReservation = BaseDonneeUG.recupere(requete)+1;
        requete = "insert into Reserver values("+idReservation+",'"+mat+"',"+numProf+",'"+dateReel+"',"+quantite+");";
        try {
            BaseDonneeUG.executeDansDB(requete);
            afficheMaterielTab();
            refaitMaterielJS();
        } catch (SQLException e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }//GEN-LAST:event_materielAjouterActionPerformed

    private void materielSupprimerUniqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materielSupprimerUniqueActionPerformed
        int ligne = materielTab.getSelectedRow();
        String idReservation = materielTab.getValueAt(ligne, 0).toString();
        String requete = "update Reserver set quantReser = quantReser-1 where idReservation = "+idReservation+";";
        try {
            BaseDonneeUG.executeDansDB(requete);
            afficheMaterielTab();
            refaitMaterielJS();
        } catch (SQLException e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }//GEN-LAST:event_materielSupprimerUniqueActionPerformed

    private void materielSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materielSupprimerActionPerformed
        int ligne = materielTab.getSelectedRow();
        String idReservation = materielTab.getValueAt(ligne, 0).toString();
        String requete = "delete from Reserver where idReservation = "+idReservation+";";
        try {
            BaseDonneeUG.executeDansDB(requete);
            requete = "select idReservation as ID, dateReservation as Date, nomMateriel as Materiel, quantReser as Quantite from Reserver where numProf ="+numProf+";";
            BaseDonneeUG.metDansJTable(requete, materielTab, 15,4);
            String choisi = materielCB.getSelectedItem().toString();
            int quant = BaseDonneeUG.recupere("select quantite from Materiel where nomMateriel = '"+choisi+"';"); 
            SpinnerNumberModel model = new SpinnerNumberModel(1, 1, quant, 1);
            materielJS.setModel(model);
        } catch (SQLException e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }//GEN-LAST:event_materielSupprimerActionPerformed

    private void contactJTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactJTFKeyReleased
        String lettres = contactJTF.getText();
        String requete = "select distinct nomProf as Nom, prenomProf as Prenom, mailProf as Mail from Professeur where numProf != "+ numProf + " and (nomProf like '"+lettres+"%' or prenomProf like '"+lettres+"%');";
        BaseDonneeUG.metDansJTable(requete, contactTabProf, 20 ,3);
    }//GEN-LAST:event_contactJTFKeyReleased

    private void contactJTF1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactJTF1KeyReleased
        String lettres = contactJTF1.getText();
        String requete = "select distinct nomEtu as Nom, prenomEtu as prenomEtu, nomGroupe as Groupe, mailEtu as Mail from Eleve natural join Groupe natural join Matiere natural join Professeur where numProf = "+numProf+" and (nomEtu like '"+lettres+"%' or prenomEtu like '"+lettres+"%') order by nomGroupe;";
        BaseDonneeUG.metDansJTable(requete, contactTabEleve, 40 ,4);
    }//GEN-LAST:event_contactJTF1KeyReleased

    private void accueilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accueilMouseClicked
        mainPane.setSelectedIndex(0);
        metOngletAccueil();
    }//GEN-LAST:event_accueilMouseClicked

    private void notesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notesMouseClicked
        mainPane.setSelectedIndex(1);
        metOngletNotes();
    }//GEN-LAST:event_notesMouseClicked

    private void planningMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_planningMouseClicked
        mainPane.setSelectedIndex(2);
        metOngletPlanning();
    }//GEN-LAST:event_planningMouseClicked

    private void materielMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materielMouseClicked
        mainPane.setSelectedIndex(3);
        metOngletMateriel();
    }//GEN-LAST:event_materielMouseClicked

    private void contactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactMouseClicked
        mainPane.setSelectedIndex(4);
        metOngletContact();
    }//GEN-LAST:event_contactMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        int logout = JOptionPane.showConfirmDialog(this, "Etes-vous sûr de vouloir vous déconnecter ?", "Log out", 0);
        this.pack();
        if (logout==JOptionPane.YES_OPTION)
        {
            this.dispose();
            Login page = new Login();
            page.setVisible(true); }
    }//GEN-LAST:event_jLabel2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Professeur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Professeur(1).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accueil;
    private javax.swing.JPanel accueilPane;
    private javax.swing.JTable accueilTab;
    private javax.swing.JLabel contact;
    private javax.swing.JTextField contactJTF;
    private javax.swing.JTextField contactJTF1;
    private javax.swing.JPanel contactPane;
    private javax.swing.JTable contactTabEleve;
    private javax.swing.JTable contactTabProf;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private datechooser.beans.DateChooserDialog dateChooserDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane mainPane;
    private javax.swing.JLabel materiel;
    private javax.swing.JButton materielAjouter;
    private javax.swing.JButton materielAjouterUnique;
    private javax.swing.JComboBox<String> materielCB;
    private datechooser.beans.DateChooserCombo materielDate;
    private javax.swing.JSpinner materielJS;
    private javax.swing.JPanel materielPane;
    private javax.swing.JButton materielSupprimer;
    private javax.swing.JButton materielSupprimerUnique;
    private javax.swing.JTable materielTab;
    private javax.swing.JLabel notes;
    private javax.swing.JButton notesAjouter;
    private javax.swing.JComboBox<String> notesCBControle;
    private javax.swing.JComboBox<String> notesCBEleve;
    private javax.swing.JComboBox<String> notesCBGroupe;
    private javax.swing.JLabel notesErreur;
    private javax.swing.JPanel notesPane;
    private javax.swing.JButton notesSupprimer;
    private javax.swing.JTextField notesTF;
    private javax.swing.JTextField notesTFRecherche;
    private javax.swing.JTable notesTab;
    private javax.swing.JLabel planning;
    private javax.swing.JPanel planningPane;
    private javax.swing.JTable planningTab;
    private javax.swing.JLabel recherche;
    private javax.swing.JLabel recherche1;
    // End of variables declaration//GEN-END:variables
}
