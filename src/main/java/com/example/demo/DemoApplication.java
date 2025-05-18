package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@Value("${LinhVo.ten}")
	private String ten;
	@Value("${LinhVo.tuoi}")
	private int tuoi;
	@Value("${LinhVo.ngoaihinh}")
	private String ngoaihinh;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	   @GetMapping("/info")
	   public String info(){
		   return  "Ten: "+ten+ "<br/>"+
				   "Tuoi: "+tuoi+ "<br/>"+
				   "ngoaihinh: "+ngoaihinh+ "<br/>";
	   }
}
