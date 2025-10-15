package OOP;

public class Account {
    private int id;
    private String name;
    private int balance = 0;

    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("That amount exceeds your current balance.");
            return;
        }
        this.balance -= amount;
    }

    public void display() {
        System.out.printf("Id: %d\nName: %s\nBalance: %d\n", this.id, this.name, this.balance);
    }
}
