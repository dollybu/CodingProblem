package com.heap.lru;

import java.util.HashMap;


class Entry
{
	int value;
	int key;
	Entry right;
	Entry left;
	/*public Entry(int value,int key)
	{
		
		this.value=value;
		this.key=key;

		this.right=null;
		this.left=null;
		
				
	}*/
	
}

public class LRUImpl {
	
	HashMap<Integer, Entry> hashmap;
	Entry start, end;
	int LRU_size=4;
	public LRUImpl()
	{hashmap= new HashMap<Integer,Entry>();}
	
	
	
	public int getEntry(int key)
	{		
		if(hashmap.containsKey(key)) {
		Entry entry =hashmap.get(key);
		removeNode(entry);
		addAtTop(entry);
		return entry.value;
	}
		return-1;
	}
	
	
	public void putEntry(int key , int value)
	{
		//System.out.println("key>>"+key+" value>>"+value);
		if(hashmap.containsKey(key))
		{
			Entry entry=hashmap.get(key);
			entry.value=value;
			removeNode(entry);
			addAtTop(entry);
		}
		else
		{
			Entry newNode=new Entry();
			 newNode.key=key;
			 newNode.value=value;
			 newNode.left=null;
			 newNode.right=null;
		
		
		if(hashmap.size()>LRU_size)
		{
			hashmap.remove(end.key);
			addAtTop(newNode);
		}
		else
		{
			addAtTop(newNode);

		}
		
		}
	}
	
	

	private void addAtTop(Entry entry) {
		System.out.println(entry.key+" value inside add>>"+entry.value);
		entry.right=start;
		entry.left=null;
		if(start!=null)
		{
			start.left=entry;
			start =entry;
		}
		if(end ==null)
		{
			end=start;
		}
		//System.out.println(start.left+" ,"+start.right);
		//System.out.println(end.left+" ,"+end.right);


	}



	private void removeNode(Entry entry) {

		if(entry.left!=null)
		{
			entry.left.right=entry.right;
		}
		else
		{
			start=entry.right;
		}
		
		if(entry.right!=null)
		{
			entry.right.left=entry.left;
			
		}
		else
		{
			end=entry.left;
		}
	}



	public static void main(String[] args) {
		LRUImpl lru= new LRUImpl();
		lru.putEntry(100, 100);
		lru.putEntry(102, 102);
		lru.putEntry(100, 103);
		lru.putEntry(103, 103);
		System.out.println(lru.getEntry(100));
		System.out.println(lru.getEntry(102));

		lru.putEntry(102,104 );
		System.out.println(lru.getEntry(102));
		
	}
	
	
	
}
