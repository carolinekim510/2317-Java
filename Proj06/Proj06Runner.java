import java.awt.*;
import java.awt.event.*;
 

class Proj06Runner extends Frame{

        Label label;
        Panel panel;
        Panel mousePanel;

    Proj06Runner() {
        System.out.println("I certify that this program is my own work");
        System.out.println("and is not the work of others. I agree not");
        System.out.println("to share my solution with others.");
        System.out.println("Caroline Kim\n");

        this.setTitle("Caroline Kim");
        this.setSize(320, 200);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                System.exit(0);
            }
        });

        panel = new Panel(new BorderLayout());

        Button button_01 = new Button("This Button does nothing");      
        Button button_02 = new Button("Button");
        TextField textArea = new TextField("This TextField does nothing");

        panel.add(button_01, BorderLayout.NORTH);
        panel.add(button_02, BorderLayout.WEST);
        panel.add(textArea, BorderLayout.SOUTH);
        
        label = new Label();
		label.setForeground(Color.red); 

		mousePanel = new Panel();
		mousePanel.add(label);
    	mousePanel.addMouseMotionListener(new MyMouse());

    	panel.add(mousePanel);
	    add(panel);

        setVisible(true);

    }


        public class MyMouse extends MouseAdapter{

            public void mouseMoved(MouseEvent e){
                label.setForeground(Color.red);
                int x = e.getX() + 5; // <- note here
                if (x < 0) {
                    x = 0;
                }
                int y = e.getY() - 15; // <- note here
                if (y < 0) {
                    y = 0;
                }

                label.setLocation(x, y);
                label.setText(x+", "+y);
            }

            public void mouseDragged(MouseEvent e){
                int x = e.getX() + 5; // <- note here
                if (x < 0) {
                    x = 0;
                }
                int y = e.getY() - 15; // <- note here
                if (y < 0) {
                    y = 0;
                }

                label.setLocation(x, y);
                label.setForeground(Color.black);
                label.setText(x+", "+y);
            }



}       

}


