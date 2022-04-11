package com.Example;


import java.io.*;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;
import com.ArrayList.*;


public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public boolean isNullOrEmpty(String str){
        if(str == null || str.isEmpty())
          return true;
        return false;
      }
    
    public Float compute(Float num1,Float num2,String op){
		
		if(op.equals("+")){return num1+num2;}
		else if (op.equals("-")){return num1-num2;}
		else if (op.equals("*")){return num1*num2;}
		else {return num1/num2;}
    }
    
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str1=request.getParameter("num1");
		String str2=request.getParameter("num2");
		String output="";
		ArrayList<String> operations=new MyArrayList();
		
		if(!isNullOrEmpty(str1) && !isNullOrEmpty(str2)){
			try{
				float num1=Float.parseFloat(str1);
				float num2=Float.parseFloat(str2);
				float result=compute(num1,num2,request.getParameter("op"));
				HttpSession session = request.getSession();
				session.setMaxInactiveInterval(1*60);
				if(!session.isNew()){

					operations=(ArrayList<String>) session.getAttribute("operations");
				}
				
				operations.add(num1+" "+request.getParameter("op")+" "+num2+" = "+result);
				session.setAttribute("operations",operations);

				output="The total result is "+result;
				
			}
			catch(NumberFormatException exption){
				output="you should enter a number";
			}
			
		}
		else{
		output="you shouid enter a non empty value";	
		}
		
		response.getWriter().println(
				    "<html>" +
				    "<body>" +
				    "<h3>" +output+ "</h3>" +
				    operations.toString()+
				    "</body>" + 
				    "</html>");
	}
}
