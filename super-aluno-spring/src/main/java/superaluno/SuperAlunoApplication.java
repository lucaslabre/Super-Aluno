package superaluno;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SuperAlunoApplication {
	
	private static Logger logger = LoggerFactory.getLogger(SuperAlunoApplication.class);

	public static void main(String[] args) {
		logger.info("Inicializando aplicação Super Aluno!");
		SpringApplication.run(SuperAlunoApplication.class, args);
		logger.info("Aplicação iniciada e pronta para ser utilizada!");
	}

}
