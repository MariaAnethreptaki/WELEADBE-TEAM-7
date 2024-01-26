package gr.athtech.transfer;

import lombok.Builder;

@Builder
public record ApiError(Integer status, String message, String path) {
}
