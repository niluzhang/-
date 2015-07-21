package data.databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
	static String drivername = "com.mysql.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3306/gamedatabase";
	static String user = "root";
	static String password = "2014nlz@nju";
	static {
		try {
			Class.forName(drivername);
			System.out.println("�������ˣ��������ӄ����ɹ�");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = (Connection) DriverManager.getConnection(url, user,
					password);
			System.out.println("�������ˣ��������B�ӳɹ�");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	public static void free(ResultSet resultSet, Connection connection,
			Statement statement) {

		try {
			if (resultSet != null)
				resultSet.close();
		} catch (SQLException e) {
			System.out.println("�������ˣ�������ر�ResultSetʧ��");
			e.printStackTrace();
		} finally {

			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				System.out.println("�������ˣ�������ر�Connectionʧ��");
				e.printStackTrace();
			} finally {

				try {
					if (statement != null)
						statement.close();
				} catch (SQLException e) {
					System.out.println("�������ˣ�������ر�Statementʧ��");
					e.printStackTrace();
				}
			}
		}

	}

}

