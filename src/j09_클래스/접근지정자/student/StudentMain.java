package j09_클래스.접근지정자.student;

public class StudentMain {
	public static void main(String[] args) {
		Student student = new Student("김종학", 1, 25, "부산 서구", "010-7696-2433");
		
		Student student2 = new Student();
		student2.setName("김종학");
		student2.setStudentYear(1);
		student2.setAge(25);
		student2.setAddress("부산 서구");
		student2.setPhone("010-7696-2433");
		System.out.println(student2.getName());
		System.out.println(student2.getStudentYear());
		System.out.println(student2.getAge());
		System.out.println(student2.getAddress());
		System.out.println(student2.getPhone());
		
	}
}
