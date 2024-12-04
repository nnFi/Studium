package Frame;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Frame extends JFrame {
    private JFrame maindwindow;
    private JTextField tf_gewicht;
    private JTextField tf_groesse;
    private JTextField tf_bmi;
    private JButton btn_calculate;

    public Frame() {
        super();
        maindwindow = this;

        this.setTitle("BMI-Rechner");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);

        //BMI
        JLabel lb_bmi = new JLabel("BMI:");
        tf_bmi = new JTextField(10);
        tf_bmi.setEditable(false);
        this.add(lb_bmi);
        this.add(tf_bmi);

        //Gewicht
        JLabel lb_gewicht = new JLabel("Gewicht:");
        tf_gewicht = new JTextField(10);
        this.add(lb_gewicht);
        this.add(tf_gewicht);

        //Größe
        JLabel lb_groesse = new JLabel("Größe:");
        tf_groesse = new JTextField(10);
        this.add(lb_groesse);
        this.add(tf_groesse);

        //Berechne Knopf
        btn_calculate = new JButton("berechne");
        //btn_calculate.addActionListener(rechne()); //Alternative zum Lambda-Ausdruck
        btn_calculate.addActionListener(event -> {
            try {
                Double gewicht = Double.parseDouble(tf_gewicht.getText());
                Double groesse = Double.parseDouble(tf_groesse.getText());
                Double bmi = gewicht / (groesse * groesse);
                tf_bmi.setText(Double.toString(bmi));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(maindwindow,e.getMessage(),"FEHLER", JOptionPane.ERROR_MESSAGE);
            }
        });
        this.add(btn_calculate);

        this.pack();
    }

    //Alternative zu Lambda-Ausdruck
    public ActionListener rechne(){
        try {
            Double gewicht = Double.parseDouble(this.tf_gewicht.getText());
            Double groesse = Double.parseDouble(this.tf_groesse.getText());
            Double bmi = gewicht / (groesse * groesse);
            tf_bmi.setText(Double.toString(Math.round(bmi*100)/100));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"es ist ein Fehler Afgetreten","FEHLER", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}
