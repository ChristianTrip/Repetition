import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFile {


    private File file;
    private Scanner scan;
    private String filePath = "resources/Strings.csv";
    private String[] list;
    private int lineCount = 0;


    public ReadFile(String filePath){
        this.filePath = filePath;
        loadFile();
    }

    public void loadFile(){
        try{
            file = new File(this.filePath);
            scan = new Scanner(file);

            while(scan.hasNextLine()){
                String text = scan.nextLine();
                list = text.split("\n");

                for (String word : list) {
                    System.out.println(word);
                }
                lineCount ++;
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }

    public void printFileContent() {
        for (String word : list) {
            System.out.println(word);
        }
    }

    public int getLineCount(){
        return lineCount;
    }

}
