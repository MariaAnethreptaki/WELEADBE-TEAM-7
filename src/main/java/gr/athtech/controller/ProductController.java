package gr.athtech.controller;

import gr.athtech.mapper.BaseMapper;
import gr.athtech.mapper.ProductMapper;
import gr.athtech.domain.Product;
import gr.athtech.service.BaseService;
import gr.athtech.service.ProductService;
import gr.athtech.transfer.resource.ProductResource;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
@RequiredArgsConstructor
public class ProductController extends BaseController<Product, ProductResource> {
	private final ProductService productService;
	private final ProductMapper productMapper;

	@Override
	protected BaseService<Product, Long> getBaseService() {
		return productService;
	}

	@Override
	protected BaseMapper<Product, ProductResource> getMapper() {
		return productMapper;
	}
}
