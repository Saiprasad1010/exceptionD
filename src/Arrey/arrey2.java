package Arrey;

public class arrey2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,48,96,45,12,35,78,94,65};
		String b[];
		b=new String[9];
		b[0]="Kolhapur";
		b[1]="Panhala";
		b[2]="Tirpan";
		b[3]="Saiprasad";
		b[4]="Subhash";
		b[5]="Patil";
		b[6]="Bytesquare";
		b[7]="Technology";
		b[8]="Pune";
		
		System.out.println("\nIntArrey=" +a[6]+ "\nStringArrey=" +b[6]);
		int q=0, w=0;
		System.out.println("\nIntArrey=");
		for(int c:a) {
			System.out.println("["+q+"]:" +c );
			q++;
		}
		System.out.println("\nStringArrey=");
		for(String c:b) {
			System.out.println("["+w+"]:" +c );
			w++;
		}
		
		

	}

}
