package GUI;

import Database.TheRealDBImplementation;
import Engine.IEngine;
import domain.Bibtex;
import domain.Kentta;
import domain.Viitetyyppi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ToolTipManager;
import javax.swing.text.JTextComponent;

public class MainWindow extends javax.swing.JFrame {

    private IEngine engine;
    private int x; //käytetään lomakkeen GridBagLayoutissa määrittämään gridx
    private int y; //käytetään lomakkeen GridBagLayoutissa määrittämään gridy

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        engine = new Engine.EngineStub(new TheRealDBImplementation());
        initComponents();
        paivitaViitetyypit();

        x = 0;
        y = 0;

    }

    public MainWindow(IEngine engine) {
        this.engine = engine;
        initComponents();
        paivitaViitetyypit();

        x = 0;
        y = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        listaus = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viitelista = new javax.swing.JList();
        poista = new javax.swing.JButton();
        muokkaa = new javax.swing.JButton();
        bibtex = new javax.swing.JButton();
        lisays = new javax.swing.JPanel();
        valitse = new javax.swing.JLabel();
        viitetyypit = new javax.swing.JComboBox();
        lisaa = new javax.swing.JButton();
        lomakeScroll = new javax.swing.JScrollPane();
        lomake = new javax.swing.JPanel();
        onPakollinen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane3FocusGained(evt);
            }
        });

        jScrollPane1.setViewportView(viitelista);

        poista.setText("Poista");
        poista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poistaActionPerformed(evt);
            }
        });

        muokkaa.setText("Muokkaa");
        muokkaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muokkaaActionPerformed(evt);
            }
        });

        bibtex.setText("Luo BibTeX-tiedosto");
        bibtex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bibtexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout listausLayout = new javax.swing.GroupLayout(listaus);
        listaus.setLayout(listausLayout);
        listausLayout.setHorizontalGroup(
            listausLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listausLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(listausLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listausLayout.createSequentialGroup()
                        .addComponent(bibtex)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(muokkaa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(poista))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        listausLayout.setVerticalGroup(
            listausLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listausLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(listausLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(poista)
                    .addComponent(muokkaa)
                    .addComponent(bibtex))
                .addContainerGap())
        );

        jTabbedPane3.addTab("Listaus", listaus);

        valitse.setText("Valitse viitetyyppi");

        viitetyypit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viitetyypitActionPerformed(evt);
            }
        });

        lisaa.setText("Lisää viite");
        lisaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lisaaActionPerformed(evt);
            }
        });

        lomakeScroll.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lomake.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lomake.setLayout(null);
        lomakeScroll.setViewportView(lomake);

        onPakollinen.setText("*= pakollinen kenttä");

        javax.swing.GroupLayout lisaysLayout = new javax.swing.GroupLayout(lisays);
        lisays.setLayout(lisaysLayout);
        lisaysLayout.setHorizontalGroup(
            lisaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lomakeScroll, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(lisaysLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(valitse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viitetyypit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lisaysLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(onPakollinen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addComponent(lisaa)
                .addGap(59, 59, 59))
        );
        lisaysLayout.setVerticalGroup(
            lisaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lisaysLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lisaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valitse)
                    .addComponent(viitetyypit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lomakeScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lisaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lisaa)
                    .addComponent(onPakollinen))
                .addContainerGap())
        );

        jTabbedPane3.addTab("Viitteen lisäys", lisays);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void poistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poistaActionPerformed
        int valitutViitteet = viitelista.getSelectedValuesList().size();
        int valinta = 0;

        if (valitutViitteet == 0) {
            JOptionPane.showMessageDialog(this, "Ei valittuja viitteitä");
        } else if (valitutViitteet < 6) {
            String poistettavat = "";

            for (Object o : viitelista.getSelectedValuesList()) {
                poistettavat += o.toString() + "\n";
            }

            valinta = JOptionPane.showConfirmDialog(this, "Poistetaanko seuraavat viitteet:\n" + poistettavat);
        } else {
            valinta = JOptionPane.showConfirmDialog(this, "Poistetaanko " + valitutViitteet + " viitettä?");
        }

        if (valinta == JOptionPane.YES_OPTION) {
            for (Object viite : viitelista.getSelectedValuesList()) {
                //Splitataan citation key taulukon ekaksi alkioksi
                engine.poistaViite(parseCitationKey(viite));
            }
        }

        paivitaViitelista();
    }//GEN-LAST:event_poistaActionPerformed

    private void jTabbedPane3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane3FocusGained
        paivitaViitelista();

    }//GEN-LAST:event_jTabbedPane3FocusGained

    private void viitetyypitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viitetyypitActionPerformed

        Viitetyyppi viitetyyppi = (Viitetyyppi) viitetyypit.getSelectedItem();

        Set<Kentta> pakollisetKentat = engine.getPakollisetKentat(viitetyyppi);
        Set<Kentta> muutKentat = engine.getEiPakollisetKentat(viitetyyppi);
        
        NakymaBuilder.teeNakymaLomakkeelle(lomake, pakollisetKentat, muutKentat, Viitetyyppi.valueOf(viitetyypit.getSelectedItem().toString()), x, y, lomakeScroll);

    }//GEN-LAST:event_viitetyypitActionPerformed


    private void lisaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lisaaActionPerformed
        Map<Kentta, String> lomakkeenSisalto = NakymaBuilder.haeLomakkeenTiedot(lomake);
        Viitetyyppi lisattavanViitteenTyyppi = Viitetyyppi.valueOf(viitetyypit.getSelectedItem().toString());

        ArrayList<String> virheet = engine.lisaaViite(lisattavanViitteenTyyppi, lomakkeenSisalto);

        if (virheet != null) {
            String virheviesti = "";

            for (String virhe : virheet) {
                virheviesti += virhe + "\n";
            }

            JOptionPane.showMessageDialog(this, virheviesti);
        } else {
            JOptionPane.showMessageDialog(this, "Viite lisättiin onnistuneesti");
            tyhjennaKentat();
        }
    }//GEN-LAST:event_lisaaActionPerformed

    private void bibtexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bibtexActionPerformed
        // TODO add your handling code here:
        Bibtex bibtex = new Bibtex(engine);
        String tiedosto = (String) JOptionPane.showInputDialog(this,
                "Anna tiedoston nimi, johon tallennetaan (ilman tiedostopäätettä)", JOptionPane.PLAIN_MESSAGE);
        try {
            bibtex.generoiTiedosto(tiedosto + ".bib");
            JOptionPane.showMessageDialog(this, "Projektin juureen on nyt lisätty " + tiedosto + ".bib niminen tiedosto.");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_bibtexActionPerformed

    private void muokkaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muokkaaActionPerformed
        int valitutViitteet = viitelista.getSelectedValuesList().size();

        if (valitutViitteet == 0) {
            JOptionPane.showMessageDialog(this, "Ei valittuja viitteitä");
        } else if (valitutViitteet > 1) {
            JOptionPane.showMessageDialog(this, "Valitse vain yksi muokattava viite.");
        } else {
            new MuokkausWindow(parseCitationKey(viitelista.getSelectedValuesList().get(0)), engine).setVisible(rootPaneCheckingEnabled);
        }
    }//GEN-LAST:event_muokkaaActionPerformed

    private String parseCitationKey(Object viite) {
        //Splitataan citation key taulukon ekaksi alkioksi
        String[] viiteSplit = viite.toString().split(":");
        return viiteSplit[0];
    }

    private void tyhjennaKentat() {
        Component[] komponentit = lomake.getComponents();

        for (Component komponentti : komponentit) {
            if (komponentti instanceof JTextComponent) {
                JTextComponent tekstikentta = (JTextComponent) komponentti;
                tekstikentta.setText("");
            }
        }
    }

    private void paivitaViitetyypit() {
        //combobox luodaan automaattisesti mutta sen arvot eivät ole oikein joten päivitetään ne
        viitetyypit.removeAllItems();

        Viitetyyppi[] tyypit = engine.getViitetyypit();

        viitetyypit.setModel(new DefaultComboBoxModel(tyypit));
        viitetyypit.setSelectedIndex(0);
    }

    /**
     * Päivittää viitteiden listausnäkymän
     */
    private void paivitaViitelista() {
        String[] sisalto = engine.listaaKaikkiViitteet();
        viitelista.setListData(sisalto);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bibtex;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JButton lisaa;
    private javax.swing.JPanel lisays;
    private javax.swing.JPanel listaus;
    private javax.swing.JPanel lomake;
    private javax.swing.JScrollPane lomakeScroll;
    private javax.swing.JButton muokkaa;
    private javax.swing.JLabel onPakollinen;
    private javax.swing.JButton poista;
    private javax.swing.JLabel valitse;
    private javax.swing.JList viitelista;
    private javax.swing.JComboBox viitetyypit;
    // End of variables declaration//GEN-END:variables
}
