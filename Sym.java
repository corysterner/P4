public class Sym {
	private String type;
	private String name;
	private SymTab table;

	public Sym(String type) {
		this.type = type;
	}
	
	public Sym(String type, String name) {
		this.name = name;
		this.type = type;
		this.table = new SymTab();
	}
	
	public String getType() {
		return type;
	}
	
	public String toString() {
		return type;
	}
	
	public SymTab getTable() {
		return table;
	}
}

