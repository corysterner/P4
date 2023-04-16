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
	private int	size;
	
	public RecordDefSym(String name, int size) {
		this.name = name;
		this.table = new SymTab();
		this.size = size;
	}
	
	public String getType() {
		return name;
	}
	
	public SymTab getTable() {
		return table;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setTable(SymTab table) {
		this.table = table;
	}
}
