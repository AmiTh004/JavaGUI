package controller;

import model.LKW;
import view.NewLkwWindow;

public class NewLkwController {
    
    NewLkwWindow _newLkwWindow;
    MainController _mc;

    public NewLkwController(MainController mc){
        setNewLkwWindow(new NewLkwWindow(this));
        setMainController(mc);
    }

    public void addNewLKW(String marke, String ps, String typ, String maxzuladung) {
        // Neues Objekt vom Typ LKW erstellen und dieses dem Maincontroller mitgeben
        LKW a = new LKW(marke, Integer.parseInt(ps), typ, Integer.parseInt(maxzuladung));
        getMainController().addNewFahrzeug(a);
        // Nachdem der LKW erstellt wurde kümmert sich der Controller um den Wechsel der Ansicht.
        getMainController().changeView("mainwindow");
    }
    
    
    /**
     * 
     * SETTER UND GETTER
     */
    public void setNewLkwWindow(NewLkwWindow mainWindow) {
        this._newLkwWindow = mainWindow;
    }

    public NewLkwWindow getNewLkwWindow() {
        return _newLkwWindow;
    }

    public MainController getMainController() {
        return _mc;
    }

    public void setMainController(MainController _mc) {
        this._mc = _mc;
    }
}
