import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface RepeatToRelease {
    ToRelease[] value();
}

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(RepeatToRelease.class)
@interface ToRelease {
    String customerName();
    String version();
}

public class Reports {
    @ToRelease(customerName = "Div_1", version = "0")
    public static void Reports1() {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(name);
    }

    @ToRelease(customerName = "Div_2", version = "0")
    public static void Reports2() {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(name);
    }

    @ToRelease(customerName = "Div_3", version = "2")
    public static void Reports3() {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(name);
    }

    @ToRelease(customerName = "Div_2", version = "0")
    public static void Reports4() {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(name);
    }

    @ToRelease(customerName = "Div_5", version = "5")
    public static void Reports5() {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(name);
    }

    @ToRelease(customerName = "Div_2", version = "0")
    public static void Reports6() {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(name);
    }

    @ToRelease(customerName = "Div_7", version = "6")
    public static void Reports7() {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(name);
    }

    @ToRelease(customerName = "Div_2", version = "0")
    public static void Reports8() {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(name);
    }

    @ToRelease(customerName = "Div_9", version = "8")
    public static void Reports9() {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(name);
    }

    @ToRelease(customerName = "Div_2", version = "0")
    @ToRelease(customerName = "Div_5", version = "5")
    public static void Reports10() {
        String name = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(name);
    }

    public static void main(String[] args) {
    }
}
