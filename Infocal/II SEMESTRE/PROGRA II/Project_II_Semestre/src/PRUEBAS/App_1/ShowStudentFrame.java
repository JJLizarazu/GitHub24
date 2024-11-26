package PRUEBAS.App_1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;

public class ShowStudentFrame {
    protected JPanel ShowStudentPanel;
    protected JLabel label1;
    protected JButton backBtn;
    protected JScrollPane scroll;
    private JPanel main;
    private JPanel buttonFooter;

    public ShowStudentFrame() {
        label1.setText(Student.showStudent());
        scroll.setViewportView(label1);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);


        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.getWindowAncestor(ShowStudentPanel).dispose();
                Pane.mainPane();
            }
        });
    }
}
