package Subsystem;

public class InstallerTest extends Installer {
    public InstallerTest(String name, int version, Subsystem[] prerequisites) {
        super(name, version, prerequisites);
    }

    public static void main(String[] args) {
        Installer B = new Installer("B", 0, new Subsystem[]{});
        //Installer A = new Installer("A", 0, new Subsystem[]{B});
        Installer F = new Installer("F", 0, new Subsystem[]{});
        Installer D = new Installer("D", 0, new Subsystem[]{});
        Installer C = new Installer("C", 0, new Subsystem[]{D});
        Installer E = new Installer("E", 0, new Subsystem[]{B,F});
        Installer A = new Installer("A", 0, new Subsystem[]{B, C, D, E});


        // При вызове A.setUpPlan() будет таким - {[F0, D0, C0, B0, E0, A0]}
        A.install();
        E.install();
        C.install();


    }
}





/* F = ("F", 0, new Subsystem[]{});
        D = ("D", 0, new Subsystem[]{});
        C = ("C", 0, new Subsystem[]{D});
        B = ("B", 0, new Subsystem[]{C});
        E = ("E", 0, new Subsystem[]{B, F});
        A = ("A", 0, new Subsystem[]{B, C, D, E});*/

