package ehcacheDemo;

import java.io.File;

import org.ehcache.Cache;
import org.ehcache.CacheManager;
import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.CacheManagerBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;
import org.ehcache.config.units.MemoryUnit;

public class App {

	public static void main(String[] args) throws InterruptedException {
	
	
		CacheManager cacheManager = CacheManagerBuilder.newCacheManagerBuilder().with(CacheManagerBuilder.persistence(new File("D:\\Task\\cache-data"))).withCache("my", CacheConfigurationBuilder.newCacheConfigurationBuilder(String.class,String.class,ResourcePoolsBuilder.heap(10).offheap(20, MemoryUnit.MB).disk(50, MemoryUnit.MB,true))).build(true);
	
		Cache<String,String> cache=cacheManager.getCache("my", String.class, String.class);
		if(cache.get("name")==null)
		{
			cache.put("name", "karthi");
		}
		System.out.println(cache.get("name"));
		cacheManager.close();
		
	}	
}
