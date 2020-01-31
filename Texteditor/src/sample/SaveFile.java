package sample;

import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.awt.*;

public class SaveFile {

    public static void SaveFile(){

        Variablen.desktop = Desktop.getDesktop();
        Variablen.fileChoosersave = new FileChooser();
        Variablen.fileChoosersave.setTitle("Save File");
        Variablen.fileChoosersave.showSaveDialog(null);


    }

}
