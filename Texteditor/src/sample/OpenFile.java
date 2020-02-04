package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


public class OpenFile {

    private InputStream inputStream;
    private BufferedReader bufferedReader;
    private StringBuilder stringBuilder;
    private Desktop desktop;
    private FileChooser fileChooseropen;
    private File file;
    @FXML
    private TextArea textarea;


    public void openFile() throws IOException {

        fileChooseropen = new FileChooser();
        fileChooseropen.setTitle("Open File");

        fileChooseropen.setSelectedExtensionFilter(new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt"));
        fileChooseropen.setInitialFileName("file.txt");
        fileChooseropen.showOpenDialog(null);

        if(file != null){
            inputStream = new FileInputStream(file);
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            stringBuilder = new StringBuilder();
            String line;
            while((line = bufferedReader.readLine()) != null){
                stringBuilder.append(line + "\n");

            }
            textarea.setText(stringBuilder.toString());
            bufferedReader.close();
        }



    }
}


