package com.javatechi.cicd;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

import org.springframework.web.bind.annotation.GetMapping;

public class Program {

	static List<String> list = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		HashMap<String, String> check=new HashMap<>();
		check.put("ok", null);
		check.put("ok", "2");
		check.put("Mahima", "2");
		HashMap<String, String> check2=new HashMap<>(2);
		check2.put("ok", "ok");
		check2.put("Mahima", "2");
		check2.put("ok", "okk");
		check2.put("spa", "okk");
		check2.put("yuu", "okk");
		System.out.println();
		
		LinkedHashMap<Object, Object> linked=new LinkedHashMap<>();
		System.out.println(linked.put("1", "3"));
		
		LinkedList<Integer >l=new LinkedList<>();
		System.out.println(l.add(12));
		
		
		ArrayList<Integer> integerL=new ArrayList<>(1);
		integerL.add(10);
		integerL.add(10);
		integerL.add(20);
		
		System.out.println(integerL.size());

		List<String> s = new ArrayList<>();
		s.add("ok");

		HashMap<String, String> h = new HashMap<>(5);
		System.out.println(h.put("HashMapKey", "HashMapValue1"));
		System.out.println(h.put("HashMapKey", "HashMapValue2"));
		HashMap<String, String> internalWorking = new HashMap<>(5);
		internalWorking.put("First","F");
		internalWorking.put("Second", "S");
		System.err.println();
		System.out.println("HashCodeValue===="+"First".hashCode());
		System.out.println("Load Factor New Thresold===="+(int).75*16);
		System.out.println("Indexing===="+((16 - 1) & 1073741824));
		System.out.println();
		
		System.err.println();
		System.out.println("HashCodeValue===="+"Second".hashCode());
		System.out.println("Load Factor===="+(int).75*16);
		System.out.println("Indexing===="+((16 - 1) & 1822412652));
		System.out.println();
		
		ConcurrentHashMap<String, String> concurrentHashMap=new ConcurrentHashMap<>();
		System.out.println(concurrentHashMap.put("ConcurrentHashMapKey", "ConcurrentHashMapValue"));
		
		TreeMap<String, String> treeMap=new TreeMap<>();
		System.err.println(treeMap.put("TreeMapKey", "se"));
		
		LinkedHashMap<String, String> linkedHash=new LinkedHashMap<>();
		System.out.println(linkedHash.put("LinkedHashMapKey", "LinkedHashMapValue"));
		
		WeakHashMap<String, String> sss=new WeakHashMap<>();
		sss.clear();
		
		IdentityHashMap<String, String> ss=new IdentityHashMap<>();
		ss.clear();
		System.out.println( 1<< 30);
		System.out.println(1 << 4);
		System.out.println(5 >> 1);
//		Set<String> st=new HashSet<>();
//		System.out.println("Completed");
//		String ok="OK";
//		while(true) {
//			ok=ok+"ok";
//			st.add(ok);
//			System.out.println("Completed");
//		}
		
		
//		BlockingDeque<String> queue=new LinkedBlockingQueue)<>();
//		queue.add("Mahima");
//		queue.add("Kamal");
//		queue.add("Vaibhav");
//		queue.add("Pranaw");
//		for (String string : queue) {
//			queue.add("OK");
//			System.out.println(string);
//		}
	}

}
