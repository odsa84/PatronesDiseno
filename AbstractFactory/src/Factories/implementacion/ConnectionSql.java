/**
 * 
 */
package Factories.implementacion;

import Factories.interfaces.iConnectionDB;

/**
 * @author Osvaldo
 *
 */
public class ConnectionSql implements iConnectionDB {
	
	private String host;
	private String port;
	private String user;
	private String pass;
	
	
	public ConnectionSql() {
		this.host = "localhost";
		this.port = "1433";
		this.user = "admin";
		this.pass = "123";
	}
	
	@Override
	public void connect() {
		
		System.out.println("Sql connection stabliched");
	}
	
	@Override
	public void disconnect() {
		
		System.out.println("Sql connection finished");
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
