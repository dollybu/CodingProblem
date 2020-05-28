package com.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Graph {

	int data;
	Map<Integer, LinkedList<Integer>> map;
	
	Graph(int vertex)
	{
		map=new HashMap<Integer,LinkedList<Integer>>();
		for(int i=0;i<vertex;i++)
		{
			map.put(i,new LinkedList<Integer>());
	
		}
	}
	
	void addEdge(int i,int j)
	{
	 this.map.get(i).add(j);	
	}
	
	public static void main(String[] args) {
		Graph graph=new Graph(6);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 0);
		graph.addEdge(1, 3);
		graph.addEdge(2, 0);
		graph.addEdge(3, 1);
		graph.addEdge(3, 5);
		graph.addEdge(4, 1);
		graph.addEdge(4, 5);
	    graph.addEdge(5, 3);
	    graph.addEdge(5, 4);
	   Boolean visited[]= {false,false,false,false,false};
	    
	    boolean result =graph.isCycle(0,visited,-1);
	    System.out.println(result);

	}
	
	private boolean isCycle(int index,Boolean visited[], int parent) {
		visited[index]=true;
		int size1 =this.map.get(index).size();
		System.out.println("Size>>"+size1);
		for(int i=0;i<size1;i++)
		{
			int val=this.map.get(index).get(i);
			System.out.println("Value>>>"+val);
			if(visited[val] == true)
			{
				System.out.println("visited[val]>>>>"+visited[val]);
				if(isCycle(i, visited, index))
	            return true;
					
				
			}
			else if(i!=parent)
				return true;
			
		}
		
		
		return false;
	}
	
	
}

