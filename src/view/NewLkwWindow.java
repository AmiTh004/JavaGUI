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
    JTextField _tf_sitze;

    NewLkwController _ml;

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
