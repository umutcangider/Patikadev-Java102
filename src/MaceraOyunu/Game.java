package MaceraOyunu;

import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Macera Oyununa Hoş Geldiniz.");
        System.out.print("Lütfen bir isim giriniz : ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Sayın " + player.getName() + " Bu Karanlık Ve Sisli Adaya Hoş Geldiniz.");
        player.selectChar();

        Location location = null;
        while (true) {
            player.printInfo();
            System.out.println();
            System.out.println("############# Bölgeler #############");
            System.out.println("1 - Güvenli Ev  --> Burası Sizin için güvenli bir ev, düşman yoktur.");
            System.out.println("2 - Eşya Dükkanı  --> Silah veya Zırh satın alabilirsiniz.");
            System.out.println("3 - Mağara  --> Ödül <Yemek> , Dikkatli ol Zombi Çıkabilir.");
            System.out.println("4 - Orman  --> Ödül <Odun> , Dikkatli ol Vampir Çıkabilir.");
            System.out.println("5 - Nehir  --> Ödül <Su> , Dikkatli ol Ayı Çıkabilir.");
            System.out.println("0 - Çıkış Yap  --> Oyunu Sonlandırır.");
            System.out.print("Lütfen Gitmek istediğiniz bölgeyi seçin : ");
            int selectLoc = input.nextInt();

            switch (selectLoc) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                default:
                    System.out.println("Lütfen Geçerli bir bölge giriniz.");
            }

            if(location == null) {
                System.out.println("Bu karanlık ve sisli adadan çabuk vazgeçtin");
                break;
            }
            if(!location.onLocation()) {
                System.out.println("GAME OVER!");
                break;
            }
        }
    }
}
