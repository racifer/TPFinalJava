package Base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;

public abstract class BaseDal<T> {
	private String database;
	private String port;
	private String type; 
	private String dir;
	private String user;
	private String password;
	private String driver;
	public BaseDal(String database,String type ,String port, String dir,String user,String password,String Driver) {
		this.database=database;
		this.port=port;
		this.dir=dir;
		this.user=user;
		this.password=password;
		this.driver=Driver;
		this.type=type;
	}
	protected Connection getConnection() throws SQLException, ClassNotFoundException {
		String conString="jdbc:"+type+"://"+dir+":"+port+"/"+database;
		if(this.driver!=null && !this.driver.isEmpty()) {
			Class.forName(this.driver);
		}
		Connection conn=DriverManager.getConnection(conString,this.user,this.password);
		return conn;
	}
	public abstract HashMap<Integer,T> getAll();
	
	public abstract int delete(T aEliminar);
	public abstract T getOne(T params);
	public abstract int modify(T params);
	public abstract int insert(T params);

}
