import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;

public class AutoCatalogo extends JFrame {
    private JPanel catalogPanel;

    public AutoCatalogo() {
        setTitle("Catálogo de Autos");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        catalogPanel = new JPanel();
        catalogPanel.setLayout(new GridLayout(0, 3, 10, 10)); // 3 columnas, ajuste automático de filas
        JScrollPane scrollPane = new JScrollPane(catalogPanel);
        add(scrollPane, BorderLayout.CENTER);

        // Llenar el catálogo con autos
        cargarAutos();

        setVisible(true);
    }

    private void cargarAutos() {
        ArrayList<Auto> autos = obtenerAutosDesdeBD(); // Simula obtener autos desde la base de datos
        for (Auto auto : autos) {
            JPanel autoPanel = new JPanel();
            autoPanel.setLayout(new BorderLayout());
            autoPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));

            // Mostrar imagen del auto
            JLabel imageLabel = new JLabel();
            ImageIcon icon = new ImageIcon(auto.getImagen());
            Image scaledImage = icon.getImage().getScaledInstance(150, 100, Image.SCALE_SMOOTH);
            imageLabel.setIcon(new ImageIcon(scaledImage));
            autoPanel.add(imageLabel, BorderLayout.CENTER);

            // Mostrar nombre del auto
            JLabel nameLabel = new JLabel(auto.getNombre(), JLabel.CENTER);
            nameLabel.setFont(new Font("Arial", Font.BOLD, 14));
            autoPanel.add(nameLabel, BorderLayout.NORTH);

            // Mostrar precio del auto
            JLabel priceLabel = new JLabel("Precio: $" + auto.getPrecio(), JLabel.CENTER);
            priceLabel.setFont(new Font("Arial", Font.PLAIN, 12));
            autoPanel.add(priceLabel, BorderLayout.SOUTH);

            catalogPanel.add(autoPanel);
        }

        catalogPanel.revalidate();
        catalogPanel.repaint();
    }

    private ArrayList<Auto> obtenerAutosDesdeBD() {
        ArrayList<Auto> autos = new ArrayList<>();
        String url = "jdbc:mysql://localhost:3306/gestion_autos";
        String user = "root";
        String password = "";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String query = "SELECT imagen, nombre, precio FROM autos";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                String imagen = rs.getString("imagen"); // Ruta de la imagen
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");

                autos.add(new Auto(imagen, nombre, precio));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar los autos de la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return autos;
    }

    public static void main(String[] args) {
        new AutoCatalogo();
    }
}

// Clase Auto para representar los datos del auto
class Auto {
    private String imagen;
    private String nombre;
    private double precio;

    public Auto(String imagen, String nombre, double precio) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}

