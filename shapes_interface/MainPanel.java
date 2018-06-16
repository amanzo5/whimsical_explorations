/*Lab7:DrawingandCheckBoxesandRadioButtons*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainPanel extends JPanel
{
  //instantiate our left panel
  private JPanel leftPanel = new JPanel();
  private JPanel rightPanel= new JPanel();
  
  //create JRadioButtons
  
  
  private JRadioButton squarebutton=new JRadioButton("Square");
  private JRadioButton circlebutton=new JRadioButton("Circle");
  private JRadioButton rectbutton=new JRadioButton("Rectangle");
  
  //create JCheckboxes
  private JCheckBox red=new JCheckBox("Red");
  private JCheckBox green=new JCheckBox("Green");
  private JCheckBox blue=new JCheckBox("Blue");
  
  //panel center
  CenterPanel centerpanel=new CenterPanel();
  
  //create a singleton just in case
  private static MainPanel mp;
  public static MainPanel getMainPanel()
  {
   return mp;
  }
 
  public MainPanel()
  {    
    //super
    super();
    
    //set up our borderlayout
    setLayout(new BorderLayout());
    //set up the preferred dimensions
    leftPanel.setPreferredSize(new Dimension (200,500));
    //set up color
    Color pink = new Color(255,173,180);
    leftPanel.setBackground(pink);
    
    //adding actionlisteners to the buttons
    rectbutton.addItemListener(new CheckBoxListener());
    squarebutton.addItemListener(new CheckBoxListener());
    circlebutton.addItemListener(new CheckBoxListener());
    red.addItemListener(new CheckBoxListener());
    blue.addItemListener(new CheckBoxListener());
    green  .addItemListener(new CheckBoxListener());



   
    //add the panels locations,adding the seperate panel that was its own class (CenterPanel)
    
    add(leftPanel, BorderLayout.WEST);
    add(centerpanel, BorderLayout.CENTER);
    add(rightPanel, BorderLayout.EAST);
    
    
    //add our label that says "shape:"
    JLabel lb1= new JLabel("Shape:");
    JLabel lb2=new JLabel("                      ");
    JLabel lb3=new JLabel("                      ");
    JLabel lb4=new JLabel("                      ");
    JLabel lb5=new JLabel("                      ");
   
    leftPanel.add(lb1);
    leftPanel.add(lb2);
    leftPanel.add(lb3);
    leftPanel.add(lb4);
    leftPanel.add(lb5);
    
    //set space before square button 
    JLabel lb6=new JLabel("       ");
    JLabel lb7=new JLabel("       ");
    JLabel lb8=new JLabel("       ");
    
    leftPanel.add(lb6);
    leftPanel.add(lb7);
    leftPanel.add(lb8);
    
    //add jradiobuttons
    
    leftPanel.add(squarebutton);
    //add space 
    JLabel lb9=new JLabel("                      ");
    JLabel lb10=new JLabel("                     ");
    JLabel lb11=new JLabel("                     ");
    JLabel lb12=new JLabel("                     ");
    leftPanel.add(lb9);
    leftPanel.add(lb10);
    leftPanel.add(lb11);
    leftPanel.add(lb12);
   
    
    
    leftPanel.add(circlebutton);
    //add space 
    JLabel lb13=new JLabel("                       ");
    JLabel lb14=new JLabel("                       ");
    JLabel lb15=new JLabel("                       ");
    JLabel lb16=new JLabel("                       ");
    leftPanel.add(lb13);
    leftPanel.add(lb14);
    leftPanel.add(lb15);
    leftPanel.add(lb16);
    
    leftPanel.add(rectbutton);
    //add space 
    JLabel lb17=new JLabel("                           ");
    JLabel lb18=new JLabel("                           ");
    
    leftPanel.add(lb17);
    leftPanel.add(lb18);
    
    //add buttongroup
    ButtonGroup bg=new ButtonGroup();
    bg.add(rectbutton);
    bg.add(squarebutton);
    bg.add(circlebutton);
    
    //add our checkboxes 
    leftPanel.add(red);
    leftPanel.add(blue);
    leftPanel.add(green);
    
    
    
   
    //working on our right panel!!!! learning how to add buttons, these do not have function yet
    
    
    //set gridLayout
    setLayout(new GridLayout(1,4));
    
    //make new buttons 
    JButton b1= new JButton("Do Action 1");
    JButton b2= new JButton("Do Action 2");
    JButton b3= new JButton("Do Action 3");
    JButton b4= new JButton("Do Action 4");
    
    //add buttons to the right panel
    rightPanel.add(b1);
    rightPanel.add(b2);
    rightPanel.add(b3);
    rightPanel.add(b4);
    
    //set the dimensions of the right panel 
    rightPanel.setPreferredSize(new Dimension (200,500));
    
    
    
    
    
    
    
   }
   
   //do our checkbox listener
   public class CheckBoxListener implements ItemListener
   {
    public void itemStateChanged(ItemEvent ie)
    {
     if(ie.getSource()==rectbutton && ie.getStateChange()== ItemEvent.SELECTED)
     {
      CenterPanel.getcp().drawRectangle();
      CenterPanel.getcp().repaint();
     }
     if(ie.getSource()==squarebutton && ie.getStateChange()== ItemEvent.SELECTED)
     {
      CenterPanel.getcp().drawSquare();
      CenterPanel.getcp().repaint();
     }
     if(ie.getSource()==circlebutton && ie.getStateChange()== ItemEvent.SELECTED)
     {
      CenterPanel.getcp().drawCircle();
      CenterPanel.getcp().repaint();
     }
     if(ie.getSource()==red && ie.getStateChange()== ItemEvent.SELECTED)
     {
      CenterPanel.getcp().setRed();
      CenterPanel.getcp().repaint();
     }
     else if(ie.getSource()==red && ie.getStateChange()== ItemEvent.DESELECTED)
     {
      CenterPanel.getcp().setRedto0();
      CenterPanel.getcp().repaint();
     }
     if(ie.getSource()==blue && ie.getStateChange()== ItemEvent.SELECTED)
     {
      CenterPanel.getcp().setBlue();
      CenterPanel.getcp().repaint();
     }
     else if(ie.getSource()==blue && ie.getStateChange()== ItemEvent.DESELECTED)
     {
      CenterPanel.getcp().setBlueto0();
      CenterPanel.getcp().repaint();
     }
     if(ie.getSource()==green && ie.getStateChange()== ItemEvent.SELECTED)
     {
      CenterPanel.getcp().setGreen();
      CenterPanel.getcp().repaint();
     }
     else if(ie.getSource()==green && ie.getStateChange()== ItemEvent.DESELECTED)
     {
      CenterPanel.getcp().setGreento0();
      CenterPanel.getcp().repaint();
     }
    }
   }
   
   //create methods to retrieve Buttons (not sure if these are necessary)
   public JRadioButton getRect()
   {
    return rectbutton;
   }
   
   
   public JRadioButton getCircle()
   {
    return circlebutton;
   }
   
   
   public JRadioButton getSquare()
   {
    return squarebutton;
   }
   
   
   public JCheckBox getRed()
   {
    return red;
   }
   
   public JCheckBox getGreen()
   {
    return green;
   }
   
   public JCheckBox getBlue()
   {
    return blue;
   }


}
