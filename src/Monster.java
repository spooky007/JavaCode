public class Monster {
//	class variables or Fields
//	You declare constants with final
	public final String TOMBSTONE = "Here lies a Dead monster!";
	
//	private fields are not visible outside of the class
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	private int xPosition = 0;
	private int yPosition = 0;
	private boolean alive = true;
	
	public String name = "Big Monster";
	
	public int getAttack() {
		return attack;
	}
	
	public int getMovement() {
		return movement;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int decreaseHealth) {
		health = health - decreaseHealth;
		if (health < 0) {
			alive = false;
		}
				
	}
	
	public void setHealth(double decrease) {
		int intDecreaseHealth = (int)decrease;
		health = health - intDecreaseHealth;
		if (health < 0) {
			alive = false;
		}
	}
	
	public Monster(int health, int attack, int movement) {
		this.health = health;
		this.attack = attack;
		this.movement = movement;
	}
	// You can overload  constructors like any other method
	// the following constructor is the one provided by default if you don't create
	// a default constructor
	public Monster() {
		
	}
	
	public Monster(int newHealth) {
		
	}
	
	public Monster(int newHealth, int newAttack) {
		this(newHealth);  //this calls for the the second constructor with one argument
		attack = newAttack;
	}
	
	public static void main(String[] args) {
		Monster Frank = new Monster();
		Frank.name = "Frank";
		
		System.out.println(Frank.name + " has " + Frank.attack);
	}
}