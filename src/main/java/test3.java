public class test3 {
    public static void main(String[] args) {
        sayHello(new String[]{"-s"});
    }

    public static void sayHello(String[] args) {
        String userName = System.getProperty("user.name");
        String osName = System.getProperty("os.name");

        if (args.length == 0)
            System.out.println("Введите параметры: -u, -s, -us, -su");
        switch (args[0]){
            case "-u":
                System.out.print("Hello, " + userName + "!");
            break;
            case "-s":
                System.out.println("Hello, " + osName + "!");
            break;
            case "-su":
                System.out.println("Hello, " + userName + " of " + osName + "!");
            break;
            case "-us":
                System.out.println("Hello, " + userName + " of " + osName + "!");
            break;
            default:
                System.out.println("Hello!");
        }
    }
}