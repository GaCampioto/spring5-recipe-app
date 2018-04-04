package br.com.gabriel.recipeapp.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Data
@EqualsAndHashCode(exclude = "recipe")
public class Notes {

    @Id
    private String id;
    private String recipeNotes;
}
