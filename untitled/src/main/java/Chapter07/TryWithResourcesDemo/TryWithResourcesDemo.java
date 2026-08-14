package Chapter07.TryWithResourcesDemo;

import java.io.IOException;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        ResourceService rs = new ResourceService();
        try {
            //rs.readFile("C:\\Users\\Juve\\Desktop\\test.txt");
            rs.readFile("test.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
