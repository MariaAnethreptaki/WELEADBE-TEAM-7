package gr.athtech.controller;

import gr.athtech.domain.StoreCategory;
import gr.athtech.mapper.StoreCategoryMapper;
import gr.athtech.mapper.BaseMapper;
import gr.athtech.service.StoreCategoryService;
import gr.athtech.service.BaseService;
import gr.athtech.transfer.resource.StoreCategoryResource;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
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
}