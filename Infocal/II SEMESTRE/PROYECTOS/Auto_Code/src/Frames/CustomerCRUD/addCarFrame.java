package Frames.CustomerCRUD;
import Controller.Car.CarController;
import Model.Car.CarDAO;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class addCarFrame {
    public JPanel addCarPanel;
    public JLabel label1;
    public JPanel main;
    public JPanel header;
    public JPanel footer;
    public JPanel body;
    public JButton uploadCarBtn;
    public JTextField brandField;
    public JLabel label2;
    public JLabel label3;
    public JLabel label5;
    public JLabel label6;
    public JLabel label7;
    public JButton uploadImgBtn;
    public JTextField modelField;
    public JTextField yearField;
    public JTextField kmField;
    public JTextField priceField;
    public JButton backBtn;
    public JLabel label9;
    public JLabel label10;
    public JRadioButton sellRadio;
    public JRadioButton rentRadio;

    public addCarFrame() {
        addCarPanel = new BackgroundPanel("src/Resources/addCarImage.png");
        header.setOpaque(true);
        header.setBackground(new Color(255, 255, 255, 0));

        body.setOpaque(true);
        body.setBackground(new Color(255, 255, 255, 0));

        footer.setOpaque(true);
        footer.setBackground(new Color(255, 255, 255, 0));

        main.setOpaque(true);
        main.setBackground(new Color(255, 255, 255, 0));
        main.setPreferredSize(new Dimension(1550, 830));

        addCarPanel.add(main);
        // Acción para el botón de retroceder
        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panels.Panel.homePanel();
                SwingUtilities.getWindowAncestor(addCarPanel).dispose();
            }
        });

        uploadImgBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Seleccionar una Imagen");
                fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
                        "Archivos de Imagen", "jpg", "png", "jpeg", "gif"));

                int result = fileChooser.showOpenDialog(addCarPanel);

                if (result == JFileChooser.APPROVE_OPTION) {
                    String imagePath = fileChooser.getSelectedFile().getAbsolutePath(); // Ruta seleccionada
                    // -------------------------
                    CarDAO.setImage(imagePath);
                    // -------------------------
                    JOptionPane.showMessageDialog(addCarPanel,
                            "Imagen seleccionada: " + imagePath, "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } else if (result == JFileChooser.CANCEL_OPTION) {
                    JOptionPane.showMessageDialog(addCarPanel,
                            "Selección de imagen cancelada", "Cancelado", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        uploadCarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (brandField.getText().isEmpty() || yearField.getText().isEmpty()
                || kmField.getText().isEmpty() || priceField.getText().isEmpty()) {
                    if (sellRadio.isSelected() && rentRadio.isSelected()) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Por favor, seleccione solo una de las opciones para continuar.",
                                "Error de Registro",
                                JOptionPane.WARNING_MESSAGE);
                    } else if(!sellRadio.isSelected() && !rentRadio.isSelected()) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Por favor, debe seleccionar al menos una opción.",
                                "Campos vacíos",
                                JOptionPane.WARNING_MESSAGE);
                    }
                    JOptionPane.showMessageDialog(
                            null,
                            "Por favor, complete todos los campos antes de continuar.",
                            "Campos vacíos",
                            JOptionPane.WARNING_MESSAGE);

                } else {
                    CarController.setCar(brandField, modelField, yearField, kmField, priceField);

                    if (sellRadio.isSelected()) {
                        //----------------
                        CarDAO.setPurpose("Venta");
                        //----------------
                    } else if(rentRadio.isSelected()){
                        //----------------
                        CarDAO.setPurpose("Alquiler");
                        //----------------
                    }

                    //--------------
                    CarDAO.addCar();
                    //--------------

                    Panels.Panel.homePanel();
                    SwingUtilities.getWindowAncestor(addCarPanel).dispose();
                }
            }
        });
    }

    class BackgroundPanel extends JPanel {
        public BufferedImage backgroundImage;

        public BackgroundPanel(String imagePath) {
            try {
                backgroundImage = ImageIO.read(new File(imagePath));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (backgroundImage != null) {
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        }
    }
}
