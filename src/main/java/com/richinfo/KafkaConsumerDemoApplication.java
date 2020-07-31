package com.richinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class KafkaConsumerDemoApplication {

	static {
		System.setProperty("java.security.auth.login.config", "E:\\IDEA_studing\\kafka-consumer-demo\\src\\main\\resources\\kafka_cilent_jaas.conf");
	}

	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerDemoApplication.class, args);
	}

}
