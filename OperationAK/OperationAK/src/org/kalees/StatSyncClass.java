package org.kalees;

public class StatSyncClass {
	int amount = 10000;

	synchronized void withdraw(int amount) throws InterruptedException {
		System.out.println("going to withdraw...");

		if (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit...");
			wait();
		}
		this.amount -= amount;
		System.out.println("withdraw completed...");
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount += amount;
		System.out.println("deposit completed... ");
		notify();
	}
}

class Test {
	public static void main(String args[]) {
		final StatSyncClass c = new StatSyncClass();
		new Thread(){
			public void run() {
				try {
					c.withdraw(166000);
				} catch (InterruptedException e) {
					
				}
			}
		}.start();
		new Thread(){
			public void run() {
				c.deposit(1000);
			}
		}.start();

	}
}
