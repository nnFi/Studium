package FileWrite;
import MeineTestKlassen.*;
import java.io.*;
import java.util.ArrayList;

import javax.swing.JFileChooser;

public class Serialisierung {
    //Preferences einbauen
    public static void main(String[] args) {
        PersonName p1 = new PersonName("Peter");
        PersonName p2 = new PersonName("Hans");
        PersonName p3 = new PersonName("Achim");

        ArrayList<PersonName> liste = new ArrayList<>();
        liste.add(p1);
        liste.add(p2);
        liste.add(p3);

        fileSave(fileDialog(),liste);
        fileRead(fileDialog());
    }

    public static File fileDialog() {
        File dir = new File("C:\\Users\\finn-\\Downloads");

        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Datei Auswahldialog");
        fc.setCurrentDirectory(dir);
        int retVal = fc.showSaveDialog(null);
        if(retVal != JFileChooser.APPROVE_OPTION) {
            return null;
        } else  return fc.getSelectedFile();
    }

    public static void fileSave(File dc, ArrayList<PersonName> liste) {
        try (FileOutputStream f_out = new FileOutputStream(dc)) {
            ObjectOutputStream o_out = new ObjectOutputStream(f_out);
            for (Object obj : liste) {
                o_out.writeObject(obj);
            }
            o_out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void fileRead(File dc) {
        //funktioniert noch nicht
        try (FileInputStream f_in = new FileInputStream(dc)) {
            ObjectInputStream o_in = new ObjectInputStream(f_in);
            Object obj = o_in.readObject();
            System.out.println(obj.toString());
            o_in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
