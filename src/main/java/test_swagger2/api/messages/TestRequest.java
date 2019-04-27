package test_swagger2.api.messages;

import io.swagger.annotations.ApiModelProperty;

public class TestRequest {

	@ApiModelProperty(example="key_666", notes="Required", required=true)
	private String key;
	@ApiModelProperty(example="value_666")
	private String value;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
