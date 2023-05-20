package Subsystem;

public interface Subsystem {
    String getName();
    int getVersion();
    void install();
    Subsystem[] getPrerequisites();
}
