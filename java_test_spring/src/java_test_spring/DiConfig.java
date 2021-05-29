package java_test_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("java_test_spring")
@Configuration
public class DiConfig {
	
	@Bean
	public Exam exam() { //메소드를 그냥 이름이라고 생각해라 		
		return new NewlecExam();
	}
}
