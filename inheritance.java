package demo;

public class inheritance {
	public static void main(String args[]) {
		Animal a1=new Animal();
		a1.setName("Honey");
		a1.setAge(5);
		System.out.println("Name of animal is:"+a1.name);
		System.out.println("Age of animal is:"+a1.age);
		
		Pen p1=new Pen();
		p1.cost=10;
		p1.tip=5;
		System.out.println("Cost of pen is:"+p1.cost);
		System.out.println("Tip of pen is:"+p1.tip);
		
	}

}
class Animal{
	String name;
	int age;
	
	void setName(String Name){
		name=Name;
	}
	void setAge(int Age) {
		age=Age;
	}
}
class Pen{
	 int cost;
	 int tip;
	 
	 Pen(){
		 System.out.println("Constructor called");
	 }
	 Pen(int cost, int tip){
		 this.cost=cost;
		 this.tip=tip;
	 }
}