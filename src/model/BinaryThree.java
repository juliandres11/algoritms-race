package model;

public class BinaryThree {

	private long number;
	
	private BinaryThree right;
	private BinaryThree left;
	
	public BinaryThree(long n) {
		number = n;
		right = null;
		left = null;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public BinaryThree getRight() {
		return right;
	}

	public void setRight(BinaryThree right) {
		this.right = right;
	}

	public BinaryThree getLeft() {
		return left;
	}

	public void setLeft(BinaryThree left) {
		this.left = left;
	}
	
	
}