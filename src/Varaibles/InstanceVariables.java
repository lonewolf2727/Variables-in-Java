package Varaibles;

public class InstanceVariables {
	
	public int rollNum;
	public String name;
	public int totalMarks;
	public int number;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariables iv = new InstanceVariables();
		iv.rollNum=10234;
		iv.name="Aditya";
		iv.totalMarks=450;
		iv.number=100;
		
		System.out.println(iv.rollNum);
		System.out.println(iv.name);
		System.out.println(iv.totalMarks);
		System.out.println(iv.number);

	}

}
