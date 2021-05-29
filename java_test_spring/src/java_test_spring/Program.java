package java_test_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		
//		Exam exam = new NewlecExam();
//		ExamConsole console = new GridExamConsole();
//		
//		console.setExam(exam);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("java_test_spring/setting.xml");
		
		//ExamConsole console = (ExamConsole) context.getBean("console");
		ExamConsole console = context.getBean(ExamConsole.class);
		
		Exam exam = context.getBean(Exam.class);
		System.out.println(exam.toString());
		
		console.print();
	}

}
