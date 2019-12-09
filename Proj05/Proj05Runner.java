import javax.swing.JFrame.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Proj05Runner {

    Proj05Runner() {
        System.out.println("I certify that this program is my own work");
        System.out.println("and is not the work of others. I agree not");
        System.out.println("to share my solution with others.");
        System.out.println("Caroline Kim\n");

        // JFrame
        JFrame frame = new JFrame("Caroline Kim");
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        // JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        frame.add(panel);

        // JLabel
        JLabel display = new JLabel();
        panel.add(display, BorderLayout.NORTH);

        // Adding mouse linster TO the PANEL so the coordinates inside of the PANEL instead of frame
        panel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                display.setText(x + ", " + y);
            }
        });

        // Button
        JButton button = new JButton("Quit");
        button.addActionListener(e -> {
            System.exit(0);
        });
        frame.add(button, BorderLayout.NORTH);

        frame.setVisible(true);
    }

}