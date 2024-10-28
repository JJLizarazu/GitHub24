package PRUEBAS.App_1;

import javax.swing.*;
import java.awt.event.*;

public class RegisterFrame {
    protected JPanel panelRegister;
    protected JLabel title_R;
    protected JLabel subTitle;
    protected JPanel panelRegister_1;
    protected JButton studentBtn;
    protected JButton teacherBtn;
    protected JButton backBtn;

    public RegisterFrame() {
        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.getWindowAncestor(panelRegister).dispose();
                Pane.mainPane();
            }
        });
        
        studentBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.getWindowAncestor(panelRegister).dispose();
                Pane.registerStudentPane();
            }
        });
        
    }
}
