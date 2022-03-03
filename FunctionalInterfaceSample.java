package bmk.pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

interface Addition {
	public int addfun(int a, int b);
}
class Employee {
	public Employee(int id, int age, String designation) {
		super();
		this.id = id;
		this.age = age;
		this.designation = designation;
	}
	int id;
	int age;
	String designation;
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
}
public class FunctionalInterfaceSample {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, 25, "Developer");
		Employee e2 = new Employee(2, 50, "Developer");
		Employee e3 = new Employee(3, 40, "Developer");
		Employee e4 = new Employee(4, 19, "Developer");
		Employee e5 = new Employee(5, 22, "Developer");

		List<Employee> ls = new ArrayList<Employee>();
		ls.add(e1);
		ls.add(e2);
		ls.add(e3);
		ls.add(e4);
		ls.add(e5);
		System.out.println("Ls ="+ls);
//		for (Object object : ls) {
//			ls.add(e);
//		}
		List<String> list = ls.stream().
				filter(e->e.getAge() > 20)
				.map(Employee::getName)
				.collect(Collectors.toList());
//		System.out.println("List Values = "+list);
		list.forEach(name -> System.out.println("Values "+name));
		
//		Addition add = new Addition();
		Addition abc = ( a,  b) -> (a + b);
		System.out.println(" Value ="+abc.addfun(20, 30));
		
//		{
//			
//			@Override
//			public int addfun(int a, int b) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		};
	}

}
