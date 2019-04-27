package test_swagger2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@ServletComponentScan
public class EwWsrgApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(EwWsrgApplication.class, args);
//		JapCommon.setApplicationContext(context);
	}
}
