package Frame;
import javax.swing.*;
import javax.swing.table.*;

public class Tabelle extends JFrame{
	private JTable table;
    
    public Tabelle() {
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
		
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane);
		
		table = new JTable(); //hier muss dass AbstractTable rein
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);

        this.pack();
	}

    public void create() {
        //Tabelle mit werten befüllen... geht auch mit abstract table modell, hier aber unnötig
    }
}
