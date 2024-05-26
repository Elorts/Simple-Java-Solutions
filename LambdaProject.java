import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	String name;
	Integer salary;
	Integer age;
	
	Employee(String name, Integer salary, Integer age) {
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
}


public class LambdaProject {

	public static void main(String[] args) {
		
		Predicate <Employee> pr = e -> (e.salary > 50000);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("John", 50000, 25));
		al.add(new Employee("David", 200000, 45));
		al.add(new Employee("Mikas", 89000, 34));
		al.add(new Employee("Julius", 45000, 36));
		
		for (Employee e : al) {
			if (pr.test(e)) {
				System.out.println(e.name + " " + e.salary);
			}
		}
		
		Integer a[] = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65};
		
		System.out.println(a.length);
		
		Predicate <Integer> im = num -> (num % 2 == 0);
		
		Predicate <Integer> in = num -> (num > 50);
		
		for (Integer i : a) {
			if (im.and(in).test(i))
				System.out.println(i);
		}
		
		Function<String, Integer> f = i -> i.length();
		System.out.println(f.apply("kukumaku"));
				
		Consumer <String> c = s -> System.out.println(s);
		c.accept("Lalalalalalala");
		
		
		
		Function <Employee, Integer> bon = e -> (e.salary / 10);  // returns bonus
	
		
		
		Predicate <Integer> siz = b -> (b > 5000);				  // return true or false
		
		Consumer <Employee> con = e -> {
											System.out.println(e.name);
											System.out.println(e.salary);
		};
			
		
		
		
		for (Employee e : al) {
			
			if (siz.test(bon.apply(e))) {
				con.accept(e);
			}
			System.out.println();
//			
//			
//			if (siz.test(bon.apply(e.salary)) {
//				con.accept
			}
		}
		
		
	}


