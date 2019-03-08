package ac.za.cput;

public class SuperEmployee
{
    private String name;
    private int amount;

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

    public void showInfo()
    {
        getName();
        getAmount();
    }

    public String greet()
    {
        return "Well well well... guess we meet again";
    }
}
