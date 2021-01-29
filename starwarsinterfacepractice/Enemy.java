package starwarsinterfacepractice;

public class Enemy implements Character{
    public String weapon = "lazerbeam";

    public Enemy(){

    }
    public void attack() {
        System.out.println("The enemy attack you.");
    }

    public void heal() {
        System.out.println("The enemy heals himeself.");
    }

    @Override
    public String getWeapon() {
        return weapon;
    }

    public void weaponDraw(){
        System.out.println("Drawout your weapon!!");
    }
}
