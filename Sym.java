public class Sym {
	private String type;
	private String name;
	private SymTab table;

	public Sym(String type) {
		this.type = type;
	}
	
	public Sym(String type, String name, SymTab table) {
		this.name = name;
		this.type = type;
		table.addScope();
		this.table = table;
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
	
	public String getName() {
		return name;
	}
}

