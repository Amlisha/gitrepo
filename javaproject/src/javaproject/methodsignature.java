package javaproject;

public class methodsignature {

	public int add(int a, int b, int c) {
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methodsignature calc=new methodsignature();
		System.out.println(calc.add(1,2, 5));
	}

}
