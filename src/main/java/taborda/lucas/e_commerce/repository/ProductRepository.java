package taborda.lucas.e_commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import taborda.lucas.e_commerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
