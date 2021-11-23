package controller;

import view.NewLkwWindow;

public class NewLkwController {
    
    NewLkwWindow _newLkwWindow;
    MainController _mc;

    public NewLkwController(MainController mc){
        setMainController(mc);
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
