package Frames;

import View.StudentVIEW;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentsFrame {
    protected JPanel PanelStudents;
    protected JPanel header;
    protected JPanel body;
    protected JPanel footer;
    protected JLabel title;
    protected JButton addBtn;
    protected JButton showBtn;
    protected JButton searchBtn;
    protected JButton deleteBtn;
    protected JButton updateBtn;
    protected JButton StudentBtn;

    public StudentsFrame() {

        StudentBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.getWindowAncestor(PanelStudents).dispose();
                Panels.mainFrame();
            }
        });
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.getWindowAncestor(PanelStudents).dispose();
                Panels.addStudentsFrame();
            }
        });

        showBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentVIEW.showStudent();
                SwingUtilities.getWindowAncestor(PanelStudents).dispose();
                Panels.showStudentsFrame();
            }
        });
    }

}
