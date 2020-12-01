package se.web.store.serviceimpl;

import se.web.store.dao.ProductDAO;
import se.web.store.entity.Product;
import se.web.store.service.MyConversionService;
import se.web.store.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    private ProductDAO productDAO;
    private MyConversionService service;

    public ProductServiceImpl(ProductDAO productDAO, MyConversionService service) {
        this.productDAO = productDAO;
        this.service = service;
    }

    @Override
    public List<Product> findAll() {
        return productDAO.findAll();
    }

    @Override
    public Product findById(Integer id) {
        return service.getProductObject(id);
    }


}
