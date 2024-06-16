package F_Methods.DerivedClassAsParameter;

public class ProductInfo {
      public void printProductDetails(Product p) {
          System.out.println("The id of product is "+ p.productId);
          System.out.println("The name of product is "+ p.productName);
          System.out.println("The price of product is "+ p.productPrice);
      }
	public static void main(String[] args) {
	   ProductInfo pInfo = new ProductInfo();
	   Product p = new Product();
	   p.productId=415 ;
	   p.productName ="Apple 14 pro max";
	   p.productPrice= 120451 ;
	   pInfo.printProductDetails(p);

	}

}
