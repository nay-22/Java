package MASTERCLASS.Section_8.Encapsulation;

public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 40;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining Health = "+player.healthRemaining());

        EnhancedPlayer nay = new EnhancedPlayer("Nay");
        System.out.println("Initial Health = "+nay.healthRemaining());
    }
}
