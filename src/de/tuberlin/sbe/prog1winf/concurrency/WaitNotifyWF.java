package de.tuberlin.sbe.prog1winf.concurrency;

/**
 * Same as WaitNotify, but without any failed tries
 */
public class WaitNotifyWF {

	volatile int value = 0;
	volatile boolean produced = false;
	Long failedTries = 0L;

	synchronized void produce() {
		value++;
		produced = true;
	}

	synchronized void consume() {
		produced = false;
	}

	void failedTry() {
		synchronized (failedTries) {
			failedTries++;
		}
	}

	long getFailedTries() {
		synchronized (failedTries) {
			return failedTries;
		}
	}

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		WaitNotifyWF wn = new WaitNotifyWF();
		ProducerWaitNotifyWF p = new ProducerWaitNotifyWF(wn);
		ConsumerWaitNotifyWF c = new ConsumerWaitNotifyWF(wn);
		p.start();
		c.start();
		Thread.sleep(5000);
		p.interrupt();
		c.interrupt();
		
		p.join();
		c.join();
		System.out.println("failed tries: " + wn.getFailedTries());
	}

}

class ProducerWaitNotifyWF extends Thread {

	private WaitNotifyWF wn;

	/**
	 * @param wn
	 */
	public ProducerWaitNotifyWF(WaitNotifyWF wn) {
		this.wn = wn;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		while (!isInterrupted()) {
			synchronized (wn) {
				while (wn.produced) {
					// System.out.println("Cannot produce :( ...");
					wn.failedTry();
					try {
						wn.wait(10);
					} catch (InterruptedException e) {
						this.interrupt();
					}
				}
				System.out.println("Produced " + (wn.value + 1));
				wn.produce();
				wn.notify();
				try {
					wn.wait(10);
				} catch (InterruptedException e) {
					this.interrupt();
				}
			}

		}
		synchronized (wn) {
			wn.notifyAll();
		}
		System.out.println("Producer is terminated.");
		
	}

}

class ConsumerWaitNotifyWF extends Thread {

	private WaitNotifyWF wn;

	/**
	 * @param wn
	 */
	public ConsumerWaitNotifyWF(WaitNotifyWF wn) {
		this.wn = wn;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		while (!isInterrupted()) {
			synchronized (wn) {
				while (!wn.produced) {
					// System.out.println("Cannot consume :( ...");
					wn.failedTry();
					try {
						wn.wait(10);
					} catch (InterruptedException e) {
						this.interrupt();
					}
				}
				System.out.println("Consumed " + wn.value);
				wn.consume();
				wn.notify();
				try {
					wn.wait(10);
				} catch (InterruptedException e) {
					this.interrupt();
				}
			}

		}
		synchronized (wn) {
			wn.notifyAll();
		}
		System.out.println("Consumer is terminated.");
	}
}
