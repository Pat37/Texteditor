package sample;

import javafx.stage.FileChooser;
import java.awt.*;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Arrays;
=======
>>>>>>> master


public class OpenFile {


    public static void OpenFile() throws IOException {

<<<<<<< HEAD
        final ArrayList<String> lineList = new ArrayList<String>();

        Variablen.desktop = Desktop.getDesktop();
        Variablen.fileChooseropen = new FileChooser();
        Variablen.fileChooseropen.setTitle("Open File");
        Variablen.fileChooseropen.setSelectedExtensionFilter(new FileChooser.ExtensionFilter("TXT Files (*.txt)","*.txt"));
        Variablen.fileChooseropen.setInitialFileName("file.txt");
        Variablen.file = Variablen.fileChooseropen.showOpenDialog(null);

        if(Variablen.file != null) {
            Variablen.inputStream = new FileInputStream(Variablen.file);
            Variablen.bufferedReader = new BufferedReader(new InputStreamReader(Variablen.inputStream));
            Variablen.stringBuilder = new StringBuilder();
            String line;
            while ((line = Variablen.bufferedReader.readLine()) != null) {
                lineList.add(line);
            }
        }
            /**
                 *  Creating an Array,to save the content and give it to the Textarea
                 */
                final String[] linearray = new String[lineList.size()];
                lineList.toArray(linearray);
                System.out.println(Arrays.toString(linearray));
                Variablen.bufferedReader.close();

                for(int i = 0; i <= linearray.length; i++){
                    Variablen.textarea.setText(linearray[i]);
            }


=======
    public void openFile(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List lines = new List();
        String line;
        while((line = bufferedReader.readLine()) != null){
            lines.add(line);
        }
        bufferedReader.close();
>>>>>>> master
    }



}
