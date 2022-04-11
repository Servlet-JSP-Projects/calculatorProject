package com.Listner;


import javax.servlet.annotation.WebListener;
import javax.servlet.http.*;


/**
 * Application Lifecycle Listener implementation class AttrubuteListner
 *
 */

public class AttrubuteListner implements HttpSessionAttributeListener {

    /**
     * Default constructor. 
     */
    public AttrubuteListner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println(new java.util.Date()+" Attribute addedd, session "+arg0
    			.getName()+": "+arg0.getValue());
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println(new java.util.Date()+" Attribute replaced, session "+arg0
    			.getName()+": "+arg0.getValue());
    }
	
}
