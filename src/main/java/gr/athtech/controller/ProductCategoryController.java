package gr.athtech.controller;

import gr.athtech.domain.Product;
import gr.athtech.domain.ProductCategory;
import gr.athtech.mapper.BaseMapper;
import gr.athtech.mapper.ProductCategoryMapper;
import gr.athtech.mapper.ProductCategoryMapper;
import gr.athtech.domain.ProductCategory;
import gr.athtech.service.BaseService;
import gr.athtech.service.ProductCategoryService;
import gr.athtech.service.ProductCategoryService;
import gr.athtech.transfer.resource.ProductCategoryResource;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("categories")
@RequiredArgsConstructor
public class CategoryController extends BaseController<ProductCategory, ProductCategoryResource> {
	private final ProductCategoryService categoryService;
	private final ProductCategoryMapper categoryMapper;

	@Override
	protected BaseService<ProductCategory, Long> getBaseService() {
		return categoryService;
	}

	@Override
	protected BaseMapper<ProductCategory, ProductCategoryResource> getMapper() {
		return categoryMapper;
	}

}
