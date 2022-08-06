package Arrey;

public class arreyprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {15,45,65,89,21,02,352};
		String b[];
		b=new String[7];
		b[0]="Saiprasad";
		b[1]="Subhash";
		b[2]="Raviraj";
		b[3]="Patil";
		b[4]="Bytesquare";
		b[5]="Technology";
		b[6]="Pune";
		
		
		System.out.println("IntArrey :" +a[5]+ "\nStringArrey :" +b[4]);
		int c=0, k=0;
		System.out.println("\nInt Arrey =");
		for (int h:a) {
			System.out.println("["+c+"]:" +h);
			c++;
		}
		System.out.println("\nString Arrey =");
		for (String h : b) {
			System.out.println("["+k+"]:" +h);
			k++;
		}
		
		
	}

}
