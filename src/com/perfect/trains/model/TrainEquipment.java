package com.perfect.trains.model;

import com.perfect.trains.base.BaseModel;
import java.util.Date;

public class TrainEquipment extends BaseModel {
    private Long id;

    private Long equipmentClassificationId;

    private Long trainId;

    private Long equipmentId;

    private Date upDate;

    private String pluginType;

    private Long equipmentParentClassificationId;

    private String parentPluginType;

    private String downReason;

    private Date downDate;

    private Long equipmentParentId;

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

    public Long getTrainId() {
        return trainId;
    }

    public void setTrainId(Long trainId) {
        this.trainId = trainId;
    }

    public Long getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Long equipmentId) {
        this.equipmentId = equipmentId;
    }

    public Date getUpDate() {
        return upDate;
    }

    public void setUpDate(Date upDate) {
        this.upDate = upDate;
    }

    public String getPluginType() {
        return pluginType;
    }

    public void setPluginType(String pluginType) {
        this.pluginType = pluginType == null ? null : pluginType.trim();
    }

    public Long getEquipmentParentClassificationId() {
        return equipmentParentClassificationId;
    }

    public void setEquipmentParentClassificationId(Long equipmentParentClassificationId) {
        this.equipmentParentClassificationId = equipmentParentClassificationId;
    }

    public String getParentPluginType() {
        return parentPluginType;
    }

    public void setParentPluginType(String parentPluginType) {
        this.parentPluginType = parentPluginType == null ? null : parentPluginType.trim();
    }

    public String getDownReason() {
        return downReason;
    }

    public void setDownReason(String downReason) {
        this.downReason = downReason == null ? null : downReason.trim();
    }

    public Date getDownDate() {
        return downDate;
    }

    public void setDownDate(Date downDate) {
        this.downDate = downDate;
    }

    public Long getEquipmentParentId() {
        return equipmentParentId;
    }

    public void setEquipmentParentId(Long equipmentParentId) {
        this.equipmentParentId = equipmentParentId;
    }
}