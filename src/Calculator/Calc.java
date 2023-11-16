package Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc extends JFrame{
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JLabel lblResult;
    private JPanel jpanel;
    private JButton btnCompute;

   public Calc(){

       btnCompute.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               calcRes();

           }

           public void calcRes() {
               int a = Integer.parseInt(tfNumber1.getText());
               int b = Integer.parseInt(tfNumber2.getText());
               String op = (String) cbOperations.getSelectedItem();
               double res = 0;

               switch (op) {
                   case "+":
                       res = a + b;
                       break;
                   case "-":
                       res = a - b;
                       break;
                   case "*":
                       res = a * b;
                       break;
                   case "/":
                       if (b != 0) {
                           res = a / b;
                       } else {
                           lblResult.setText("Error: Cannot divide by zero");
                           return;
                       }
                       break;
                   default:
                       lblResult.setText("Error: Invalid operator");
                       return;
               }

               lblResult.setText(String.valueOf(res));
           }


       });
   }

    public static void main(String[] args) {
        Calc app = new Calc();
        app.setContentPane(app.jpanel);
        JButton btn = new JButton("HIEFS");
        app.setSize(500, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Simple Calculator");
        app.setVisible(true);
    }

}
