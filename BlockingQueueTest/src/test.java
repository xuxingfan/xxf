import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors; 
public class test {
	private static Bqueue bqueue;
	public static void main(String []args){
		//ExecutorService service = Executors.newCachedThreadPool(); 
		run r=new run();
		//service.submit(r); 
		//service.execute(r);
		 new Thread(r).start();
   //for(int i=0;i<10;i++){
		try {
			Thread.sleep(5000); 
			bqueue.produce("--");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   // }
	}
	public Bqueue getBqueue() {
		return bqueue;
	}
	public void setBqueue(Bqueue bqueue) {
		this.bqueue = bqueue;
	}

}
