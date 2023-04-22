package databaseauditor.Models;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Instances {
    public List<Object> data = new ArrayList<Object>();

    public Instances() {
        data.add(new Actor(1, "Aman", "Kumar", Timestamp.valueOf(LocalDateTime.now())));
        data.add(new Address(1, "House Number - 86, Nasrat Pura", "", "Ghaziabad", 1, "201001", "9250131555",
                Timestamp.valueOf(LocalDateTime.now())));

    }
}
