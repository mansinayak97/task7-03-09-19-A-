
public class Emp extends Thread{
	private int empNo;
	private String eName;
	private int salary;
	
	public void run(){
		calculateOtherSal();
	}
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Emp(int empNo, String eName, int salary) {
		super();
		this.empNo = empNo;
		this.eName = eName;
		this.salary = salary;
	}
	public void calculateOtherSal()
	{
			double HRA=(0.1*this.getSalary());
			double DA=(0.25*this.getSalary());
			double CA=(0.1*this.getSalary());
			System.out.println("For Employee "+this.geteName()+": HRA= "+HRA);
			System.out.println("For Employee "+this.geteName()+": DA= "+DA);
			System.out.println("For Employee "+this.geteName()+": CA= "+CA);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 = new Emp(101, "AAA", 10000);
		Emp e2 = new Emp(102, "BBB", 20000);
		Emp e3 = new Emp(103, "CCC", 15000);
		Emp e4 = new Emp(104, "DDD", 25000);
		Emp e5 = new Emp(105, "EEE", 5000);
		
		e1.start();
		e2.start();
		e3.start();
		e4.start();
		e5.start();
	}
}
