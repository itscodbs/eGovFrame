package spring.test.ch04.ex01;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="{classpath:spring/text/ch04/ex01/spring-context.xml}")
@WebAppConfiguration
public class UserControllerTest {
	@Autowired private WebApplicationContext ctx;
	
	private MockMvc mockMvc;
	
	@Before
	public void setUp(){
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.ctx).build();
	}
	
	@Test
	public void testUserController() throws Exception{
		MockHttpServletRequestBuilder request = get("/ch04/ex01/user")
				.param("userName", "최한석");
				.param("age", "25");
				
				mockMvc.perform(request)
				.andDo(print())
				.andExpect(status().isOk());
	}
}
