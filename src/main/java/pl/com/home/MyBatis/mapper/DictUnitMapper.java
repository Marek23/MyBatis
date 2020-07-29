package pl.com.home.MyBatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import pl.com.home.MyBatis.model.DictUnit;

@Mapper
public interface DictUnitMapper {

	@Select(
		"select * from dict_units" +
		"where id = #{id}"
	)
	public DictUnit findUnit(String unit);

	@Select(
			"select * from dict_units"
	)
	public List<DictUnit> findAll();
}
