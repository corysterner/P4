public class Sym {
	private String type;

	public Sym(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public String toString() {
		return type;
	}
	
}
class RecordDefSym extends Sym{
	private String name;
	private String type;
	private SymTab table;
	
	public RecordDefSym(String type, String name) {
		this.name = name;
		this.type = type;
		this.table = new SymTab();
	}
	
	public String getType() {
		return name;
	}
	
	public SymTab getTable() {
		return table;
	}
	
}
