package com.chat;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import com.msg.Msg;

public class Client {

	int port;
	String address;
	String id;
	Socket socket;
	Sender sender;

	public Client() {
	}

	public Client(String address, int port, String id) {
		this.address = address;
		this.port = port;
		this.id = id;
	}

	public void connect() throws IOException {
		try {
			socket = new Socket(address, port);
		} catch (Exception e) {
			while (true) {
				try {
					Thread.sleep(1000);
					socket = new Socket(address, port);
					break;
				} catch (Exception e1) {
					System.out.println("Retry ..");
				}
			}
		}

		System.out.println("Connected Server: " + address);
		sender = new Sender(socket);
//		new Receiver(socket).start(); // server���� ������ ����
	}
	
	public void sendTarget(String ip, String cmd) {
		ArrayList<String> ips = new ArrayList<String>();
		ips.add(ip);
		Msg msg = new Msg(ips, id, cmd);
		sender.setMsg(msg);
		new Thread(sender).start();
	}

	public void sendMsg() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Input Msg");
			String ms = sc.nextLine();

			// 1�� ������ ���������� ����� ����Ʈ�� ������.
			Msg msg = null;
			if (ms.equals("1")) {
				msg = new Msg(id, ms);
			} else if(ms.equals("whis")) { // whisper ���
				System.out.println("Input ip");
				String ipms = sc.nextLine();
				ArrayList<String> ips = new ArrayList<>();
				ips.add(ipms);
				if(ipms.equals("q")) {
					continue;
				}
				while(true) {
				System.out.println("Input msg2");
				String ms2 = sc.nextLine();
				msg = new Msg(ips, id, ms2);
				sender.setMsg(msg);
				new Thread(sender).start();
				if(ms2.equals("q")) {
					break;
				}
//				msg = new Msg(ips, id, ms2);
				} 							// �������
			}else {
				ArrayList<String> ips = new ArrayList<>();
				ips.add("/192.168.0.9");
				ips.add("/192.168.0.60");
				ips.add("/192.168.0.72");
				ips.add("/192.168.0.61");
				ips.add("/192.168.0.28");
//				msg = new Msg(ips, id, ms); // Ư�� �����"��"���� �޽��� ������
				msg = new Msg(null, id, ms); // ��ο��� ������(BroadCast)
			}
			sender.setMsg(msg);
			new Thread(sender).start();
			if (ms.equals("q")) {
				break;
			}
		}
		sc.close();
		if (socket != null) {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Bye ...");
	}

	class Sender implements Runnable { // Thread ���� implements Runnable�� !
		Socket socket;
		ObjectOutputStream oo;
		Msg msg;

		public Sender(Socket socket) throws IOException {
			this.socket = socket;
			oo = new ObjectOutputStream(socket.getOutputStream());
		}

		public void setMsg(Msg msg) {
			this.msg = msg;
		}

		@Override
		public void run() {
			if (oo != null) {
				try {
					oo.writeObject(msg); // �̋� exception�� ���� server�� �׾����� ���ɼ��� ŭ
				} catch (IOException e) {
//					e.printStackTrace();
					try {
						if (socket != null) {
							socket.close();
						}
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					try {
						Thread.sleep(2000);
						connect();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
			}
		}

	}

	class Receiver extends Thread {
		ObjectInputStream oi;
//		Scanner sc = new Scanner(System.in);

		public Receiver(Socket socket) throws IOException {
			oi = new ObjectInputStream(socket.getInputStream());
		}

		@Override
		public void run() {
			while (oi != null) {
				Msg msg = null;
				try {
					msg = (Msg) oi.readObject();
					if (msg.getMaps() != null) {
						HashMap<String, Msg> hm = msg.getMaps();
						Set<String> keys = hm.keySet();
//						System.out.println(hm.keySet());
						for (String k : keys) {
							System.out.println(k);
						} 
//						System.out.println("�ӼӸ� ����� ip�� �Է��ϼ���.");
//						System.out.println(msg.getIps().toString());
//						String ipms = sc.nextLine();
//						if(ipms.equals(msg.getIps().toString())) {
//							ArrayList<String> ips = new ArrayList<>();
//							ips.add(ipms);
//						}else {
//							System.out.println("��ҵǾ����ϴ�.");
//						}
						continue; // �ؿ� �ִ� System.out.println�� �������� �ʰ� �������� ���� continue;
					}
					System.out.println(msg.getId() + ": " + msg.getMsg());
				} catch (Exception e) {
					e.printStackTrace();
					break;
				} 
			}
//			sc.close();
			try {
				if (oi != null) {
					oi.close();
				}
				if (socket != null) {
					socket.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		Client client = new Client("192.168.0.19", 5555, "[Ki]: ");
		try {
			client.connect();
			client.sendMsg();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
