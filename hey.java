import java.util.*;
import java.io.*:

public void hey() {
	public static void main(String [] args) {
	strings[] = new Strings[3];
	strings[0] = "cde";
	strings[1] = "ct";
	strings[2] = "cddef";
	if (strings.length == 0) {
		System.out.println("yayy");
        return "";   // Or maybe return null?
    }

    for (int prefixLen = 0; prefixLen < strings[0].length(); prefixLen++) {
        char c = strings[0].charAt(prefixLen);
        for (int i = 1; i < strings.length; i++) {
            if ( prefixLen >= strings[i].length() ||
                 strings[i].charAt(prefixLen) != c ) {
                // Mismatch found
                ans =  strings[i].substring(0, prefixLen);
            }
        }
    }
    System.out.println(strings[0]);
	}
}
if (strings.length == 0) {
        return "";   // Or maybe return null?
    }

    for (int prefixLen = 0; prefixLen < strings[0].length(); prefixLen++) {
        char c = strings[0].charAt(prefixLen);
        for (int i = 1; i < strings.length; i++) {
            if ( prefixLen >= strings[i].length() ||
                 strings[i].charAt(prefixLen) != c ) {
                // Mismatch found
                return strings[i].substring(0, prefixLen);
            }
        }
    }
    return strings[0];