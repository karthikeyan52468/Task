package ReentrantReadWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class WriteAndReadLock {


	int count=0;
	ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	public void read()
	{
		lock.readLock().lock();
		try {
			
			System.out.println(count);
		}
		finally {
			lock.readLock().unlock();
		}
		
	}
	
	public void write()
	{
		lock.writeLock().lock();
		try {
			++count;
			Thread.sleep(5000);
			System.out.println("writer unlock");
		}
		catch(Exception e)
		{
			
		}
		finally {
			lock.writeLock().unlock();
			
		}
	}
	
}
