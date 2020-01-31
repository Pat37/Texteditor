package sample;

        import javafx.stage.FileChooser;

        import java.awt.*;

public class NewFile {


    public static void NewFile(){

        Variablen.desktop = Desktop.getDesktop();
        Variablen.fileChoosernewfile = new FileChooser();
        Variablen.fileChoosernewfile.setTitle("Open File");
        Variablen.fileChoosernewfile.showSaveDialog(null);





    }
}
