package com.algo.graph;

import java.util.ArrayList;

public class GraphList<T> {
	
	private int n;
	private ArrayList<Node<T>> tab;
	
	private boolean oriente;
	
	public GraphList(ArrayList<Node<T>> tab,int n,boolean oriente) {
		this.tab=tab;
		this.n=n;
		this.oriente=oriente;
	}
	public boolean getOriente() {
		return oriente;
	}
	public int getN() {
		return n;
	}
	
	@Override
	public String toString() {
		return "";
	}
	
}
