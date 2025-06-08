import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpringForceCalculator extends JFrame {

    private final JTextField stiffnessField;
    private final JTextField displacementField;
    private final JTextField resultField;

    public SpringForceCalculator() {
        setTitle("Обчислення сили пружини");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null); // Центрує вікно

        // Створюємо панель і компоненти
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel stiffnessLabel = new JLabel("Жорсткість пружини (k), Н/м:");
        stiffnessField = new JTextField();

        JLabel displacementLabel = new JLabel("Деформація (x), м:");
        displacementField = new JTextField();

        JLabel resultLabel = new JLabel("Сила (F), Н:");
        resultField = new JTextField();
        resultField.setEditable(false);
        resultField.setBackground(Color.LIGHT_GRAY);

        JButton calculateButton = new JButton("Обчислити");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateForce();
            }
        });

        // Додаємо компоненти на панель
        panel.add(stiffnessLabel);
        panel.add(stiffnessField);
        panel.add(displacementLabel);
        panel.add(displacementField);
        panel.add(resultLabel);
        panel.add(resultField);
        panel.add(new JLabel()); // порожня клітинка
        panel.add(calculateButton);

        // Додаємо панель у вікно
        add(panel);
        setVisible(true);
    }

    private void calculateForce() {
        try {
            double k = Double.parseDouble(stiffnessField.getText());
            double x = Double.parseDouble(displacementField.getText());
            double force = k * x;
            resultField.setText(String.format("%.2f", force));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Будь ласка, введіть коректні числові значення.",
                    "Помилка введення",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SpringForceCalculator::new);
    }
}
