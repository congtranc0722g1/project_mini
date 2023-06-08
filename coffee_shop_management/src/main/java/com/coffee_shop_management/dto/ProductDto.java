package com.coffee_shop_management.dto;

import com.coffee_shop_management.model.Category;
import org.springframework.lang.NonNull;

import javax.validation.constraints.*;

public class ProductDto {
    private Integer id;
    @NotBlank(message = "Không được để trống")
//    @Size(max = 200, message = "Tên không được quá 200 ký tự")
    private String name;
    @NotNull(message = "Không được để trống")
    @Min(value = 1,message = "Giá tiền phải lớn hơn 0")
    private Double price;
    @NotNull(message = "Không được để trống")
    @Min(value = 1,message = "Số lượng phải lớn hơn 0")
    private Integer quantity;
    @NotBlank(message = "Không được để trống")
    @Size(max = 500, message = "Mô tả không được quá 200 ký tự")
    private String description;
    private Category category;

    public ProductDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
