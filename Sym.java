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
	private SymTab table;
	
	public RecordDefSym(String name) {
		this.name = name;
		this.table = new SymTab();
	}
	
	public String getType() {
		return name;
	}
	
	public SymTab getTable() {
		return table;
	}
	
}
