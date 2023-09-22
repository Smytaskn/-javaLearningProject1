import java.io.FileWriter;
import java.io.IOException;

public class FileReaderFileManager implements FileManager{

    @Override
    public String read(String filePath) {
        return null;
    }

    @Override
    public String writeFile(String filePath, String data) {
        try(FileWriter fw=new FileWriter("text.txt",true)){
            fw.write("test");
        }
        catch(IOException e){
            throw new RuntimeException();
        }
        return data;
    }

}
