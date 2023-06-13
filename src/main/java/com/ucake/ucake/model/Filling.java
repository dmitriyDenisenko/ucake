package com.ucake.ucake.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.IdGeneratorType;

@Entity
@Table(name = "fillings")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Filling {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String description;

    private String urlBigImg;

    private String urlSmallImg;
}
