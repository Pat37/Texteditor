package sample;

import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;


import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
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
    @FXML
    static TextArea textarea;

    static Desktop desktop;
    static FileChooser fileChoosernewfile;
    static FileChooser fileChoosersave;

    //Var, to open a File that's already there
    static FileChooser fileChooseropen;
    static File file;
    static InputStream inputStream;
    static BufferedReader bufferedReader;
    static StringBuilder stringBuilder;

}
