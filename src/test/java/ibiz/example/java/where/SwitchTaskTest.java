package ibiz.example.java.where;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import ibiz.example.java.enums.JavaEnum;
import ibiz.example.java.where.SwitchTask;

public class SwitchTaskTest {

	private SwitchTask switchTask;
	
	@Before
	public void setUp() {
		switchTask = new SwitchTask();
	}
	
	@Test
	public void switchFuncionTest() {
		List<String> switchFuncion = switchTask.switchFuncion(JavaEnum.SWITCH_TEST1);
		System.out.println(switchFuncion.toString());
	}
	
	@Test
	public void valueOfTest() {
		String valueOf = switchTask.valueOf("SWITCH_TEST1");
		System.out.println(valueOf);
	}
}
