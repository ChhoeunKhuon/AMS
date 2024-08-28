package co.cstad.ams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ArticalManagementSystemApplicationTests {

	@Autowired
	@Qualifier("artical1")
	private Artical artical;
	@Test
	void testLombok(){
		Assertions.assertEquals(1, artical.getId());
	}
	@Test
	void testLombok2(){
		Artical artical = new Artical();
		artical.setId(1);
		artical.setTitle("title");

		System.out.println(artical.getId());
		System.out.println(artical.getTitle());
		Assertions.assertEquals(1,artical.getId());
	}

}
