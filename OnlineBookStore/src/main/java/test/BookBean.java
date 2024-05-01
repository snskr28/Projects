package test;
import java.io.Serializable;
public class BookBean implements Serializable{
	//Creating Variables for data Storage
	private String bCode,bName,bAuthor;
	private float bPrice;
	private int bQty;
	public BookBean() {}
	//Creating Setters and getters
	public String getbCode() {
		return bCode;
	}
	public void setbCode(String bCode) {
		this.bCode = bCode;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbAuthor() {
		return bAuthor;
	}
	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}
	public float getbPrice() {
		return bPrice;
	}
	public void setbPrice(float bPrice) {
		this.bPrice = bPrice;
	}
	public int getbQty() {
		return bQty;
	}
	public void setbQty(int bQty) {
		this.bQty = bQty;
	};
	
}
