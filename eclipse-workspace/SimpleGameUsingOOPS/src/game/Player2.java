package game;

public class Player2 extends Player1 {

	private int health;
	private boolean armour;
	
	
	public Player2(String name, String weapon, int health, boolean armour) {
		super(name, weapon, health);
		this.health = health;
		this.armour = armour;
	}


	@Override
	public void damageByGun1() {
		if(armour) {
			this.health -= 20;
			if(this.health <=0) this.health = 0;
			System.out.println("Armour is On.Get hit by gun1.reduced by 20."+"new health is "+ this.health);
		}if(!armour) {
			this.health -= 30;
			if(this.health <=0) this.health = 0;
			System.out.println("Armour is Off.Get hit by gun1.reduced by 30."+"new health is "+ this.health);
		}
		if(this.health == 0) {
			System.out.println(getName()+"is dies");
		}
	}


	@Override
	public void damageByGun2() {
		if(armour) {
			this.health -= 40;
			if(this.health <=0) this.health = 0;
			System.out.println("Armour is On.Get hit by gun1.reduced by 40."+"new health is "+ this.health);
		}if(!armour) {
			this.health -= 50;
			if(this.health <=0) this.health = 0;
			System.out.println("Armour is off.Get hit by gun1.reduced by 50."+"new health is "+ this.health);
		}
		if(this.health == 0) {
			System.out.println(getName()+"is dies");
		}
	}


	@Override
	public void heal() {

	}
	
	
	
}
