/**
 * 
 */
package factory.implementacion;

import factory.interfaces.iConnection;

/**
 * @author Osvaldo
 *
 */
public class ConnectionOracle implements iConnection {
	
	private String host;
	private String port;
	private String user;
	private String pass;
	
	
	public ConnectionOracle() {
		this.host = "localhost";
		this.port = "1521";
		this.user = "admin";
		this.pass = "123";
	}
	
	@Override
	public void connect() {
		
		System.out.println("Oracle connection stabliched");
	}
	
	@Override
	public void disconnect() {
		
		System.out.println("Oracle connection finished");
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
