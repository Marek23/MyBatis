package pl.com.home.MyBatis.model;

public class DictUnit {
	private String unit;
	private String name;

	public String getUnit() {
		return unit;
	}
	public String getName() {
		return name;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "DictUnit [unit=" + unit + ", name=" + name + "]";
	}	
}
