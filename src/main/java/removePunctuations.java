public class removePunctuations {
    //https://www.techiedelight.com/ru/remove-punctuation-from-string-java/ - удалить все знаки препинания
    public static String removePunctuations(String source) {
        return source.replaceAll("\\p{Punct}", "");
    }

    public static String upLowCase(String world) { // сделать весь текс в LowerCase
        return world.toLowerCase();
    }

    public static void main(String[] args) {
        String source = "Привет мир";
        upLowCase(source);
        removePunctuations(source);
    }
}
