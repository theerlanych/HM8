package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage,
                SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int Fireball = RPG_Game.random.nextInt(10);
        for (int i = 0; i < heroes.length; i++) {

            heroes[i].setDamage(heroes[i].getDamage() + Fireball);
        }
    }
}
