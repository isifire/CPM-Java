
package contactomaestro;

/**
 *
 * @author Isidro Benitez Zapico UO285039
 */
public class ImportaciónCode extends ImportaciónMetodos{

    private ImportaciónVentana Inter;
    private boolean IsStoped;
    
    
    public ImportaciónCode(ImportaciónVentana Inter)
    {
        IsStoped=false;
        this.Inter=Inter;
    }

    public void Start()
    {
        Inter.barP.setValue(0);
        IsStoped=false;
    }
    
    public void Finish()
    {
        Inter.barP.setValue(100);
        Inter.btnStop.setEnabled(false);        
        Inter.btnEjecuta.setEnabled(true);
    }
    
    public void ProportionExecuted(float p)
    {
        Inter.barP.setValue((int)(p*100));
    }
    
    public void Message(String M)
    {
        Inter.txtIteracion.setText(M);
    }

    public void setStop()
    {
        this.IsStoped=true;
    }

    
    public boolean Stop()
    {
        return IsStoped;
    }

    
    
}
