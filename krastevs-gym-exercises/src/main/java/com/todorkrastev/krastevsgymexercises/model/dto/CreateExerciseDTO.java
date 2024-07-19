package com.todorkrastev.krastevsgymexercises.model.dto;

import com.todorkrastev.krastevsgymexercises.model.enums.EquipmentTypeEnum;
import com.todorkrastev.krastevsgymexercises.model.enums.ExerciseCategoryEnum;

public class CreateExerciseDTO {
    private Long currUserId;

    private String name;

    private String description;

    private EquipmentTypeEnum equipmentType;

    private ExerciseCategoryEnum category;

    private String instructions;

    private String gifUrl;

    public CreateExerciseDTO() {
    }

    public Long getCurrUserId() {
        return currUserId;
    }

    public CreateExerciseDTO setCurrUserId(Long currUserId) {
        this.currUserId = currUserId;
        return this;
    }

    public String getName() {
        return name;
    }

    public CreateExerciseDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateExerciseDTO setDescription(String description) {
        this.description = description;
        return this;
    }

    public EquipmentTypeEnum getEquipmentType() {
        return equipmentType;
    }

    public CreateExerciseDTO setEquipmentType(EquipmentTypeEnum equipmentType) {
        this.equipmentType = equipmentType;
        return this;
    }

    public ExerciseCategoryEnum getCategory() {
        return category;
    }

    public CreateExerciseDTO setCategory(ExerciseCategoryEnum category) {
        this.category = category;
        return this;
    }

    public String getInstructions() {
        return instructions;
    }

    public CreateExerciseDTO setInstructions(String instructions) {
        this.instructions = instructions;
        return this;
    }

    public String getGifUrl() {
        return gifUrl;
    }

    public CreateExerciseDTO setGifUrl(String gifUrl) {
        this.gifUrl = gifUrl;
        return this;
    }
}
