package FileWrite;
import java.io.*;

import javax.swing.JFileChooser;

public class SchreibeTextdatei {
    public static void main(String[] args) {
        int zahlen = 10;

        File dir = new File("C:\\Users\\finn-\\Downloads");

        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Datei Auswahldialog");
        fc.setCurrentDirectory(dir);
        int retVal = fc.showSaveDialog(null);
        if(retVal != JFileChooser.APPROVE_OPTION) {
            return;
        }

        File file = fc.getSelectedFile();
        //File file = new File("");

        try (FileWriter fw = new FileWriter(file)) {
            BufferedWriter bw = new BufferedWriter(fw);

            for(int k = 1; k <= zahlen; k++) {
                for(int i = 1; i <= zahlen; i++) {
                    bw.write(Integer.toString(i*k) + "\t");
                }
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


