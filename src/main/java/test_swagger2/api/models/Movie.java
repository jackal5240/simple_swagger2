package test_swagger2.api.models;

import io.swagger.annotations.ApiModelProperty;

public class Movie {

	@ApiModelProperty(example="666", notes="Required", required=true)
	private String number;
	@ApiModelProperty(example="Leo")
	private String name;
	@ApiModelProperty(example="magic")
	private String catalog;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCatalog() {
		return catalog;
	}
	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}
	
}
