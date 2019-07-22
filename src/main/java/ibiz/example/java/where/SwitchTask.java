package ibiz.example.java.where;

import java.util.ArrayList;
import java.util.List;

import ibiz.example.java.enums.JavaEnum;

public class SwitchTask {
	public List<String> switchFuncion(JavaEnum enumParam) {
		List<String> resultList = new ArrayList<String>();
		switch (enumParam) {
		case SWITCH_TEST1:
			resultList.add(JavaEnum.SWITCH_TEST1.getValue());
		case SWITCH_TEST2:
			resultList.add(JavaEnum.SWITCH_TEST2.getValue());
		case SWITCH_TEST3:
			resultList.add(JavaEnum.SWITCH_TEST3.getValue());
			break;

		default:
			break;
		}
		return resultList;
	}
	
	public String valueOf(String enumString) {
		JavaEnum valueOf = JavaEnum.valueOf(enumString);
		return valueOf.getValue();
	}
}
