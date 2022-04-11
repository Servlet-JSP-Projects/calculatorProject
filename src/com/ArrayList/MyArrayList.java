package com.ArrayList;
import java.util.ArrayList;
	
public class MyArrayList extends ArrayList<String> {
	
	    private static final long serialVersionUID = 1L;

	    @Override
	    public String toString() {
	        String result = "\n";
	        for (int i = 0; i < this.size(); i++) {
	            result += i+1 + ".  " + this.get(i)+ "\n";
	        }
	        return result;
	    }
	}
