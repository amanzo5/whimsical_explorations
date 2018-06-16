/*Written By Ashley Manzo*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class GamePanel extends JPanel 
{ 
   //singleton
   private static GamePanel gp;
   //string to change
   private String pname="Player One";
   private String pname2="Player Two";
   Timer t;
   
   //location of GOAL
   int gxname=596;
   int gyname=395;
   //movements
   int p1ymove, p1xmove, p1xnamemove, p1ynamemove, xrectrange, yrectrange, xgoalrange, ygoalrange;
   

   
   /*---------------------------------------------------------------------------------------------*/
   
   //player one
   
   //location of circle
   int p1x=70;
   int p1y=400;
   //location of pname
   int p1xname=70;
   int p1yname=395;
   //location of the rect
   int gx=600;
   int gy=400;
   
   
      /*---------------------------------------------------------------------------------------------*/
   
   //player two
   
    //location of circle
   int p2x=130;
   int p2y=450;
   //location of pname
   int p2xname=130;
   int p2yname=445;
   
   //movements
   int p2ymove, p2xmove, p2xnamemove, p2ynamemove;
   
   /*---------------------------------------------------------------------------------------------*/

   
   
   //create a random object
   Random rn = new Random();
           
   
   //create an accessor for the singleton
   public static GamePanel getgp()
   {
    return gp;
   }

  
   public GamePanel()
   {
     //set up our super
     super();
     
     gp=this;
     
     
     //set up the dimensions
     setPreferredSize(new Dimension(800,600));
     setBackground(Color.BLACK);
     
     //add keylistener
     addKeyListener(new KeyEventListener());
     addKeyListener(new KeyEventListener1());
     
     //add a Timer
     t=new Timer(10, new TimerListener());
     
     
          
   }
   
   //create a setname method
   
   public void SetName(String pname_in)
   {
    pname=pname_in;  
    repaint();
   }
   
   public void SetName2(String pname_in2)
   {
    pname2=pname_in2;  
    repaint();
   }
   
   //create the paint component
   public void paintComponent (Graphics g)
   {
   
     //in order to not override theblack
     super.paintComponent(g);
     
     //draw a symbol for the player one
     Color bluebell = new Color(84,182,204);
     g.setColor(bluebell);
     g.fillOval(p1x,p1y,20,20);
     g.drawString(pname, p1xname,p1yname);
     
     //draw a symbol for the player two
     Color brick= new Color(212,19,2);     
     g.setColor(brick);
     g.fillOval(p2x,p2y,20,20);
     g.drawString(pname2, p2xname,p2yname);
     
     
     
      
     //draw a symbol for the goal
     
     g.drawRect(gx,gy,25,25);
     g.drawString("GOAL", gxname, gyname);
       
     
   }
   
   //create a timelistener
   public class TimerListener implements ActionListener
   {
    public void actionPerformed(ActionEvent ae)
    {
    
       //random movements for the rectangle
     int randomchangex=rn.nextInt(3)-1;
     int randomchangey=rn.nextInt(3)-1;
     
     //movements for the pname and the ball
     p1x+= p1xmove;
     p1y+= p1ymove;
     p1xname+=p1xnamemove;
     p1yname+=p1ynamemove;
     p2x+= p2xmove;
     p2y+= p2ymove;
     p2xname+=p2xnamemove;
     p2yname+=p2ynamemove;
     gx=gx+randomchangex;
     gy=gy+randomchangey;
     gxname=gxname+randomchangex;
     gyname=gyname+randomchangey;
     
     
     //random movements for the GOAL
     //gxname= rn.nextInt(597-595)+595;
     //gyname= rn.nextInt(396-394)+394;
     
     //how to tell if the person reached the point
     
     //create difference in x and y points from the ball and the rect
     double diffx=gx-p1x;
     double diffy=gy-p1y;
     
     //do the powers 
     double distx=Math.pow(diffx,2);
     double disty=Math.pow(diffy,2);
     
     //do the sqrt root
     double difference=Math.sqrt(distx+disty);
     
     //create one for the second one 
     double diffx2=gx-p2x;
     double diffy2=gy-p2y;
     
     //do the powers 
     double distx2=Math.pow(diffx2,2);
     double disty2=Math.pow(diffy2,2);
     
     //do the sqrt root
     double difference2=Math.sqrt(distx2+disty2);
     
     
     
     //do an if statement that determines if the difference is less than ten, tell them they won
     if(difference<=10)
     {  
      JOptionPane.showMessageDialog(null, "PLAYER ONE YOU WON");
      t.stop();
      
     }
      repaint();
      
      //do an if statement that determines if the difference is less than ten, tell them they won
     if(difference2<=10)
     {  
      JOptionPane.showMessageDialog(null, "PLAYER TWO YOU WON");
      t.stop();
     }
      
      repaint();
    }
   }
   
   //create a  first keylistener for playerone
   public class KeyEventListener implements KeyListener
   { 
    public void keyTyped(KeyEvent e) {}
    public void keyPressed(KeyEvent e)
    {
      if(e.getKeyCode()==KeyEvent.VK_W)
      {
       p1ymove=-1;
       p1ynamemove=-1;
       repaint();
      }
  
      if(e.getKeyCode()==KeyEvent.VK_A)
      {
       p1xmove=-1;
       p1xnamemove=-1;
       repaint();
      }
      
      if(e.getKeyCode()==KeyEvent.VK_S)
      {
       p1ymove=1;
       p1ynamemove=1;
       repaint();
      }
    
     if(e.getKeyCode()==KeyEvent.VK_D)
      {
       p1xmove=1;
       p1xnamemove=1;
       repaint();
      }
      
    }
    public void keyReleased(KeyEvent e) 
    {
     if(e.getKeyCode()==KeyEvent.VK_W)
     {
       p1ymove=0;
       p1ynamemove=0;
       repaint();
     }
     if(e.getKeyCode()==KeyEvent.VK_A)
     {
       p1xmove=0;
       p1xnamemove=0;
       repaint();
     }
     if(e.getKeyCode()==KeyEvent.VK_S)
     {
       p1ymove=0;
       p1ynamemove=0;
       repaint();
     }
     if(e.getKeyCode()==KeyEvent.VK_D)
     {
       p1xmove=0;
       p1xnamemove=0;
       repaint();
     }
     
    }
   }
   
   //--------------------------------------------------------------------------------------------------
   
   //create a key listener for player two
   public class KeyEventListener1 implements KeyListener
   { 
    public void keyTyped(KeyEvent e) {}
    public void keyPressed(KeyEvent e) 
    { 
        if(e.getKeyCode()==KeyEvent.VK_UP)         
         {
          p2ymove=-1;
          p2ynamemove=-1;
          repaint();
         }
            
        if(e.getKeyCode()==KeyEvent.VK_DOWN) 
         {
          p2ymove=1;
          p2ynamemove=1;
          repaint();
         }
        
        if(e.getKeyCode()==KeyEvent.VK_LEFT) 
         {
          p2xmove=-1;
          p2xnamemove=-1;
          repaint();
         }
 
        if(e.getKeyCode()==KeyEvent.VK_RIGHT) 
         {
          p2xmove=1;
          p2xnamemove=1;
          repaint();
         }
            
     
}     public void keyReleased(KeyEvent e) 
    {
     if(e.getKeyCode()==KeyEvent.VK_UP)
     {
       p2ymove=0;
       p2ynamemove=0;
       repaint();
     }
     if(e.getKeyCode()==KeyEvent.VK_LEFT)
     {
       p2xmove=0;
       p2xnamemove=0;
       repaint();
     }
     if(e.getKeyCode()==KeyEvent.VK_DOWN)
     {
       p2ymove=0;
       p2ynamemove=0;
       repaint();
     }
     if(e.getKeyCode()==KeyEvent.VK_RIGHT)
     {
       p2xmove=0;
       p2xnamemove=0;
       repaint();
     }
     
    }
   }
   
}