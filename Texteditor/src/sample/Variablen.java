package sample;

import javafx.fxml.FXML;
import javafx.stage.FileChooser;

import java.awt.*;
import java.io.InputStream;

public class Variablen {

    @FXML
    static MenuBar menuBar;
    @FXML
    static MenuItem newfile;
    @FXML
    static MenuItem savefile;
    @FXML
    static MenuItem openfile;

    static Desktop desktop;
    static FileChooser fileChoosernewfile;
    static FileChooser fileChoosersave;

}
