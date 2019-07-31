package ibiz.example.java.enums;

public enum JavaEnum implements EnumType{
	
	SWITCH_TEST2("test2")
	, SWITCH_TEST1("test1")
	, SWITCH_TEST3("test3");

	private String value;
	
	JavaEnum(String value) {
		this.value = value;
	}
	
	public String getCode() {
		return name();
	}
	
	@Override
	public String getValue() {
		return value;
	}
}
