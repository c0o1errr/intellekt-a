import java.lang.reflect.Array;
import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        double[] j = {1000.47, 1111.34, 1298.9, 1500.0, 1633.73, 1634.7, 1890.7};
        double[] people = {1111.34, 1298.9, 1633.73, 1500.0, 1634.7, 1000.47, 1890.7};

        /*double[] result = findAllWinners(j);
        if (result != null && result.length > 0) {
            for (double elem : result)
                System.out.print(elem + " ");
        } else {
            System.out.print("[]");
        }*/

        //System.out.println(peopleChoiceAward(people, 10));
        System.out.println(maxSpeed());
    }

    public static double[] findAllWinners(double[] allWin) {
        int id = 0;
        if (allWin != null) {
            Arrays.sort(allWin);
            for (int i = 0; i < allWin.length; i++) {
                if (allWin[i] > 1500) {
                    id = i;
                    break;
                }
            }
            double[] onlyWin = Arrays.copyOfRange(allWin, id, allWin.length);
            return onlyWin;
        }
        return null;
    }

    public static int peopleChoiceAward(double[] part, int key) {
        if (part == null || key > part.length) {
            return -1;
        }
        int index = 0;
        if (part != null) {
            Arrays.sort(part);
            index = Arrays.binarySearch(part, 1500);
            if (index <= 0) {
                return -1;
            } else {
                return index;
            }
        }
        return -1;
    }


    enum Planes {
        BOEING(8000, 10),
        IL90(5400, 9),
        TU153(14000, 15);

        public final int distance;
        public final int time;


        int speed() {
            int speed = distance / time;
            return speed;
        }

        Planes(int distance, int time) {
            this.distance = distance;
            this.time = time;
        }
    }

    public static int maxSpeed() {
        Planes boeing = Planes.BOEING;
        Planes il90 = Planes.IL90;
        Planes tu153 = Planes.TU153;
        if (boeing.speed() <= il90.speed()) {
            return il90.speed();
        } else if (boeing.speed() <= tu153.speed()) {
            return tu153.speed();
        } else {
            return boeing.speed();
        }
    }
}

