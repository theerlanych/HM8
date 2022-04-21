package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Warrior extends Hero {
    public Warrior(int health, int damage, String name) {
        super(health, damage,
                SuperAbility.CRITICAL_DAMAGE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int coeff = RPG_Game.random.nextInt(5) + 1;
        boss.setHealth(boss.getHealth() - this.getDamage() * coeff);
        System.out.println("Warrior hits critically "
                + this.getDamage() * coeff);
    }
}
