package Calculator_1410;

import java.lang.Math;
public class Calculate {
	
	/*field*/
	
	double fnum;
	double secNum;
	double result;
	String ans;
	String operation;
	double ops;
	/*Constructor*/
	public Calculate(){
		
		
	}
	
	//methods for operator for +-/*%
	
	
	public void add() {
		
		if(operation == "+") {
			
			result = fnum + secNum;
			ans = String.format("%.2f",result);
			
		}		
	}
	
	public void sub() {
		
		if(operation == "-") {
			
			result = fnum - secNum;
			ans = String.format("%.2f",result);
			
		}
	}
		
	public void mul() {
			
			if(operation == "*") {
				
				result = fnum * secNum;
				ans = String.format("%.2f",result);
			}
			
	}
	
	public void div() {
		if(operation == "/") {
			
			result = fnum / secNum;
			ans = String.format("%.2f",result);
		}	
		
		
	}
	public void rem() {
		if(operation == "%") {
			
			result = fnum % secNum;
			ans = String.format("%.2f",result);
		}	
	}
	public void power() {
		if(operation == "^") {
			
			result = Math.pow(fnum, secNum);
			ans = String.format("%.2f",result);
		}
		
	}	
	public void squre() {
		if(operation == "\u221A") {
			
			 ops = Math.sqrt(ops);
			 ans = String.format("%.2f",ops);
			
			
		}
		
	}	
}//Closed class Calculate
