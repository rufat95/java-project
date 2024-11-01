import java.time.LocalDate;

public class Worker {
    private String name;
    private String birtDate;
    protected String endDate;

    public Worker(){}

    public Worker(String name, String birtDate) {
        this.name = name;
        this.birtDate = birtDate;
    }

    public int getAge(){
        int currentYear = LocalDate.now().getYear();
        int birthYear = Integer.parseInt(birtDate);

        return (currentYear - birthYear);
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birtDate='" + birtDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
