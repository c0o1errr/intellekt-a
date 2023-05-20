package mypackage;
import static java.lang.Math.PI;


public class Radius {
    public static double getSquare (int radius) {
        if(radius < 0){
            return -1;
        }
        double S =  PI*(radius^2);
        return S;
    }
}
