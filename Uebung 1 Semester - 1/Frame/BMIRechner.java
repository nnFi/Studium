package Frame;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class BMIRechner extends JFrame {

    private JFrame maindwindow;
    private JTextField tf_gewicht;
    private JTextField tf_groesse;
    private JTextField tf_bmi;
    private JButton btn_calculate;
    private JButton btn_delete;

    public BMIRechner() {
        super();
        maindwindow = this;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Gewicht:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		tf_gewicht = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		contentPane.add(tf_gewicht, gbc_textField);
		tf_gewicht.setColumns(5);
		
		JLabel lblNewLabel_1 = new JLabel("Größe:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		tf_groesse = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		contentPane.add(tf_groesse, gbc_textField_1);
		tf_groesse.setColumns(5);
		
		JLabel lblNewLabel_2 = new JLabel("BMI:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		tf_bmi = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 2;
		contentPane.add(tf_bmi, gbc_textField_2);
		tf_bmi.setColumns(5);
        tf_bmi.setEditable(false);
		
		btn_delete = new JButton("Löschen");
		btn_delete.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 3;
		contentPane.add(btn_delete, gbc_btnNewButton);
        btn_delete.addActionListener(event -> {
            tf_gewicht.setText("");
            tf_groesse.setText("");
			tf_bmi.setText("");
        });
		
		btn_calculate = new JButton("Berechnen");
		btn_calculate.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 4;
		contentPane.add(btn_calculate, gbc_btnNewButton_1);
        btn_calculate.addActionListener(event -> {
            try {
                Double gewicht = Double.parseDouble(tf_gewicht.getText());
                Double groesse = Double.parseDouble(tf_groesse.getText());
                Double bmi = (gewicht / (groesse * groesse))*10000;
                tf_bmi.setText(Double.toString(Math.round(bmi*10.0)/10.0));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(maindwindow,e.getMessage(),"FEHLER", JOptionPane.ERROR_MESSAGE);
            }
        });

        this.pack();
    }
}
