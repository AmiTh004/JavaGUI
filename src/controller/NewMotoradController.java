package controller;

import model.Motorad;
import view.NewMotoradWindow;

public class NewMotoradController {
    
    NewMotoradWindow _newMotoradWindow;
    MainController _mc;

    public NewMotoradController(MainController mc){
        setNewMotoradWindow(new NewMotoradWindow(this));
        setMainController(mc);
    }

    public void addNewMotorad(String marke, String ps, String typ) {
        // Neues Objekt vom Typ Motorad erstellen und dieses dem Maincontroller mitgeben
        Motorad a = new Motorad(marke, Integer.parseInt(ps), typ);
        getMainController().addNewFahrzeug(a);
        // Nachdem der Motorad erstellt wurde kümmert sich der Controller um den Wechsel der Ansicht.
        getMainController().changeView("mainwindow");
    }
    
    
    /**
     * 
     * SETTER UND GETTER
     */
    public void setNewMotoradWindow(NewMotoradWindow mainWindow) {
        this._newMotoradWindow = mainWindow;
    }

    public NewMotoradWindow getNewMotoradWindow() {
        return _newMotoradWindow;
    }

    public MainController getMainController() {
        return _mc;
    }

    public void setMainController(MainController _mc) {
        this._mc = _mc;
    }
}

