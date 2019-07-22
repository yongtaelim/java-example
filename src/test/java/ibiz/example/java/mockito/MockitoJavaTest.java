package ibiz.example.java.mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.FromDataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ibiz.example.java.entity.TestEntity;

@RunWith(Theories.class)
public class MockitoJavaTest {

	private MockitoJava mockitoJava;
	
	private TestEntity testEntity; 
	
	@Before
	public void setUp() {
		this.testEntity = mock(TestEntity.class);
		mockitoJava = new MockitoJava(testEntity);
		
		//예외 발생시키는 토막 객체
//		doThrow(new Exception()).when(testEntity).setTest( "data");;
	}
	
	@Test
	public void getDataTest() {
		when(testEntity.getTest()).thenReturn("mock test data");
//		testentity.getTest가 호출 되지 않았는지  검증
		verify(testEntity, never()).getTest();
		assertThat(mockitoJava.getData()).isEqualTo("mock test data");
		assertThat(mockitoJava.getData()).isEqualTo("mock test data");
		assertThat(mockitoJava.getData()).isEqualTo("mock test data");
		
//		testentity.getTest가 최소한 1번 이상 호출되었는지 검증
		verify(testEntity, atLeastOnce()).getTest();
//		testentity.getTest가 최소한 4번 이상 호출되었는지 검증
		verify(testEntity, atMost(4)).getTest();
	}
	
	@Test
	public void doThrowTest() {
		String DATA = "data1";
		mockitoJava.setData(DATA);
	}
	
	@DataPoint("data") public static String DATA = "data1";
	@DataPoints("dataArray") public static String DATA_ARRAY[] = new String[] {"data1", "data2", "data3", "data4"};
	
	@Theory
	public void dataPointTest(@FromDataPoints("data") String datadd) {
		System.out.println(datadd);
	}
	@Theory
	public void dataPointArratTest(@FromDataPoints("dataArray") String dataArrayddd) {
		System.out.println(dataArrayddd);
	}
}
