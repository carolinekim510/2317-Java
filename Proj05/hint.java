import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Proj05Runner {
 
  public Proj05Runner(){//constructor
    JFrame theFrame = new JFrame();
    theFrame.setSize(200,200);
    theFrame.setTitle("Your Name");
    JButton northButton = new JButton("Quit");
    theFrame.getContentPane().add(northButton,"North");
    JButton westButton = new JButton("West");
    theFrame.getContentPane().add(westButton,"West");
    JButton southButton = new JButton("South");
    theFrame.getContentPane().add(southButton,"South");
    JButton eastButton = new JButton("East");
    theFrame.getContentPane().add(eastButton,"East");
   
   
    DisplaySpace displayWindow = new DisplaySpace();
    theFrame.getContentPane().add(displayWindow,"Center");

    System.out.println("Proj05");
    System.out.println(
      "I certify that this program is my own work");
    System.out.println(
      "and is not the work of others. I agree not");
    System.out.println("to share my solution with others.");
    System.out.println("Print your name here.");
    System.out.println();

    displayWindow.setForeground(Color.RED);

    theFrame.setDefaultCloseOperation(
                              JFrame.EXIT_ON_CLOSE);

    theFrame.setVisible(true);

    //Register an anonymous action lister to terminate
    // the program when the user clicks the Quit button

    northButton.addActionListener(
      new ActionListener(){
        public void actionPerformed(ActionEvent e){
          System.exit(0);
        }//end actionPerformed()
      }//end new ActionListener
    );//end addActionListener

    //Instantiate and register a Listener object that will
    // process mouse events to determine and display the
    // coordinates when the user presses the mouse button.
    displayWindow.addMouseListener(
                                new MProc1(displayWindow));
  }//end constructor
//=======================================================//
//Begin inner class definitions

private class DisplaySpace extends JPanel{

  int clickX;
  int clickY;

  public void paintComponent(Graphics g){
    super.paintComponent(g);

    g.drawString(
      "Y=" + clickY + ", X=" + clickX, clickX, clickY+10);
  }//end paintComponent
}//end class DisplaySpace
//=======================================================//

//This listener class monitors for mouse presses and
// displays the coordinates of the mouse pointer when the
// mouse is pressed.
private class MProc1 implements MouseListener{
  DisplaySpace refToWin;

  MProc1(DisplaySpace inWin){//constructor
    refToWin = inWin;//save ref to window
  }//end constructor

  public void mouseClicked(MouseEvent e){}
  public void mouseReleased(MouseEvent e){}
  public void mouseEntered(MouseEvent e){}
  public void mouseExited(MouseEvent e){}

  //Override the mousePressed method to determine and
  // display the coordinates when the mouse is pressed.
  public void mousePressed(MouseEvent e){
    //Get X and Y coordinates of mouse pointer
    // and store in the JFrame object.
    refToWin.clickX = e.getX();
    refToWin.clickY = e.getY();
    refToWin.repaint();//display coordinate information
  }//end mousePressed()
}//end class MProc1
}//end Proj05Runner class
//======================================================//
