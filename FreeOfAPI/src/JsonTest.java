import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;

public class JsonTest {
	public static void main(String[] args) {
	 //Object to Json String 
		
		/*Gson gson = new Gson();
		
		Column column = new Column();
		column.setColumnName("Column_Name");
		column.setDataType("varchar");
		column.setLength(255);
		column.setPK(true);
		column.setAutoInc(true);
		
		//System.out.println(gson.toJson(column)); // Output: {"columnName":"Column_Name","dataType":"varchar","length":255,"isPK":true,"autoInc":true}
		
		 //JSON String to Object Conversion 
		String jsonStr = "[{'columnName':'Column_Name','dataType':'varchar','length':255,'isPK':true,'autoInc':true},{'columnName':'Column_Name','dataType':'varchar','length':255,'isPK':true,'autoInc':true},{'columnName':'Column_Name','dataType':'varchar','length':255,'isPK':true,'autoInc':true}]";
			
		
		Column newColumn = gson.fromJson(jsonStr, Column.class);
		System.out.println(newColumn.getColumnName());*/
		
		
		
		List<String> list=new ArrayList();
	    list.add("a");
	    list.add("b");
	    list.add("c");
	    System.out.println(list);
	    Gson gsonSender = new Gson();
	    String json = gsonSender.toJson(list);
	    System.out.println(json);
	    Gson gsonReceiver = new Gson();
	    List obj = gsonReceiver.fromJson(json, List.class);
	    Iterator it=obj.iterator();
	    while(it.hasNext())
	    {
	        System.out.println((String)it.next());//java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.String
	    }
		
	}
}
