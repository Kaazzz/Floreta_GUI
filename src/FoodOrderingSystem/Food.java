package FoodOrderingSystem;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Food extends JFrame{
    private JPanel jpanel;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;


    public Food() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcRes();
            }

            public void calcRes(){
                double total = 0;
                double discount = 0;

                if(cPizza.isSelected()) {
                    total += 100;
                }
                if(cBurger.isSelected()) {
                    total += 80;
                }
                if(cFries.isSelected()) {
                    total += 65;
                }
                if(cSoftDrinks.isSelected()) {
                    total += 55;
                }
                if(cTea.isSelected()) {
                    total += 50;
                }
                if(cSundae.isSelected()) {
                    total += 40;
                }

                if(rbNone.isSelected()) {
                    JOptionPane.showMessageDialog(Food.this, "The total price is Php " + total);
                }

                if(rb5.isSelected()) {
                    discount = total*0.05;
                }
                if(rb10.isSelected()) {
                    discount = total* 0.10;
                }
                if(rb15.isSelected()) {
                    discount = total*0.15;
                }
                total -= discount;
                JOptionPane.showMessageDialog(Food.this, "The total price is Php " + String.format("%.2f", total));
            }
        });
    }

    public static void main(String[] args) {
        Food app = new Food();
        app.setContentPane(app.jpanel);
        JButton btn = new JButton("HIEFS");
        app.setSize(500, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Food Ordering System");
        app.setVisible(true);
    }
}
