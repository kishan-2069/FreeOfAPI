import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class TestList {
	public static void main(String[] args) throws SQLException {
		List<Column> list = new ArrayList<Column>();
		
		Column column1 =new  Column();
		
		column1.setColumnName("EmpName");
		column1.setDataType("varchar");
		column1.setLength(255);
		column1.setPK(true);
		column1.setAutoInc(false);
		
		Column column2 =new  Column();
		
		column2.setColumnName("Address");
		column2.setDataType("varchar");
		column2.setLength(255);
		column2.setPK(false);
		column2.setAutoInc(false);
		
		list.add(column1);
		list.add(column2);
			
		DBUtil dbUtil = new DBUtil();
		dbUtil.createTable("census001", "Employee", list);
	}
	
}
