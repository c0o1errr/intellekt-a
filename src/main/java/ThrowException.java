public class ThrowException {
    public static void main(String[] args) {
        try {
            hoho();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println(" что делать дальше?");
        }
    }

    public static void hoho() throws Exception {  // throws нужно обязательно указывать, если методом может выбросить исключение, как индикатор, что возможна ошибка
        int i = 5 / 0;
        throw new Exception("Не дели на 0"); // throw создает объект в исключительной ситуации
    }
}
