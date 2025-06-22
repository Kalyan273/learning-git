import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Transaction {
    private int id;
    private LocalDate date;
    private double amount;

    public Transaction(int id, LocalDate date, double amount) {
        this.id = id;
        this.date = date;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Transaction{id=" + id + ", date=" + date + ", amount=" + amount + "}";
    }
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
            new Transaction(1, LocalDate.of(2024, 12, 1), 2000),
            new Transaction(2, LocalDate.of(2025, 1, 15), 3500),
            new Transaction(3, LocalDate.of(2025, 5, 10), 1200),
            new Transaction(4, LocalDate.of(2025, 6, 5), 4500)
        );

        LocalDate startDate = LocalDate.of(2025, 1, 1);
        LocalDate endDate = LocalDate.of(2025, 5, 31);

        List<Transaction> trans =transactions.stream().filter(tnx-> tnx.getDate().isAfter(startDate) && tnx.getDate().isBefore(endDate)).
        collect(Collectors.toList());

        System.out.println(trans);
    }
}
