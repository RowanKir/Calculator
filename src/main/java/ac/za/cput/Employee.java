package ac.za.cput;

public class Employee implements Interface
{
    private String name;
    private int amount;

    public Person() {
    }

    public Person(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String showInfo()
    {
        return (getName() + getAmount());
    }

    public String greet()
    {
        System.out.println("Hi daar!!");
        return null;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
