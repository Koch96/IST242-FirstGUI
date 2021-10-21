package FirstGUI;

import javax.swing.*;

/** @author sak5680 */
public class FilledFrameViewer2 {

    public static void main (String[] args){
        JFrame frame = new FilledFrame();
        frame.setTitle("A frame with two components");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    private void createComponents(){
        label = new JLabel("Hello, World!");
        button = new JButton("Click me!");
        panel = new JPanel();
        panel.add(label);
        panel.add(button);
        add(panel);
    }
    
}
