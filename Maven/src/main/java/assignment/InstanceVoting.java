package assignment;
//Write a program to check whether the candidate is eligible for Voting(Using Instance Method and return type)
public class InstanceVoting {
 public void Vote(int age)
 {
	 boolean eli=true,  noeli=false;
	 if (age>=18)
		 System.out.println(eli);
	 else
		 System.out.println(noeli);
 }

	public static void main(String[] args) {
		InstanceVoting ob=new InstanceVoting();
		ob.Vote(5);

	}

}
