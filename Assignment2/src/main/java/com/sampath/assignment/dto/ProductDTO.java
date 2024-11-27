package com.sampath.assignment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public record ProductDTO (
   @JsonProperty("product_name")
     String productName,
   @JsonProperty("price")
     int price,
     int max,
     int min
)
{}