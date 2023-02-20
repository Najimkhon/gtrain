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
        MuscleGroup(
            "Core",
            ""
        ),
        MuscleGroup(
            "Full Body",
            ""
        )
    )

    val exercises = listOf(
        Exercise(
            0,
            "Bench Press",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/chest%2Fbench_press%2Fbench-press-1-1000x1000.jpg?alt=media&token=3ac16a17-dab5-433f-81af-6ef682afbd33",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/chest%2Fbench_press%2Fbench-press-2-1000x1000%20(1).jpg?alt=media&token=5d8799be-5355-4602-b3ef-5a09f3c4c72a"
            ),
            "CjHIKDQ4RQo",
            "Bench Press is the best exercise to increase the strength and size of your chest and build upper body muscle. It is the most popular exercise done at the gym.",
            54,
            "Chest"
        ),
        Exercise(
            0,
            "Dumbbell Bench Press",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/chest%2Fchest%2Fdumbbell-bench-press-1-1000x1000.jpg?alt=media&token=8342acf5-9a38-41c0-a58e-28430b34d294",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/chest%2Fchest%2Fdumbbell-bench-press-2-1000x1000.jpg?alt=media&token=3aa5867a-00d7-4c58-918e-9f2f191a52bb",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/chest%2Fchest%2Fdumbbell-bench-press-1-1000x1000%20(1).jpg?alt=media&token=fd234328-f23b-4567-aa40-34d805cb180c"
            ),
            "AduT4Eq-iP0",
            "Dumbbell Bench Press strength standards help you to compare your one-rep max lift with other lifters at your bodyweight.",
            60,
            "Chest"
        ),
        Exercise(
            0,
            "Push Ups",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/chest%2Fchest%2Fpush-ups-1-1000x1000.jpg?alt=media&token=a8af9de2-cdc3-4479-b763-1a6893b7a36d",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/chest%2Fchest%2Fpush-ups-2-1000x1000.jpg?alt=media&token=0651cab1-21ee-4dfe-a6d6-d6c37f1706e9",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/chest%2Fchest%2Fpush-ups-1-1000x1000%20(1).jpg?alt=media&token=5928f319-017a-4c74-b6b6-55e78318e744"
            ),
            "tPN5ElY6SlU",
            "Push Ups strength standards help you to compare your one-rep max lift with other lifters at your bodyweight.",
            60,
            "Chest"
        ),
        Exercise(
            0,
            "Incline Bench Press",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/chest%2Fincline_bench_press%2Fincline-bench-press-1-1000x1000.jpg?alt=media&token=ef4ade3d-9fec-4b63-baa6-4bef9cffe70e",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/chest%2Fincline_bench_press%2Fincline-bench-press-2-1000x1000.jpg?alt=media&token=09ae6ed1-ddbf-4c65-8b3b-a227f7b2b58d"
            ),
            "2jFFCy8JBU8",
            "Incline Bench Press strength standards help you to compare your one-rep max lift with other lifters at your bodyweight.",
            50,
            "Chest"
        ),
        Exercise(
            0,
            "Incline Dumbbell",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/chest%2Fincline_dumbbell_press%2Fincline-dumbbell-bench-press-1-1000x1000.jpg?alt=media&token=d7ecdff1-fdc9-4231-803a-55eab83c7a60",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/chest%2Fincline_dumbbell_press%2Fincline-dumbbell-bench-press-2-1000x1000.jpg?alt=media&token=ff22d9e1-ac40-47b2-82dd-9edf5665e844"
            ),
            "oZVCBM9f8Eo",
            "Incline Dumbbell Bench Press strength standards help you to compare your one-rep max lift with other lifters at your bodyweight.",
            50,
            "Chest"
        ),
        Exercise(
            0,
            "Chest Press",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/chest%2Fchest_press%2Fchest-press-1000x1000.jpg?alt=media&token=071dfa54-1563-4267-afac-52896d9b5752"),
            "CIykDiF4sfg",
            "Chest Press strength standards help you to compare your one-rep max lift with other lifters at your bodyweight.",
            60,
            "Chest"
        ),
        Exercise(
            0,
            "Close Grip Bench Press",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/chest%2Fchest%2Fclose-grip-bench-press-1000x1000.jpg?alt=media&token=32a14c3e-fbeb-46ef-9bf7-70b197e54641"),
            "DzA2xZhDGeo",
            "Close Grip Bench Press strength standards help you to compare your one-rep max lift with other lifters at your bodyweight.",
            60,
            "Chest"
        ),
        Exercise(
            0,
            "Decline Bench Press",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/chest%2Fchest%2Fdecline-bench-press-1-1000x1000.jpg?alt=media&token=48aab217-cc98-4f19-b2c4-e627016daee2",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/chest%2Fchest%2Fdecline-bench-press-2-1000x1000%20(1).jpg?alt=media&token=96ad3418-f9ad-40d1-aa4d-65ca5653a3d4",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/chest%2Fchest%2Fdecline-bench-press-2-1000x1000.jpg?alt=media&token=99f4a900-0c0b-4ca9-addc-ca4d7b91e4c7"
            ),
            "4R_GwRhG0rY",
            "Decline Bench Press strength standards help you to compare your one-rep max lift with other lifters at your bodyweight.",
            60,
            "Chest"
        ),
        Exercise(
            0,
            "Dumbbell Fly",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/chest%2Fchest%2Fdumbbell-fly-1-1000x1000.jpg?alt=media&token=f4acf716-967f-4861-b05a-9bd6f561b0a5",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/chest%2Fchest%2Fdumbbell-fly-2-1000x1000%20(1).jpg?alt=media&token=eb6e5f2f-f550-44f4-b496-d837ca111984",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/chest%2Fchest%2Fdumbbell-fly-2-1000x1000.jpg?alt=media&token=616ea657-9e36-4adf-b67a-67d047bfd60e"
            ),
            "4nSCZj_Gxxo",
            "Dumbbell Fly strength standards help you to compare your one-rep max lift with other lifters at your bodyweight.",
            60,
            "Chest"
        ),
        Exercise(
            0,
            "Machine Chest Fly",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/chest%2Fchest%2Fmachine-chest-fly-1000x1000.jpg?alt=media&token=7b33d0a5-229d-4b64-9f60-90db63450d6c"),
            "eGjt4lk6g34",
            "Machine Chest Fly strength standards help you to compare your one-rep max lift with other lifters at your bodyweight.",
            60,
            "Chest"
        ),
        Exercise(
            0,
            "Smith Machine Bench Press",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/chest%2Fchest%2Fsmith-machine-bench-press-1000x1000.jpg?alt=media&token=2a44975b-9398-45aa-b915-840141b05753"),
            "",
            "Smith Machine Bench Press strength standards help you to compare your one-rep max lift with other lifters at your bodyweight.",
            60,
            "Chest"
        ),
        Exercise(
            0,
            "Floor Press",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/chest%2Fchest%2Ffloor-press-1000x1000.jpg?alt=media&token=ad3ad8fc-889b-41e3-b42f-a714bfd71593"),
            "T0Y3OBF1bNI",
            "Floor Press strength standards help you to compare your one-rep max lift with other lifters at your bodyweight.",
            60,
            "Chest"
        ),
        Exercise(
            0,
            "Curls",
            listOf("", ""),
            "",
            "30 degrees",
            52,
            "Biceps"
        ),
        Exercise(
            0,
            "Barbell Curls",
            listOf("", ""),
            "",
            "30 degrees",
            52,
            "Biceps"
        ),
        Exercise(
            0,
            "Preacher Curls",
            listOf("", ""),
            "",
            "30 degrees",
            52,
            "Biceps"
        ),
        Exercise(
            0,
            "Hammer Curls",
            listOf("", ""),
            "",
            "30 degrees",
            52,
            "Biceps"
        )

    )

}

