package com.qa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class Java_Practics_String {
	
	//reverse String:
	
	@Test(enabled=false)
	public void reverseAString() {
		String s="Subhojit";
		StringBuilder sb=new StringBuilder(s);
		StringBuilder ratan= sb.reverse();
		System.out.println(ratan);
	}
	
	//reverse String without stringBuilder
	
	@Test(enabled=false)
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
	
	@Test(enabled=false)
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
	
	@Test(enabled=false)
	public void removeUnwantedCharacter() {
		String s="########$$$$$$$##@@@@@@@@@@@#$%%%$$$#Java############# JJJHA";
		s=s.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(s);
	}
	
	//Find duplicate characters in the provided String and also find the count of each duplicate character.
	
	//given String: "INDIA";
	
	@Test
	public void removeDuplicateFromString() {
		
		String name="INDIAUUUUAAAAAAAAAA";
		name=name.toLowerCase();
		char[] toChar=name.toCharArray();
		System.out.println(toChar);
		HashMap<Character, Integer> load=new HashMap<Character, Integer>();
		for(Character ch:toChar) {
			if(load.containsKey(ch)) {
				load.put(ch, load.get(ch)+1);
			}
			else {
				load.put(ch, 1);
			}
		
		}
		System.out.println(load);
		System.out.println(load.keySet());
		Set<Character> r=load.keySet();
		for (Character ch:r) {
			if(load.get(ch)>1) {
				System.out.println("Dubbblie  --> "+ch+"  Count-> "+ load.get(ch));
			}
		}
		
	}
	
	//Practices on Duplicate cods:
	
	@Test
	public void nonDuplicateChar() {
		
		String name= "IndiaIAM";
		name=name.toLowerCase();
		char[] toChar=name.toCharArray();
		HashMap<Character,Integer> nameToMap=new HashMap<Character,Integer>();
		for(Character ch:toChar) {
			if(nameToMap.containsKey(ch)) {
				nameToMap.put(ch, nameToMap.get(ch)+1);
			}
			else {
				nameToMap.put(ch,1);
				
			}
					
		}
		Set<Character> tada=nameToMap.keySet();
		for(Character ch1:tada) {
			if(nameToMap.get(ch1)==1) {
				System.out.println("This is non duplicates character --> "+ch1);
				
			}
		}
		
		
		
		
		
	}
	
	
	

}
