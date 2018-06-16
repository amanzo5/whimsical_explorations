/*Lab7:DrawingandCheckBoxesandRadioButtons*/
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class JFrameShape extends JFrame
{
 public JFrameShape()
 {
  //create our header for the JFrame
  super("Shapes!"); 
   
  //create our Container
  Container contents= getContentPane();
    
  //set layout manager
  contents.setLayout(new BorderLayout());
    
  //set the size and visibility
  setSize(800,530);
  setVisible(true);
  
  //add our mainpanel
  contents.add(new MainPanel()); 
 
 }
 
  public static void main(String[]args)
  {
    JFrameShape theFrame=new JFrameShape();
    theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
