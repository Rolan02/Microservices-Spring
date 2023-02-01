package rolydev.store.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import rolydev.store.product.Category.Category;
import rolydev.store.product.Product.Product;
import rolydev.store.product.Product.ProductRepository;

import java.util.Date;
import java.util.List;

@DataJpaTest
public class ProductRepositoryMockTest {
        @Autowired
        private ProductRepository productRepository;
        @Test
        public void whenFindByCategory_thenReturnListProduct() {
            Product product1 = Product.builder()
                    .name("computer")
                    .category(Category.builder().id(1L).build())
                    .description("")
                    .stock(Double.parseDouble("10"))
                    .price(Double.parseDouble("1240.99"))
                    .status("Create")
                    .crateAt(new Date()).build();
            productRepository.save(product1);
            List<Product> found = productRepository.findByCategory(product1.getCategory());
            Assertions.assertThat(found.size()).isEqualTo(3);
        }
}
