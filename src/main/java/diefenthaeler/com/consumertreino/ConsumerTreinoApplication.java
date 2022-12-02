package diefenthaeler.com.consumertreino;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class ConsumerTreinoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerTreinoApplication.class, args);
	}

}
