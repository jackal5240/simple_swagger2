package test_swagger2.api.messages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.core.env.StandardEnvironment;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

public class TestRequest {

	@Autowired
	static
    Environment env;
	
	private static final String kk = env.getProperty("spring.key");
	
//	@Value("${spring.key}")
	@ApiModelProperty(example="@Value(\"${spring.key})\"") 
	private String defaultKey;
	
	@ApiModelProperty(example = "value_key", notes="Required", required=true)
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
	public String getDefaultKey() {
		return defaultKey;
	}
	public void setDefaultKey(String defaultKey) {
		this.defaultKey = defaultKey;
	}
	
}
