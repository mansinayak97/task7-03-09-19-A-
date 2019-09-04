
public class EmpMainInterface implements Runnable{
	private int empNo;
	private String eName;
	private int salary;
	
	public EmpMainInterface(int empNo, String eName, int salary) {
		super();
		this.empNo = empNo;
		this.eName = eName;
		this.salary = salary;
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

	@Override
	public void run() {
		// TODO Auto-generated method stub
		calculateOtherSal();
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
		Thread t1 = new Thread(e1);
		Thread t2 = new Thread(e2);
		Thread t3 = new Thread(e3);
		Thread t4 = new Thread(e4);
		Thread t5 = new Thread(e5);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
