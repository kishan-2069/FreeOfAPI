
public class Column {

	private String columnName;
	private String dataType;
	private int length;
	private boolean isPK;
	private boolean autoInc;
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public boolean isPK() {
		return isPK;
	}
	public void setPK(boolean isPK) {
		this.isPK = isPK;
	}
	public boolean isAutoInc() {
		return autoInc;
	}
	public void setAutoInc(boolean autoInc) {
		this.autoInc = autoInc;
	}
	@Override
	public String toString() {
		return "Column [columnName=" + columnName + ", dataType=" + dataType
				+ ", length=" + length + ", isPK=" + isPK + ", autoInc="
				+ autoInc + "]";
	}
}
