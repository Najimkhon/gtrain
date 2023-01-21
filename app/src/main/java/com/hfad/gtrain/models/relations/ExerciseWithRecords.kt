package com.hfad.gtrain.models.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.hfad.gtrain.models.Exercise
import com.hfad.gtrain.models.Record

data class ExerciseWithRecords(
    @Embedded val exercise: Exercise,
    @Relation(
        parentColumn = "id",
        entityColumn = "exerciseId"
    )
    val records: List<Record>
)