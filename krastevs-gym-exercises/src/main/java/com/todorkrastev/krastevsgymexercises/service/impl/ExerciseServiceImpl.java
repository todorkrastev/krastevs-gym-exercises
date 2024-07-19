package com.todorkrastev.krastevsgymexercises.service.impl;

import com.todorkrastev.krastevsgymexercises.exception.ObjectNotFoundException;
import com.todorkrastev.krastevsgymexercises.model.dto.CreateExerciseDTO;
import com.todorkrastev.krastevsgymexercises.model.dto.CreateExerciseNotesDTO;
import com.todorkrastev.krastevsgymexercises.model.dto.ExerciseDetailsDTO;
import com.todorkrastev.krastevsgymexercises.model.entity.ExerciseEntity;
import com.todorkrastev.krastevsgymexercises.repository.ExerciseRepository;
import com.todorkrastev.krastevsgymexercises.service.ExerciseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExerciseServiceImpl implements ExerciseService {
    private final ExerciseRepository exerciseRepository;

    public ExerciseServiceImpl(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    @Override
    public ExerciseDetailsDTO createExercise(CreateExerciseDTO createExerciseDTO) {
        ExerciseEntity exercise = new ExerciseEntity()
                .setName(createExerciseDTO.getName())
                .setDescription(createExerciseDTO.getDescription())
                .setEquipmentType(createExerciseDTO.getEquipmentType())
                .setCategory(createExerciseDTO.getCategory())
                .setInstructions(createExerciseDTO.getInstructions())
                .setGifUrl(createExerciseDTO.getGifUrl())
                .setUserId(createExerciseDTO.getCurrUserId());

        System.out.println(exercise);


        //  ExerciseEntity exercise = modelMapper.map(createExerciseDTO, ExerciseEntity.class);
        ExerciseEntity exerciseSaved = exerciseRepository.save(exercise);

        return new ExerciseDetailsDTO(
                exerciseSaved.getId(),
                exerciseSaved.getName(),
                exerciseSaved.getDescription(),
                exerciseSaved.getGifUrl(),
                exerciseSaved.getMusclesWorkedUrl(),
                exerciseSaved.getInstructions(),
                exerciseSaved.getNotes()
        );
    }

    @Override
    public ExerciseDetailsDTO createExerciseNotes(CreateExerciseNotesDTO createExerciseNotesDTO, Long id) {
        Optional<ExerciseEntity> currentExercise = exerciseRepository.findById(id);

        currentExercise.ifPresent(exerciseEntity -> exerciseRepository.save(exerciseEntity.setNotes(createExerciseNotesDTO.getNotes())));

        if (currentExercise.isPresent()) {
            return new ExerciseDetailsDTO(
                    currentExercise.get().getId(),
                    currentExercise.get().getName(),
                    currentExercise.get().getDescription(),
                    currentExercise.get().getGifUrl(),
                    currentExercise.get().getMusclesWorkedUrl(),
                    currentExercise.get().getInstructions(),
                    currentExercise.get().getNotes()
            );
        }

        return null;
    }

    @Override
    public ExerciseDetailsDTO getExerciseById(Long id) {
        return exerciseRepository
                .findById(id)
                .map(exerciseEntity ->
                        new ExerciseDetailsDTO(
                                exerciseEntity.getId(),
                                exerciseEntity.getName(),
                                exerciseEntity.getDescription(),
                                exerciseEntity.getGifUrl(),
                                exerciseEntity.getMusclesWorkedUrl(),
                                exerciseEntity.getInstructions(),
                                exerciseEntity.getNotes()))
                .orElseThrow(() -> new ObjectNotFoundException());
    }

    @Override
    public void deleteExercise(Long exerciseId) {
        exerciseRepository.deleteById(exerciseId);
    }

    @Override
    public List<ExerciseDetailsDTO> getAllOffers() {
        return exerciseRepository
                .findAll()
                .stream()
                .map(exerciseEntity ->
                        new ExerciseDetailsDTO(
                                exerciseEntity.getId(),
                                exerciseEntity.getName(),
                                exerciseEntity.getDescription(),
                                exerciseEntity.getGifUrl(),
                                exerciseEntity.getMusclesWorkedUrl(),
                                exerciseEntity.getInstructions(),
                                exerciseEntity.getNotes()))
                .toList();
    }
}
