
class D
{
	String name;
	double salary;
/*	D(String empname,double salary)
	{
		this.name = name;
		this.salary = salary;
	}*/
	void setName(String name)
	{
		this.name = name;
	}
	void setSalary(double salary){
		this.salary = salary;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
}
public class Emp {

	public static void main(String[] args) {
	    
      D obj = new D();
      obj.setName("ramani");
      obj.setSalary(123);
      System.out.println(obj.getName());
      System.out.println(obj.getSalary());

	}

}
