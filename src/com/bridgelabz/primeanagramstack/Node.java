package com.bridgelabz.primeanagramstack;

public class Node {
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
		Stack.size++;
	}
}
