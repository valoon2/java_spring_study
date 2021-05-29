package java_test_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class InlineExamConsole implements ExamConsole {

	private Exam exam;
	
	public InlineExamConsole() {
		// TODO Auto-generated constructor stub
	}
	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}



	@Override
	public void print() {
		System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());

	}

	
	//@Autowired //setting에서 자동으로 매칭해준다.
	//@Qualifier("exam") //설정된 이름으로 매칭되게 도와준다. 
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
		
	}

}
