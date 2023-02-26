package dream.dreamcatcher_bakcend_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DreamcatcherBakcEndJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DreamcatcherBakcEndJavaApplication.class, args);
	}

}
