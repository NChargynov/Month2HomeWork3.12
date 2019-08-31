public class BankAccount {

    private double amount;

    public double getAmount() {
        System.out.println("Ваш баланс составляет = " + amount);
        return amount;
    }

    double deposit(double sum) {
        amount = amount + sum;
        System.out.println("Вы положили на сумму " + sum);
        return amount;
    }

    double withDraw(double sum) throws LimitException {
        System.out.println("Вы сняли на сумму " + sum);
        amount = amount - sum;
        if (sum > amount) {
                throw new LimitException("Не хватает денежных средств. Вам удалось снять только "
                        + amount, getAmount());
        }
        return amount;
    }
}
