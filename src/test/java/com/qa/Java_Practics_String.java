package com.qa;

import java.util.HashSet;

import org.testng.annotations.Test;

public class Java_Practics_String {
	
	//reverse String:
	
	@Test
	public void reverseAString() {
		String s="Subhojit";
		StringBuilder sb=new StringBuilder(s);
		StringBuilder ratan= sb.reverse();
		System.out.println(ratan);
	}
	
	//reverse String without stringBuilder
	
	@Test
	public void reverseStringwithoutRevese() {
		String s="Subhojit";
		String reverseString="";
		
		for(int u=(s.length()-1);u>=0;u--) {
			reverseString=reverseString+s.charAt(u);
		}
		System.out.println(reverseString);
	}
	
	//reverse words in place of each character like this.
	//Input String: “This is the string to reverse”
	//Output String: “reverse to string the is This”
	
	@Test
	public void reverseWordWithoutReversingString() {
		String originalString="This is the string to reverse";
		String[] breakTheString=originalString.trim().split(" ");
		String rr="";
		for(int u=(breakTheString.length-1);u>=0;u--) {
			rr=rr+" "+breakTheString[u];
			rr=rr.trim();
		}
		System.out.println(rr);
	}
	
	
	//remove unwanted/ unknown character:
	
	//by using regular expression [a-zA-Z0-9]
	
	@Test
	public void removeUnwantedCharacter() {
		String s="########$$$$$$$##@@@@@@@@@@@#$%%%$$$#Java############# JJJHA";
		s=s.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(s);
	}
	
	//Find duplicate characters in the provided String and also find the count of each duplicate character.
	
	//given String: "INDIA";
	
	@Test
	public void removeDuplicateFromString() {
		
		String name="INDIA";
		name=name.toLowerCase();
		HashSet<Character> ch=new HashSet<Character>();
		for(int u=0;u<name.length();u++) {
			ch.add(name.charAt(u));
		}
		System.out.println(ch);
		
		
		
	}
	
	

}
