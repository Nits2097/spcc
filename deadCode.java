import java.util.*;
import java.io.*;

class deadCode {
	static int global;
	public static void main(String args[]) {
		beforeOpt();
		afterOpt();
	}
	static void beforeOpt() {

		long start = System.nanoTime();
		int i;
		global=1;
		global=2;
		long end = System.nanoTime();
		System.out.println((end-start)*1000);
		return;
		//global=3;
	}
	static void afterOpt() {

		long start = System.nanoTime();
		global=2;
		long end = System.nanoTime();
		System.out.println((end-start)*1000);
		return;
		
	}


}

/*
OUTPUT
C:\Users\Niti123\Desktop\coding\spcc>javac deadCode.java

C:\Users\Niti123\Desktop\coding\spcc>java deadCode
3308000
945000
*/