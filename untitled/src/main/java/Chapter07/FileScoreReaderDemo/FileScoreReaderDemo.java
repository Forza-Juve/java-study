package Chapter07.FileScoreReaderDemo;

public class FileScoreReaderDemo {
    public static void main(String[] args) {
        ScoreReader sr = new ScoreReader();
        int s1 = sr.readScore("C:\\Users\\Juve\\Desktop\\test.txt");
        System.out.println(s1);

        try {
            int s2 = sr.readScore("C:\\Users\\Juve\\Desktop\\test1.txt");
            System.out.println(s2);
        } catch (IllegalStateException e) {
            System.out.println(e);
            System.out.println(e.getCause());
        }
    }
}
