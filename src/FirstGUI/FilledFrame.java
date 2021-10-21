package FirstGUI;

import javax.swing.*;

/** @author sak5680 */
public class FilledFrame extends JFrame{

    private JLabel label;
    private JButton button;
    private JPanel panel;
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 100;
    
    public FilledFrame() {
        label = new JLabel("Hello world!");
        button = new JButton("Click here");
        panel = new JPanel();
        
        panel.add(label);
        panel.add(button);
        
        add(panel);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
    
}
