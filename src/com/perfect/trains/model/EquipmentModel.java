package com.perfect.trains.model;

import com.perfect.trains.base.BaseModel;

public class EquipmentModel extends BaseModel {
    private Long id;

    private Long equipmentClassificationId;

    private String name;

    private String note;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}