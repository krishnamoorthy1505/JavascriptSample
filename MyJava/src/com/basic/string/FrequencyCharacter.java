package com.basic.string;

public class FrequencyCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String freqString="Frequency character";
		int[] fi=new int[freqString.length()];
		char ch[]=freqString.toCharArray();
		for(int i=0;i<freqString.length();i++) {
			fi[i]=1;
			for(int j=i+1;j<freqString.length();j++) {
				if(ch[i]==ch[j]) {
					fi[i]++;
					ch[j]='0';
				}
			}
			
		}
		for(int i=0;i<fi.length;i++) {
			if(ch[i]!=' ' && ch[i]!= '0')
			System.out.println(ch[i]+" "+fi[i]);
		}

	}

}
