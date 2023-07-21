package jdbc.connection;

import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariDataSource;

public class ConnectionProvider {
	private static ConnectionProvider innstance;
	private static HikariDataSource ds;

	public static ConnectionProvider getInstance() {
		if (innstance == null) {
			synchronized (ConnectionProvider.class) {
				innstance = new ConnectionProvider();
			}
		}
		return innstance;
	}

	public void setDs(HikariDataSource ds) {
		ConnectionProvider.ds = ds;
	}

	// connection pooling 기능을 사용한 connection
	// connection 제공해주면 된다.
	public static Connection getConnection() throws SQLException {
		return ds.getConnection();
	}

}
