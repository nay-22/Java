package MASTERCLASS.Section_8.Encapsulation;

public class EnhancedPlayer {
    private String fullName;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String fullName, int healthPercentage, String weapon) {
        this.fullName = fullName;
        this.healthPercentage = (healthPercentage <=0)?1:(Math.min(healthPercentage, 100));
        this.weapon = weapon;
    }
    public EnhancedPlayer(String fullName) {
        this(fullName,100,"Sword");
    }

    public void loseHealth(int damage) {
        healthPercentage -= damage;
        if(healthPercentage <= 0) {
            System.out.println("Player knocked out of game");
        }
    }
    public void restoreHealth(int extraHealth) {
        healthPercentage += extraHealth;
        if(healthPercentage >100) {
            System.out.println("Player restored to 100%");
            healthPercentage = 100;
        }
    }
    public int healthRemaining() {
        return healthPercentage;
    }


}
