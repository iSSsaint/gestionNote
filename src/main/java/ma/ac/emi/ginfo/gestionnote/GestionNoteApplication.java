package ma.ac.emi.ginfo.gestionnote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class GestionNoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionNoteApplication.class, args);
	}

}
