package prueba3;

public class prueba3_main {
	public static void main(String[] args) {		
		Integer num1=new Integer("125");
		Integer num2=new Integer("125");
		int n1=num1.intValue();
		int n2=num2.intValue();
		System.out.println("La suma de "+n1+" y "+n2+" da :"+(n1+n2));
		if (n1+n2>130)
			n1++;
		else
			n1--;
		System.out.println(n1);
	}

}
