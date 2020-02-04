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
    private TextArea textfeld;


    public void openFile() throws IOException {

        ArrayList<String> arrayList = new ArrayList<>();

        fileChooseropen = new FileChooser();
        fileChooseropen.setTitle("Open File");

        fileChooseropen.setSelectedExtensionFilter(new FileChooser.ExtensionFilter("TXT files (.txt)", ".txt"));
        fileChooseropen.setInitialFileName("file.txt");
        fileChooseropen.showOpenDialog(null);

        if(file != null){

            inputStream = new FileInputStream(file);
            bufferedReader = new BufferedReader(new FileReader(file));
            stringBuilder = new StringBuilder();
            String line;
            while((line = bufferedReader.readLine()) != null){
                stringBuilder.append(line).append("\n");
                arrayList.add(line);


            }
            textfeld.setText(stringBuilder.toString());
            bufferedReader.close();
        }
    }

}
