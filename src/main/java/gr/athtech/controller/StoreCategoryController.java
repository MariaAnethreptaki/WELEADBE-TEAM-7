package gr.athtech.controller;

import gr.athtech.domain.StoreCategory;
import gr.athtech.mapper.StoreCategoryMapper;
import gr.athtech.mapper.BaseMapper;
import gr.athtech.service.StoreCategoryService;
import gr.athtech.service.BaseService;
import gr.athtech.transfer.ApiResponse;
import gr.athtech.transfer.resource.StoreCategoryResource;
import gr.athtech.transfer.resource.StoreResource;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("storeCategories")
public class StoreCategoryController extends BaseController<StoreCategory, StoreCategoryResource>{
    private final StoreCategoryService storeCategoryService;
    private final StoreCategoryMapper storeCategoryMapper;

    @Override
    protected BaseService<StoreCategory, Long> getBaseService() {
        return storeCategoryService;
    }

    @Override
    protected BaseMapper<StoreCategory, StoreCategoryResource> getMapper() {
        return storeCategoryMapper;
    }
    @GetMapping(params = {"Id"})
    public ResponseEntity<ApiResponse<StoreCategoryResource>> findById(@RequestParam long Id) {
        return ResponseEntity.ok(ApiResponse.<StoreCategoryResource>builder()
                .data(storeCategoryMapper.toResource(storeCategoryService.findById(Id)))
                .build());
    }
}