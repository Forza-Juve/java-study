package Chapter07.FileScoreReaderDemo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScoreReader {
    public int readScore(String filename){
        try (Scanner scanner = new Scanner(new File(filename))) {
            return scanner.nextInt();
        } catch (IOException e) {
            throw new IllegalStateException("文件不存在或者文件读取失败",e);
        }
    }
}
