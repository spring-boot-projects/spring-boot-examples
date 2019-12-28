package com.neo.banner;

import javafx.scene.Parent;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class BannerApplication {

	public static void main(String[] args) {
//		SpringApplication.run(BannerApplication.class, args);

		/*----------------------- Customizing SpringApplication -------------------------*/
//		SpringApplication springApplication = new SpringApplication(BannerApplication.class);
//		springApplication.setBannerMode(Banner.Mode.CONSOLE);
//		springApplication.setLazyInitialization(true);
//		springApplication.run(args);

		/*----------------------- Fluent Builder API -------------------------*/
		new SpringApplicationBuilder()
				.sources(Parent.class)
				.child(BannerApplication.class)
				.bannerMode(Banner.Mode.OFF)
				.run(args);
	}
}
