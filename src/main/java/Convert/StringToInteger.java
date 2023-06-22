package Convert;

final class StringToInteger implements Converter<String,Integer> {

    public Integer convert(String source) {
        return Integer.valueOf(source) + 1000;
    }

    public class StringToEmployeeConverter implements Converter<String, Employee> {

        @Override
        public Employee convert(String from) {
            String[] data = from.split(",");
            return new Employee(Long.parseLong(data[0]), Double.parseDouble(data[1]));
        }
    }

    public static void main(String[] args) {
        try{
            Long num = Long.valueOf("Привет, как дела?");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
