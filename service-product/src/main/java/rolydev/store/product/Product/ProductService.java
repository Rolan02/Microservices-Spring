package rolydev.store.product.Product;

import rolydev.store.product.Category.Category;
import java.util.List;
public interface ProductService {
    public List<Product> listAll();
    public Product getProduct(Long id);
    public Product updateProduct(Product product);
    public Product createProduct(Product product);
    public Product deleteProduct(Long id);
    public List<Product> findByCategory(Category category);
    public Product updateStock(Long id, Double quantity);
}
