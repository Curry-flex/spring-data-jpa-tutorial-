package com.example.demo;

import java.text.NumberFormat.Style;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Course;
import com.example.demo.entity.CourseMaterial;
import com.example.demo.entity.Guardian;
import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import com.example.demo.repository.CourseMaterialRepository;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.StudentRepository;
import com.example.demo.repository.TeacherRepository;

@SpringBootApplication
public class SpringDataJpaTutorialApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaTutorialApplication.class, args);
	}
	
	//StudentRepository injection
	/*
	private StudentRepository reposotory;
	

	public SpringDataJpaTutorialApplication(StudentRepository reposotory) {
		super();
		this.reposotory = reposotory;
	}
	*/

	
	//CourseMaterialRepository Injection
	
	private CourseMaterialRepository repository;
	

	public SpringDataJpaTutorialApplication(CourseMaterialRepository repository) {
		super();
		this.repository = repository;
	}
    
	@Autowired
	private CourseRepository courserepository;
	
	@Autowired
	
	private TeacherRepository teacherRepository;
	

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 Guardian g1 = new Guardian();
		 g1.setGfname("zahoro");
		 g1.setGlname("Mtati");
		 g1.setGphone("074635243");
		 
		 Student stu1 = new Student();
		 stu1.setFname("Adam");
		 stu1.setLname("zahoro");
		 stu1.setEmail("adam@gmail.com");
		 stu1.setGuardian(g1);
		 
		
		 
		 reposotory.save(stu1);
		 
		 
		 
	     List<Student> student =reposotory.findByLnameNotNull();
		System.out.println(student);
		
		List<Student> student1= reposotory.findByGuardianGlnameContaining("Mt");
		System.out.println(student1);
		
		
		Student stu = reposotory.getStudentByEmail("adam@gmail.com");
		System.out.println(stu);
		
	
		
		String name = reposotory.getFirstNameByEmail("adam@gmail.com");
		
		System.out.println(name);
		
		
		Student stu = reposotory.getStudentByEmailWithParam("flex@gmail.com");
		System.out.println(stu);
		
		
		 reposotory.updateStudent("Ibrahim", "Mtati", "merry@gmail.com");
		 
		
		
		
		//One to one relationship (Course and course material)
		Course course = new Course();
		course.setTitle("Spring boot");
		course.setCredit(10);
		
		CourseMaterial material = new CourseMaterial();
		material.setUrl("www.currytutorial/springMVC");
		material.setCourse(course);
		
		repository.save(material);
		
	
		
		//fetch one to one relationship data
		
	  List<CourseMaterial> material = repository.findAll();
		System.out.println(material);
		
		
		List<Course> course = courserepository.findAll();
		System.out.println(course);
		
			
		
	
		//One to Many relatioship(Teacher and Course)
		
		Course course1 = new Course();
		course1.setTitle("Java Programming");
		course1.setCredit(10);
		
		
		
		Course course2 = new Course();
		course2.setTitle("Spring MVC");
		course2.setCredit(15);
		
		
		
		List<Course> courselist = new ArrayList<Course>();
		courselist.add(course1);
		courselist.add(course2);
		
		Teacher teacher = new Teacher();
		teacher.setFisrtname("Shakira");
		teacher.setLastname("Zahoro");
		teacher.setCourse(courselist);
		
		teacherRepository.save(teacher);
		
		
		
		//Many to One (Course and teacher)
		Teacher teacher = new Teacher();
		teacher.setFisrtname("Mongi");
		teacher.setLastname("Kimambi");
		
		
		
		Course course = new Course();
		
		course.setTitle("PHPprogramming");
		course.setCredit(9);
		course.setTeacher(teacher);
		//course.setMaterial(null);
		
		
		courserepository.save(course);
		
		*/
		
		//Many to Many (Student and Course)
		
		//Teacher object
		Teacher teacher = new Teacher();
		teacher.setFisrtname("Dr chali");
		teacher.setLastname("Fedrick");
		
		//Student Object
		Student stu1  = new Student();
		stu1.setFname("Faustina");
		stu1.setLname("Anorld");
		stu1.setEmail("tyna@gmail.com");
		
		Student stu2  = new Student();
		stu2.setFname("Ayesha");
		stu2.setLname("Mtati");
		stu2.setEmail("ayesha@gmail.com");
		
		List<Student> studentlist = new ArrayList<Student>();
		studentlist.add( stu1);
		studentlist.add(stu2);
		
		Course course = new Course();
		course.setTitle("Larvel Framework");
		course.setCredit(15);
		course.setTeacher(teacher);
		course.setStudent(studentlist);
		
		
		courserepository.save(course);
		
		
		
	
		
	}

}
