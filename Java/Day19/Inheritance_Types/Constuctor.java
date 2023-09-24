public class Constuctor {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
    }
}

class Account {
    public Account() {
        System.out.println("Account Zero Constuctor");
    }
}

class SavingAccount extends Account {
    public SavingAccount() {
        // class the parent class no arg consturctor (if available)
        System.out.println("SavingAccount Zero Constructor");
    }
}