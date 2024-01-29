package gr.athtech.transfer;



public record ApiError(Integer status, String message, String path) {
}
