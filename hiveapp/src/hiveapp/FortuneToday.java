package hiveapp;

public class FortuneToday {
	String name;
	int age;
	String gender;
	String luck;
	
	public FortuneToday() {
	}
	
	public FortuneToday(String name, int age, String gender, String luck) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.luck = luck;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLuck() {
		return luck;
	}
	public void setLuck(String luck) {
		this.luck = luck;
	}
	@Override
	public String toString() {
		return "fortune [name=" + name + ", age=" + age + ", gender=" + gender + ", luck=" + luck + "]";
	}
	
}
