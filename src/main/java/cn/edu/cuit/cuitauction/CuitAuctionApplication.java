package cn.edu.cuit.cuitauction;

import com.didispace.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableSwagger2Doc
public class CuitAuctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CuitAuctionApplication.class, args);
	}
}
