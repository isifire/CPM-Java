
package contactomaestro;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Isidro Benitez Zapico UO285039
 */

public class PaintPanel extends javax.swing.JPanel{
   
    private LinkedList<Point> puntos;
    private Color lineaColor;
    
    public PaintPanel(){
        super();
        puntos = new LinkedList();
        lineaColor = Color.red;
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        
        Iterator<Point> itr = puntos.iterator();
        while (itr.hasNext()){
            Point p = itr.next();
            g.setColor(lineaColor);
            g.fillOval(p.x, p.y, 10, 10);
        }
    }
        public Color getColor(){
            return lineaColor;
        }
        
        public void setColor(Color c) {
            this.lineaColor = c;
        }
        
        public void insertaPunto(Point p){
            puntos.add(p);
        }
        
        public void borrar(){
            puntos.clear();
        }
  
}
