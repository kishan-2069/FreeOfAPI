import java.sql.SQLException;

public class DBTest {

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {

		DBUtil dbUtil = new DBUtil();

		dbUtil.createDB(1, "Census002");

	}

}
