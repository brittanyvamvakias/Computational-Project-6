import java.io.*;

public class Problem1 {
    public static void main(String[] args) { 
          double t=0.;
          double dt=0.1;
          double x,y,xplot,yplot,term;
          final double rcos = Math.cos(3.141592653*76.11/180.0);
          final double rsin = Math.sin(3.141592653*76.11/180.0);
          double [] y0 = {0.1, 0.2, 0.3, 0.4, 0.441, 0.442, 0.5, 0.6, 0.65, 0.66, 0.665,
            0.67, 0.68, 0.69, 0.71, 0.715, 0.72, 0.725, 0.73, 0.735};
          double x0 = 0.0;

 for(int i = 0;i<y0.length;i++){
     String filename = String.format("chaotic%s", i);
             x = x0;
             y = y0[i];
  try{
      FileWriter wtraject = new FileWriter(filename);
      BufferedWriter trajectout = new BufferedWriter(wtraject);
            for(int n = 0;n<7000;n++) {
                term =y-x*x;
                xplot= rcos*x-rsin*term;
                yplot= rsin*x+rcos*term;
                x=xplot;
                y=yplot;
                t += dt;
    
            trajectout.write(x+ " " + y);
            trajectout.newLine();
    
            }// end of the inner for-loop
        
      trajectout.close(); 
      
      }catch (Exception e){//Catch exception if any
      System.err.println("Error: " + e.getMessage());
                         }
      System.out.println("  ");					      
      System.out.println("All done!");
                        }
                     }
  
  }
  