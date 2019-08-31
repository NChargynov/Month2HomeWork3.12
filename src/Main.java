public class Main {

    public static void main(String[] args) throws LimitException{

        BankAccount accountPeter = new BankAccount();

        accountPeter.deposit(10000);
        accountPeter.getAmount();

        while (true){
            accountPeter.withDraw (6000);
        }
    }
}
