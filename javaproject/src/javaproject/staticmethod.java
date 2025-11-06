package javaproject;

public class staticmethod {
      public static int addNumbers(int a , int b) {
    	  return a+b;
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       staticmethod calc=new staticmethod();
       int sum=staticmethod.addNumbers(200, 100);
       System.out.println("Sum is= "+sum);
		
	}
	private String name;

}
