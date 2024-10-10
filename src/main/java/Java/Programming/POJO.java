package Java.Programming;

public class POJO {
	
	String name;
	double salary;
	int age;
	char gender;
	
		
	public void updateDetails(String name,	double salary,int age,char gender) {
		this.name=name;
		this.salary=salary;
		this.age=age;
		this.gender=gender;
	}

	String getName() {
		return name;
	}
	
	double getsalary() {
		return salary;
	}
	
	int getage() {
		return age;
	}
	
	char getgender() {
		return gender;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		POJO pojo = new POJO();
		pojo.updateDetails("Rudra", 50000, 3, 'M');
		System.out.println(pojo.getgender());
		System.out.println(pojo.getName());
		pojo.updateDetails("Dnyaneshwari", 50000.01, 30, 'F');
		System.out.println(pojo.getgender());
		System.out.println(pojo.getName());

	}

}
