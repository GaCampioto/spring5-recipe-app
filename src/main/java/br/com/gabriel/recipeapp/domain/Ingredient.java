package br.com.gabriel.recipeapp.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Data
@EqualsAndHashCode(exclude = {"recipe", "uom"})
public class Ingredient {

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
    }

    private String id = UUID.randomUUID().toString();;
    private String description;
    private BigDecimal amount;
    private UnitOfMeasure uom;
}
