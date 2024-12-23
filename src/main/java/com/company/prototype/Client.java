package com.company.prototype;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman swordsman = new Swordsman();
		swordsman.move(new Point3D(-10,0,0), 20);
		swordsman.attack();
		System.out.println(swordsman);

		Swordsman s2 = (Swordsman) swordsman.clone();
		System.out.println("Cloned swordsman:" + s2);
	}

}
