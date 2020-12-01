package se.web.store.service;

import org.springframework.stereotype.Service;
import se.web.store.dao.ProductDAO;
import se.web.store.entity.Product;

import java.util.Optional;

@Service
public class MyConversionService {

    private ProductDAO productDAO;

    public MyConversionService(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    /** Converter Optional to Object **/

    public Product getProductObject(Integer id) {
        Product product = null;

        Optional<Product> productList = productDAO.findById(id);
        if ( productList.isPresent() ) {
            product = productList.get();
        }
        return product;
    }


}
