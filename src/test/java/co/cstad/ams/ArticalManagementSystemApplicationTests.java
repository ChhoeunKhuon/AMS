package co.cstad.ams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ArticalManagementSystemApplicationTests {

	@Test
	void testLombok(){
		Artical artical = new Artical();
		artical.setId(1);
		artical.setTitle("title");

		System.out.println(artical.getId());
		System.out.println(artical.getTitle());
		Assertions.assertEquals(1,artical.getId());
	}

}
