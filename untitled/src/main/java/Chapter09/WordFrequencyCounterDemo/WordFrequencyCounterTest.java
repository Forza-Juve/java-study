package Chapter09.WordFrequencyCounterDemo;

public class WordFrequencyCounterTest {
    public static void main(String[] args) {
        WordFrequencyCounter wfc = new WordFrequencyCounter();
        wfc.addWord("java");
        System.out.println(wfc.getCount("java"));

        wfc.addWord("java");
        wfc.addWord("java");
        System.out.println(wfc.getCount("java"));

        wfc.addWord("java");
        wfc.addWord("spring");
        wfc.addWord("java");
        wfc.addWord("mysql");
        wfc.addWord("spring");
        System.out.println(wfc.getCount("java"));
        System.out.println(wfc.getCount("spring"));
        System.out.println(wfc.getCount("mysql"));

        System.out.println(wfc.getCount("redis"));
    }
}
