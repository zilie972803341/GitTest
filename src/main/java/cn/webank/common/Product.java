package cn.webank.common;

public enum Product {

	DS(200002),ML(200003),YX(200004);
	
	private int proCode;
	
	private Product() {}
	
	private Product(int proCode) {
		this.proCode = proCode;
	}
	
	public int getProCode() {
		return proCode;
	}
}
