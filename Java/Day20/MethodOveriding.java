public class MethodOveriding {
    public static void main(String[] args) {
        SavingAccounts sa = new SavingAccounts();
        sa.AccHolder = "Shailesh";
        sa.AccNo = 235461866;
        sa.Balance = 10000;
        sa.deposit(20000);
        sa.withdraw(29500);
        // sa.Details();
    }
}

class Accounts {
    String AccHolder;
    int AccNo;
    int Balance;

    public void deposit(int amt) {
        Balance = Balance + amt;
        System.out.println("Updated Balanace after deposit is " + Balance);
    }

    public void withdraw(int amt) {
        Balance = Balance - amt;
        System.out.println("Updated Balanace after withdraw is " + Balance);
    }
}

class SavingAccounts extends Accounts {
    // public void Details() {
    // System.out.println("Name of Account Holder is " + AccHolder);
    // System.out.println("Account Number " + AccNo);
    // System.out.println("Account Balance " + Balance);
    // }
    int min_balance = 1000;

    // overriding method :- use for enhancement (like new features)
    @Override
    public void withdraw(int amt) {
        int max_withdrawal = Balance - min_balance;
        if (amt <= max_withdrawal) {
            Balance = Balance - amt;
            System.out.println("Updated Balanace after Withdraw is " + Balance);
        } else {
            System.out.println("Sorry you cant withdraw more than " + max_withdrawal);
        }
    }
}