package com.sunbeam;

public class ExpressionEvaluationMain {
	
	public static int calculate(int op1, int op2, char opr) {
		switch(opr) {
		case '+': return op1 + op2;
		case '-': return op1 - op2;
		case '*': return op1 * op2;
		case '/': return op1 / op2;
		case '%': return op1 % op2;
		case '$': return (int)Math.pow(op1, op2);
		}
		return 0;
	}
	
	public static int postfixEvaluate(String postfix) {
		//1. create stack to  push operands
		Stack st = new Stack(10);
		//2. traverse postfix expression from left to right
		for(int i = 0 ; i < postfix.length() ; i++) {
			//3. extract element from ith index
			char ele = postfix.charAt(i);
			//4. check if operand
			if(Character.isDigit(ele))
				st.push(ele - '0');// push it on stack
			//5. if operator
			else {
				//6. pop two elements from stack 
				int op2 = st.pop();	//6.1 first popped will become second operand
				int op1 = st.pop();	//6.2 second popped will become first operand
				//7. perfrom operation of op1, op2 and ele
				int res = calculate(op1, op2, ele);
				//8. push result on stack
				st.push(res);
			}
		}
		//9. pop result from stack and return it
		if(!st.isEmpty())
			return st.pop();
		return 0;
	}

	public static int prefixEvaluate(String prefix) {
		//1. create stack to  push operands
		Stack st = new Stack(10);
		//2. traverse prefix expression from right to left
		for(int i = prefix.length()-1  ; i >= 0 ; i--) {
			//3. extract element from ith index
			char ele = prefix.charAt(i);
			//4. check if operand
			if(Character.isDigit(ele))
				st.push(ele - '0');// push it on stack
			//5. if operator
			else {
				//6. pop two elements from stack 
				int op1 = st.pop();	//6.1 first popped will become first operand
				int op2 = st.pop();	//6.2 second popped will become second operand
				//7. perform operation of op1, op2 and ele
				int res = calculate(op1, op2, ele);
				//8. push result on stack
				st.push(res);
			}
		}
		//9. pop result from stack and return it
		if(!st.isEmpty())
			return st.pop();
		return 0;
	}
	
	public static void main(String[] args) {
		String postfix = "456*3/+9+7-";
		
		System.out.println("Post : " + postfix);
		int result = postfixEvaluate(postfix);
		System.out.println("Result : " + result);
		
		String prefix = "-++4/*56397";
		
		System.out.println("Pre : " + prefix);
		result = prefixEvaluate(prefix);
		System.out.println("Result : " + result);
	}

}









