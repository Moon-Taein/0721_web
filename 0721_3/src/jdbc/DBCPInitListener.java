package jdbc;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import jdbc.connection.ConnectionProvider;

public class DBCPInitListener implements ServletContextListener {
	private static HikariConfig config = new HikariConfig();
	public static HikariDataSource ds;
	public static ConnectionProvider cp;

	public static final String JDBC_URL = "jdbc:mysql://localhost:3306/board?characterEncoding=utf8";
	public static final String USER = "root";
	public static final String PASSWORD = "root";

	// 여기서 커넥션
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		config.setJdbcUrl(JDBC_URL);
		config.setUsername(USER);
		config.setPassword(PASSWORD);
		ds = new HikariDataSource(config);
		ConnectionProvider cp = ConnectionProvider.getInstance();
		cp.setDs(ds);
	}

}