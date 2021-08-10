package org.test.day.four;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayList 
{
	public static void main(String[] args) 
	{
		int arr[]=new int[6];
		
		arr[0]=15;
		arr[1]=12;
		arr[2]=45;
		arr[3]=87;
		arr[4]=65;
		arr[5]=90;
		
	
		
		List <Integer> li=new LinkedList<>();	
	
		for (int i = 0; i < arr.length; i++)
		{
			li.add(arr[i]);
		}

		
		li.add(45);

		
		Set<Integer> s=new LinkedHashSet<>();
		
		s.addAll(li);
	
		
		Map<Integer, Integer> mp=new HashMap<>();
		
		//Set<entry<Integer, Integer>> e=mp.entrySet();
		
		int n=0;
		for (Integer z : s) 
		{
			mp.put(n, z);
			n++;
					
		}
		System.out.println(mp);

	}
	
}
