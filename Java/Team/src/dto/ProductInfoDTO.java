package dto;

public class ProductInfoDTO {
	private String productName;
	private String productName_kana;
	private String imageFilePath;
	private String imageFileName;
	private String Price;
	private boolean productInfoFlg = false;

	public String getProductName(){
		return productName;
	}
	public void setProductName(String productName){
		this.productName=productName;
	}
	public String getProductName_kana(){
		return productName_kana;
	}
	public void setProductName_kana(String productName_kana){
		this.productName=productName_kana;
	}
	public String getImageFilePath(){
		return imageFilePath;
	}
	public void setImagePath(String imageFilePath){
		this.imageFilePath=imageFilePath;
	}
	public String getImageFileName(){
		return imageFileName;
	}
	public void setImageFileName(String imageFileName){
		this.imageFileName=imageFileName;
	}
	public String getPrice(){
		return Price;
	}
	public void setPrice(String Price){
		this.Price=Price;
	}
	public boolean getProductInfoFlg(){
		return productInfoFlg;
	}
	public void setProductInfoFlg(boolean productInfoFlg){
		this.productInfoFlg=productInfoFlg;
	}
}
