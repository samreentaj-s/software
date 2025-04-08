;package p1;

public class employee {
	private String name;
	private float salary;
	
	public void setname(String a) {
		this.name=a;
	}
	public String getname() {
		return this.name;
	}
	public void setsalary(float d) {
		this.salary=d;
	}
	public float getsalary() {
		return this.salary;
		
	}


public static void main(String[]args) {
	employee e1=new employee();
	e1.setname("eshu");
	e1.setsalary((float) 9999.0);
	System.out.println(e1.getname());
	System.out.println(e1.getsalary());
}
}