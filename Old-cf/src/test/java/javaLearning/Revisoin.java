package javaLearning;

public class Revisoin {
	static String sName= "Hello World";
	static int ivalue= 20;
	double dvalue=23.333;
	double dvalue1=2.234;
	static Boolean bmyboolean= true;
	
	public Revisoin() {
		
	}
	
	
public static void main(String args[]){
	Revisoin myrev= new Revisoin();
	myrev.dvalue=myrev.dvalue1;
	
	bmyboolean=false;
	
	System.out.println("My Java program "+ sName);
	System.out.println("My ivalue is "+ivalue);
	System.out.println("My dvalue is "+myrev.dvalue);
	System.out.println("My dvalue1 is "+ myrev.dvalue1);
	System.out.println("My myboolean is "+bmyboolean);
   airthmmeticOpe();
   
  String[] days = {"Monday","Tuesday","Wed","Thur","Friday","Saturday"};
   for(int i=0;i<=days.length;i++){
   switchcase(days[i]);
   if (i==4) {
	break;
}
   System.out.println("day is = " +i);
   }
 
}

static public void airthmmeticOpe(){
	int a, b=10, c=5;
	a=b+c;
	int d=15;
	System.out.println("Value of a is " +a);
	System.out.println("Value of a is " +(a=b-c));
	System.out.println("Value of a is " +(a=b*c));
	System.out.println("Value of a is " +(a=b/c));
	System.out.println("Value of a is " +(a=b%c));
	System.out.println("Value of a is " +(b++));
	System.out.println("Value of a is " +(c--));
	System.out.println("Value of a is " +(b==c));
	
	if(b<c){
		System.out.println("Condition is passed");
	}
	else if(c<b){
		System.out.println("condition is not passed");
	}
}
	
	static public void switchcase(String a){
	//int iday=1;
//	String sday= "Monday";
	switch (a) {
	case "Monday":
		System.out.println("Today is monday");
		break;

	case "Tuesday":
		System.out.println("Today is Tuesday");
		break;
		
	case "Wed":
		System.out.println("Today is Wednesday");
		break;
	case "Thur":
		System.out.println("Today is Thursday");
		break;
	case "Friday":
		System.out.println("Today is Firday");
		break;
	case "Saturday":
		System.out.println("Today is Saturday");
		break;
	default:
			System.out.println("Today is monday");
		
		break;
	}
	
}
}
