package StringMethods;

public class Methstring {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hello Java";
		System.out.println(s.length());   //length method
		System.out.println(s.charAt(6)); //Display character at mentioned index
		int a=10;
		String b=String.valueOf(a); //convert any datatype to string
		System.out.println(b);
		String s1="Hello Java";
		System.out.println(s.equals(s1));
		String s2= new String("Hello World");//check two string values (case and value) and return boolean value
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s1)); //check only the content of string not the case
		
		String s3="";
		System.out.println(s3.isEmpty());//check whether the string is empty or not and return a boolean value
		String s4="World";
		System.out.println(s4.isEmpty());
		String s5=s4.concat(" Wonder");//add two strings together
		System.out.println(s5);
		String s6=s5.concat(" Wow");
		System.out.println(s6);
		
	}


}
