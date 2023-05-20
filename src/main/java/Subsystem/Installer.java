package Subsystem;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Installer implements Subsystem {
    static String name;
    static int version;
    static Subsystem[] prerequisites;

    public Installer(String name, int version, Subsystem[] prerequisites) {
        this.name = name;
        this.version = version;
        this.prerequisites = prerequisites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Queue<Subsystem> setUpPlan() {
        Queue<Subsystem> queue = new LinkedList<>();
        Iterator iterator = queue.iterator();
        while (iterator.hasNext()) {

        }
        return null;
    }

    public static void setUp(Queue<Subsystem> queue) {
        if (queue.equals(null)) {
            System.out.printf("SetUp plan calculation failed. Wrong prerequisite description at %s %d", name, version);
        }
    }

    public void install() {
        System.out.printf("%s version %d installed successfully\n", name, version);
    }

    @Override
    public Subsystem[] getPrerequisites() {
        return new Subsystem[0];
    }

    @Override
    public int getVersion() {
        return 0;
    }
}
