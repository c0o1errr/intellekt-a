import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class importUsersToListTestTest {
    @Test
    public void testAddUserToList() throws IOException {
        // Создание временного файла
        String users = "Dmitry\nMarina\nBoris\nVeronika\n";
        File tempFile = File.createTempFile("tempUsersFile", ".txt", new File("D:/"));
        FileWriter writer = new FileWriter(tempFile);
        writer.write(users);
        writer.close();

        // проверка добавления в список
        importToListUsers.importUsersToList(tempFile.getAbsolutePath());
        LinkedList<String> usersLinkedList = new LinkedList<>();
        usersLinkedList.add("Dmitry");
        usersLinkedList.add("Marina");
        usersLinkedList.add("Boris");
        usersLinkedList.add("Veronika");

        assertEquals(usersLinkedList, users);

        tempFile.delete();
    }

    @Test
    public void testEmptyUserToList() throws IOException {
        // Создание временного файла с пустой строкой
        String usersWithEmpty = " \nDmitry\nMarina";
        File tempFileWithEmpty = File.createTempFile("tempUserWithEmpty", ".txt", new File("D:/"));
        FileWriter writer = new FileWriter(tempFileWithEmpty);
        writer.write(usersWithEmpty);
        writer.close();

        // проверка удаления пустой строки
        importToListUsers.importUsersToList(tempFileWithEmpty.getAbsolutePath());
        LinkedList<String> userWithOutEmpty = new LinkedList<>();
        userWithOutEmpty.add("Dmitry");
        userWithOutEmpty.add("Marina");

        assertEquals(userWithOutEmpty, usersWithEmpty);

        tempFileWithEmpty.delete();
     }
}