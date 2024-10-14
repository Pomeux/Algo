package com.algo.graph;

public class NodeWeight<T,M> extends Node<T> {
	
	private M weight;
	
	public NodeWeight(T val,Node<T> next,M weight) {
		super(val,next);
		this.weight=weight;
		
	}
	
	@Override
	public String toString() throws Exception {
		Node next=getNext();
		T val=getVal();
		if(next instanceof NodeWeight) 
			return "->"+val+weight+next; // bien verifie que next est de type 
		else 
			throw new Exception("Le GraphList ne peut pas être avec des NodeWeight et Node!");
	}

}
