package string;

import java.util.Scanner;

public class Str1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		char[] a = s.nextLine().trim().toCharArray();
		String word = "" ;
		String str = "" ;
		for(int i = 0 ; i < a.length ; i++)
		{
			int s_index = i ;
			while (i < a.length && a[i] != ' ') {
				i++ ;
			}
			int e_index = i-1 ;
			while(i < a.length && a[i] != ' ') {
			word = word + a[e_index--];
			}
			str = str + (word + "");
			word = "";
		}
		System.out.println(str);
	}

}
