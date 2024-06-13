package com.sunbeam;

public class ExpressionConversionMain {
	
	public static int priority(char opr) {
		switch(opr) {
		case '$': return 10;
		case '/': return 9;
		case '*': return 9;
		case '%': return 9;
		case '+': return 8;
		case '-': return 8;
		}
		return 0;
	}
	
	public static String infixToPostfix(String infix) {
		//1. create stack to push operators
		Stack st = new Stack(10);
		//2. create postfix string to append elements
		StringBuilder postfix = new StringBuilder();
		//3. check infix expression from left to right
		for(int i = 0  ;i < infix.length() ; i++) {
			//4. extract ith element from string
			char ele = infix.charAt(i);
			//5. if element is digit/operand
			if(Character.isDigit(ele))
				postfix.append(ele);
			else if(ele == '(')
				st.push(ele);
			else if(ele == ')') {
				while(st.peek() != '(')
					postfix.append(st.pop());
				st.pop();		// to discrad '('
			}
			// if element is operator
			else {
				// check priority of topmost element and current element
				while(!st.isEmpty() && priority(st.peek()) >= priority(ele)){
					postfix.append(st.pop());
				}
				// push current element on stack
				st.push(ele);
			}
		}
		// pop all remaining elements from stack and append into postfix expr
		while(!st.isEmpty()) {
			postfix.append(st.pop());
		}
		// return postfix expr
		return postfix.toString();
	}
	
	public static String infixToPrefix(String infix) {
		//1. create stack to push operators
		Stack st = new Stack(10);
		//2. create postfix string to append elements
		StringBuilder postfix = new StringBuilder();
		//3. check infix expression from left to right
		for(int i = infix.length()-1  ; i >= 0 ; i--) {
			//4. extract ith element from string
			char ele = infix.charAt(i);
			//5. if element is digit/operand
			if(Character.isDigit(ele))
				postfix.append(ele);
			else if(ele == ')')
				st.push(ele);
			else if(ele == '(') {
				while(st.peek() != ')')
					postfix.append(st.pop());
				st.pop();		// to discrad '('
			}
			// if element is operator
			else {
				// check priority of topmost element and current element
				while(!st.isEmpty() && priority(st.peek()) > priority(ele)){
					postfix.append(st.pop());
				}
				// push current element on stack
				st.push(ele);
			}
		}
		// pop all remaining elements from stack and append into postfix expr
		while(!st.isEmpty()) {
			postfix.append(st.pop());
		}
		// reverse the prefix string
		postfix.reverse();
		// return postfix expr
		return postfix.toString();
	}

	public static void main(String[] args) {
		String infix = "1$9+3*4-(6+8/2)+7";
		
		System.out.println("Infix : " + infix);
		String postfix = infixToPostfix(infix);
		System.out.println("Postfix : " + postfix);
		
		String prefix = infixToPrefix(infix);
		System.out.println("Prefix : " + prefix);
		
		// String infix = "12 + 13 - 7"
		// String postfix = "12 13 + 7 -"	
		// - slip by ' '
		// - pasreInt
	}

}









