import javax.swing.*;


public class LeapYear extends JFrame{
    private JTextField tfYear;
    private JButton btnCheckYear;
    private JPanel jpanel;

    public LeapYear() {
        btnCheckYear.addActionListener(e -> {
            int n = Integer.parseInt(tfYear.getText());
            if((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
                JOptionPane.showMessageDialog(LeapYear.this, "Leap Year");
            } else {
                JOptionPane.showMessageDialog(LeapYear.this, "Not a leap Year");
            }
        });
    }
    public static void main(String[] args) {
        LeapYear app = new LeapYear();
        app.setContentPane(app.jpanel);
        app.setSize(500, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);
    }
}
