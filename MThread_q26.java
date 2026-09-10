class CThread extends Thread{

	int n;
	public CThread(int n){
		this.n=n;
	}

	public void run() {
    for (int i = 1; i <= n; i++) {
        System.out.print("i=" + i + " ");
    }
}

}


class MThread_q26{

	public static void main(String args[]){

		CThread t1,t2;
		t1=new CThread(50);
		t2=new CThread(100);

		System.out.println("Before Threading: ");
		t1.start();
		System.out.println("After Threading: ");
		t2.start();
		System.out.println("Finished");
	}
}
