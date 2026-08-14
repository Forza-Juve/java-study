package Chapter07.TryWithResourcesDemo;

import java.io.FileInputStream;
import java.io.IOException;

public class ResourceService {
    public void readFile(String fileName) throws IOException{
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        }
    }
}
