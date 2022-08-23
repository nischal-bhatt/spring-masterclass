package com.eazybytes.eazyschool.model;

import lombok.Data;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@MappedSuperclass
//mapped super class means pls treat these fields as columns also in the db 
public class BaseEntity {

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;
}
