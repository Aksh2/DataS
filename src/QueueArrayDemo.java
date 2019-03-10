
public class QueueArrayDemo {

	public static void main(String[] args) {
		QueueArray<Integer> q = new QueueArray<Integer>(5);
		q.queue(5);
		q.queue(5);
		q.queue(5);
		q.queue(5);
		q.queue(5);
		System.out.println("Dequeue:"+q.DeQueue());
		System.out.println("Dequeue:"+q.DeQueue());

	}
	
}
