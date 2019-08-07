package com.company;

public class Main {

    public static void main(String[] args) {

	Boss boss = new Boss();
	boss.setLf(800);
	boss.setHit(50);
	boss.setDefence(80);

	Warrior warrior = new Warrior();
	warrior.setLf(300);
	warrior.setHit(40);
	warrior.setSuperHit(80);

	Magical magical = new Magical();
	magical.setLf(300);
	magical.setHit(40);
	magical.setSuperHit(80);

	Mental mental = new Mental();
	mental.setLf(300);
	mental.setHit(40);
	mental.setSuperHit(80);

        System.out.println("The game");
        System.out.println("Boss Lf = " + boss.getLf() + ";" + "boss hit" + boss.getHit() + ",");
        System.out.println("warrior Lf = " + warrior.getLf() + ";" + "warrior Hit" + warrior.getHit() + ",");
        System.out.println("Magical Lf = " + magical.getLf() + ";" + "magical Hit" + warrior.getHit() + ",");
        System.out.println("Mental Lf = " + mental.getLf() + ";" + "mental Hit" + mental.getHit() + ",");

    }
}
