package ibiz.example.java.assertj;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import org.assertj.core.api.AbstractListAssert;
import org.assertj.core.api.ObjectAssert;
import org.junit.Before;
import org.junit.Test;

public class assertTest {

	private String DATA1 = "data1";
	private List<entity> DATALIST;
	
	@Before
	public void setUp() {
		DATALIST = new ArrayList<entity>();
	}
	
	@Test
	public void assertThatEqualTest() {
		//success
		assertThat(DATA1).isEqualTo("data1");
		assertThat(DATA1).isNotEqualTo("data2");
		//fail
//		assertThat(DATA1).isEqualTo("data2");
		
	}
	
	@Test
	public void assertThatIsIn() {
		//success
		assertThat(DATA1).isIn(new String[] {"data1", "data2"});
		
		//fail
//		assertThat(DATA1).isIn(new String[] {"data11", "data22"});
	}
	
	@Test
	public void assertThatContains() {
		DATALIST.add(new entity("key1", "name1"));
		DATALIST.add(new entity("key2", "name2"));
		DATALIST.add(new entity("key3", "name3"));
		
		assertThat(DATALIST).extracting("key")
										.contains("key1","key2")
										.doesNotContain("name1");
		assertThat(DATALIST).extracting("name").contains("name3");
		
	}
	
	public static class entity {
		private String key;
		private String name;
		
		public entity(String key, String name) {
			this.key = key;
			this.name = name;
		}
		
		public String getKey() {
			return this.key;
		}
		
		public String getName() {
			return this.name;
		}
		
		public void setKey(String key) {
			this.key = key;
		}
		
		public void setName(String name) {
			this.name = name;
		}
	}
}
