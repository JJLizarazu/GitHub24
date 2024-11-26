package Frames;

import Frames.Students.AddStudents;
import Frames.Students.ShowStudents;

import javax.swing.*;


public class Panels {

    static ImageIcon imageIcon = new ImageIcon("src/Resources/logoInfocal.png");
    //ndgug4hb7f
    // 7eg7ef h e
    // 8eduee
    // sdhudhue euhweihfew ueuueuhw h
    // di9dejihiuedjie uedhwedbuedhjn uifehjbuiefuiwefjkbueifbkjbeuikwje fukhc,MENBDKIASHFKWBFIUDHFKSJBCLWIUBLIWEUGDEJFBLIUEWHFEJBLUEBFKEJB
    public static void mainFrame(){
        JFrame mainFrame = new JFrame("COLEGIO INFOCAL");
        mainFrame.setIconImage(imageIcon.getImage());
        mainFrame.setContentPane(new MainFrame().PanelMain);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setBounds(520, 200, 450, 300);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
    }

    public static void studentsFrame(){
        JFrame studentsFrame = new JFrame("ESTUDIANTES");
        studentsFrame.setIconImage(imageIcon.getImage());
        studentsFrame.setContentPane(new StudentsFrame().PanelStudents);
        studentsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studentsFrame.setBounds(450, 150, 550, 500);
        studentsFrame.setResizable(false);
        studentsFrame.setVisible(true);
    }

    public static void addStudentsFrame(){
        JFrame addStudentsFrame = new JFrame("AÑADIR ESTUDIANTE");
        addStudentsFrame.setIconImage(imageIcon.getImage());
        addStudentsFrame.setContentPane(new AddStudents().PanelAdd);
        addStudentsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addStudentsFrame.setBounds(550, 200, 400, 400);
        addStudentsFrame.setResizable(false);
        addStudentsFrame.setVisible(true);
    }

    public static void showStudentsFrame(){
        JFrame showStudentsFrame = new JFrame("MOSTRAR ESTUDIANTES");
        showStudentsFrame.setIconImage(imageIcon.getImage());
        showStudentsFrame.setContentPane(new ShowStudents().PanelShow);
        showStudentsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        showStudentsFrame.setBounds(525,200,620,350);
        showStudentsFrame.setResizable(false);
        //sui fiwf euifhwefujhdufhibweyeyf fbrbhfhr f
        // fehuernfu9enur euheuihe efuefjneurueurbehtuiw8gerbyg3udiusjhedfhjeqguy qeruyguyhugyrejhgiewyu8gr83hgt873kjgi7etfi2iubriu2t82ubkjtefjhvruyt23vqhjquiwrte68rq8ey9tr6et8t3r
        //lilwd 7yru8y73ruhyy38ru h78ruhuiriu8e7rby38u78euigrhui7e87yrhq7wuuwuwuwuwuwuwuwuwuwuuwu6er3yugeyy
        //hnfu  efuighe uifhgh efkiugwenkbiufj7 jUIuahuef jose ijzaiur y9e8f kheiuhfbeuigrubeurbiekjfiebiufliuhewiwnbfiuiudfiu yeuih uiefkjuifjjuabeueb idfiuebu9gjhbeygygfuyge
        showStudentsFrame.setVisible(true);
    }

}
