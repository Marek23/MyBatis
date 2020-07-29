package pl.com.home.MyBatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pl.com.home.MyBatis.mapper.DictUnitMapper;

@SpringBootApplication
public class MyBatisApplication {

	private static DictUnitMapper mapper;

	// konstruktor pozwala injectować mappera do klasy
	public MyBatisApplication(DictUnitMapper mapper) {
		this.mapper = mapper;
	}

	public static void main(String[] args) {
		SpringApplication.run(MyBatisApplication.class, args);
		mapper.findAll().forEach(d -> System.out.println(d.toString()));
	}

}
