package com.matmr.twitterapiclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.matmr.twitterapiclient.config.PictureUploadProperties;

@SpringBootApplication
@EnableConfigurationProperties({ PictureUploadProperties.class })
public class TwitterapiclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwitterapiclientApplication.class, args);
	}
}
