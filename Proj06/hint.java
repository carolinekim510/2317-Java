import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.TextField;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Proj06Runner extends Frame{
  private int xCoor;
  private int yCoor;
  private Proj06Runner thisFrame;
  private Panel myPanel = new MyPanel();

  public Proj06Runner(){//constructor
    this.setSize(300,200);

    this.add(new Button(
          "This Button does nothing"),BorderLayout.SOUTH);
    this.add(new TextField(
       "This TextField does nothing"),BorderLayout.NORTH);
    this.add(new Button("West"),BorderLayout.WEST);
    this.add(myPanel);
   
    this.setVisible(true);
    thisFrame = this;

    this.addWindowListener(new WindowCloser());

    myPanel.addMouseMotionListener(new MouseHandler());
   
    System.out.println("Proj06");
    System.out.println(
      "Students: Don't forget to print your certification.");
    System.out.println();
  }//end constructor

//=======================================================//

//Begin definitions of three inner classes.

//=======================================================//

private class MyPanel extends Panel{
  public void paint(Graphics g){
    g.drawString("" + xCoor + ", " + yCoor, xCoor, yCoor);
  }//end paint()
}//end class MyPanel
//=======================================================//

private class MouseHandler extends MouseMotionAdapter{

  public void mouseDragged(MouseEvent e){
    myPanel.setForeground(Color.RED);

    xCoor = e.getX();
    yCoor = e.getY();

    myPanel.repaint();

  }//end mouseDragged()
  //----------------------------------------------------//

  public void mouseMoved(MouseEvent e){

    myPanel.setForeground(Color.BLACK);

    xCoor = e.getX();
    yCoor = e.getY();
    //Force a repaint to display the coordinate information

    myPanel.repaint();

  }//end mouseDragged()

}//end inner class MouseHandler
//=========================================================

private class WindowCloser extends WindowAdapter{
  public void windowClosing(WindowEvent e){
    System.exit(0);
  }//end windowClosing()
}//end inner class WindowCloser
//=======================================================//
//End definitions of three inner classes.
//=======================================================//
}//end class Proj06Runner
//=======================================================//

