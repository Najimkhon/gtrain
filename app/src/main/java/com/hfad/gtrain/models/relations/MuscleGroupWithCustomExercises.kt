package com.hfad.gtrain.models.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.hfad.gtrain.models.CustomExercise
import com.hfad.gtrain.models.MuscleGroup

data class MuscleGroupWithCustomExercises (
    @Embedded val muscleGroup: MuscleGroup,
    @Relation(
        parentColumn = "title",
        entityColumn = "muscleGroup"
    )
    val customExercises: List<CustomExercise>
)