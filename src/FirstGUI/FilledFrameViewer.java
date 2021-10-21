package FirstGUI;

import javax.swing.*;

/** @author sak5680 */
public class FilledFrameViewer {

    public static void main(String[] args){
        JFrame frame = new JFrame();
        
        JButton button = new JButton("Click me!");
        JLabel label = new JLabel("Hello, World!");
        
        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        frame.add(panel);
        
        final int FRAME_WIDTH = 300;
        final int FRAME_HEIGHT = 100;
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("A frame with two components");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
    }
    
}
