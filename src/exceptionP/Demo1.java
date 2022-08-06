package exceptionP;

public class Demo1 {
	int a=1;
	int b=0;

		void abc(){
			System.out.println(a/b);
		
			
		}
		void xyz() {
			abc();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Demo1 v=new Demo1();
       v.xyz();

	}

}
