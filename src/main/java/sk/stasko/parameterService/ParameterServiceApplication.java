package sk.stasko.parameterService;

import org.dozer.DozerBeanMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sk.stasko.parameterService.type.TypeBeanMappingBuilder;

@SpringBootApplication
public class ParameterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParameterServiceApplication.class, args);
	}

	@Bean
	public DozerBeanMapper mapper() {
		DozerBeanMapper mapper = new DozerBeanMapper();
		mapper.addMapping(new TypeBeanMappingBuilder());
		return mapper;
	}

}
