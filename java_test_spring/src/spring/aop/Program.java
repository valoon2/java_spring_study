package spring.aop;
import spring.aop.entity.Exam;
import spring.aop.entity.NewlecExam;

public class Program {

	public static void main(String[] args) {
		
		Exam exam = new NewlecExam(1,1,1,1);
		
		System.out.println(exam.total());
		
		
		
	}

}
