package com.arrays;

import java.util.ArrayList;
import java.util.List;
//Find Local Min and locamax 
class Result
{
	int buy;
	int sell;
}
public class BuySellMulitpleTran {

	
	public static void main(String[] args) {
		int items[]= {98,178,250,300,40,540,690};
	    List<Result> profiltList=findProfit(items,items.length);
	    for(Result res:profiltList)
	    {
	    System.out.println("Buy->"+res.buy+" Sell->"+res.sell);	
	    }
	}

	private static List<Result> findProfit(int[] items, int n) {
		
		List <Result> list=new ArrayList<Result>();
		
		for(int i=0;i<n;i++)
		{
			Result temp=new Result();

			while(i<n-1 && items[i+1]<=items[i])
			{
				i++;
			}
			if(i== n-1)
				break;
			temp.buy=i++;
			
			while(i<n-1 && items[i+1]>=items[i])
			{
				i++;
			}
			//if(i== n-1)
			temp.sell=i;
			
			list.add(temp);
			
			
			
		}
		
		
		
		
		
		return list;
	}
}
