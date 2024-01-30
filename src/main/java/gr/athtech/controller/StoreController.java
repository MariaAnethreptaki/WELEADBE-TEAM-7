package gr.athtech.controller;

import gr.athtech.domain.Store;

import gr.athtech.mapper.StoreMapper;
import gr.athtech.mapper.BaseMapper;
import gr.athtech.service.StoreService;
import gr.athtech.service.BaseService;
import gr.athtech.transfer.ApiResponse;
import gr.athtech.transfer.resource.AccountResource;
import gr.athtech.transfer.resource.OrderResource;
import gr.athtech.transfer.resource.StoreResource;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("stores")
public class StoreController extends BaseController<Store, StoreResource>{
    private final StoreService storeService;
    private final StoreMapper storeMapper;

    @Override
    protected BaseService<Store, Long> getBaseService() {
        return storeService;
    }

    @Override
    protected BaseMapper<Store, StoreResource> getMapper() {
        return storeMapper;
    }
    @GetMapping(params = {"Id"})
    public ResponseEntity<ApiResponse<StoreResource>> findById(@RequestParam long Id) {
        return ResponseEntity.ok(ApiResponse.<StoreResource>builder()
                .data(storeMapper.toResource(storeService.findById(Id)))
                .build());
    }
}
