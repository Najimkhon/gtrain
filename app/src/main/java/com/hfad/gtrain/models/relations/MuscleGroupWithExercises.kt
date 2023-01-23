package com.hfad.gtrain.models.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.hfad.gtrain.models.Exercise
import com.hfad.gtrain.models.MuscleGroup

data class MuscleGroupWithExercises (
    @Embedded val muscleGroup: MuscleGroup,
    @Relation(
        parentColumn = "title",
        entityColumn = "muscleGroup"
    )
    val exercises: List<Exercise>
)