package InfoAccess;

public class Instructor {
private String name;
private int price;
private int age;
public Instructor(String name,int price,int age) {
	this.age=age;
	this.name=name;
	this.price=price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
}
