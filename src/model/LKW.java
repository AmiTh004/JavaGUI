package model;

public class LKW extends Fahrzeug {
    
    int _maxZuladung;
    
    public LKW(String marke, int ps, String typ, int maxZuladung){
        super(marke, ps, typ);
        setMaxZuladung(maxZuladung);
    }

    @Override
    public String getSpezial() {
        // TODO Auto-generated method stub
        return "" + _last;
    }

    /**
     * 
     * SETTER UND GETTER
     */
    public int getMaxZuladung() {
        return _maxZuladung;
    }

<<<<<<< Updated upstream
    public void setMaxZuladung(int maxZuladung) {
        this._maxZuladung = maxZuladung;
    }
=======
     public int getLast() {
         return _last;
     }

    
>>>>>>> Stashed changes
}
