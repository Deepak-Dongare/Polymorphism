package Polymorphism;

class Oveer{
	
	void add(){
		int a=10,b=20;
		int c=a+b;
		System.out.println("parent class"+c);
		
	}
	
}
class Over extends Oveer{
	void add(){
		int a=10,b=20;
		int c=a+b;
		
		System.out.println("chiled class"+c);
		
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oveer r=new Oveer();
		r.add();
		Oveer r1=new Over();
		r1.add();

	}

}
