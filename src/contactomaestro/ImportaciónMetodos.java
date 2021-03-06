
package contactomaestro;

/**
 *
 * @author Isidro Benitez Zapico UO285039
 */
abstract public class ImportaciónMetodos implements ImportaciónInterface {
    

    private int SumaMin=100;
    private float SegsIte=0.1F;
    public void setSumaMin(int SumaMin)
    {
        this.SumaMin=SumaMin;
    }
    
    public void setSegsInte(float SegsIte)
    {
        this.SegsIte=SegsIte;    }
            
    public void Run()
    {
     
     System.out.println("Start");
     Start();// Indica que empieza
     
     java.util.Random RandGen = new java.util.Random();
     float SumaAct=0.0F;
     int Iters=0;
     while(SumaAct<SumaMin)    
     {
        Iters++;
        Duerme(); 
        if(Stop()) 
            break;

        float Sumando=RandGen.nextFloat();
        SumaAct+=Sumando;
        
        ProportionExecuted(SumaAct/SumaMin);
     }
     Finish();
    }

    private void Duerme()
    {
        try
        {
            Thread.sleep((int)(SegsIte*1000));
        }
        catch(java.lang.InterruptedException E){}
    }
}