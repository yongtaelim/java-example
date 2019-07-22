package ibiz.example.java.mockito;

import ibiz.example.java.entity.TestEntity;

public class MockitoJava {

	private TestEntity testEntity;
	
	public MockitoJava(TestEntity testEntity) {
		this.testEntity = testEntity;
	}
	
	public String getData() {
		return testEntity.getTest();
	}
	
	public void setData(String data ) {
		testEntity.setTest(data);
	}
}
