class Student 
{
	int roll;
	String name;
	double marks;
	public void setData(int roll, String name, double marks) //mutator
	{
		
		this.roll=roll;
		
		this.name=name;
		
		this.marks=marks;
	}
	public void getData() //accessor
	{
		System.out.println("Roll no of student:"+roll);
		System.out.println("Name of Student:"+name);
		System.out.println("Marks of student:"+marks);
	}
}
class TestStudent
{
	public static void main(String args[])
	{
		Student S1 = new Student(); //create object
		S1.setData(55,"Rohan",100);
		S1.getData();
		System.out.println();
		Student S2 = new Student();
		S2.setData(59,"Rohan",100);
		S2.getData();
	}
}