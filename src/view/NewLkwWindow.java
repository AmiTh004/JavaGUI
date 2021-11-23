package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.NewLkwController;


public class NewLkwWindow {

    JFrame _mainFrame;
    JPanel _mainPanel;
    JButton _addCarBtn;

    JTextField _tf_marke;
    JTextField _tf_typ;
    JTextField _tf_ps;
    JTextField _tf_maxzuladung;

    NewLkwController _ml;

    public NewLkwWindow(NewLkwController newLkwController){
        setNewLkwController(newLkwController);
        setMainPanel(new JPanel());
        getMainPanel().setLayout(new FlowLayout());
        // Neues Hauptfenster erstellen
        setMainFrame(new JFrame());
        getMainFrame().setTitle("Neuer LKW erstellen");
        
        // Eingabefelder für den LKW erstellen
        JLabel l_marke = new JLabel("Marke");
        getMainPanel().add(l_marke);
        // Textfeld erstellen
        _tf_marke = new JTextField("", 15);
        // Textfeld dem Panel hinzufügen
        getMainPanel().add(_tf_marke);

        // Eingabefelder für den LKW erstellen
        JLabel l_ps = new JLabel("PS");
        getMainPanel().add(l_ps);
        // Textfeld erstellen
        _tf_ps = new JTextField("", 15);
        // Textfeld dem Panel hinzufügen
        getMainPanel().add(_tf_ps);

        // Eingabefelder für den LKW erstellen
        JLabel l_typ = new JLabel("Typ");
        getMainPanel().add(l_typ);
        // Textfeld erstellen
        _tf_typ = new JTextField("", 15);
        // Textfeld dem Panel hinzufügen
        getMainPanel().add(_tf_typ);

        // Eingabefelder für den LKW erstellen
        JLabel l_maxzuladung = new JLabel("Maximale Zuladung");
        getMainPanel().add(l_maxzuladung);
        // Textfeld erstellen
        _tf_maxzuladung = new JTextField("", 15);
        // Textfeld dem Panel hinzufügen
        getMainPanel().add(_tf_maxzuladung);


        _addCarBtn = new JButton("Auto speichern");
        _addCarBtn.setBounds(0,0,0,0);
        _addCarBtn.addActionListener(new saveCarListener());
        getMainPanel().add(_addCarBtn);

        // Breite und Höhe des Fensters setzen
        getMainFrame().setSize(900,300);

        // Fenster anzeigen
        getMainFrame().setVisible(true);
        
        // Standard-Operation, wenn das Fenster geschlossen wird
        getMainFrame().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        getMainFrame().add(getMainPanel());
    }

     /**
     * 
     * Action Listener
     */
    class saveCarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == _addCarBtn){
                System.out.println("LKW speichern - Daten aktualisieren und in neue Ansicht wechseln.");
                System.out.println(_tf_marke.getText());
                System.out.println(_tf_ps.getText());
                System.out.println(_tf_typ.getText());
                System.out.println(_tf_maxzuladung.getText());
                // Fenster ausblenden
                getMainFrame().setVisible(false);

                // Dem Controller die Daten übergeben
                getNewLkwController().addNewLKW(_tf_marke.getText(), _tf_ps.getText(), _tf_typ.getText(), _tf_maxzuladung.getText());
            }
        }
    }



     /**
     * 
     * SETTER UND GETTER
     */
    public JFrame getMainFrame() {
        return _mainFrame;
    }

    public void setMainFrame(JFrame _mainFrame) {
        this._mainFrame = _mainFrame;
    }

    public void setMainPanel(JPanel _mainPanel) {
        this._mainPanel = _mainPanel;
    }

    public JPanel getMainPanel() {
        return _mainPanel;
    }

    public void setNewLkwController(NewLkwController _ml) {
        this._ml = _ml;
    }

    public NewLkwController getNewLkwController() {
        return _ml;
    }
}
