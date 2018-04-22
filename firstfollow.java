import java.util.*;
import java.io.*;

class firstfollow{
	static char t[],nt[];
	static int tlen,ntlen;
	static String cfg[][],first[],follow[];
	public static void main(String args[]) throws IOException{
		System.out.println("enter nonterminals");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nonter,ter;
		nonter = br.readLine();
		nt = new char[nonter.length()];
		nt = nonter.toCharArray();
		System.out.println("enter terminals");
		ter = br.readLine();
		t = new char[ter.length()];
		t = ter.toCharArray();
		int n,i,j,k;
		cfg = new char[nt.length][];
		for (i=0;i<nt.length;i++)
		{
			System.out.println("enter no of productions for " + nt[i]);
			n=Integer.parseInt(br.readLine());
			System.out.println("enter productions: ");
			cfg[i] = new String[n];
			for(j=0;j<n;j++)
			{
				cfg[i][j] = br.readLine();
			}

		}
		System.out.println("FIRST SET");
		first = new String[nt.length];
		follow = new String[t.length];
		for(i=0;i<nt.length;i++)
		{
			first[i] = computeFirst(i);
			System.out.println(nt[i] + " --> " + removeDuplicates(first[i]));
		}
		System.out.println("FOLLOW SET");
		for(i=0;i<t.length;i++)
		{
			follow[i] = computeFollow(i);
			System.out.println(nt[i] + " --> " + removeDuplicates(follow[i]));
		}

	}



}