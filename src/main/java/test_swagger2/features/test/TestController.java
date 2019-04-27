package test_swagger2.features.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import test_swagger2.api.messages.TestRequest;

@RestController
public class TestController {

	@ApiOperation(value = "testGet")
	@GetMapping(value = "/testGet")
	public String test () {
		return "testGet finish";
	}
	
	@ApiOperation(value="testPost.")
//    @ApiImplicitParams({
//        @ApiImplicitParam(name="ReuestBody", paramType="body", dataType="test_swagger2.api.models.Movie", required=true)})
	@PostMapping(value = "/testPost")
	public String test (@RequestBody TestRequest request) {
		return "testPost finish";
	}
}
