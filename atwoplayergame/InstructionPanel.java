/*Written By Ashley Manz*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class InstructionPanel extends JPanel 
{
   int red;
   public InstructionPanel()
   {
     //set up
     super();
     
     //set up the dimensions
     setPreferredSize(new Dimension(800,150));
     
     //add some empty space
     
     JLabel empty10= new JLabel("                                     ");
     add(empty10);
     
     JLabel empty11= new JLabel("                                     ");
     add(empty11);
     
     //create the JLabel that will indicate the controls for p1
     JLabel controls= new JLabel("Player 1 controls: WASD");
     add(controls);
     
     //create the JLabel that will indicate the controls
     JLabel space= new JLabel("                                                                                  ");
     add(space);
     
     //create the JLabel that will indicate the controls
     JLabel space2= new JLabel("                                                                       ");
     add(space2);
     
     //create the JLabel that will indicate the controls for p2
     JLabel controls2= new JLabel("Player 2 controls: ↑↓←→");
     add(controls2);
     
     //add the appropiate empty spaces
     JLabel empty= new JLabel("             ");
     add(empty);
     
     JLabel empty2= new JLabel("                ");
     add(empty2);
     
     JLabel empty3= new JLabel("                ");
     add(empty3);
     
     JLabel empty4= new JLabel("                ");
     add(empty4);
     
     JLabel empty5= new JLabel("                ");
     add(empty5);
     
     JLabel empty6= new JLabel("   ");
     add(empty6);
     
     
          
     
     //add another button that says to start game
     JButton start= new JButton("START GAME!");
     add(start);
     
     //add action listener
     start.addActionListener( new ActionListener()
     {
      public void actionPerformed(ActionEvent e)
      {
        System.out.println("starting game");
        GamePanel.getgp().requestFocusInWindow();
        GamePanel.getgp().t.start();
      }
     }); 
     
     
   }
   
  
} 
