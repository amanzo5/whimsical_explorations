/*Written By Ashley Manzo*/
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class JFrameGame extends JFrame
{
  
  private JPanel NamePanel;
  private JPanel InstructionPanel;
  private JPanel GamePanel;
 
  public JFrameGame()
  { 
    //create our header for the JFrame
    super("Are you ready? Let's play!"); 
    
    //create our Container
    Container contents= getContentPane();
    
    //set layout manager
    contents.setLayout(new FlowLayout());
    
    //set the size and visibility
    setSize(800,800);
    setVisible(true);
    
    //add my panel to the layout, to the contents
    contents.add(new NamePanel());
    //contents.add(new NamePanel2());
    
    //add my instruction panel, to the contents 
    contents.add(new InstructionPanel()); 
    
    //add out the game panel, to the contents
    contents.add(new GamePanel()); 
    
    
   
  }
  
  
  
  
 
  
  public static void main(String[]args)
  {
    JFrameGame theFrame=new JFrameGame();
    theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
