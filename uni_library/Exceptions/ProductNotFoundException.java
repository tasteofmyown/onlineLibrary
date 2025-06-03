package com.example.uni_library.Exceptions;

import com.example.uni_library.Product.Services.GetProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProductNotFoundException extends RuntimeException{
    private static final Logger logger = LoggerFactory.getLogger(GetProductService.class);
    public ProductNotFoundException() {
        super(ErrorMessages.PRODUCT_NOT_FOUND.getMessage());
        logger.error("Exeption" + getClass() + "thrown");
    }
}
