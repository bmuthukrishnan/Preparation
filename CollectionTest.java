package bmk.pkg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface OperationAdd {
	public int add(int a, int b);
}
class Emp {
	int empid;
	String name;
	String department;
	int salary;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public Emp(int empid, String name, String department, int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
}
public class CollectionTest {

	public static void main(String[] args) {

		Map map = new HashMap<Integer, String>();
		map.put(1, "Muthu");
		map.put(2, "Krish");
		map.put(3, "Raju");
		map.put(4, "Jeya");
		map.put(5, "Suga");
		map.put(6, "Karu");
		map.put(7, "Ram");
//		System.out.println("Map details ="+map);
		System.out.println("-----------------------------------------------1");
		Iterator iter = map.keySet().iterator();
		//Iterator
		while (iter.hasNext()) {
			Object object = (Object) iter.next();
			System.out.println("Key= "+object+" Value ="+map.get(object));
//			System.out.println("Object ="+map.get(object));

		}
		//EntrySet
		Iterator<Map.Entry<Integer, String>> iter1 = map.entrySet().iterator();
		System.out.println("-----------------------------------------------2");
		while (iter1.hasNext()) {
			Map.Entry<Integer, String> iteratormap = iter1.next();
			System.out.println("Key= "+iteratormap.getKey()+" Value ="+iteratormap.getValue());
//			System.out.println("Object ="+map.get(object));

		}
		System.out.println("----------------------------------------------3");
		//ForEach
		map.forEach((k, v) -> System.out.println("Key ="+k+"Value ="+v));
		Emp emp = new Emp(1,"Muthu","Computer",4000);
		Emp emp1 = new Emp(2,"Suga","Computer",60000);
		Emp emp2 = new Emp(3,"Karu","Computer",9000);
		Emp emp3 = new Emp(4,"EM3","Computer",8000);
		Emp emp4 = new Emp(5,"EM4","Computer",92000);
		Emp emp5 = new Emp(6,"EM5","Computer",34000);

		List<Emp> l=new ArrayList<Emp>();
		l.add(emp);
		l.add(emp1);
		l.add(emp2);
		l.add(emp3);
		l.add(emp4);
		l.add(emp5);
		List<Emp> empplist = l.stream()
				.filter(p -> p.getSalary() >5000)
				.collect(Collectors.toList());
//		empplist.forEach(n -> System.out.println("filter = "+n.getName()));
		
		OperationAdd addValue = ((a, b) -> a + b);
		System.out.println("Value of Addition is ="+addValue.add(30, 40));		
		StringJoiner str = new StringJoiner(":");
		str.add("STR!");
		str.add("STR2");
		str.add("STR3");
		str.add("STR4");
		System.out.println("------------"+str);

		List<String> collect = l.stream().map(x -> x.name).collect(Collectors.toList());
		
		System.out.println("Collector value"+collect);
		
	}

}
