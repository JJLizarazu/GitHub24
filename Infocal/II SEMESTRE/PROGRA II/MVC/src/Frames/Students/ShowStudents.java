package Frames.Students;

import Frames.Panels;
import View.StudentVIEW;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowStudents {
    public JPanel PanelShow;
    protected JLabel label1;
    protected JButton backBtn;
    protected JPanel buttonFooter;
    protected JPanel main;
    protected JScrollPane scroll;

    public ShowStudents() {
        label1.setText(StudentVIEW.showStudent());
        scroll.setViewportView(label1);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);


        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.getWindowAncestor(PanelShow).dispose();
                Panels.studentsFrame();
            }
        });
    }
}
