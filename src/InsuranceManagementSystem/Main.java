package InsuranceManagementSystem;

public class Main {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        Account account = accountManager.login();
        System.out.println("Hoşgeldiniz " + account.getUser().getFname() + " " + account.getUser().getLname());
        account.addAddress("Merkez / Kırklareli");
        account.addAddress("Lüleburgaz / Kırklareli");
        account.addAddress("Çorlu / Tekirdağ");
        account.addInsurance(new CarInsurance());
        account.showUserInfo();
    }
}
