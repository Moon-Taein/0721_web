package jdbc;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import jdbc.connection.ConnectionProvider;

public class DBCPInitListener implements ServletContextListener {
	private static HikariConfig config = new HikariConfig();
	public static HikariDataSource ds;

	public static final String JDBC_URL = "jdbc:mysql://localhost:3306";
	public static final String USER = "root";
	public static final String PASSWORD = "root";

	// 여기서 커넥션
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println(JDBC_URL);
		System.out.println(USER);
		System.out.println(PASSWORD);
		config.setJdbcUrl(JDBC_URL);
		config.setUsername(USER);
		config.setPassword(PASSWORD);
		// 요놈이 문제인디
		ds = new HikariDataSource(config);

		ds.getJdbcUrl();
		ds.getUsername();
		ds.getPassword();

		// ds.setJdbcUrl(JDBC_URL);

		// 인스턴스의 ds를 세팅해주는데 왜?
		ConnectionProvider cp = ConnectionProvider.getInstance();
		cp.setDs(ds);
		System.out.println(cp.toString());
	}

}