package com.perfect.trains.model;

import com.perfect.trains.base.BaseModel;

public class TrainModelEquipmentClassification extends BaseModel {
    private Long id;

    private Long equipmentClassificationId;

    private Long trainModelId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEquipmentClassificationId() {
        return equipmentClassificationId;
    }

    public void setEquipmentClassificationId(Long equipmentClassificationId) {
        this.equipmentClassificationId = equipmentClassificationId;
    }

    public Long getTrainModelId() {
        return trainModelId;
    }

    public void setTrainModelId(Long trainModelId) {
        this.trainModelId = trainModelId;
    }
}