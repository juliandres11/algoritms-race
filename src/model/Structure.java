package model;

import java.util.ArrayList;

public class Structure {
	
	public final static char ITERATIVE = 'I';
	public final static char RECURSIVE = 'R';

	public ArrayList<Numbers>numbers;
	public BinaryThree firstAbb;
	public LinkedList first;
	
	public Structure() {
		numbers = new ArrayList<Numbers>();
	}
	
	public long[] generateNumbers(int n) {
		long[] numeros = new long[n];
		long num = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			num = (long)(Math.random()*n+1);
			numeros[i] = num;
		}
		
		return numeros;
	}
	
	public void addArrayList(int n) {
		long[] numeros = generateNumbers(n);
		int i = 0;
		Numbers number = null;
		
		while (i < numeros.length) {
			number = new Numbers(numeros[i]);
			numbers.add(number);
		}
	}
	
	public boolean SearchArrayIterative(long n) {
		boolean found = false;
		
		for (int j = 0; j < numbers.size() && !found; j++) {
			if (n == numbers.get(j).getNumber()) {
				found = true;
			}
		}
		return found;
	}
	
	public Numbers removeArrayIterative(long n) {
		Numbers temp = null;
		
		for (int i = 0; i < numbers.size(); i++) {
			if (n == numbers.get(i).getNumber()) {
				temp = numbers.get(i);
				numbers.remove(i);
			}
		}
		return temp;
	}
	
	public void searchArrayList(int n, char mode) {
		addArrayList(n);
		long[] numeros = generateNumbers(n);
		
		if (mode == ITERATIVE ) {
			for (int i = 0; i < numeros.length; i++) {
				SearchArrayIterative(numeros[i]);
			}
		}else {
			//metodo recursivo
		}
	}
	
	public void removeArryList(int n, char mode) {
		addArrayList(n);
		long[] numeros = generateNumbers(n);
		
		if (mode == ITERATIVE) {
			for (int i = 0; i < numeros.length; i++) {
				removeArrayIterative(numeros[i]);
			}
		}else {
			//metodo recursivo
		}
	}
	
	public void addListIterative(long n ) {
		LinkedList lk = null;
		
		if (first == null) {
			lk = new LinkedList(n);
			first = lk;
		}else {
			LinkedList temp = first;
			while (temp.getNext() == null) {
				temp = temp.getNext();
			}
			lk = new LinkedList(n);
			temp.setNext(lk);
			lk.setPrev(temp);
		}
	}
	
	public void addLinkedList(int n, char mode) {
		long[] numeros = generateNumbers(n);
		
		if (mode == ITERATIVE) {
			for (int i = 0; i < numeros.length; i++) {
				addListIterative(numeros[i]);
			}
		}
	}
}
