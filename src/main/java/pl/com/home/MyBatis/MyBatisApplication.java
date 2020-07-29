package pl.com.home.MyBatis;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;

import pl.com.home.MyBatis.mapper.DictUnitMapper;

@SpringBootApplication
public class MyBatisApplication {
	private static DictUnitMapper mapper;

	public MyBatisApplication(DictUnitMapper mapper) {
		this.mapper = mapper;
	}

	public static void main(String[] args) {
		SpringApplication.run(MyBatisApplication.class, args);
		System.out.println(mapper.findXmlTest("001", null));
	}

//	@Bean
//	CommandLineRunner demo() {
//		return args -> {
//		};
//	}
}
