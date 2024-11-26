package Frames.Students;

import Frames.Panels;
import Model.Student;
import Model.StudentDAO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AddStudents {
    public JPanel PanelAdd;
    protected JPanel header;
    protected JPanel body;
    protected JPanel footer;
    protected JLabel title;
    protected JLabel nameLabel;
    protected JTextField nameField;
    protected JLabel FatherLabel;
    protected JTextField lastFatherNameField;
    protected JCheckBox hombreCheckBox;
    protected JCheckBox mujerCheckBox;
    protected JButton addBtn;
    protected JLabel MotherLabel;
    protected JTextField lastMotherNameField;
    protected JLabel emailLabel;
    protected JTextField emailField;
    protected JLabel genderLabel;
    protected JLabel edadLabel;
    protected JTextField edadField;
    protected JButton backBtn;

    public AddStudents() {

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.getWindowAncestor(PanelAdd).dispose();
                Panels.studentsFrame();
            }
        });
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String male, female;
                if (nameField.getText().isEmpty() || lastFatherNameField.getText().isEmpty() || lastMotherNameField.getText().isEmpty()
                || emailField.getText().isEmpty() || edadField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "LLENE LOS CAMPOS PARA CONTINUAR");
                } else {
                    Student.setName(nameField.getText());
                    Student.setLastFatherName(lastFatherNameField.getText());
                    Student.setLastMotherName(lastMotherNameField.getText());
                    Student.setEmail(emailField.getText());
                    Student.setAge(Integer.parseInt(edadField.getText()));

                    if(hombreCheckBox.isSelected() && mujerCheckBox.isSelected()) {
                        JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR SOLO UNA CASILLA");
                    } else if (!hombreCheckBox.isSelected() && !mujerCheckBox.isSelected()) {
                        JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR ALGUNA DE LAS CASILLAS");
                    } else if(hombreCheckBox.isSelected()) {
                        Student.setGender("Masculino");
                    } else {
                        Student.setGender("Femenino");
                    }

                    StudentDAO.addStudent();
                    SwingUtilities.getWindowAncestor(PanelAdd).dispose();
                    Panels.studentsFrame();
                }
            }
        });
    }

}
