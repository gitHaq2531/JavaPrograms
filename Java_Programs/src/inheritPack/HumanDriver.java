package inheritPack;

public class HumanDriver 
{
public static void main(String[] args) 
{
	Human h1=new Human("alex", 20);
	Human h2=new Human("smith", 40);
	h1.print();
	h1.job();
	h2.print();
	h2.job();
}
}
