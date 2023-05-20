package APM;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class ImportClients {
    private File directory;

    public ImportClients(File directory) {
        Objects.requireNonNull(directory, "Directory must not be null");
        this.directory = directory;
    }

    public static List<Clients> cardsToClients(File directory) throws IOException {
        List<Clients> clientsList = new LinkedList<>();
        InputStream is = new FileInputStream(directory);
        ObjectInputStream ois = new ObjectInputStream(is);
        try (ois) {
            while (ois.readObject() != null) {
                clientsList.add((Clients) ois.readObject());
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return clientsList;
    }


    public static void checkImport(List<Clients> clients) {
        if (clients.isEmpty()) {
            System.out.println("import failed");
            return;
        }
        Clients firstShortName = clients.get(0);  // firstShortName самое короткое имя из списка для сравнения
        for (int i = 1; i < clients.size(); i++) {
            Clients shortName = clients.get(i);
            if (firstShortName.getName().length() < shortName.getName().length()) {
                firstShortName = shortName;
            }
        }
        System.out.println(firstShortName.getName() + ", " + firstShortName.getContactPerson() +
                ", " + firstShortName.getRequisites());
    }
}
