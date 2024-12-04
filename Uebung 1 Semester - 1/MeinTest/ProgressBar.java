package MeinTest;
import javax.swing.*;
 
public class ProgressBar 
{
	public static void main(String[] args) {
		JFrame meinJFrame = new JFrame();
		meinJFrame.setSize(300, 400);
		meinJFrame.setTitle("JProgressBar Beispiel");
		JPanel meinPanel = new JPanel();
 
		// JProgressBar-Objekt wird erzeugt
		JProgressBar meinLadebalken = new JProgressBar(0, 100);
 
		// Startwert/Wert für den Ladebalken wird gesetzt
		meinLadebalken.setValue(0);
 
		// Der aktuelle Wert wird als als Pronzent in Bar angezeigt
		meinLadebalken.setStringPainted(true);
 
		// JProgressBar wird Panel hinzugefügt
		meinPanel.add(meinLadebalken);

		//Dialogbox
 
		meinJFrame.add(meinPanel);
		meinJFrame.pack();
		meinJFrame.setVisible(true);
 
		// Wert des Ladebalkens wird in der Schleife um 1 erhöht bis max
		for(int i=0; i<=meinLadebalken.getMaximum(); i++){
			meinLadebalken.setValue(i);
			try {
				// Thread pausieren für 50 Millisekunden
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
 
		}
 
	}
}