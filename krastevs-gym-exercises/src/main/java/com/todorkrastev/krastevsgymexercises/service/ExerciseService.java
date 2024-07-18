package com.todorkrastev.krastevsgymexercises.service;

import com.todorkrastev.krastevsgymexercises.model.dto.CreateExerciseDTO;
import com.todorkrastev.krastevsgymexercises.model.dto.CreateExerciseNotesDTO;
import com.todorkrastev.krastevsgymexercises.model.dto.ExerciseDetailsDTO;

import java.util.List;

public interface ExerciseService {
    ExerciseDetailsDTO createExercise(CreateExerciseDTO createExerciseDTO);

    void deleteExercise(Long exerciseId);

    ExerciseDetailsDTO getExerciseById(Long id);

    List<ExerciseDetailsDTO> getAllOffers();

    ExerciseDetailsDTO createExerciseNotes(CreateExerciseNotesDTO createExerciseNotesDTO, Long id);
}
