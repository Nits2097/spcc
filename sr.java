import java.util.*;
import java.io.*;

class sr {
	public static void main(String[] args) {
		int n,i,ipos=0,pos=0,flag=0;
		Scanner sc= new Scanner(System.in);
		n = sc.nextInt();
		String[] code = new String[n];
		for(i=0;i<n;i++) {
			code[i] = sc.nextLine();
		}
		System.out.println("k = 0; ");
		pos = code[3].indexOf("c");
		System.out.println(pos);
		for(i=0;i<n;i++) {
			if(i==3) {
				flag=1;
				break;
			}
			System.out.println(code[i]);
		}
		System.out.println(code[3].substring(0,pos) + " k;");
		for(i=5;i<n;i++) {
			System.out.println(code[i]);
		}
	}
}


/*c = 7;
for (i = 0; i < N; i++)
{
    y[i] = c * i;
}
can be replaced with successive weaker additions

c = 7;
k = 0;
for (i = 0; i < N; i++)
{
    y[i] = k;
    k = k + c;
}*/