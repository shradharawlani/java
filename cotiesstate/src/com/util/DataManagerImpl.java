package com.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import com.exception.CityNotFoundException;
import com.exception.InvalidStateException;


// Override and implement the methods of Interface DataManager here 
public class DataManagerImpl implements DataManager {

	@Override
	public Map<String, List<String>> populateCityDataMap(String fileName)
			throws FileNotFoundException {
		Map<String,List<String>> sc=new HashMap<String, List<String>>();
		
		try(BufferedReader br=new BufferedReader(new FileReader(fileName)))
		{
		String row;
		while((row=br.readLine())!=null){
			String arr[]=row.split("-");
			List<String> c=sc.getOrDefault(arr[0], new ArrayList<String>());
			c.add(arr[1]);
			sc.put(arr[0], c);
		}
//		List<String> city=new ArrayList<String>();
//		List<String> state=new ArrayList<String>();
//			while((row=br.readLine())!=null)
//			{
//				
//	
//				String[]	s=row.split("-");
//				
//				String states=s[0];
//				String cities=s[1];
//				
//				sc.put(states, city);
//			}
//			
//				while((row=br.readLine())!=null)
//				{
//					
//		
//					String[]	s=row.split("-");
//					
//					String states=s[0];
//					String cities=s[1];
//					
//			
//				
//					if(sc.getKey().equals(states))
//					city.add(cities);
//					
//				
//				
//				sc.put(states, city);
//				
//			
//				
//			}
//		
//		
//		
//				for(Map.Entry<String,List<String>> st:sc.entrySet())
//				{
//					System.out.println(st.getKey());
//					System.out.println(st.getValue());
//					
//				}
		
		
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return sc;
	}

	@Override
	public List<String> getCities(Map<String, List<String>> stateCityMap,
			String state) throws InvalidStateException {
		List<String> lc=new ArrayList<String>();
		for(String hs:stateCityMap.keySet()){
			if(hs.equals(state))
	 lc     =			stateCityMap.get(hs);
			return lc;
		}
		//System.out.println(stateCityMap.values());
		   
			  
			   
		  
		return null;
	}

	@Override
	public String getState(Map<String, List<String>> stateCityMap, String city)
			throws CityNotFoundException {
		// TODO Auto-generated method stub
		
		for(Map.Entry<String, List<String>> en:stateCityMap.entrySet()){
			if(en.getValue().contains(city))
				return en.getKey();
		}
		return null;
	}

}
