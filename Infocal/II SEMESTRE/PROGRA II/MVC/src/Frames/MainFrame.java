package Frames;

import javax.swing.*;
import java.awt.event.*;

public class MainFrame {
    protected JPanel PanelMain;
    protected JPanel header;
    protected JPanel body;
    protected JLabel title;
    protected JButton StudentBtn;
    protected JButton OutBtn;

    public MainFrame() {
        StudentBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.getWindowAncestor(PanelMain).dispose();
                Panels.studentsFrame();
            }
        });
        OutBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.getWindowAncestor(PanelMain).dispose();
            }
        });
    }

}
