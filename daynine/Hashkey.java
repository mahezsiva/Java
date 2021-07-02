package com.daynine;

import java.util.Collections;
import java.util.HashMap;

public class Hashkey {
	public static void main(String[] args)
    {
       
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        map.put(1, 90);
        map.put(2, 100);
        map.put(3, 220);
        map.put(4, 1000);
        int  minValue=(Collections.min(map.values()));
        int maxvalue=(Collections.max(map.values()));
        int maxkey=(Collections.max(map.keySet()));
        System.out.println("minimum value="+minValue);
        System.out.println("maximum value="+maxvalue);
        System.out.println("maximum keyvalue="+maxkey);
        
    }

}