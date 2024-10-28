package SchoolApp;

import javax.swing.*;

public class Test {
    private JPanel main;
    private JLabel title;
    private JPanel Header;
    private JPanel body;
    private JTextField textField1;
    private JTextField textField2;
    private JButton INICIARSESIÓNButton;

    public Test() {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new Test().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
    }

}
