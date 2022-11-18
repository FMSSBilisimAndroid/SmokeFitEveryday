
package SmokeFitEveryday.src.com.smokefiteveryday.apps.entity;



public class User {
	
	private int id;
	private final String name;
	private final String surname;
	private final int sex;
	private final float weigth;
	private final float heigth;
	
	
	public User(int id, String name, String surname, int sex, float weigth, float heigth) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.sex = sex;
		this.weigth = weigth;
		this.heigth = heigth;
		
	}

	
	
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getSex() {
		return sex;
	}

	public float getWeigth() {
		return weigth;
	}

	public float getHeigth() {
		return heigth;
	}

	
	
}
