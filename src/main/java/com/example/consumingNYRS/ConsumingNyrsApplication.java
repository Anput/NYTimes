package com.example.consumingNYRS;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingNyrsApplication {

	private static final Logger log =
		LoggerFactory.getLogger(ConsumingNyrsApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(ConsumingNyrsApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){

		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception{
		return args -> {
			TopStories topStories = restTemplate.getForObject("https://api.nytimes.com/svc/topstories/v2/home.json?api-key=5Juyps8ID6qTGAC1bcsuk00GB6RfOzer", TopStories.class);
			log.info(topStories.toString());
		};
	}

}
