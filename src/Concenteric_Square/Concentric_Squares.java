
package Concenteric_Square;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Arrays;

public class Concentric_Squares extends Canvas {
    int maxX ;
    int maxY ;
    float m = (float) 0.5;
    float n = (float) 0.5;
    float []  xPoints  = new float[4];   float []  new_xPoints  = new float[4];    int [] x = new int[4];
    float [] yPoints = new float [4];    float []  new_yPoints  = new float[4];    int [] y = new int[4];
    float  Start_x =25;
    float Start_y = 25 ;
    float Side_length = 500;
    
    public void paint(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g  ;
        Dimension d = getSize();
        maxX = d.width-1;
        maxY = d.height-1;
        
        g2.setStroke(new BasicStroke(1));
        g2.setColor(Color.red);
        
        square_ini();
        array_convert();
       // System.out.println("x coordinates "+ Arrays.toString(xPoints));
       
       for (int j = 0 ; j< 14 ; j++)
       {
        g2.drawPolygon(x, y , x.length);
        new_squares();
       }
        
      
        
    }
    
    void square_ini()
    {
      xPoints[0]= Start_x;                                                      yPoints[0]= Start_y;
      xPoints[1] =xPoints[0]+ Side_length;                            yPoints[1]= yPoints[0];
      xPoints[2]= xPoints[0]+ Side_length;                            yPoints[2]=  yPoints[0] +Side_length;
      xPoints[3]=  xPoints[0];                                                yPoints[3]=  yPoints[0] +Side_length;
      
    }    
    
    void array_convert()
    {
            for (int i =0 ; i< xPoints.length ; i++)
            {
               x[i] =  iX(xPoints[i]);
               y[i] =  iX(yPoints[i]);
               
            }
    }
    
    void new_squares()
    {
       new_xPoints[0]= xPoints[0]*m + n* xPoints[1] ;                               new_yPoints[0]=yPoints[0]*m + n* yPoints[1] ;  
       new_xPoints[1] =xPoints[1]*m + n* xPoints[2] ;                              new_yPoints[1]= yPoints[1]*m + n* yPoints[2] ;  
       new_xPoints[2]=xPoints[2]*m + n* xPoints[3] ;                               new_yPoints[2]=  yPoints[2]*m + n* yPoints[3] ;  
       new_xPoints[3]=xPoints[3]*m + n* xPoints[0] ;                               new_yPoints[3]=  yPoints[3]*m + n* yPoints[0] ;  
       
         for (int i =0 ; i< xPoints.length ; i++)
            {
               xPoints[i] = new_xPoints[i];
               yPoints[i] = new_yPoints[i];
               
            }
         array_convert();
     
    }
    
    
   int iX(float x){return Math.round (x); }
   float fX(int x) {return (float)x; } 
    
}
