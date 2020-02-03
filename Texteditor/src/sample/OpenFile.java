package sample;

import javafx.stage.FileChooser;
import java.awt.*;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class OpenFile {


    public static void OpenFile() throws IOException {

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
                 *  Creating an Array,to save the content
                 */
                final String[] linearray = new String[lineList.size()];
                lineList.toArray(linearray);
                System.out.println(Arrays.toString(linearray));
                Variablen.bufferedReader.close();

                for(int i = 0; i <= linearray.length; i++){
                    Variablen.textarea.setText(Variablen.textarea.getText() + linearray[i] + "");
            }


    }



}
