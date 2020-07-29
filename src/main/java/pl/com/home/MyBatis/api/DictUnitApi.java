package pl.com.home.MyBatis.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.com.home.MyBatis.mapper.DictUnitMapper;
import pl.com.home.MyBatis.model.DictUnit;

@RestController
@RequestMapping("/api/dict_unit")
public class DictUnitApi {

	private DictUnitMapper mapper;

	// konstruktor pozwala injectować mappera do klasy
	public DictUnitApi(DictUnitMapper mapper) {
		this.mapper = mapper;
	}
	@GetMapping
	public List<DictUnit> getAll() {
		System.out.println(mapper);
		return mapper.findAll();
	}
}
