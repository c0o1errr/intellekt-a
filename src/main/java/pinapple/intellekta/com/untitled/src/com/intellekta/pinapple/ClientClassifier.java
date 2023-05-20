package com.intellekta.pinapple;

public class ClientClassifier {
    public static void getClientsByType(String[] clients, String type, String[] result) {
        if (clients.length == 0 || clients == null) {
            System.out.println("Clients array is null or empty");
        }
        if (result.length == 0 || result == null) {
            System.out.println("Result array is null or empty");
        }
        for (int i = 0; i < clients.length; i++) {
            result[i] = clients[i];
        }
    }

    public static void printClients(String[] clients) {
        Client client = new Client();
        if (clients.length == 0 || clients == null) {
            return;
        }
        for (int i = 0; i < clients.length; i++) {
            System.out.println("{" + client.id + "};" + "{" + client.name + "};" + "{" + client.type + "};" + "{" + client.sum + "}\n");
        }
    }
}
