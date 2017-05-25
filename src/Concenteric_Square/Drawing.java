
package Concenteric_Square;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class Drawing  {


    public static void main(String[] args) {
        JFrame jf = new JFrame("Concentreric Squares");
        
        jf.setSize(580,620);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
      
        Concentric_Squares s = new Concentric_Squares();
        
       // jf.add(t);  // adding the canvass which is going to draw triangle.
       jf.add(s);
      /*  t.addMouseListener( new MouseAdapter() {
            @Override
                    public void mouseClicked(MouseEvent e) 
                    {           
                                t.mouseX= (int) e.getX();
                                t.mouseY = (int) e.getY();
                                
                                t.updateGraphics();  // for calling the repaint();
                                
                    }
        }   );  
*/
// 888888       Mouse Listener ends         88888888888888888888888888888   
        
    }      //88888888888888888888888888888888888888888         Main ends       88888888888888888888888888888888888888888888888
    
}
