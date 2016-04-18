package com.perfect.trains.model;

import com.perfect.trains.base.BaseModel;

public class ClassificationManufacturer extends BaseModel {
    private Long id;

    private Long classificationId;

    private Long manufacturerId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClassificationId() {
        return classificationId;
    }

    public void setClassificationId(Long classificationId) {
        this.classificationId = classificationId;
    }

    public Long getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Long manufacturerId) {
        this.manufacturerId = manufacturerId;
    }
}