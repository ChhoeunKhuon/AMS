package co.cstad.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArticalManagementSystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(ArticalManagementSystemApplication.class, args);

		Artical artical = new Artical();
		artical.setId(1);
		artical.setTitle("title");

		System.out.println(artical.getId());
		System.out.println(artical.getTitle());
	}

}
