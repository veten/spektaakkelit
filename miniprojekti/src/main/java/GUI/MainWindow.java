package GUI;

import Database.MockDatabase;
import Engine.IEngine;
import domain.Bibtex;
import domain.Kentta;
import domain.Viitetyyppi;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        engine = new Engine.EngineStub(new MockDatabase());
        initComponents();
        paivitaViitetyypit();

    }

    public MainWindow(IEngine engine) {
        this.engine = engine;
        initComponents();
        paivitaViitetyypit();
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
        tahti = new javax.swing.JLabel();
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
        lomake.setLayout(new javax.swing.BoxLayout(lomake, javax.swing.BoxLayout.Y_AXIS));
        lomakeScroll.setViewportView(lomake);

        tahti.setForeground(java.awt.Color.red);
        tahti.setText("*");

        onPakollinen.setText("= pakollinen kenttä");

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
                .addGap(32, 32, 32)
                .addComponent(tahti)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(onPakollinen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
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
                .addComponent(lomakeScroll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lisaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lisaa)
                    .addComponent(tahti)
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
            int[] indeksit = new int[viitelista.getSelectedIndices().length];

            int i = viitelista.getSelectedIndices().length - 1;
            for (int luku : viitelista.getSelectedIndices()) {
                indeksit[i--] = luku;
            }

            for (Integer indeksi : indeksit) {
                engine.poistaViite(indeksi);
            }
        }

        paivitaViitelista();
    }//GEN-LAST:event_poistaActionPerformed

    private void jTabbedPane3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane3FocusGained
        paivitaViitelista();

    }//GEN-LAST:event_jTabbedPane3FocusGained

    private void viitetyypitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viitetyypitActionPerformed
        lomake.removeAll();

        Viitetyyppi viitetyyppi = (Viitetyyppi) viitetyypit.getSelectedItem();

        Set<Kentta> pakollisetKentat = engine.getPakollisetKentat(viitetyyppi);
        Set<Kentta> muutKentat = engine.getEiPakollisetKentat(viitetyyppi);

        //luodaan alkuun pakolliset kentät tähden kera
        lisaaLomakkeeseen(pakollisetKentat, true);

        //lopuksi muut sallitut kentät
        lisaaLomakkeeseen(muutKentat, false);

        //paivitetaan lomake-paneeli ja skrollaus
        lomake.validate();
        lomake.repaint();

        lomakeScroll.validate();

    }//GEN-LAST:event_viitetyypitActionPerformed

    private void lisaaLomakkeeseen(Set<Kentta> viitteenKentat, boolean pakollinen) {
        if (viitteenKentat == null) {
            return;
        }
        
        Viitetyyppi tyyppi = Viitetyyppi.valueOf(viitetyypit.getSelectedItem().toString());
        //Kirjalla täytyy olla joko kirjoittaja tai editori, joten  käydään tämä erikoistapaus
        //läpi ensiksi
        if (tyyppi == Viitetyyppi.book && pakollinen) {
            JPanel kenttaAlue = new JPanel();
            kenttaAlue.add(new JComboBox(new Kentta[]{Kentta.author, Kentta.editor}));
            
            JTextArea tekstikentta = new JTextArea(1, 20);
            tekstikentta.setToolTipText("Erottele henkilöt pilkulla");
            kenttaAlue.add(tekstikentta);
            
            JLabel tahti = new JLabel("*");
            tahti.setForeground(Color.RED);
            kenttaAlue.add(tahti);

            lomake.add(kenttaAlue);

            //lisätään seuraavaksi muut kentät silmukassa joten poistetaan ensin nämä, etteivät tule kahdesti
            viitteenKentat.remove(Kentta.author);
            viitteenKentat.remove(Kentta.editor);
        }
        
        Arrays.sort(viitteenKentat.toArray());

        for (Kentta kentta : viitteenKentat) {
            JPanel kenttaAlue = new JPanel();
            kenttaAlue.add(new JLabel(kentta.toString()));
            JTextArea tekstikentta = new JTextArea(1, 20);


            if (kentta == Kentta.pages) {
                tekstikentta.setToolTipText("Anna sivut muodossa: 21, 21-40 tai 21+");
            }

            if (kentta == Kentta.author || kentta == Kentta.editor) {
                tekstikentta.setToolTipText("Erottele henkilöt pilkulla");
            }

            kenttaAlue.add(tekstikentta);


            if (pakollinen) {
                JLabel tahti = new JLabel("*");
                tahti.setForeground(Color.RED);
                kenttaAlue.add(tahti);
            }
            lomake.add(kenttaAlue);
        }
        
        ToolTipManager.sharedInstance().setInitialDelay(0);
    }

    private void lisaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lisaaActionPerformed
        HashMap<Kentta, String> lomakkeenSisalto = haeLomakkeenTiedot();
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

    public HashMap<Kentta, String> haeLomakkeenTiedot() {
        HashMap<Kentta, String> lomakkeenSisalto = new HashMap();

        //lomake sisältää joukon paneeleita, yksi per viitteen kenttä
        Component[] paneelitKomponentteina = lomake.getComponents();

        for (Component komponentti : paneelitKomponentteina) {
            JPanel sisaltaaKentanJaSyotteen;
            Kentta kentta = null;
            String syote = "";

            //tarkistetaan vielä kuitenkin, että onhan komponentti paneeli ja muutetaan se
            if (komponentti instanceof JPanel) {
                sisaltaaKentanJaSyotteen = (JPanel) komponentti;
            } else {
                continue;
            }

            Component[] tiedot = sisaltaaKentanJaSyotteen.getComponents();

            //tiedetään, että ensimmäinenä komponenttina voi olla jlabel tai combobox
            if (tiedot[0] instanceof JLabel) {
                JLabel lomakkeenKentta = (JLabel) tiedot[0];
                kentta = Kentta.valueOf(lomakkeenKentta.getText());

            } else if (tiedot[0] instanceof JComboBox) {
                JComboBox box = (JComboBox) tiedot[0];
                kentta = Kentta.valueOf(box.getSelectedItem().toString());
            }

            //toisena komponenttina jokaisen paneelin pitäisi sisältää tekstikenttä, johon
            //käyttäjä on mahdollisesti kirjoittanut jotain
            if (tiedot[1] instanceof JTextComponent) {
                JTextComponent tekstikentta = (JTextComponent) tiedot[1];
                syote = tekstikentta.getText();
            }

            lomakkeenSisalto.put(kentta, syote);
        }
        System.out.println(lomakkeenSisalto);
        return lomakkeenSisalto;
    }

    private void tyhjennaKentat() {
        Component[] komponentit = lomake.getComponents();
        JPanel paneeli = null;

        //lomake sisältää paljon jpaneeleita
        for (Component komponentti : komponentit) {
            if (komponentti instanceof JPanel) {
                paneeli = (JPanel) komponentti;
            } else {
                continue;
            }
            Component[] tiedot = paneeli.getComponents();

            //jokainen jpaaneli sisältää tekstikentän
            for (Component paneelinSisalto : tiedot) {
                if (paneelinSisalto instanceof JTextComponent) {
                    JTextComponent tekstikentta = (JTextComponent) paneelinSisalto;
                    tekstikentta.setText("");
                }
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
        // halutaanko viitteet aakkos- vai lisäysjärjestyksessä?
        // Arrays.sort(sisalto);
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
    private javax.swing.JLabel tahti;
    private javax.swing.JLabel valitse;
    private javax.swing.JList viitelista;
    private javax.swing.JComboBox viitetyypit;
    // End of variables declaration//GEN-END:variables
}
