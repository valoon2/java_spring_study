package java_test_spring;

public class GridExamConsole implements ExamConsole {
	
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

	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
		
	}

}
