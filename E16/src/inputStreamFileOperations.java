import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class inputStreamFileOperations implements FileManager{
    @Override
    public String writeFile(String filePath, String data) {
        String read(String filePath ){
            FileInputStream fis=new FileInputStream("c:/text.");
            InputStreamReader r=new InputStreamReader(fis,"ISO-8859-9");
        };
        return null;
    }

    @Override
    public String read(String filePath) {
        try{
        String writeFile(String filePath,String data){
                FileOutputStream o = new FileOutputStream("c:/text.txt");
            }
            catch{
            OutputStreamWriter osw= new OutputStreamWriter(o,"ISO-8859-9");
            osw.write("şşşiiüüüğğğğççööö");
            osw.flush();
        }
        return null;
    }



}

