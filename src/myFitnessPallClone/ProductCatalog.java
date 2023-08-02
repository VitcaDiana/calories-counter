package myFitnessPallClone;

public class ProductCatalog {
    Product[] products ;
    final int maxNumberOfProducts = 100;
    int numberOfProducts;

    public ProductCatalog() {
        this.products = new Product[maxNumberOfProducts];
        this.numberOfProducts = 0;
    }
    public void printProduct(){

    }

    public boolean addProduct(Product product){

        return true;
    }
    public Product getProductByName(String name){

        return null;
    }
    public boolean deleteProduct(String name){

        return true;
    }
}
