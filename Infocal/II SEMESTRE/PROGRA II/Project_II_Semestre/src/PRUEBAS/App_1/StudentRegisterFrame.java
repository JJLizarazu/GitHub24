package PRUEBAS.App_1;

import javax.swing.*;
import java.awt.event.*;

public class StudentRegisterFrame {
    public JPanel panelStundent;
    public  JLabel title;
    public  JLabel nameLabel;
    public JTextField nameField;
    public JLabel lastFatherLabel;
    public JTextField lastFatherField;
    public JLabel lastMotherLabel;
    public JTextField lastMotherField;
    public JLabel ageLabel;
    public JTextField ageField;
    public JPanel panelStudent_2;
    public JPanel panelStudent_1;
    public JButton confirmStudentBtn;
    public JLabel genderLabel;
    public JTextField genderField;


    public StudentRegisterFrame() {
        confirmStudentBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Student.setName(nameField.getText());
                Student.setLastFatherName(lastFatherField.getText());
                Student.setLastMotherName(lastMotherField.getText());
                Student.setAge(Integer.parseInt(ageField.getText()));
                Student.setGender(genderField.getText());

                Student.registStudent();

                SwingUtilities.windowForComponent(panelStundent).dispose();
                Pane.mainPane();
            }
        });
    }

}
