package za.co.idealogic.javaexercise1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaExercise1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JavaExercise1Application.class, args);	
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.print("Hello world!");
	}
}
