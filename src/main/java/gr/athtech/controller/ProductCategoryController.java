package gr.athtech.controller;

import gr.athtech.domain.ProductCategory;
import gr.athtech.mapper.BaseMapper;
import gr.athtech.mapper.ProductCategoryMapper;
import gr.athtech.service.BaseService;
import gr.athtech.service.ProductCategoryService;
import gr.athtech.transfer.ApiResponse;
import gr.athtech.transfer.resource.ProductCategoryResource;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("categories")
@RequiredArgsConstructor
public class ProductCategoryController extends BaseController<ProductCategory, ProductCategoryResource> {
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

	@PostMapping(params = "categoryId")
	public ResponseEntity<ApiResponse<ProductCategoryResource>> create(@RequestBody final ProductCategoryResource productResource,
																	   @RequestParam Long categoryId) {
		var product = categoryMapper.toDomain(productResource);
		return new ResponseEntity<>(
				ApiResponse.<ProductCategoryResource>builder()
						.data(getMapper().toResource(categoryService.create(product)))
						.build(),
				getNoCacheHeaders(),
				HttpStatus.CREATED
		);
	}

	@GetMapping(params = "id")
	public ResponseEntity<ApiResponse<ProductCategoryResource>> findById(@RequestParam long id) {
		final ProductCategoryResource productResource = getMapper().toResource(categoryService.findById(id));
		return ResponseEntity.ok(ApiResponse.<ProductCategoryResource>builder().data(productResource).build());
	}
}
