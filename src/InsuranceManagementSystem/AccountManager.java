package InsuranceManagementSystem;

import java.util.Scanner;
import java.util.TreeSet;

public class AccountManager {
    private TreeSet<Account> accounts;

    public AccountManager() {
        accounts = new TreeSet<>();
        accounts.add(new Enterprise(new User("Umutcan","Gider","umutcan@gider","123123","Mühendis",24)));
        accounts.add(new Individual(new User("Ad1","Soyad1","ad1@soyad1","123","Öğrenci",20)));
        accounts.add(new Individual(new User("Ad2","Soyad2","ad2@soyad2","12345","İşçi",18)));
    }
    public Account login() {
        String[] infos = getLoginInfos();
        Account tempAccount = null;

        for (Account account : accounts) {
            if (account.getUser().getEmail().equals(infos[0])) {
                tempAccount = account;
                break;
            }
        }
        if (tempAccount != null) {
            try {
                tempAccount.login(infos[0], infos[1]);
            } catch (InvalidAuthenticationException e) {
                throw new RuntimeException(e);
            }
        }
        return tempAccount;
    }

    public String[] getLoginInfos() {
        String[] infos = new String[2];
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen giriş yapmak için bilgilerinizi giriniz:");
        System.out.print("E-Posta: ");
        infos[0] = input.nextLine();
        System.out.print("Şifre: ");
        infos[1] = input.nextLine();
        input.close();
        return infos;
    }

    public TreeSet<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(TreeSet<Account> accounts) {
        this.accounts = accounts;
    }
}
