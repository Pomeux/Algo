package com.algo.matrice;

public class Matrice<T extends Number> {
	private T[][] matrice;
	
	private int ligne;
	private int colonne;
	
	//faire en sorte que matrice soit bien défini(car là on peut avoir [[5,1,3] [1,3]]
	
	public Matrice(T[][] matrice) {
		this.matrice=matrice;
		ligne=matrice.length;
		colonne=matrice[0].length;
	}
	public T get(int i,int j) {
		
		if(1<=i && i<=ligne && 1<=j &&j<=colonne) 		
			return matrice[i-1][j-1];
		throw new IllegalArgumentException("ligne ou colonne a pas la bonne dimension de la matrice"+ getClass().getSimpleName());
	}
	
	public String toString() {
		String s="";
		
		for(int i=0;i<ligne;i++) {
			for(int j=0;j<colonne;j++) {
				s+= ""+matrice[i][j]+" ";
			}
			s+="\n";
		}
		return s;
	}
}
