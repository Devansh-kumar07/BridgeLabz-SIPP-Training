package membership_Exipiridate;

import java.time.LocalDate;

public class Members {
    private String name;
    private LocalDate expiryDate;

    public Members(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "Member{name='" + name + "', expiryDate=" + expiryDate + "}";
    }
}

