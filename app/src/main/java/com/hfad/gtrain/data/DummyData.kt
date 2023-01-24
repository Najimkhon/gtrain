package com.hfad.gtrain.data


import com.hfad.gtrain.models.Exercise
import com.hfad.gtrain.models.MuscleGroup
import com.hfad.gtrain.models.Record
import com.hfad.gtrain.models.Set


object DummyData {

    val muscleGroups = listOf(
        MuscleGroup(
            "Chest",
            ""
        ),
        MuscleGroup(
            "Biceps",
            ""
        ),
        MuscleGroup(
            "Triceps",
            ""
        ),
        MuscleGroup(
            "Back",
            ""
        ),
        MuscleGroup(
            "Legs",
            ""
        ),
        MuscleGroup(
            "Shoulders",
            ""
        ),
    )

    val exercises = listOf(
        Exercise(
            0,
            "Bench Press",
            "",
            "",
            "One of the core exercises",
            54,
            "Chest"
        ),
        Exercise(
            0,
            "Incline Presses",
            "",
            "",
            "30 degrees",
            50,
            "Chest"
        ),
        Exercise(
            0,
            "Incline Dumbbell",
            "",
            "",
            "30 degrees",
            50,
            "Chest"
        ),
        Exercise(
            0,
            "Parallel Bar Dips",
            "",
            "",
            "Bruce",
            60,
            "Chest"
        ),
        Exercise(
            0,
            "Curls",
            "",
            "",
            "30 degrees",
            52,
            "Biceps"
        ),
        Exercise(
            0,
            "Barbell Curls",
            "",
            "",
            "30 degrees",
            52,
            "Biceps"
        ),
        Exercise(
            0,
            "Preacher Curls",
            "",
            "",
            "30 degrees",
            52,
            "Biceps"
        ),
        Exercise(
            0,
            "Hammer Curls",
            "",
            "",
            "30 degrees",
            52,
            "Biceps"
        )

    )

    val records = listOf(
        Record(
            0,
            0,
            exercises[0].id,
            listOf(
                Set(
                    12,
                    60
                ),
                Set(
                    12,
                    60
                ),
                Set(
                    12,
                    65
                ),
            )
        ),
        Record(
            0,
            0,
            exercises[1].id,
            listOf(
                Set(
                    12,
                    60
                ),
                Set(
                    12,
                    60
                ),
                Set(
                    12,
                    65
                ),
            )
        ),
        Record(
            0,
            0,
            exercises[2].id,
            listOf(
                Set(
                    12,
                    60
                ),
                Set(
                    12,
                    60
                ),
                Set(
                    12,
                    65
                ),
            )
        )
    )


}

