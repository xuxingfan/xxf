import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue; 
 


public class Bqueue{ 
private static BlockingQueue<Object> queue = new LinkedBlockingQueue();
public static void produce(Object obj) throws InterruptedException{ 
	queue.put(obj); 
}
public static Object consume() throws InterruptedException{ 

    return queue.take();

}
}