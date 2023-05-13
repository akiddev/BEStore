package edu.btec.bestore.dto;

import edu.btec.bestore.domain.CategoryStatus;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.io.Serializable;

@Data
public class CategoryDto implements Serializable {
    private Long id;
    @NotEmpty(message = "Category name is required")
    private String name;
    private CategoryStatus status;
}
