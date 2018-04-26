import java.util.*;
import java.io.*;

class cseTry {
	static String[] eqn = new String[2];
	static int i,j,index;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter 2 statements: ");
		for(i=0;i<2;i++) {
			eqn[i] = sc.next();
		}
		String cse = eqn[0].substring(2,5);
		if(eqn[1].contains(cse)) {
			index = eqn[1].indexOf(cse);
			System.out.println("NEW EQUATIONS ARE: ");	
			System.out.println("t1 = " + eqn[0].substring(2,5));	
			System.out.println(eqn[0].substring(0,2) + "t1" + eqn[0].substring(5,eqn[0].length()));
			System.out.println(eqn[1].substring(0,index) + "t1" + eqn[1].substring(index+3,eqn[1].length()));

		}
		

	}

}

/*
PS: DON'T KNOW IF THIS IS OKAY!
OUTPUT
C:\Users\Niti123\Desktop\coding\spcc>javac cseTry.java

C:\Users\Niti123\Desktop\coding\spcc>java cseTry
enter 2 statements:
a=b*c+y;
l=b*c-u;
NEW EQUATIONS ARE:
t1 = b*c
a=t1+y;
l=t1-u;
*/