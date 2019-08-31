public class Main {

    public static void main(String[] args){

        BankAccount accountPeter = new BankAccount();
        accountPeter.deposit(10000);

        while (true) {
            try {
                accountPeter.withDraw (6000);
                System.out.println("На вашем балансе осталось" + accountPeter.getAmount());
            }catch (LimitException le){
                System.out.println("На вашем балансе " + accountPeter.getAmount());
                double amout = accountPeter.getAmount();
                if (accountPeter.getSum() >= accountPeter.getAmount())
                    amout = le.getRemainingAmount() - le.getRemainingAmount();
                System.out.println("Вы сняли остаток суммы " + amout);
                break;
                }
            }
        }
    }
