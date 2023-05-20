import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Index {
    static Map<String, Integer> frequencyTable;

    public Index() {
    }

    public Index(String text) {
        appendText(text);
    }

    public static int getWordFrequency(String word) {
        Integer count = frequencyTable.get(word);
        if (count == null) {
            count = 0;
        }
        frequencyTable.put(word, count + 1);
        return count + 1;
    }

    public static String appendText(String str) {
        String convertStr = str.toLowerCase();
        convertStr = convertStr.replaceAll("\\p{Punct}", "");
        String[] words = convertStr.split(" ");  // переделывает входную строку  в массив words с помощью разделителя space
        for (String word : words) {
            getWordFrequency(word);
        }
        return convertStr;
    }

    public static Map<String, Integer> getFrequencyTable() {
        SortedMap<String, Integer> tableWord = new TreeMap<String, Integer>();
        return tableWord;
    }
}
