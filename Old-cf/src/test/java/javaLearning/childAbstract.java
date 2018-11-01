package javaLearning;

public class childAbstract extends myAbstract {
	
	public static void main(String[] args){
		childAbstract abst= new childAbstract();
		abst.myabsMethod();
		abst.myRef(5);
	}

	@Override
	void myabsMethod() {
		System.out.println("Base class is calling");
		
	}
	void myRef(int a){
		System.out.println("Value fo x is " +a);
	}

}
