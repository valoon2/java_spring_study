package java_test_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		
//		Exam exam = new NewlecExam();
//		ExamConsole console = new GridExamConsole();
//		
//		console.setExam(exam);
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("java_test_spring/setting.xml"); //xml 파일을 통해서 어노테이션 설정할 때
		ApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
		
		
		//Exam exam = context.getBean(Exam.class);
		//System.out.println(exam.toString());
		
		//ExamConsole console = context.getBean(ExamConsole.class);
		//ExamConsole console = (ExamConsole) context.getBean("console");
		//console.print();
	}

}
