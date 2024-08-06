package org.example;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Purchase> purchaseList = new ArrayList<>();
        List<Login> loginList = new ArrayList<Login>();

        Client client1 = new Client("Dupond", "Jean", LocalDate.of(1990, 3, 12));
        Client client2 = new Client("Dupont", "Benoit", LocalDate.of(2001, 8, 31));


        Purchase purchase1 = new Purchase(client1, "Savon", 3, LocalDate.of(2024, 8, 1));
        Purchase purchase2 = new Purchase(client1, "Serviette", 1, LocalDate.of(2024, 8, 1));
        Purchase purchase3 = new Purchase(client1, "Baguette", 4, LocalDate.of(2024, 8, 1));
        Purchase purchase4 = new Purchase(client1, "Baguette", 6, LocalDate.of(2024, 8, 4));
        Purchase purchase5 = new Purchase(client2, "Piles", 1, LocalDate.of(2024, 8, 4));
        Purchase purchase6 = new Purchase(client2, "Baguette", 3, LocalDate.of(2024, 8, 4));

        purchaseList.add(purchase1);
        purchaseList.add(purchase2);
        purchaseList.add(purchase3);
        purchaseList.add(purchase4);
        purchaseList.add(purchase5);
        purchaseList.add(purchase6);

        Login log1 = new Login(client1, LocalDate.of(2024, 6, 4));
        Login log2 = new Login(client1, LocalDate.of(2024, 7, 4));
        Login log3 = new Login(client1, LocalDate.of(2024, 7, 20));
        Login log4 = new Login(client1, LocalDate.of(2024, 8, 1));
        Login log5 = new Login(client1, LocalDate.of(2024, 8, 2));
        Login log6 = new Login(client2, LocalDate.of(2024, 8, 1));

        loginList.add(log1);
        loginList.add(log2);
        loginList.add(log3);
        loginList.add(log4);
        loginList.add(log5);
        loginList.add(log6);

        Map<String, Integer> map = new HashMap<>();


        for(int i = 0; i < loginList.size(); i++) {
            if(!loginList.get(i).getLoginDate().equals(purchaseList.get(i).getPurchaseDate())) {

                   long days = ChronoUnit.DAYS.between(loginList.get(i).getLoginDate(), purchaseList.get(i).getPurchaseDate());
                   if ( days > 7) {
                       if (!map.containsKey(loginList.get(i).getClient().getLastName())) {
                           map.put(loginList.get(i).getClient().getLastName(), 1);
                       } else {
                           map.put(loginList.get(i).getClient().getLastName(), map.get(loginList.get(i).getClient().getLastName()) + 1);
                       }
                   }
               }
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}