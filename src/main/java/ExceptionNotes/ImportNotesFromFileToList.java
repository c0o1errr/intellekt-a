package ExceptionNotes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImportNotesFromFileToList {
    static Scanner sc = new Scanner(System.in);
    /*String filePath = "D:\\Notes.txt";
    File file = new File(filePath);*/
    File dir = new File(".\\Notes");

    public static List<Note> readNotesToList(File dir) throws IOException {
        List<Note> noteList = new ArrayList<>();
        //FileReader fr = new FileReader(dir);
        BufferedReader br = new BufferedReader(new FileReader(dir));
        try {
            String line;
            while ((line = br.readLine()) != null) {
             //  noteList.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } finally {
            br.close();
            System.out.println("Process finished");
        }
        return noteList;
    }

    public static void writeCommentToNotes(File dir) throws IOException {
        String comment = sc.nextLine();
        try {
            FileWriter fw = new FileWriter(dir);
            fw.write("#" + comment);
        } catch (IOException e) {
            System.out.println("Access denied");
        } finally {
            sc.close();
        }
    }
}