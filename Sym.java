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
	private String type;
	private SymTab table;
	private int	size;
	
	public RecordDefSym(String type, int size) {
		this.type = type;
		this.table = new SymTab();
		this.size = size;
	}
	
	public String getType() {
		return type;
	}
	
	public SymTab getTable() {
		return table;
	}
	
	public int getSize() {
		return size;
	}
}
