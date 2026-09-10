class CPrint {
	public synchronized void print(String data) {
		System.out.println("Start Printing ");
		try {
			Thread.sleep(1000);
		}
		catch (Exception e) {
		}
		System.out.println(data);
		System.out.println("Printing Finished");
	}
}
class APrint extends Thread {
	CPrint p;
	String data;
	public APrint(CPrint p,String d) {
		this.p = p;
		data = d;
	}
	public void run() {
		p.print(data);
	}
}
class MPrint {
	public static void main(String args []) {
		APrint p1,p2,p3;
		CPrint p =new CPrint();
		p1 = new APrint(p,"Hello");
		p2 = new APrint(p,"World");
		p3 = new APrint(p,"Good");
		p1.start();
		p2.start();
		p3.start();
	}
}