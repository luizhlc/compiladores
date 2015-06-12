package compiler;

public enum Type {
	Int("int","I","i"),
	Double("double","D","d"),
	Bool("bool","B","b"),
	String("string","S","s"),
	Char("char","C","c"),
	Void("void","V","");
	
	private String type;
	private String typeParameter;
	private String typePrefix;
	
	private Type(java.lang.String type, java.lang.String typeParameter,
			java.lang.String typePrefix) {
		this.type = type;
		this.typeParameter = typeParameter;
		this.typePrefix = typePrefix;
	}

	public String getType() {
		return type;
	}

	public String getTypeParameter() {
		return typeParameter;
	}

	public String getTypePrefix() {
		return typePrefix;
	}
}
