public class run implements Runnable{
	  public static void main(final String[] args) {
	        new Thread(new run()).start();
	    }

	@Override
	public void run() {
		// TODO Auto-generated method stub  
		test t=new test();
		//while(true){
		try {
			t.getBqueue().produce("-");
			t.getBqueue().consume();
			t.getBqueue().produce("-");
			System.out.println("+++++++++++++++++");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		//}
		
	}

}
