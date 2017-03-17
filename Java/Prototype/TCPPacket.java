package Prototype;

public class TCPPacket implements Cloneable, Prototype { // concrete prototype
	private String url;
	private int port;
	private boolean secured;
	private String data;
	
	public TCPPacket() {
		secured = false;
		port = 0;
	}
	
	public TCPPacket clone() {
		try {
			return (TCPPacket) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	public void setURL(String url) {
		this.url = url;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public void setSecured(boolean secured) {
		this.secured = secured;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void print() {
		System.out.println("TCPPacket. URL = " + url + "  Port = " + port
				+ "  Secured = " + (secured ? " Yes" : " No") + "  Data =[ "
				+ data + "]");
	}
}
