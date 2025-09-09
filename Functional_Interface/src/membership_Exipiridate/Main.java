package membership_Exipiridate;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Members> members = Arrays.asList(
                new Members("Alice", LocalDate.now().plusDays(10)),
                new Members("Bob", LocalDate.now().plusDays(40)),
                new Members("Charlie", LocalDate.now().plusDays(25)),
                new Members("David", LocalDate.now().plusDays(5))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        List<Members> expiringSoon = members.stream()
                .filter(m -> !m.getExpiryDate().isBefore(today)) // not already expired
                .filter(m -> !m.getExpiryDate().isAfter(next30Days)) // within 30 days
                .collect(Collectors.toList());

        // Print expiring members
        expiringSoon.forEach(System.out::println);
    }
}

