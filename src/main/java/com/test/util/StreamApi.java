package com.test.util;

import java.util.List;

public class StreamApi {

	public long  evenCount(List<Integer> intList){

		
		long count=intList.stream().filter(x->x%2==0).count();
		return count;
	}
	
	public long  mapOddCount(List<Integer> intList){

		long count=intList.stream().map(x->x*x).filter(n->n%2!=0).count();
		return count;
	}

	public boolean  funcProg1(List<String> s){
		int forEachCount=0;
		int streamCount=0;
		boolean flag=false;
		
	
		
		for (String string : s) {
			if(string.startsWith("S"))
				forEachCount++;
		}

		streamCount=(int)s.stream().filter(n->n.startsWith("S")).count();
		if(streamCount==forEachCount){
			flag=true;
		}else{
			flag=false;
		}
		
		
		return flag;
	}

	
	
	
}
