import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class importToListUsers {
    public static void importUsersToList(String path) throws IOException {
        LinkedList<String> users = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            try {
                BufferedReader bf = new BufferedReader(new FileReader(path));
                String currentLine = bf.readLine();
                if(currentLine != "") {
                    users.add(currentLine);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}



