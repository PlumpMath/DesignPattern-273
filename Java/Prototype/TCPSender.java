package Prototype;

public class TCPSender { // client
	private TCPPacket defaultPacket;
	
	public void setDefaultPacket(TCPPacket packet) {
		defaultPacket = packet;
	}

	public TCPPacket createTCPPacket() throws CloneNotSupportedException {
		return (TCPPacket) defaultPacket.clone();
	}
}