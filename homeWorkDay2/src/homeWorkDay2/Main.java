package homeWorkDay2;

public class Main {

	public static void main(String[] args) {
		
		
		
		Courses courses1=new Courses(1,"Java & React","Engin Demiro�");
		Courses courses2=new Courses(2,"C# ile temel programlama","�smail AK");
		Courses courses3=new Courses(3,"Python ile derin ��renme","�saac Promise");
		
		Courses [] courses = {courses1,courses2,courses3};
		
		for(Courses course:courses) {
			
			System.out.println("Kurs ad�:" + course.name);
			System.out.println("Kurs e�itmeni:" + course.tutor);
			
		}
			
			
		
		
		
		
		CourseManager courseManager=new CourseManager();
		courseManager.Add(courses1);
		courseManager.Update(courses2);
		
		
		
		
		

	}
	
		
		
		

}
