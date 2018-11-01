package javaLearning;
 
public class Constructor {
	
		int empid;
	 String empName;
	public Constructor(int a, String b) {
		this.empid= a;
		this.empName= b;
	}
	
	void pass(){
		System.out.println("empid " +empid + " and " + "empName " +empName);
	}
	
	public static void main(String args[]){
		//int amit =38;
		//String sonu = "Raining season";
	 Constructor amita = new Constructor(2,"sonu");
	 amita.pass();
	}

}
