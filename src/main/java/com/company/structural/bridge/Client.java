package com.company.structural.bridge;


import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Client {

	public static void main(String[] args) {
		FifoCollection<Integer> collection = new Queue<>(new SinglyLinkedList<>());
		collection.offer(10);
		collection.offer(40);
		collection.offer(99);

		System.out.println(collection.poll());
		System.out.println(collection.poll());
		System.out.println(collection.poll());

		System.out.println(collection.poll());

		// newSetFromMap is an example of Bridge design pattern
		Set<String> set = Collections.newSetFromMap(new ConcurrentHashMap<>());

		set.add("A");
		set.add("B");
		set.add("C");

		set.remove("B");
		System.out.println(set);
		System.out.println(set.contains("A"));

	}

}
