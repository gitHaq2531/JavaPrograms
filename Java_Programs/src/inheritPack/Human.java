package inheritPack;

public class Human 
{
String name;
int age;
public Human(String name, int age)
{
	this.name=name;
	this.age=age;
}
public void print()
{
	System.out.println(name);
	System.out.println(age);
}
public void job()
{
	System.out.println(name+" can do job");
}
}
