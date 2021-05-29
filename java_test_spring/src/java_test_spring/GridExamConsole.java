package java_test_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("console") //이름을 붙여도 되고 안붙여도됨
public class GridExamConsole implements ExamConsole {
	
	@Autowired(required = true)
	//@Qualifier("exam")
	private Exam exam;
	
	public GridExamConsole() {
		// TODO Auto-generated constructor stub
	}
	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}
	
	@Override
	public void print() {
		System.out.println(""
				+ "-------------------------------"
				+ "\ntotal : " + exam.total()
				+ "\n"
				+ "avg" + exam.avg()
				+ "\n"
				+ "-------------------------------");
	}

	@Autowired
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
		
	}

}
