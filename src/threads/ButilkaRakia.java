package threads;

public class ButilkaRakia {
	
	Integer gramaj = 1000;
	static final String NAME = "Grozdova";
	
	
	void otpivam(int ejTolkovaGrama) {
		
		System.out.println("Pochvam da piq");
		synchronized (this) {
			if (gramaj >= ejTolkovaGrama) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				gramaj -= ejTolkovaGrama;
				System.out.println(gramaj);
			}
		}

		System.out.println("Sprqh da piq");

	}
	
	void chupq() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("schupih butilkata");
	}

}
