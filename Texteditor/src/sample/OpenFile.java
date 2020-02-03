package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


import java.awt.*;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class OpenFile {


    public static void OpenFile() throws IOException {

        Variablen.desktop = Desktop.getDesktop();
        Variablen.fileChooseropen = new FileChooser();
        Variablen.fileChooseropen.setTitle("Open File");
        Variablen.fileChooseropen.setSelectedExtensionFilter(new FileChooser.ExtensionFilter("TXT Files (*.txt)","*.txt"));
        Variablen.fileChooseropen.setInitialFileName("file.txt");
        Variablen.file = Variablen.fileChooseropen.showOpenDialog(null);

        if(Variablen.file != null){
            Variablen.inputStream = new FileInputStream(Variablen.file);
            Variablen.bufferedReader = new BufferedReader(new InputStreamReader(Variablen.inputStream));
            Variablen.stringBuilder = new StringBuilder();
            String line;
            while((line = Variablen.bufferedReader.readLine()) != null){
                Variablen.stringBuilder.append(line + "\n");
            }
            Variablen.bufferedReader.close();

        }



    }

}
