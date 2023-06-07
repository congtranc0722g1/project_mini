package com.coffee_shop_management.dto;

import com.coffee_shop_management.model.Category;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ProductDto {
    private Integer id;
    @NotBlank(message = "Không được để trống")
    @Size(max = 200, message = "Tên không được quá 200 ký tự")
    private String name;
    @NotBlank(message = "Không được để trống")
    @Min(value = 1, message = "Giá tiền phải lớn hơn 0")
    private Double price;
    @NotBlank(message = "Không được để trống")
    private Integer quantity;
    @NotBlank(message = "Không được để trống")
    @Size(max = 500, message = "Mô tả không được quá 200 ký tự")
    private String description;
    private Category category;
}
