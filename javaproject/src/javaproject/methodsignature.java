package javaproject;

public class methodsignature {

	public int add(int a, int b, int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methodsignature calc=new methodsignature();
		int res=calc.add(1, 2, 3);
		System.out.println("The sum is "+res);
	}

}
