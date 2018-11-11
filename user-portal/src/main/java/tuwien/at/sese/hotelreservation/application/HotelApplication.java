package tuwien.at.sese.hotelreservation.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableConfigurationProperties
@EnableAutoConfiguration(exclude = { SecurityAutoConfiguration.class })
@EntityScan(basePackages = {"tuwien.at.sese.hotelreservation.model"})  // scan JPA entities
@Configuration
@ComponentScan({ "tuwien.at.sese.hotelreservation.controller", "tuwien.at.sese.hotelreservation.service"})
@EnableJpaRepositories("tuwien.at.sese.hotelreservation.repository")
public class HotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelApplication.class, args);
	}
}