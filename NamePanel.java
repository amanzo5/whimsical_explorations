/*Written By Ashley Manzo*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class NamePanel extends JPanel  
{
  private JTextField name;
  private JTextField name2;
    
  
  
  public NamePanel()  
  {
      //create our super to create the head title of the popup window
      super();
      
      //add instructions to changing name
      JLabel instruction= new JLabel("Press Enter to Change Player Name");                                   
      instruction.setFont(instruction.getFont().deriveFont(Font.BOLD, 10f));
      add(instruction);
      
     
   
      //create the place where you will keep all the contents 
      JLabel nameplayer= new JLabel("Player One Name:");
      
      //add the label which has the name in it to the layout
      add(nameplayer);
      
      //set the dimensions
      setPreferredSize(new Dimension(800,100));
      Color bluebell = new Color(84,182,204);
      nameplayer.setBackground(bluebell);
      
      
      
      //instantiate a text field
      name=new JTextField("",13);
      add(name);
      
      
      //-------------------------------------------------------------------------------
      
      //create the place where you will keep all the contents
      JLabel nameplayer2= new JLabel("Player Two Name:");
      
      //add the label which has the name in it to the layout
      add(nameplayer2);
      
      //set the dimensions
      Color brick= new Color(212,19,2);

      setPreferredSize(new Dimension(800,50));
      nameplayer2.setBackground(brick);
      
      //instantiate a text field
      name2=new JTextField("",13);
      add(name2);

      
      //add an action listener
      name.addActionListener(new ActionListener()
      {
       
       public void actionPerformed(ActionEvent e)
       {
         GamePanel.getgp().SetName(name.getText());
         repaint();
         
       }
      });
      
      name2.addActionListener(new ActionListener()
      {
       
       public void actionPerformed(ActionEvent e)
       {
         GamePanel.getgp().SetName2(name2.getText());
         repaint();
         
       }
      });
       
      
  }  
}