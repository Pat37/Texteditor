package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;


public class OpenFile {

    private InputStream inputStream;
    private BufferedReader bufferedReader;
    private StringBuilder stringBuilder;
    private Desktop desktop;
    private FileChooser fileChooseropen;
    private File file;
    @FXML
    private TextArea textarea;


    public void openFile(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List lines = new List();
        String line;
        while((line = bufferedReader.readLine()) != null){
            lines.add(line);
        }
        bufferedReader.close();
    }
}


