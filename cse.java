import java.util.*;
import java.io.*;

class cse {
	static String[] eqn = new String[2];
		static int i,j,k,n;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enterr no of statements");
		n=sc.nextInt();
		System.out.println("enter");
		for(i=0;i<n;i++) {
			eqn[i] = sc.next();
		}
		String ab = getLongestCommonPrefix(eqn);
		System.out.println(ab);
	}

	public static String getLongestCommonPrefix(String[] strings) {
		    int commonPrefixLength = 0;
		    while (allCharactersAreSame(strings, commonPrefixLength)) {
		        commonPrefixLength++;
		    }
		    return strings[0].substring(0, commonPrefixLength);
		}

		private static boolean allCharactersAreSame(String[] strings, int pos) {
		    String first = strings[0];
		    for (String curString : strings) {
		        if (curString.length() <= pos 
		                || curString.charAt(pos) != first.charAt(pos)) {
		            return false;
		        }
		    }
		    return true;
		}
}