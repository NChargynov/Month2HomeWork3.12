public class BankAccount {

    private double amount;
    private double sum;

    public double getSum() {
        return sum;
    }

    public double getAmount(){
        return amount;
    }

    double deposit(double sum) {
        amount = amount + sum;
        System.out.println("Вы пополнили свой баланс на " + sum);
        return amount;
    }

    public double withDraw(double sum) throws LimitException {
        System.out.println("Вы сняли на сумму " + sum);
        amount = amount - sum;
        if (sum > amount) {
            throw new LimitException("Не хватает денежных средств ", getAmount());
        }
        return sum;
    }
}
