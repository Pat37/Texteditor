package sample;

import javafx.fxml.Initializable;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller {


    public void ListenOpenFile() throws IOException {

        OpenFile openFile = new OpenFile();
        openFile.openFile();
    }


    public void ListenNew(){
        NewFile.NewFile();
    }


    public void ListenSave(){
        SaveFile.SaveFile();
    }



}
