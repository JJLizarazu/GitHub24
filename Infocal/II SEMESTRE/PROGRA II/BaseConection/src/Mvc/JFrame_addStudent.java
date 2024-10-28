package Mvc;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class JFrame_addStudent {
    protected JPanel addStudentPanel;
    protected JLabel title;
    protected JTextField nameField;
    protected JTextField lastFatherNameField;
    protected JLabel nameLabel;
    protected JLabel lastFatherLabel;
    protected JTextField lastMotherNameField;
    protected JLabel lastMotherLabel;
    protected JTextField numberPhoneField;
    protected JLabel phoneLabel;
    protected JTextField emailField;
    protected JLabel emailLabel;
    protected JPanel header;
    protected JPanel body;
    protected JPanel footPage;
    protected JButton addButton;
    private JButton backButton;

    public JFrame_addStudent() {
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (nameField.getText().isEmpty() || lastFatherNameField.getText().isEmpty() || lastMotherNameField.getText().isEmpty() ||
                        numberPhoneField.getText().isEmpty() || numberPhoneField.getText().isEmpty() || emailField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos!");
                } else {
                    Student.setNameStudent(nameField.getText());
                    Student.setLastNameFather(lastFatherNameField.getText());
                    Student.setLastNameMother(lastMotherNameField.getText());
                    Student.setNumberPhone(Integer.parseInt(numberPhoneField.getText()));
                    Student.setEmail(emailField.getText());

                    Student.addStudent();
                    SwingUtilities.getWindowAncestor(addStudentPanel).dispose();
                    Pane.mainPane();
                }
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.getWindowAncestor(addStudentPanel).dispose();
                Pane.mainPane();
            }
        });
    }
}
