import java.time.LocalDate;

public class Task {
    private static int idCounter = 1;
    private final int id;
    private final String name;
    private final LocalDate date;
    private final String priority;
    private String status;

    public Task(String name, LocalDate date, String priority) {
        this.id = idCounter++;
        this.name = name;
        this.date = date;
        this.priority = priority;
        this.status = "Unfinished";
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
