package sample;

import javafx.fxml.Initializable;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    OpenFile openFile = new OpenFile();

    public void ListenOpenFile() throws IOException {
        openFile.openFile();
    }


    public void ListenNew(){
        NewFile.NewFile();
    }


    public void ListenSave(){
        SaveFile.SaveFile();
    }



}
