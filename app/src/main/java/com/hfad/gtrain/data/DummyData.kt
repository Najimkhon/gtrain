package com.hfad.gtrain.data


import com.hfad.gtrain.models.Exercise
import com.hfad.gtrain.models.MuscleGroup


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
            "Aw7C1PADw84",
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
            "Dumbbell Curl",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/biceps%2Fdumbbell%20curl%2Fdumbbell-curl-1-1000x1000.jpg?alt=media&token=723d2ef2-7c10-45e8-be1a-cd20d2181067",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/biceps%2Fdumbbell%20curl%2Fdumbbell-curl-2-1000x1000.jpg?alt=media&token=8053ff31-fe47-4a49-9fbf-2b2c36d2523a",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/biceps%2Fdumbbell%20curl%2Fdumbbell-curl-3-1000x1000%20(1).jpg?alt=media&token=5953eb4b-21fc-4d74-b612-f4103fc5dfdb",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/biceps%2Fdumbbell%20curl%2Fdumbbell-curl-4-1000x1000.jpg?alt=media&token=aa5f3398-8b92-44ed-89cd-795e9f90f81f",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/biceps%2Fdumbbell%20curl%2Fdumbbell-curl-3-1000x1000.jpg?alt=media&token=36d0644f-c8d6-4f02-99d3-0833454fa5a2"
            ),
            "",
            "Dumbbell Curls are a fundamental movement for growing the biceps. By turning the wrist you also work the brachialis which makes your biceps look fuller. \n" +
                    "No swinging. Straight back. Full extension. Full contraction.",
            52,
            "Biceps"
        ),
        Exercise(
            0,
            "Barbell Curls",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/biceps%2Fbarbell%20curl%2Fbarbell-curl-1-1000x1000%20(1).jpg?alt=media&token=fae6d4bb-d85e-4e68-a9f7-2469bf419298",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/biceps%2Fbarbell%20curl%2Fbarbell-curl-2-1000x1000.jpg?alt=media&token=81b83d1b-7d49-4678-b7d0-0283eb85b6c2",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/biceps%2Fbarbell%20curl%2Fbarbell-curl-1-1000x1000.jpg?alt=media&token=7e87094f-3846-4490-9fb7-257454bf9219"
            ),
            "N5x5M1x1Gd0",
            "Barbell Curls build big arms, locking the wrists in position so that you put maximum weight and strain on the bicep contraction as you work through the full range of motion.\n" +
                    "Start with arms straight\n" +
                    "Finish shoulder height\n" +
                    "No swinging\n" +
                    "Start fully upright",
            52,
            "Biceps"
        ),
        Exercise(
            0,
            "Preacher Curls",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/biceps%2Fpreachers%2Fpreacher-curl-1000x1000.jpg?alt=media&token=c0b89faf-ce15-41b6-bb66-add4f37dda29"),
            "Zbs3ko8ycyg",
            "Preacher Curl strength standards help you to compare your one-rep max lift with other lifters at your bodyweight.",
            52,
            "Biceps"
        ),
        Exercise(
            0,
            "Hammer Curls",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/biceps%2Fhammer%20curl%2Fhammer-curl-1000x1000.jpg?alt=media&token=6f60edd3-38b9-4780-adbe-3e66a293875b"),
            "nvcqKLIJ_ds",
            "Hammer Curl strength standards help you to compare your one-rep max lift with other lifters at your bodyweight.",
            52,
            "Biceps"
        ),
        Exercise(
            0,
            "EZ Bar Curl",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/biceps%2Fez%20bar%2Fez-bar-curl-1000x1000.jpg?alt=media&token=4269ab1a-9884-4cfd-95e1-c27fa1c5214b"),
            "8Mzuf0gLqig",
            "EZ Bar Curl strength standards help you to compare your one-rep max lift with other lifters at your bodyweight.",
            52,
            "Biceps"
        ),
        Exercise(
            0,
            "Dumbbell Concentration Curl",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/biceps%2Fconcentration%2Fdumbbell-concentration-curl-1000x1000.jpg?alt=media&token=a2496a19-1543-49b3-88a4-566e82377bd7"),
            "ikbzNiMcUjw",
            "Dumbbell Concentration Curl strength standards help you to compare your one-rep max lift with other lifters at your bodyweight.",
            52,
            "Biceps"
        ),
        Exercise(
            0,
            "Cable Bicep Curl",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/biceps%2Fcable%20curl%2Fcable-bicep-curl-1000x1000.jpg?alt=media&token=e909f718-de58-43ea-8a08-1b998708ff64"),
            "2No_kYsfTko",
            "Cable Bicep Curl strength standards help you to compare your one-rep max lift with other lifters at your bodyweight.",
            52,
            "Biceps"
        ),
        Exercise(
            0,
            "Incline Dumbbell Curl",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/biceps%2Fincline%20dubbell%20curl%2Fincline-dumbbell-curl-1000x1000.jpg?alt=media&token=57ecfb4c-42ac-49ae-8379-baaab9febdc1"),
            "Igs7vfn1Yf4",
            "Incline Dumbbell Curl strength standards help you to compare your one-rep max lift with other lifters at your bodyweight.",
            52,
            "Biceps"
        ),
        Exercise(
            0,
            "One Arm Cable Bicep Curl",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/biceps%2Fone%20arm%20cable%20curl%2Fone-arm-cable-bicep-curl-1000x1000.jpg?alt=media&token=012109e9-434f-42a0-b679-621f9ff2babe"),
            "dKyFMBSXPbY",
            "One Arm Cable Bicep Curl strength standards help you to compare your one-rep max lift with other lifters at your bodyweight.",
            52,
            "Biceps"
        ),
        Exercise(
            0,
            "Strict Curl",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/biceps%2Fstrict%20curl%2Fstrict-curl-1000x1000.jpg?alt=media&token=d40f56f3-911b-4e6e-a38b-2b9f2df16bdb"),
            "PidrvZTsm7k",
            "Strict Curl strength standards help you to compare your one-rep max lift with other lifters at your bodyweight.",
            52,
            "Biceps"
        ),
        Exercise(
            0,
            "Machine Bicep Curl",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/biceps%2Fmachine%20bicep%20curl%2Fmachine-bicep-curl-1000x1000.jpg?alt=media&token=b899aef4-f99f-40c6-916a-db7f8432ac2f"),
            "w8RccmpZ1C4",
            "Machine Bicep Curl strength standards help you to compare your one-rep max lift with other lifters at your bodyweight.",
            52,
            "Biceps"
        ),
        Exercise(
            0,
            "One Arm Dumbbell",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/biceps%2Fone%20arm%20dumbbell%2Fone-arm-dumbbell-preacher-curl-1000x1000.jpg?alt=media&token=b8811f1e-084f-4a36-9bd4-bfa1bcdebedf"),
            "R4s8obKxrro",
            "One Arm Dumbbell Preacher Curl strength standards help you to compare your one-rep max lift with other lifters at your bodyweight.",
            52,
            "Biceps"
        ),
        Exercise(
            0,
            "Incline Hammer Curl",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/biceps%2Fincline%20hammer%20curl%2Fincline-hammer-curl-1000x1000.jpg?alt=media&token=d96b2785-efd2-4e79-a822-bfb8225725f9"),
            "tK55JIavsC4",
            "Incline Hammer Curl strength standards help you to compare your one-rep max lift with other lifters at your bodyweight.",
            52,
            "Biceps"
        ),
        Exercise(
            0,
            "Spider Curl",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/biceps%2Fspider%20curl%2Fspider-curl-1000x1000.jpg?alt=media&token=9d0d753c-b10c-4d0e-ba03-8c1792f3e486"),
            "d60BTJ8ja7U",
            "What is the average Spider Curl? The average Spider Curl weight for a male lifter is 33 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Spider Curl? Male beginners should aim to lift 6 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Biceps"
        ),
        Exercise(
            0,
            "Zottman Curl",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/biceps%2Fzottman%20curl%2Fzottman-curl-1000x1000.jpg?alt=media&token=8f1b8eef-4809-420e-bac9-ebc71a2792dd"),
            "05YHYzFXK8o",
            "What is the average Zottman Curl? The average Zottman Curl weight for a male lifter is 21 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Zottman Curl? Male beginners should aim to lift 3 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Biceps"
        ),
        Exercise(
            0,
            "Seated Dumbbell Curl",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/biceps%2Fseated%20dumbell%2Fseated-dumbbell-curl-1000x1000.jpg?alt=media&token=f6f4102d-d9b4-4b55-859f-e01d9d9691e5"),
            "hfZW0ddt4Ws",
            "What is the average Seated Dumbbell Curl? The average Seated Dumbbell Curl weight for a male lifter is 22 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Seated Dumbbell Curl? Male beginners should aim to lift 8 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Biceps"
        ),
        Exercise(
            0,
            "Cheat Curl",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/biceps%2Fcheat%20curl%2Fcheat-curl-1000x1000.jpg?alt=media&token=c906132c-0b9d-4a61-a0c7-99a874323fd6"),
            "jH1fMl85Zc0",
            "What is the average Cheat Curl? The average Cheat Curl weight for a male lifter is 62 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Cheat Curl? Male beginners should aim to lift 22 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Biceps"
        ),
        Exercise(
            0,
            "Cable Hammer Curl",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/biceps%2Fcable%20hammer%20curl%2Fcable-hammer-curl-1000x1000.jpg?alt=media&token=83b2f5ff-e2c4-44e1-bfdc-699a1c184570"),
            "irKuiuH9Fs8",
            "What is the average Cable Hammer Curl? The average Cable Hammer Curl weight for a male lifter is 21 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Cable Hammer Curl? Male beginners should aim to lift 6 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Biceps"
        ),
        Exercise(
            0,
            "One Arm Pulldown",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/biceps%2Fone%20arm%20pulldown%2Fone-arm-pulldown-1000x1000.jpg?alt=media&token=bdbdb2f4-252a-4c2c-868d-5a6bb001aa53"),
            "H53DlZwfLHQ",
            "What is the average One Arm Pulldown? The average One Arm Pulldown weight for a male lifter is 38 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good One Arm Pulldown? Male beginners should aim to lift 3 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Biceps"
        ),
        Exercise(
            0,
            "Incline Cable Curl",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/biceps%2Fincline%20cable%20curl%2Fincline-cable-curl-1000x1000.jpg?alt=media&token=2c3f51ed-c796-4a6f-8359-02d5ec12f8a4"),
            "3ILzL9rI5GE",
            "What is the average Incline Cable Curl? The average Incline Cable Curl weight for a male lifter is 45 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Incline Cable Curl? Male beginners should aim to lift 7 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Biceps"
        ),
        Exercise(
            0,
            "Overhead Cable Curl",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/biceps%2Foverhead%20cable%2Foverhead-cable-curl-1000x1000.jpg?alt=media&token=91d7741f-ccbc-4f17-b0e2-121f9aba12ba"),
            "AcEgxyKpcU8",
            "What is the average Overhead Cable Curl? The average Overhead Cable Curl weight for a male lifter is 51 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Overhead Cable Curl? Male beginners should aim to lift 11 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Biceps"
        ),
        Exercise(
            0,
            "Lying Cable Curl",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/biceps%2Flying%20cable%20cur%2Flying-cable-curl-1000x1000.jpg?alt=media&token=3bb551eb-d431-4b1f-9476-0eef7c5e5625"),
            "fv2Iih_LoCw",
            "What is the average Lying Cable Curl? The average Lying Cable Curl weight for a male lifter is 54 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Lying Cable Curl? Male beginners should aim to lift 13 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Biceps"
        ),

        Exercise(
            0,
            "Dips",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/triceps%2Fdips%2Fdips-1-1000x1000%20(1).jpg?alt=media&token=0d09bf0e-6091-45d6-a782-b853d4548188",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/triceps%2Fdips%2Fdips-2-1000x1000.jpg?alt=media&token=ba979bcd-deb3-4572-9c48-cfad7d8a009b",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/triceps%2Fdips%2Fdips-1-1000x1000.jpg?alt=media&token=898717fc-40dd-4c55-a2fd-6c441b26db40"
            ),
            "Sri-rcwua3s",
            "Dips are an excellent way of training the chest and triceps using your bodyweight. You can make the movement more chest or tricep heavy by varying the angle. How many reps of Dips can the average lifter do? The average male lifter can do 20 reps of Dips. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Triceps"
        ),
        Exercise(
            0,
            "Tricep Pushdown",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/triceps%2Ftricep%20pushdown%2Ftricep-pushdown-1-1000x1000%20(1).jpg?alt=media&token=1af795ef-b6f3-485f-88a9-2877306f57ce",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/triceps%2Ftricep%20pushdown%2Ftricep-pushdown-2-1000x1000.jpg?alt=media&token=9eb68f7c-8cd8-4115-ac6f-ce0c27c0d9a7",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/triceps%2Ftricep%20pushdown%2Ftricep-pushdown-1-1000x1000.jpg?alt=media&token=230f4587-24c7-49ec-9e1f-9b1c5944e24d"
            ),
            "FsSnnlV2Vps",
            "Tricep Pushdown is a great alternative to Tricep Extension for isolating the triceps. Instead of pushing upwards against gravity you push downwards using a cable for resistance. This makes it a better accessory for Dips. What is the average Tricep Pushdown? The average Tricep Pushdown weight for a male lifter is 57 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Tricep Pushdown? Male beginners should aim to lift 17 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Triceps"
        ),
        Exercise(
            0,
            "Lying Tricep Extension",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/triceps%2Flying%20tricep%20ext%2Flying-tricep-extension-1-1000x1000%20(1).jpg?alt=media&token=b6e197a3-2c96-4b53-8515-b478e09bd812",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/triceps%2Flying%20tricep%20ext%2Flying-tricep-extension-2-1000x1000.jpg?alt=media&token=88e42dba-ee88-40d8-b6de-611aa856ebb9",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/triceps%2Flying%20tricep%20ext%2Flying-tricep-extension-1-1000x1000.jpg?alt=media&token=e159b0f4-1cdd-45ff-b21e-3437ab417474"
            ),
            "XPQziBbJVnI",
            "Tricep Extension works the triceps in isolation in front of your head on a bench. This provides a good crossover with other horizontal pushing movements where your elbows stay in front of your chest. What is the average Lying Tricep Extension? The average Lying Tricep Extension weight for a male lifter is 43 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Lying Tricep Extension? Male beginners should aim to lift 15 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Triceps"
        ),
        Exercise(
            0,
            "Tricep Rope Pushdown",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/triceps%2Ftricep%20robe%20pushdown%2Ftricep-pushdown-2-1000x1000.jpg?alt=media&token=8c7b7af2-e679-4f35-b3d9-0a13c956d384",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/triceps%2Ftricep%20robe%20pushdown%2Ftricep-rope-pushdown-1-1000x1000.jpg?alt=media&token=ff37a3b8-815b-4a98-808c-1e5a13a5b07d",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/triceps%2Ftricep%20robe%20pushdown%2Ftricep-pushdown-2-1000x1000.jpg?alt=media&token=8c7b7af2-e679-4f35-b3d9-0a13c956d384"
            ),
            "gg-31qQfOag",
            "Tricep Rope Pushdown is a variation on Tricep Pushdown where you use a rope as a handle, increasing the difficulty and changing the wrist angle. What is the average Tricep Rope Pushdown? The average Tricep Rope Pushdown weight for a male lifter is 47 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Tricep Rope Pushdown? Male beginners should aim to lift 15 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Triceps"
        ),
        Exercise(
            0,
            "Dumbbell Tricep Extension",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/triceps%2Fdumbbell%20tricep%20ext%2Fdumbbell-tricep-extension-2-1000x1000%20(1).jpg?alt=media&token=76beb1d6-5f74-4a52-b1f2-cb90aa71ec34",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/triceps%2Fdumbbell%20tricep%20ext%2Fdumbbell-tricep-extension-1-1000x1000.jpg?alt=media&token=a2ef54e0-bd7c-46b9-b9ec-e1413e7dadef",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/triceps%2Fdumbbell%20tricep%20ext%2Fdumbbell-tricep-extension-2-1000x1000.jpg?alt=media&token=cd71971d-0672-4513-adc8-6cfb1f7da53c"
            ),
            "Faou3M95lSE",
            "Dumbbell Tricep Extension works each triceps in isolation above your head, requiring you to use your core for stability. This provides a good crossover with other vertical pushing movements where your elbows go above your head. What is the average Dumbbell Tricep Extension? The average Dumbbell Tricep Extension weight for a male lifter is 23 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Dumbbell Tricep Extension? Male beginners should aim to lift 5 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Triceps"
        ),
        Exercise(
            0,
            "Tricep Extension",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/triceps%2Ftricep%20ext%2Ftricep-extension-1-1000x1000%20(1).jpg?alt=media&token=dcdb3514-5b34-4abc-b6e9-85e98fc9bda1",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/triceps%2Ftricep%20ext%2Ftricep-extension-2-1000x1000.jpg?alt=media&token=ec044558-92e0-492d-a4af-ddeee5640c25",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/triceps%2Ftricep%20ext%2Ftricep-extension-1-1000x1000%20(1).jpg?alt=media&token=dcdb3514-5b34-4abc-b6e9-85e98fc9bda1"
            ),
            "gm2p83ohASA",
            "Tricep Extension works the triceps in isolation above your head, requiring you to use your core for stability. This provides a good crossover with other vertical pushing movements where your elbows go above your head. What is the average Tricep Extension? The average Tricep Extension weight for a male lifter is 49 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Tricep Extension? Male beginners should aim to lift 12 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Triceps"
        ),
        Exercise(
            0,
            "Lying Dumbbell Tricep Extension",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/triceps%2Flying%20dumbbell%20ext%2Flying-dumbbell-tricep-extension-1-1000x1000%20(1).jpg?alt=media&token=bc32c8be-4428-4612-97b7-99634bffa5e9",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/triceps%2Flying%20dumbbell%20ext%2Flying-dumbbell-tricep-extension-2-1000x1000.jpg?alt=media&token=77a38b7b-a533-46bb-b288-a2eb8444130d",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/triceps%2Flying%20dumbbell%20ext%2Flying-dumbbell-tricep-extension-1-1000x1000%20(1).jpg?alt=media&token=bc32c8be-4428-4612-97b7-99634bffa5e9"
            ),
            "TKfln4-tLN8",
            "Dumbbell Tricep Extension works each triceps in isolation in front of your head on a bench. This provides a good crossover with other horizontal pushing movements where your elbows stay in front of your chest. What is the average Lying Dumbbell Tricep Extension? The average Lying Dumbbell Tricep Extension weight for a male lifter is 20 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Lying Dumbbell Tricep Extension? Male beginners should aim to lift 5 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Triceps"
        ),
        Exercise(
            0,
            "Seated Dip Machine",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/triceps%2Fseated%20dip%20machine%2Fseated-dip-machine-1000x1000.jpg?alt=media&token=517af1da-42dd-4327-9a60-8f3bf2ab4cdb"),
            "gTSge1qIkcI",
            "What is the average Seated Dip Machine? The average Seated Dip Machine weight for a male lifter is 105 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Seated Dip Machine? Male beginners should aim to lift 36 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Triceps"
        ),
        Exercise(
            0,
            "Dumbbell Tricep Kickback",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/triceps%2Fdumbbell%20tricep%20kickback%2Fdumbbell-tricep-kickback-1000x1000.jpg?alt=media&token=11d5f3bf-3f74-43d6-9e7d-fea418958d28"),
            "SuB149YXyLU",
            "What is the average Dumbbell Tricep Kickback? The average Dumbbell Tricep Kickback weight for a male lifter is 18 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Dumbbell Tricep Kickback? Male beginners should aim to lift 4 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Triceps"
        ),
        Exercise(
            0,
            "Cable Overhead Tricep Extension",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/triceps%2Fcable%20overhead%20tricep%2Fcable-overhead-tricep-extension-1000x1000.jpg?alt=media&token=2c80a834-f4de-45d3-8fd7-701748023248"),
            "FRqYUyrdcTU",
            "What is the average Cable Overhead Tricep Extension? The average Cable Overhead Tricep Extension weight for a male lifter is 42 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Cable Overhead Tricep Extension? Male beginners should aim to lift 10 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Triceps"
        ),
        Exercise(
            0,
            "Reverse Grip Tricep Pushdown",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/triceps%2Freverse%20grip%20pushdown%2Freverse-grip-tricep-pushdown-1000x1000.jpg?alt=media&token=8d4ff281-81f7-4465-b78a-0eb98d5c17f6"),
            "UfBwS-zKrzM",
            "What is the average Reverse Grip Tricep Pushdown? The average Reverse Grip Tricep Pushdown weight for a male lifter is 48 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Reverse Grip Tricep Pushdown? Male beginners should aim to lift 10 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Triceps"
        ),
        Exercise(
            0,
            "Seated Dumbbell Tricep Extension",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/triceps%2Fseated%20dumbbell%20ext%2Fseated-dumbbell-tricep-extension-1000x1000.jpg?alt=media&token=42796e88-dfe1-4660-9358-2006655f5d94"),
            "s-FoAbMyHTc",
            "What is the average Seated Dumbbell Tricep Extension? The average Seated Dumbbell Tricep Extension weight for a male lifter is 32 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Seated Dumbbell Tricep Extension? Male beginners should aim to lift 9 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Triceps"
        ),
        Exercise(
            0,
            "Tate Press",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/triceps%2Ftate%20press%2Ftate-press-1000x1000.jpg?alt=media&token=c51b461a-01ab-4f9f-866a-e38985345465"),
            "Er-UcoSOA90",
            "What is the average Tate Press? The average Tate Press weight for a male lifter is 21 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Tate Press? Male beginners should aim to lift 4 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Triceps"
        ),
        Exercise(
            0,
            "JM Press",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/triceps%2FJM%20press%2Fjm-press-1000x1000.jpg?alt=media&token=d9d2534d-000a-4b83-9a48-e6f4046c7663"),
            "EkLv3kFPxmY",
            "What is the average JM Press? The average JM Press weight for a male lifter is 66 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good JM Press? Male beginners should aim to lift 24 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Triceps"
        ),
        Exercise(
            0,
            "Bench Dips",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/triceps%2Fbench%20dips%2Fbench-dips-1000x1000.jpg?alt=media&token=727e4eaa-78c9-4284-b535-4ea3a3114dcf"),
            "-nodwuzTXYQ",
            "How many reps of Bench Dips can the average lifter do? The average male lifter can do 32 reps of Bench Dips. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Triceps"
        ),
        //Back-----------------------

        Exercise(
            0,
            "Pull Ups",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fpull%20ups%2Fpull-ups-1-1000x1000%20(1).jpg?alt=media&token=25579b69-181a-4987-9241-c3a84479772b",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fpull%20ups%2Fpull-ups-2-1000x1000.jpg?alt=media&token=25f626df-1f79-46fb-933d-ab24d15fa9f5",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fpull%20ups%2Fpull-ups-1-1000x1000.jpg?alt=media&token=e8a40ee4-e3af-4244-a66d-33f5c7b9d6c6"
            ),
            "VfDjjmHSDdA",
            "Pulls Ups are excellent for developing a strong back and athletic physique. Getting to one pull up is a milestone in your strength training journey. How many reps of Pull Ups can the average lifter do? The average male lifter can do 14 reps of Pull Ups. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Bent Over Row",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fbent%20over%20row%2Fbent-over-row-1-1000x1000%20(1).jpg?alt=media&token=a6f1bd69-b76f-43bc-b6e6-7d91a2e097a1",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fbent%20over%20row%2Fbent-over-row-2-1000x1000.jpg?alt=media&token=691474f8-72f6-481e-9c2b-b48df6e28191",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fbent%20over%20row%2Fbent-over-row-1-1000x1000%20(1).jpg?alt=media&token=a6f1bd69-b76f-43bc-b6e6-7d91a2e097a1"
            ),
            "U1gDt2h_sfw",
            "Bent Over Rows is the primary exercise for developing the upper back. What is the average Bent Over Row? The average Bent Over Row weight for a male lifter is 85 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Bent Over Row? Male beginners should aim to lift 41 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Lat Pulldown",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Flat%20pulldown%2Flat-pulldown-1-1000x1000%20(1).jpg?alt=media&token=68e2dfc2-8c88-45d2-b106-b47ed583465d",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Flat%20pulldown%2Flat-pulldown-2-1000x1000.jpg?alt=media&token=5fa3f6e5-f961-4fa8-8ab8-99a77b88065d",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Flat%20pulldown%2Flat-pulldown-1-1000x1000%20(1).jpg?alt=media&token=68e2dfc2-8c88-45d2-b106-b47ed583465d"
            ),
            "2x9E_reM8cU",
            "Lat Pulldown is a primary mass builder for the upper back, similar to Pull Ups but making it much easier to vary the load compared to using your bodyweight. What is the average Lat Pulldown? The average Lat Pulldown weight for a male lifter is 82 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Lat Pulldown? Male beginners should aim to lift 38 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Chin Ups",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fchin%20ups%2Fchin-ups-1-1000x1000%20(1).jpg?alt=media&token=a1f54228-5781-4a8d-b20f-4e1bf26f02bf",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fchin%20ups%2Fchin-ups-2-1000x1000.jpg?alt=media&token=ee65353a-968c-4bd3-ab8d-775d29525f17",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fchin%20ups%2Fchin-ups-1-1000x1000%20(1).jpg?alt=media&token=a1f54228-5781-4a8d-b20f-4e1bf26f02bf"
            ),
            "uv6mAYXe9Jg",
            "Chins Ups are excellent for developing a strong back and athletic physique. They focus more on the biceps compared to Pull Ups which focus more on the back. How many reps of Chin Ups can the average lifter do? The average male lifter can do 14 reps of Chin Ups. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Dumbbell Row",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fdumbell%20row%2Fdumbbell-row-1-1000x1000%20(1).jpg?alt=media&token=712ad987-12b9-409a-88ac-0d4402330d16",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fdumbell%20row%2Fdumbbell-row-2-1000x1000.jpg?alt=media&token=74f3275e-0ac3-4386-b41f-632e0695b6e9",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fdumbell%20row%2Fdumbbell-row-1-1000x1000%20(1).jpg?alt=media&token=712ad987-12b9-409a-88ac-0d4402330d16"
            ),
            "15yYpjULQ2c",
            "Dumbbell Rows allow you to focus on one arm at a time and work each side of your back to exhaustion. You may be able to lift more than Bent Over Row as this movement is more supported. What is the average Dumbbell Row? The average Dumbbell Row weight for a male lifter is 43 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Dumbbell Row? Male beginners should aim to lift 16 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Seated Cable",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fseated%20calble%20row%2Fseated-cable-row-1000x1000.jpg?alt=media&token=3c48d7d9-530e-4f8f-a7e4-b818c66a5b9a"),
            "9AODjutglP4",
            "What is the average Seated Cable Row? The average Seated Cable Row weight for a male lifter is 86 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Seated Cable Row? Male beginners should aim to lift 41 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Barbell Shrug",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fbarbell%20power%20shrug%2FBarbell%20Power%20Shrug.jpg?alt=media&token=8f4643a8-822f-457a-8ef5-fd5fd3f326f3"),
            "QdtHkugsQQ4",
            "Barbell Shrug is a primary mass builder for the trapezius, allowing you to put a lot of load through the muscle, forcing it to grow through volume. What is the average Barbell Shrug? The average Barbell Shrug weight for a male lifter is 131 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Barbell Shrug? Male beginners should aim to lift 46 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "T Bar Row",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Ft%20bar%20row%2Ft-bar-row-1-1000x1000%20(1).jpg?alt=media&token=cfd0450a-2f3b-46fb-9595-d6effd6bbe9f",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Ft%20bar%20row%2Ft-bar-row-2-1000x1000.jpg?alt=media&token=2c8cb774-1ed5-40aa-b551-11241f62ce4a",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Ft%20bar%20row%2Ft-bar-row-1-1000x1000%20(1).jpg?alt=media&token=cfd0450a-2f3b-46fb-9595-d6effd6bbe9f"
            ),
            "MB3oPmpbumE",
            "T Bar Row is a good alternative to Bent Over Rows for developing the upper back. What is the average T Bar Row? The average T Bar Row weight for a male lifter is 89 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good T Bar Row? Male beginners should aim to lift 37 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Dumbbell Shrug",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fdumbbell%20shrug%2Fdumbbell-shrug-1-1000x1000%20(1).jpg?alt=media&token=4f53f1f1-c372-4e12-8929-051e26b17cde",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fdumbbell%20shrug%2Fdumbbell-shrug-2-1000x1000.jpg?alt=media&token=ea53697b-541a-47e6-b5fb-bb887ce8f2be",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fdumbbell%20shrug%2Fdumbbell-shrug-1-1000x1000%20(1).jpg?alt=media&token=4f53f1f1-c372-4e12-8929-051e26b17cde"
            ),
            "0XwbGkBVA20",
            "Dumbbell Shrug is a more flexible version of the Barbell Shrug that allows the arms to be in a neutral position which can help isolate the trapezius more. What is the average Dumbbell Shrug? The average Dumbbell Shrug weight for a male lifter is 46 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Dumbbell Shrug? Male beginners should aim to lift 14 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Pendlay Row",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fpendlay%20row%2Fpendlay-row-1-1000x1000%20(1).jpg?alt=media&token=4934c461-403f-40d2-a4c7-5d3ba20d1c76",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fpendlay%20row%2Fpendlay-row-2-1000x1000.jpg?alt=media&token=9307a188-afcd-4d9b-86a7-ea246ed4b590",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fpendlay%20row%2Fpendlay-row-1-1000x1000%20(1).jpg?alt=media&token=4934c461-403f-40d2-a4c7-5d3ba20d1c76"
            ),
            "P9cXUGEJKbw",
            "Pendlay Row works the back through a longer range of motion than typical Bent Over Rows as your back is more horizontal to the floor and the bar comes to a stop on the ground every rep. This also helps with static strength. What is the average Pendlay Row? The average Pendlay Row weight for a male lifter is 91 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Pendlay Row? Male beginners should aim to lift 47 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Machine Row",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fmachine%20row%2Fmachine-row-1000x1000.jpg?alt=media&token=f59cf140-3ec1-4249-9d9f-971c3a374b5b"),
            "zUx50dExgxA",
            "What is the average Machine Row? The average Machine Row weight for a male lifter is 101 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Machine Row? Male beginners should aim to lift 38 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Dumbbell Pullover",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fdumbbell%20pullover%2Fdumbbell-pullover-1000x1000.jpg?alt=media&token=4db79964-1d9c-4342-a54a-d3c470b710a5"),
            "JjepnbZEwC0",
            "What is the average Dumbbell Pullover? The average Dumbbell Pullover weight for a male lifter is 35 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Dumbbell Pullover? Male beginners should aim to lift 12 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Dumbbell Reverse Fly",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fdumbbell%20reverse%20fly%2Fdumbbell-reverse-fly-1000x1000.jpg?alt=media&token=ecf82967-9259-4e54-be0d-172c7aa56c5d"),
            "tcHwAmcUMxQ",
            "What is the average Dumbbell Reverse Fly? The average Dumbbell Reverse Fly weight for a male lifter is 18 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Dumbbell Reverse Fly? Male beginners should aim to lift 2 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Close Grip Lat Pulldown",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fclose%20grip%20lat%20pulldown%2Fclose-grip-lat-pulldown-1000x1000.jpg?alt=media&token=ac7d28e2-2043-4dac-9615-e8ffce9a6228"),
            "dK3HEay3g50",
            "What is the average Close Grip Lat Pulldown? The average Close Grip Lat Pulldown weight for a male lifter is 90 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Close Grip Lat Pulldown? Male beginners should aim to lift 46 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Machine Reverse Fly",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fmachine%20reverse%20fly%2FMachine%20Reverse%20Fly.jpg?alt=media&token=9da75005-e132-40f5-b66d-f33e5c27aff8"),
            "VoscK_FHNbw",
            "What is the average Machine Reverse Fly? The average Machine Reverse Fly weight for a male lifter is 64 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Machine Reverse Fly? Male beginners should aim to lift 23 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Reverse Grip Lat Pulldown",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Freverse%20grip%20lat%20pulldown%2Freverse-grip-lat-pulldown-1000x1000.jpg?alt=media&token=de587fe1-342d-41cb-a3f2-c41f4675a77d"),
            "zKQHoKXvrAs",
            "What is the average Reverse Grip Lat Pulldown? The average Reverse Grip Lat Pulldown weight for a male lifter is 90 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Reverse Grip Lat Pulldown? Male beginners should aim to lift 42 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Cable Reverse Fly",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fcable%20reverse%20fly%2Fcable-reverse-fly-1000x1000.jpg?alt=media&token=6236c181-6620-4c63-8f55-d065d0fd09ce"),
            "M8Q5P21IWXg",
            "What is the average Cable Reverse Fly? The average Cable Reverse Fly weight for a male lifter is 28 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Cable Reverse Fly? Male beginners should aim to lift 4 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Straight Arm Pulldown",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fstraight%20arm%20pulldown%2Fstraight-arm-pulldown-1000x1000.jpg?alt=media&token=8427002c-dddb-475b-be13-faff03c07739"),
            "7kMcBd8H6l0",
            "What is the average Straight Arm Pulldown? The average Straight Arm Pulldown weight for a male lifter is 57 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Straight Arm Pulldown? Male beginners should aim to lift 17 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Bench Pull",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fbench%20pull%2Fbench-pull-1000x1000.jpg?alt=media&token=552a8044-2c30-484f-832b-aaa5e624a8fe"),
            "0x238F8IhJo",
            "What is the average Bench Pull? The average Bench Pull weight for a male lifter is 87 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Bench Pull? Male beginners should aim to lift 37 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Yates Row",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fyates%20row%2Fyates-row-1000x1000.jpg?alt=media&token=bf620f73-5ce8-4d05-85bf-43d3e6bc7b25"),
            "F-lUv5thwrg",
            "What is the average Yates Row? The average Yates Row weight for a male lifter is 102 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Yates Row? Male beginners should aim to lift 50 kg (1RM) which is still impressive compared to the general population",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Neutral Grip Pull Ups",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fneutral%20grip%2Fneutral-grip-pull-ups-1000x1000.jpg?alt=media&token=39b01384-96e2-4060-80ae-63f854ec8645"),
            "",
            "How many reps of Neutral Grip Pull Ups can the average lifter do? The average male lifter can do 15 reps of Neutral Grip Pull Ups. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Barbell Pullover",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fbarbell%20pull%20over%2Fbarbell-pullover-1000x1000.jpg?alt=media&token=c55a9e69-690c-4d70-b7b7-3bfbad5ef32a"),
            "bxovgJoP3GY",
            "What is the average Barbell Pullover? The average Barbell Pullover weight for a male lifter is 47 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Barbell Pullover? Male beginners should aim to lift 12 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Back Extension",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fback%20ext%2Fback-extension-1000x1000.jpg?alt=media&token=bc59044c-6340-48bc-89eb-70d26a5062e9"),
            "GD0w2iizShE",
            "How many reps of Back Extension can the average lifter do? The average male lifter can do 28 reps of Back Extension. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Bent Over Dumbbell Row",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fbent%20over%20dumbbell%20row%2Fbent-over-dumbbell-row-1000x1000.jpg?alt=media&token=4930f5e6-14a6-46c6-9e65-e4e41fca5211"),
            "AKxkTXBWtmk",
            "What is the average Bent Over Dumbbell Row? The average Bent Over Dumbbell Row weight for a male lifter is 35 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Bent Over Dumbbell Row? Male beginners should aim to lift 12 kg (1RM) which is still impressive compared to the general population",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Renegade Row",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Frenegade%20row%2Frenegade-row-1000x1000.jpg?alt=media&token=4aea75c9-cd8e-4b12-b34d-03a5e312ed2f"),
            "WC-X6HGnVzE",
            "What is the average Renegade Row? The average Renegade Row weight for a male lifter is 28 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Renegade Row? Male beginners should aim to lift 3 kg (1RM) which is still impressive compared to the general population",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Inverted Row ",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Finverted%20row%2Finverted-row-1000x1000.jpg?alt=media&token=4165b39b-1940-477d-8468-9055c246c424"),
            "CBqr6Qex9dw",
            "How many reps of Inverted Row can the average lifter do? The average male lifter can do 19 reps of Inverted Row. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "One Arm Lat Pulldown",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fone%20arm%20lat%20pulldown%2Fone-arm-lat-pulldown-1000x1000.jpg?alt=media&token=1890330a-6aab-411c-83d3-b54a1296d524"),
            "H53DlZwfLHQ",
            "What is the average One Arm Lat Pulldown? The average One Arm Lat Pulldown weight for a male lifter is 39 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good One Arm Lat Pulldown? Male beginners should aim to lift 12 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "One Arm Seated Cable Row",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fone%20arm%20seated%20cable%20row%2Fone-arm-seated-cable-row-1000x1000.jpg?alt=media&token=24d6fcfe-3d98-4cf2-baf3-dac217ee8c94"),
            "Ra8jU_BWP_w",
            "What is the average One Arm Seated Cable Row? The average One Arm Seated Cable Row weight for a male lifter is 59 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good One Arm Seated Cable Row? Male beginners should aim to lift 20 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Cable Upright Row",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fcable%20upright%20row%2Fcable-upright-row-1000x1000.jpg?alt=media&token=cb6840ad-e084-4a35-9edd-8b9aa365e42c"),
            "oB9AfQfjf2c",
            "What is the average Cable Upright Row? The average Cable Upright Row weight for a male lifter is 69 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Cable Upright Row? Male beginners should aim to lift 21 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Dumbbell Incline Y Raise",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fdumbbell%20incline%20y%20raise%2Fdumbbell-incline-y-raise-1000x1000.jpg?alt=media&token=7d38e88f-fd53-45b6-87c9-2194f0882aff"),
            "bNIXKnuTRGs",
            "What is the average Dumbbell Incline Y Raise? The average Dumbbell Incline Y Raise weight for a male lifter is 23 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Dumbbell Incline Y Raise? Male beginners should aim to lift 3 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Bent Arm Barbell Pullover",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fbent%20arm%20barbell%20pull%20over%2Fbent-arm-barbell-pullover-1000x1000.jpg?alt=media&token=95de5e99-35f0-43fa-b661-84b156581d70"),
            "cZyygOeQek0",
            "What is the average Bent Arm Barbell Pullover? The average Bent Arm Barbell Pullover weight for a male lifter is 24 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Bent Arm Barbell Pullover? Male beginners should aim to lift 7 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Barbell Power Shrug",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fbarbell%20power%20shrug%2FBarbell%20Power%20Shrug.jpg?alt=media&token=8f4643a8-822f-457a-8ef5-fd5fd3f326f3"),
            "ibbeNcOeZv8",
            "What is the average Barbell Power Shrug? The average Barbell Power Shrug weight for a male lifter is 160 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Barbell Power Shrug? Male beginners should aim to lift 49 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Smith Machine Shrug",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fsmith%20machine%20shrug%2Fsmith-machine-shrug-1000x1000.jpg?alt=media&token=b1e2843b-f705-41b0-abaf-4924183b6ae8"),
            "4PItuEWCTog",
            "What is the average Smith Machine Shrug? The average Smith Machine Shrug weight for a male lifter is 133 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Smith Machine Shrug? Male beginners should aim to lift 52 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Cable Shrug",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fcable%20shrug%2Fcable-shrug-1000x1000.jpg?alt=media&token=c5952ae8-ca50-490a-a761-b2b2287a2bd1"),
            "3Tp08q3ARAo",
            "What is the average Cable Shrug? The average Cable Shrug weight for a male lifter is 88 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Cable Shrug? Male beginners should aim to lift 27 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Hex Bar Shrug",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fhex%20bar%20shrug%2Fhex-bar-shrug-1000x1000.jpg?alt=media&token=d4075aa1-1bdb-44d2-92ff-7bd1e3ab4ed9"),
            "",
            "What is the average Hex Bar Shrug? The average Hex Bar Shrug weight for a male lifter is 132 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Hex Bar Shrug? Male beginners should aim to lift 47 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Behind The Back Barbell Shrug",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fbehind%20the%20back%20barbell%20shrug%2Fbehind-the-back-barbell-shrug-1000x1000.jpg?alt=media&token=926a96a1-7873-4c8b-83bb-effc7e0e9e69"),
            "886maSVQUWo",
            "What is the average Behind The Back Barbell Shrug? The average Behind The Back Barbell Shrug weight for a male lifter is 132 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Behind The Back Barbell Shrug? Male beginners should aim to lift 47 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Meadows Row",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Fmeadows%20row%2Fmeadows-row-1000x1000.jpg?alt=media&token=cd2e90fa-e9d8-4342-beaa-5f1fed25a5cc"),
            "",
            "What is the average Meadows Row? The average Meadows Row weight for a male lifter is 39 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Meadows Row? Male beginners should aim to lift 12 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Back"
        ),
        Exercise(
            0,
            "Reverse Hyperextension",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/back%2Freverse%20hyperextension%2Freverse-hyperextension-1000x1000.jpg?alt=media&token=38118360-e277-4450-8fd9-428416cc7ee9"),
            "hOGo5bX1y9A",
            "How many reps of Reverse Hyperextension can the average lifter do? The average male lifter can do 29 reps of Reverse Hyperextension. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Back"
        ),


        //legs-------

        Exercise(
            0,
            "Squat",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fsquat%2Fsquat-1-1000x1000%20(1).jpg?alt=media&token=3075eb32-94b1-4a5b-849a-e4855c0e506d",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fsquat%2Fsquat-2-1000x1000.jpg?alt=media&token=558ed7d0-d125-4877-bb36-a55ffcfb2c60",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fsquat%2Fsquat-1-1000x1000%20(1).jpg?alt=media&token=3075eb32-94b1-4a5b-849a-e4855c0e506d"
            ),
            "ilcZWIMeTto",
            "The Squat is the King of Exercises. It develops your legs more completely than any other exercise and also requires a solid core. What is the average Squat? The average Squat weight for a male lifter is 130 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Squat? Male beginners should aim to lift 64 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Sled Leg Press",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fsled%20leg%20press%2Fsled-leg-press-1-1000x1000%20(1).jpg?alt=media&token=c3ab1740-2971-4ae1-b62a-42b0c9cb8551",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fsled%20leg%20press%2Fsled-leg-press-2-1000x1000.jpg?alt=media&token=708b875f-bddf-4064-8370-866de9504bd5",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fsled%20leg%20press%2Fsled-leg-press-1-1000x1000%20(1).jpg?alt=media&token=c3ab1740-2971-4ae1-b62a-42b0c9cb8551"
            ),
            "WMNBc6MtlKk",
            "What is the average Sled Leg Press? The average Sled Leg Press weight for a male lifter is 226 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Sled Leg Press? Male beginners should aim to lift 86 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Front Squat",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Ffront%20squat%2Ffront-squat-1-1000x1000%20(1).jpg?alt=media&token=f70da6e9-2a74-4202-8921-f1e1b28fcc98",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Ffront%20squat%2Ffront-squat-2-1000x1000.jpg?alt=media&token=6cf978de-de5b-4a31-8562-aa43031c1581",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Ffront%20squat%2Ffront-squat-1-1000x1000%20(1).jpg?alt=media&token=f70da6e9-2a74-4202-8921-f1e1b28fcc98"
            ),
            "lC7w883JdjM",
            "Front Squat is a more advanced variation of the Back Squat that puts extra emphasis on your quadriceps and requires more mobility, especially around the shoulders and wrist. The upright posture can help with injury prevention compared to Back Squat. What is the average Front Squat? The average Front Squat weight for a male lifter is 105 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Front Squat? Male beginners should aim to lift 55 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Hip Thrust",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fhip%20thrust%2Fhip-thrust-1-1000x1000%20(1).jpg?alt=media&token=542e16f2-54fc-4c6b-8dfe-b5f893097e85",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fhip%20thrust%2Fhip-thrust-2-1000x1000.jpg?alt=media&token=6b3130f2-c1d4-4400-96da-95846095353d",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fhip%20thrust%2Fhip-thrust-1-1000x1000%20(1).jpg?alt=media&token=542e16f2-54fc-4c6b-8dfe-b5f893097e85"
            ),
            "ZpRvIgg",
            "Hip Thrust is a very popular posterior chain builder, used especially in sports for developing jump power. It also helps with injury prevention. What is the average Hip Thrust? The average Hip Thrust weight for a male lifter is 129 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Hip Thrust? Male beginners should aim to lift 38 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Horizontal Leg Press",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fhorizontal%20leg%20press%2Fhorizontal-leg-press-1-1000x1000%20(1).jpg?alt=media&token=3522ef28-e224-4be5-81bb-22c09bd5a1e7",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fhorizontal%20leg%20press%2Fhorizontal-leg-press-2-1000x1000.jpg?alt=media&token=164c9057-c0c9-45ec-9d1a-b63659023477",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fhorizontal%20leg%20press%2Fhorizontal-leg-press-1-1000x1000%20(1).jpg?alt=media&token=3522ef28-e224-4be5-81bb-22c09bd5a1e7"
            ),
            "US2B17Nkkzw",
            "Horizontal Leg Press lets you stimulate your lower body with a large amount of weight. It keeps you safe as you can easily exit the machine after a failed rep without any help as you just let the weight stack return to the ground. What is the average Horizontal Leg Press? The average Horizontal Leg Press weight for a male lifter is 193 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Horizontal Leg Press? Male beginners should aim to lift 71 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Leg Extension",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fleg%20extension%2Fleg-extension-1-1000x1000%20(1).jpg?alt=media&token=8aed6b54-8782-49a8-bcd9-0ad23b4ba523",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fleg%20extension%2Fleg-extension-2-1000x1000.jpg?alt=media&token=bca91b5d-769d-41cf-9fd2-a74155c1a1b3",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fleg%20extension%2Fleg-extension-1-1000x1000%20(1).jpg?alt=media&token=8aed6b54-8782-49a8-bcd9-0ad23b4ba523"
            ),
            "vw7VJ-EBnfM",
            "Leg Extension is the primary exercise for working the quadriceps in isolation. It is an excellent way to develop the size and strength of the quads. You can target different heads by changing the angle between your feet. What is the average Leg Extension? The average Leg Extension weight for a male lifter is 96 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Leg Extension? Male beginners should aim to lift 35 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Seated Leg Curl",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fseated%20leg%20curl%2Fseated-leg-curl-1-1000x1000%20(1).jpg?alt=media&token=148c38b2-b456-439a-91e1-aaf3d0860abf",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fseated%20leg%20curl%2Fseated-leg-curl-2-1000x1000.jpg?alt=media&token=d3e2c1df-2cbe-423b-8652-303ad0f4bf78",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fseated%20leg%20curl%2Fseated-leg-curl-1-1000x1000%20(1).jpg?alt=media&token=148c38b2-b456-439a-91e1-aaf3d0860abf"
            ),
            "joImLSPyQWQ",
            "Leg Extension is the primary exercise for working the hamstrings in isolation. It is an excellent way to develop the size and strength of the hamstrings. What is the average Seated Leg Curl? The average Seated Leg Curl weight for a male lifter is 79 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Seated Leg Curl? Male beginners should aim to lift 29 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Hack Squat",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fhack%20squat%2Fhack-squat-1000x1000.jpg?alt=media&token=d710bf86-4989-4044-b429-1c17e5759b5a"),
            "ik3Ni2s9AhA",
            "What is the average Hack Squat? The average Hack Squat weight for a male lifter is 157 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Hack Squat? Male beginners should aim to lift 54 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Lying Leg Curl",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Flying%20leg%20curl%2Flying-leg-curl-1-1000x1000%20(1).jpg?alt=media&token=f8d9105b-1310-4d16-b0cc-028a134ff954",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Flying%20leg%20curl%2Flying-leg-curl-2-1000x1000.jpg?alt=media&token=9bd6b6a2-3654-40fd-98a3-22b2a6e1c68e",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Flying%20leg%20curl%2Flying-leg-curl-1-1000x1000%20(1).jpg?alt=media&token=f8d9105b-1310-4d16-b0cc-028a134ff954"
            ),
            "xxvuOe8dQc",
            "Lying Leg Curl works the hamstrings in more isolation than Seated Leg Curl as you are unable to move your body forward to help with the movement because you are lying face first on the machine. What is the average Lying Leg Curl? The average Lying Leg Curl weight for a male lifter is 64 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Lying Leg Curl? Male beginners should aim to lift 23 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Machine Calf Raise",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fmachine%20calf%20raise%2Fmachine-calf-raise-1-1000x1000%20(1).jpg?alt=media&token=b7fa176b-c4ee-43e9-8609-0e828297dd1b",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fmachine%20calf%20raise%2Fmachine-calf-raise-2-1000x1000.jpg?alt=media&token=a4f43b5c-9de8-47e2-9631-be819c8b138f",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fmachine%20calf%20raise%2Fmachine-calf-raise-1-1000x1000%20(1).jpg?alt=media&token=b7fa176b-c4ee-43e9-8609-0e828297dd1b"
            ),
            "yd1-V3L49zk",
            "Machine Calf Raise allows you to fully exhaust your calf muscles using a significant amount of weight while leaving you in a safe position if you fail. What is the average Machine Calf Raise? The average Machine Calf Raise weight for a male lifter is 134 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Machine Calf Raise? Male beginners should aim to lift 31 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Goblet Squat",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fgoblet%20squat%2Fgoblet-squat-1000x1000.jpg?alt=media&token=fa890f54-1677-44f9-ade6-9b003458e490"),
            "o4FlqPNGdEI",
            "What is the average Goblet Squat? The average Goblet Squat weight for a male lifter is 42 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Goblet Squat? Male beginners should aim to lift 13 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Dumbbell Lunge",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fdumbbell%20lunge%2Fdumbbell-lunge-1000x1000.jpg?alt=media&token=4cd7fdc3-d039-4c20-a601-29e9be6d1995"),
            "aU444npXJiM",
            "What is the average Dumbbell Lunge? The average Dumbbell Lunge weight for a male lifter is 30 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Dumbbell Lunge? Male beginners should aim to lift 8 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Vertical Leg Press",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fvertical%20leg%20press%2Fvertical-leg-press-1000x1000.jpg?alt=media&token=1615fefb-ed0c-4032-b949-5c05ac6dcd4f"),
            "IuaxiZ4BkqI",
            "What is the average Vertical Leg Press? The average Vertical Leg Press weight for a male lifter is 220 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Vertical Leg Press? Male beginners should aim to lift 81 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Box Squat",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fbox%20squat%2Fbox-squat-1000x1000.jpg?alt=media&token=948b57a4-db10-4fc9-90dc-d179df3b85af"),
            "hyqI0cT5BFA",
            "What is the average Box Squat? The average Box Squat weight for a male lifter is 153 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Box Squat? Male beginners should aim to lift 69 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Bodyweight Squat",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fbodyweight%20squat%2Fbodyweight-squat-1-1000x1000%20(1).jpg?alt=media&token=2a8616f2-5649-4d8d-94f7-6e68c336f47a",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fbodyweight%20squat%2Fbodyweight-squat-2-1000x1000.jpg?alt=media&token=3c545a17-21d5-4192-9209-e6145a815dfb",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fbodyweight%20squat%2Fbodyweight-squat-1-1000x1000%20(1).jpg?alt=media&token=2a8616f2-5649-4d8d-94f7-6e68c336f47a"
            ),
            "NrKLFHsWnCM",
            "The Bodyweight Squat is an easier variation of Squat that you can do anywhere as it does not require any equipment. Instead of using a barbell you use higher repetitions to develop muscle. How many reps of Bodyweight Squat can the average lifter do? The average male lifter can do 57 reps of Bodyweight Squat. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Bulgarian Split Squat",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fbulgarian%20split%20squat%2Fbulgarian-split-squat-1000x1000.jpg?alt=media&token=892d426a-ee67-4975-ad16-100b624bbebe"),
            "yLmO-PleeIU",
            "What is the average Bulgarian Split Squat? The average Bulgarian Split Squat weight for a male lifter is 61 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Bulgarian Split Squat? Male beginners should aim to lift 15 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Seated Calf Raise",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fseated%20calf%20raise%2Fseated-calf-raise-1-1000x1000%20(1).jpg?alt=media&token=df79bbaa-993b-43c2-8e36-a09e3158bc67",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fseated%20calf%20raise%2Fseated-calf-raise-2-1000x1000.jpg?alt=media&token=d90ac9f8-44b6-4c31-88f4-43a93c75cbbe",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fseated%20calf%20raise%2Fseated-calf-raise-1-1000x1000.jpg?alt=media&token=c157cf6a-e262-4c5d-9f5f-2fae0ed2c9a8"
            ),
            "MPdAHYH6bVU",
            "Seated Calf Raise isolates your calf muscles by putting the weight above your knees, cutting out the rest of the body. This allows you to focus completely on the contraction in your calf. What is the average Seated Calf Raise? The average Seated Calf Raise weight for a male lifter is 100 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Seated Calf Raise? Male beginners should aim to lift 22 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Good Morning",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fgood%20morning%2Fgood-morning-1-1000x1000.jpg?alt=media&token=1823df6f-0f90-4f18-acc3-0b88365bd65d",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fgood%20morning%2Fgood-morning-2-1000x1000.jpg?alt=media&token=7fcda6c2-0db9-401c-9d65-de9617e6eee8",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fgood%20morning%2Fgood-morning-1-1000x1000.jpg?alt=media&token=1823df6f-0f90-4f18-acc3-0b88365bd65d"
            ),
            "Good Morning",
            "Good Morning is a traditional posterior chain builder for developing power in the legs and glutes. What is the average Good Morning? The average Good Morning weight for a male lifter is 87 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Good Morning? Male beginners should aim to lift 24 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Barbell Lunge",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fbarbell%20lunge%2Fbarbell-lunge-1000x1000.jpg?alt=media&token=ddd099c1-753b-47ca-89f7-c7a947e81d61"),
            "gWeyziUtsa0",
            "What is the average Barbell Lunge? The average Barbell Lunge weight for a male lifter is 82 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Barbell Lunge? Male beginners should aim to lift 30 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Smith Machine Squat",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fsmith%20machine%20squat%2Fsmith-machine-squat-1000x1000.jpg?alt=media&token=3a5c6702-5987-4af6-8dce-cdd38037789b"),
            "O1_4vksXI5o",
            "What is the average Smith Machine Squat? The average Smith Machine Squat weight for a male lifter is 120 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Smith Machine Squat? Male beginners should aim to lift 48 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Zercher Squat",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fzercher%20squat%2Fzercher-squat-1000x1000.jpg?alt=media&token=42308020-d249-4a76-b811-77157c9619b8"),
            "B-5n0aCXaAU",
            "What is the average Zercher Squat? The average Zercher Squat weight for a male lifter is 115 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Zercher Squat? Male beginners should aim to lift 50 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Hip Abduction",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fhip%20abduction%2Fhip-abduction-1000x1000.jpg?alt=media&token=339dd733-f144-47c4-8af2-9b52468d06d2"),
            "8Z3HU56kzbA",
            "What is the average Hip Abduction? The average Hip Abduction weight for a male lifter is 101 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Hip Abduction? Male beginners should aim to lift 30 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Overhead Squat",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Foverhead%20squat%2Foverhead-squat-1000x1000.jpg?alt=media&token=0e3d557d-719f-484b-aa57-7f0ab169f0cc"),
            "xjJF4Lnp6GY",
            "What is the average Overhead Squat? The average Overhead Squat weight for a male lifter is 81 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Overhead Squat? Male beginners should aim to lift 27 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Hip Adduction",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fhip%20adduction%2Fhip-adduction-1000x1000.jpg?alt=media&token=a4d4c62b-3b25-4694-84fe-774097fb23ec"),
            "JK4S67PrKIE",
            "What is the average Hip Adduction? The average Hip Adduction weight for a male lifter is 109 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Hip Adduction? Male beginners should aim to lift 32 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Split Squat",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fsplit%20squat%2Fsplit-squat-1000x1000.jpg?alt=media&token=42b1e6dc-9036-4fe5-88fc-adf6f50ff0e5"),
            "iHkBjcx9CiQ",
            "What is the average Split Squat? The average Split Squat weight for a male lifter is 85 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Split Squat? Male beginners should aim to lift 24 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Barbell Calf Raise",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fbarbell%20calf%2Fbarbell-calf-raise-1000x1000.jpg?alt=media&token=18ccf5b2-ee54-412e-9507-6b3e1a6da521"),
            "ofEDDXpFgj8",
            "What is the average Barbell Calf Raise? The average Barbell Calf Raise weight for a male lifter is 119 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Barbell Calf Raise? Male beginners should aim to lift 39 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Dumbbell Squat",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fdumbbell%20squat%2Fdumbbell-squat-1000x1000.jpg?alt=media&token=14bed7b3-4ea3-457a-b5ca-0c7b2bd7703f"),
            "Op7uuchcDzU",
            "What is the average Dumbbell Squat? The average Dumbbell Squat weight for a male lifter is 34 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Dumbbell Squat? Male beginners should aim to lift 10 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Cable Pull Through",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fcable%20pull%20through%2Fcable-pull-through-1000x1000.jpg?alt=media&token=6f90fa9c-f8ea-4ee0-bae4-ffe0a8b336a6"),
            "oAmxBgCM5Sw",
            "What is the average Cable Pull Through? The average Cable Pull Through weight for a male lifter is 60 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Cable Pull Through? Male beginners should aim to lift 13 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Landmine Squat ",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Flandmine%20squat%2Flandmine-squat-1000x1000.jpg?alt=media&token=2c327606-0a89-4249-b7dc-6c56c0b2af73"),
            "tgd6gpo20k8",
            "What is the average Landmine Squat? The average Landmine Squat weight for a male lifter is 94 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Landmine Squat? Male beginners should aim to lift 24 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Standing Leg Curl ",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fstanding%20leg%20curl%2Fstanding-leg-curl-1000x1000.jpg?alt=media&token=aa06a2a6-0b89-40fa-ace8-b0af7822754c"),
            "hiA_3QRIHsQ",
            "What is the average Standing Leg Curl? The average Standing Leg Curl weight for a male lifter is 51 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Standing Leg Curl? Male beginners should aim to lift 6 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Dumbbell Calf Raise",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fdumbbell%20calf%20raise%2Fdumbbell-calf-raise-1000x1000.jpg?alt=media&token=c37aad6a-343c-4b14-a020-bc16a1c49770"),
            "ADIDoYt_ko4",
            "What is the average Dumbbell Calf Raise? The average Dumbbell Calf Raise weight for a male lifter is 38 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Dumbbell Calf Raise? Male beginners should aim to lift 8 kg (1RM) which is still impressive compared to the general population",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Barbell Reverse Lunge",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fbarbell%20reverse%20lunge%2Fbarbell-reverse-lunge-1000x1000.jpg?alt=media&token=800e177a-20ae-4bd0-9d69-5063975524b6"),
            "0ygCeLlHEh4",
            "What is the average Barbell Reverse Lunge? The average Barbell Reverse Lunge weight for a male lifter is 99 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Barbell Reverse Lunge? Male beginners should aim to lift 44 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Barbell Glute Bridge",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fbarbell%20glute%20bridge%2Fbarbell-glute-bridge-1000x1000.jpg?alt=media&token=c5194b0a-6321-40c5-967f-f13a0cce2f8b"),
            "yYCc2HDLfO8",
            "What is the average Barbell Glute Bridge? The average Barbell Glute Bridge weight for a male lifter is 118 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Barbell Glute Bridge? Male beginners should aim to lift 32 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Single Leg Squat",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fsingle%20leg%20squat%2Fsingle-leg-squat-1-1000x1000%20(1).jpg?alt=media&token=8ef1e13c-04a4-4833-8493-1b5c7a1f4e00",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fsingle%20leg%20squat%2Fsingle-leg-squat-2-1000x1000.jpg?alt=media&token=33fe95c1-38f3-4e48-939a-15190f8d5a28",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fsingle%20leg%20squat%2Fsingle-leg-squat-1-1000x1000%20(1).jpg?alt=media&token=8ef1e13c-04a4-4833-8493-1b5c7a1f4e00"
            ),
            "QsrNuqCRcvc",
            "The Pistol Squat is a challenging variation of the King of Exercises that you can do anywhere. It requires significant strength, balance and practice. How many reps of Single Leg Squat can the average lifter do? The average male lifter can do 14 reps of Single Leg Squat. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Sled Press Calf Raise",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fsled%20press%20calf%20raise%2Fsled-press-calf-raise-1000x1000.jpg?alt=media&token=8ec84a56-3543-42fc-963f-4321a72f473c"),
            "DuOiuPwiZKY",
            "What is the average Sled Press Calf Raise? The average Sled Press Calf Raise weight for a male lifter is 204 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Sled Press Calf Raise? Male beginners should aim to lift 48 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Single Leg Press",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fsingle%20leg%20press%2Fsingle-leg-press-1000x1000.jpg?alt=media&token=25a2f1da-75a1-4266-9409-6b1c6209f50d"),
            "D934zSaVtU0",
            "What is the average Single Leg Press? The average Single Leg Press weight for a male lifter is 142 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Single Leg Press? Male beginners should aim to lift 33 kg (1RM) which is still impressive compared to the general population",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Belt Squat",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fbelt%20squat%2Fbelt-squat-1000x1000.jpg?alt=media&token=d5eb918c-7a6a-47b1-a224-fc0a16a2a55b"),
            "cBtCV5oPM_4",
            "What is the average Belt Squat? The average Belt Squat weight for a male lifter is 173 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Belt Squat? Male beginners should aim to lift 52 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Safety Bar Squat",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fsafety%20bar%20squat%2Fsafety-bar-squat-1000x1000.jpg?alt=media&token=1637cd8b-2698-440f-be88-7360cf0ed447"),
            "Amb9NJu4c4E",
            "What is the average Safety Bar Squat? The average Safety Bar Squat weight for a male lifter is 152 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Safety Bar Squat? Male beginners should aim to lift 72 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Barbell Hack Squat",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fbarbell%20hack%20squat%2Fbarbell-hack-squat-1000x1000.jpg?alt=media&token=9cf33569-d103-4672-b06b-77c340bb0563"),
            "J3df6XxEr-M",
            "What is the average Barbell Hack Squat? The average Barbell Hack Squat weight for a male lifter is 126 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Barbell Hack Squat? Male beginners should aim to lift 50 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Pause Squat",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fpause%20squat%2Fpause-squat-1000x1000.jpg?alt=media&token=c72c2047-21bf-49c2-b4b1-20e5ea25b447"),
            "lqflf3ophJw",
            "What is the average Pause Squat? The average Pause Squat weight for a male lifter is 131 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Pause Squat? Male beginners should aim to lift 69 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Sumo Squat ",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fsumo%20squat%2Fsumo-squat-1000x1000.jpg?alt=media&token=73001c62-b679-4a7e-a63f-8049e0b2394f"),
            "idDqMq9H-_Y",
            "What is the average Sumo Squat? The average Sumo Squat weight for a male lifter is 100 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Sumo Squat? Male beginners should aim to lift 23 kg (1RM) which is still impressive compared to the general population",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Pistol Squat",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fpistol%20squat%2Fpistol-squat-1000x1000.jpg?alt=media&token=b64f6f5b-a5ab-4a02-9771-66cd63a398f4"),
            "41QWfuAokAk",
            "How many reps of Pistol Squat can the average lifter do? The average male lifter can do 13 reps of Pistol Squat. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Cable Kickback ",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fcable%20kickback%2Fcable-kickback-1000x1000.jpg?alt=media&token=5cb5fe5d-38ec-490c-b50c-035d5c230d9a"),
            "QBemKEDJ3dE",
            "What is the average Cable Kickback? The average Cable Kickback weight for a male lifter is 20 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Cable Kickback? Male beginners should aim to lift 4 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Lunge",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Flunge%2Flunge-1000x1000.jpg?alt=media&token=2337784d-0536-462e-a1a7-fc16002251d5"),
            "krxGoIpg9XQ",
            "How many reps of Lunge can the average lifter do? The average male lifter can do 38 reps of Lunge. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Glute Bridge",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fglute%20bridge%2Fglute-bridge-1000x1000.jpg?alt=media&token=f9847b25-bd7f-4b8a-be3d-0a9234ae3ef7"),
            "",
            "How many reps of Glute Bridge can the average lifter do? The average male lifter can do 37 reps of Glute Bridge. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Bodyweight Calf Raise",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fbody%20weight%20calf%20raise%2Fbodyweight-calf-raise-1000x1000.jpg?alt=media&token=183629ae-77c2-4940-a451-25d2297e657c"),
            "ayy8owPQ61w",
            "How many reps of Bodyweight Calf Raise can the average lifter do? The average male lifter can do 67 reps of Bodyweight Calf Raise. This makes you Intermediate on Strength Level and is a very impressive achievement",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Walking Lunge",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fwalking%20lunge%2Fwalking-lunge-1000x1000.jpg?alt=media&token=3011dd38-e0db-42a0-acd4-fdccb5ccc308"),
            "6wZoPedlpok",
            "What is the average Walking Lunge? The average Walking Lunge weight for a male lifter is 63 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Walking Lunge? Male beginners should aim to lift 3 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Dumbbell Front Squat",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fdumbbell%20front%20squat%2Fdumbbell-front-squat-1000x1000.jpg?alt=media&token=6569deea-0c1f-400b-9ffc-b815ee4648a4"),
            "7CuKlSgu1B0",
            "What is the average Dumbbell Front Squat? The average Dumbbell Front Squat weight for a male lifter is 35 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Dumbbell Front Squat? Male beginners should aim to lift 8 kg (1RM) which is still impressive compared to the general population",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Reverse Lunge",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Freverse%20lunge%2Freverse-lunge-1000x1000.jpg?alt=media&token=d5f57c84-10fe-45ab-8235-b7a582cfab09"),
            "riVwQa0N-SU",
            "How many reps of Reverse Lunge can the average lifter do? The average male lifter can do 34 reps of Reverse Lunge. This makes you Intermediate on Strength Level and is a very impressive achievement",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Squat Jump",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fsquat%20jump%2Fsquat-jump-1000x1000.jpg?alt=media&token=13077755-6e9f-4d94-b2bb-9a5ff8b59727"),
            "kFm3hfp7ogc",
            "How many reps of Squat Jump can the average lifter do? The average male lifter can do 35 reps of Squat Jump. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Dumbbell Split Squat",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fdumbbell%20split%20squat%2Fdumbbell-split-squat-1000x1000.jpg?alt=media&token=eaa33268-1c7a-4caf-9d99-f6731a952a93"),
            "Wcmg-3iHwjQ",
            "What is the average Dumbbell Split Squat? The average Dumbbell Split Squat weight for a male lifter is 29 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Dumbbell Split Squat? Male beginners should aim to lift 9 kg (1RM) which is still impressive compared to the general population",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Glute Ham Raise",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fglute%20ham%20raise%2Fglute-ham-raise-1000x1000.jpg?alt=media&token=bfa2f0a2-728b-438e-8b78-1bf19808c923"),
            "HOwIfNzumPE",
            "How many reps of Glute Ham Raise can the average lifter do? The average male lifter can do 22 reps of Glute Ham Raise. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Single Leg Seated Calf Raise",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fsingle%20leg%20seated%20calf%20raise%2Fsingle-leg-seated-calf-raise-1000x1000.jpg?alt=media&token=03a75eb1-a5f5-4939-81a0-8def890f76ee"),
            "4NUJeFJ14F4",
            "What is the average Single Leg Seated Calf Raise? The average Single Leg Seated Calf Raise weight for a male lifter is 62 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Single Leg Seated Calf Raise? Male beginners should aim to lift 15 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Sissy Squat ",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fsissy%20squat%2Fsissy-squat-1000x1000.jpg?alt=media&token=52555c09-8461-47dd-8632-1b0ffd5d347a"),
            "_kuzM5gKU8U",
            "How many reps of Sissy Squat can the average lifter do? The average male lifter can do 27 reps of Sissy Squat. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Side Lunge ",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fside%20lunge%2Fside-lunge-1000x1000.jpg?alt=media&token=efd60667-6726-46bc-a975-54f5ed453ae1"),
            "7RgQ-vqKJGU",
            "How many reps of Side Lunge can the average lifter do? The average male lifter can do 39 reps of Side Lunge. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Donkey Calf Raise",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fdonkey%20calf%20raise%2Fdonkey-calf-raise-1000x1000.jpg?alt=media&token=530596d7-569a-4123-a618-fe7ba8f8ed12"),
            "",
            "How many reps of Donkey Calf Raise can the average lifter do? The average male lifter can do 67 reps of Donkey Calf Raise. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Dumbbell Walking",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fdumbbell%20walking%20calf%20raise%2Fdumbbell-walking-calf-raise-1000x1000.jpg?alt=media&token=00423f2c-a730-437b-b90e-a549dcee8591"),
            "QYfIF7EJhP0",
            "What is the average Dumbbell Walking Calf Raise? The average Dumbbell Walking Calf Raise weight for a male lifter is 30 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Dumbbell Walking Calf Raise? Male beginners should aim to lift 7 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Glute Kickback",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fglute%20kickback%2Fglute-kickback-1000x1000.jpg?alt=media&token=89414603-57aa-4365-9fc4-ac9a7cf4a61d"),
            "Ibwp50t3b1Y",
            "How many reps of Glute Kickback can the average lifter do? The average male lifter can do 31 reps of Glute Kickback. This makes you Intermediate on Strength Level and is a very impressive achievement",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Side Leg Raise",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fside%20leg%20raise%2Fside-leg-raise-1000x1000.jpg?alt=media&token=b25198ea-f353-47ac-8a5b-9aea51aa4b21"),
            "zrZuHi7EeWs",
            "How many reps of Side Leg Raise can the average lifter do? The average male lifter can do 25 reps of Side Leg Raise. This makes you Intermediate on Strength Level and is a very impressive achievement",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Jefferson Squat",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fjefferson%20squat%2Fjefferson-squat-1000x1000.jpg?alt=media&token=81564934-6a1d-477c-92be-e3ca880c906a"),
            "wcfgi6fpLAg",
            "What is the average Jefferson Squat? The average Jefferson Squat weight for a male lifter is 113 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Jefferson Squat? Male beginners should aim to lift 50 kg (1RM) which is still impressive compared to the general population",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Floor Hip Abduction",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Ffloor%20hip%20abduction%2Ffloor-hip-abduction-1000x1000.jpg?alt=media&token=5a33be3f-cc4b-41e2-8825-7042a690a615"),
            "E78SP0TETTg",
            "How many reps of Floor Hip Abduction can the average lifter do? The average male lifter can do 19 reps of Floor Hip Abduction. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Legs"
        ),
        Exercise(
            0,
            "Hip Extension",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/legs%2Fhip%20extension%2Fhip-extension-1000x1000.jpg?alt=media&token=b3a5bc1e-2f59-4a0a-bd2c-7390f619aacb"),
            "JIJ-qyUJE4s",
            "How many reps of Hip Extension can the average lifter do? The average male lifter can do 35 reps of Hip Extension. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Legs"
        ),

        //Shoulders---------------

        Exercise(
            0,
            "Shoulder Press",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fshoulder%20press%2Fshoulder-press-1-1000x1000%20(1).jpg?alt=media&token=edc390aa-5978-4e6b-afd5-c4741ca48b93",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fshoulder%20press%2Fshoulder-press-2-1000x1000.jpg?alt=media&token=4fce29c3-8b10-40bd-9295-b4d4dce17fb5",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fshoulder%20press%2Fshoulder-press-1-1000x1000%20(1).jpg?alt=media&token=edc390aa-5978-4e6b-afd5-c4741ca48b93"
            ),
            "c-hQY9bbsac",
            "Shoulder Press is a fundamental movement for building strong shoulders and arms. What is the average Shoulder Press? The average Shoulder Press weight for a male lifter is 64 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Shoulder Press? Male beginners should aim to lift 30 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Shoulders"
        ),
        Exercise(
            0,
            "Dumbbell Shoulder Press",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fdumbbell%20shoulder%20press%2Fdumbbell-shoulder-press-1-1000x1000%20(1).jpg?alt=media&token=ba07e1ac-55d8-4dbc-8ece-cada4850b584",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fdumbbell%20shoulder%20press%2Fdumbbell-shoulder-press-2-1000x1000.jpg?alt=media&token=bb3402ac-3fa1-415d-a816-f84ba01847fd",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fdumbbell%20shoulder%20press%2Fdumbbell-shoulder-press-1-1000x1000%20(1).jpg?alt=media&token=ba07e1ac-55d8-4dbc-8ece-cada4850b584"
            ),
            "wc4Z4nUhpbw",
            "Dumbbell Shoulder Press works each shoulder/arm in isolation which helps address imbalances. You can also support your back using a bench, reducing the risk of injury and preventing cheating using bad form. What is the average Dumbbell Shoulder Press? The average Dumbbell Shoulder Press weight for a male lifter is 32 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Dumbbell Shoulder Press? Male beginners should aim to lift 13 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Shoulders"
        ),
        Exercise(
            0,
            "Dumbbell Lateral Raise",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fdumbbell%20lateral%20raise%2Fdumbbell-lateral-raise-1-1000x1000%20(1).jpg?alt=media&token=90d85dac-7716-4885-9c87-5dec7d03f135",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fdumbbell%20lateral%20raise%2Fdumbbell-lateral-raise-2-1000x1000.jpg?alt=media&token=3547bef9-9d6e-4426-9d0a-bc6c3babe001",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fdumbbell%20lateral%20raise%2Fdumbbell-lateral-raise-1-1000x1000%20(1).jpg?alt=media&token=90d85dac-7716-4885-9c87-5dec7d03f135"
            ),
            "8aUc9snLOxU",
            "Dumbbell Lateral Raise is a challenging exercise that isolates the side delts, requiring them to work hard while using relatively light weights. What is the average Dumbbell Lateral Raise? The average Dumbbell Lateral Raise weight for a male lifter is 15 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Dumbbell Lateral Raise? Male beginners should aim to lift 4 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Shoulders"
        ),
        Exercise(
            0,
            "Push Press",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fpush%20press%2Fpush-press-1-1000x1000%20(1).jpg?alt=media&token=40965c95-c889-4260-95f6-65a9770740d5",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fpush%20press%2Fpush-press-2-1000x1000.jpg?alt=media&token=95f37faf-d110-4f90-ba2d-ef4d17f856dc",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fpush%20press%2Fpush-press-3-1000x1000.jpg?alt=media&token=dea8072a-53de-40e7-8b2a-4bcd15d37b4f",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fpush%20press%2Fpush-press-4-1000x1000.jpg?alt=media&token=1b437f93-2389-4244-b202-6bc2db07e315",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fpush%20press%2Fpush-press-1-1000x1000%20(1).jpg?alt=media&token=40965c95-c889-4260-95f6-65a9770740d5"
            ),
            "MmjM11GJPAM",
            "Push Press allows you to lift more weight overhead than a standard Shoulder Press by using leg drive to accelerate the bar at the start of the movement. This additional weight allows you to increase the load and training stimulus on the body and shoulders. What is the average Push Press? The average Push Press weight for a male lifter is 83 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Push Press? Male beginners should aim to lift 37 kg (1RM) which is still impressive compared to the general population",
            52,
            "Shoulders"
        ),
        Exercise(
            0,
            "Seated Shoulder Press",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fseated%20shoulder%20press%2Fseated-shoulder-press-1000x1000.jpg?alt=media&token=bb640478-d7cf-4f49-94d0-e42ae81e735f"),
            "3qPsBlwx7hM",
            "What is the average Seated Shoulder Press? The average Seated Shoulder Press weight for a male lifter is 70 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Seated Shoulder Press? Male beginners should aim to lift 28 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Shoulders"
        ),
        Exercise(
            0,
            "Machine Shoulder Press",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fmachine%20shoulder%20press%2Fmachine-shoulder-press-1000x1000.jpg?alt=media&token=fe649f20-1713-4f71-a0db-bdd8b03cabbd"),
            "fKA6HtKGzW4",
            "What is the average Machine Shoulder Press? The average Machine Shoulder Press weight for a male lifter is 77 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Machine Shoulder Press? Male beginners should aim to lift 24 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Shoulders"
        ),
        Exercise(
            0,
            "Upright Row ",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fupright%20row%2Fupright-row-1-1000x1000%20(1).jpg?alt=media&token=156b9064-890d-4670-98c9-9fd4245982ac",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fupright%20row%2Fupright-row-2-1000x1000.jpg?alt=media&token=b0ef8648-4391-4f8e-8ae9-b51d918584b5",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fupright%20row%2Fupright-row-1-1000x1000%20(1).jpg?alt=media&token=156b9064-890d-4670-98c9-9fd4245982ac"
            ),
            "bXTqFe0GnmQ",
            "Upright Row is a classic bodybuilding exercise for developing the trapezius and the shoulders, giving you the physique of a Greek statue. Some people avoid it due to shoulder impingement. What is the average Upright Row? The average Upright Row weight for a male lifter is 64 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Upright Row? Male beginners should aim to lift 21 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Shoulders"
        ),
        Exercise(
            0,
            "Dumbbell Front Raise",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fdumbbell%20front%20raise%2Fdumbbell-front-raise-1-1000x1000%20(1).jpg?alt=media&token=14b4c57c-396b-41ef-a6d6-690c8d8e2d18",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fdumbbell%20front%20raise%2Fdumbbell-front-raise-2-1000x1000.jpg?alt=media&token=a6e270e1-bcf6-42b2-a45e-7b702d5facad",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fdumbbell%20front%20raise%2Fdumbbell-front-raise-1-1000x1000%20(1).jpg?alt=media&token=14b4c57c-396b-41ef-a6d6-690c8d8e2d18"
            ),
            "1R30rnr3xis",
            "Dumbbell Front Raise allows you to isolate the front delts and work them hard using relatively light weights. You can lift the dumbbells together or alternately. What is the average Dumbbell Front Raise? The average Dumbbell Front Raise weight for a male lifter is 18 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Dumbbell Front Raise? Male beginners should aim to lift 3 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Shoulders"
        ),
        Exercise(
            0,
            "Cable Lateral Raise",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fcable%20lateral%20raise%2Fcable-lateral-raise-1000x1000.jpg?alt=media&token=579284cd-1f7a-4390-9e9f-11089e60e2c6"),
            "xWtG-KQY8W4",
            "What is the average Cable Lateral Raise? The average Cable Lateral Raise weight for a male lifter is 18 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Cable Lateral Raise? Male beginners should aim to lift 1 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Shoulders"
        ),
        Exercise(
            0,
            "Arnold Press",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Farnold%20press%2Farnold-press-1000x1000.jpg?alt=media&token=5f2f9b07-0cd6-4583-84f9-2cdb8b162869"),
            "HS5j_dSjysQ",
            "What is the average Arnold Press? The average Arnold Press weight for a male lifter is 24 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Arnold Press? Male beginners should aim to lift 8 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Shoulders"
        ),
        Exercise(
            0,
            "Face Pull",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fface%20pull%2Fface-pull-1000x1000.jpg?alt=media&token=48ad8796-d4f1-43cc-822c-792c90ce8506"),
            "q3pnXvD-s50",
            "What is the average Face Pull? The average Face Pull weight for a male lifter is 46 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Face Pull? Male beginners should aim to lift 12 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Shoulders"
        ),
        Exercise(
            0,
            "Seated Dumbbell Shoulder Press",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fseated%20dumbbell%20shoulder%20press%2Fseated-dumbbell-shoulder-press-1-1000x1000%20(1).jpg?alt=media&token=a12a53fa-1112-40e6-a04b-edfb797658e8",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fseated%20dumbbell%20shoulder%20press%2Fseated-dumbbell-shoulder-press-2-1000x1000.jpg?alt=media&token=ada213f4-2fab-49ef-a6e7-0915a13d46e9",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fseated%20dumbbell%20shoulder%20press%2Fseated-dumbbell-shoulder-press-1-1000x1000%20(1).jpg?alt=media&token=a12a53fa-1112-40e6-a04b-edfb797658e8"
            ),
            "U9PvhniBdv4",
            "Seated Dumbbell Shoulder Press works each shoulder/arm in isolation which helps address imbalances. You can also support your back using a bench, reducing the risk of injury and preventing cheating using bad form. What is the average Seated Dumbbell Shoulder Press? The average Seated Dumbbell Shoulder Press weight for a male lifter is 31 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Seated Dumbbell Shoulder Press? Male beginners should aim to lift 13 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Shoulders"
        ),
        Exercise(
            0,
            "Neck Curl ",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fneck%20curl%2Fneck-curl-1000x1000.jpg?alt=media&token=3a14dd26-ccc5-4a7e-8112-17fae3432f28"),
            "rhMh_d05fao",
            "What is the average Neck Curl? The average Neck Curl weight for a male lifter is 37 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Neck Curl? Male beginners should aim to lift 1 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Shoulders"
        ),
        Exercise(
            0,
            "Dumbbell Upright Row",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fdumbbell%20upright%20row%2Fdumbbell-upright-row-1000x1000.jpg?alt=media&token=1cda56cd-00b2-427a-bf2d-8269bdddba62"),
            "-zeWhNPEfoc",
            "What is the average Dumbbell Upright Row? The average Dumbbell Upright Row weight for a male lifter is 26 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Dumbbell Upright Row? Male beginners should aim to lift 5 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Shoulders"
        ),
        Exercise(
            0,
            "Barbell Front Raise",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fbarbell%20front%20raise%2Fbarbell-front-raise-1000x1000.jpg?alt=media&token=59772faf-81ea-42b8-a49c-0b8e364523aa"),
            "u9fXtdxZtF4",
            "What is the average Barbell Front Raise? The average Barbell Front Raise weight for a male lifter is 38 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Barbell Front Raise? Male beginners should aim to lift 3 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Shoulders"
        ),
        Exercise(
            0,
            "Behind The Neck Press",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fbehind%20the%20neck%20press%2Fbehind-the-neck-press-1000x1000.jpg?alt=media&token=1d524a91-d575-4ba7-ac86-c36826e18d99"),
            "xL3qmUG0b_A",
            "What is the average Behind The Neck Press? The average Behind The Neck Press weight for a male lifter is 65 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Behind The Neck Press? Male beginners should aim to lift 23 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Shoulders"
        ),
        Exercise(
            0,
            "Handstand Push Ups",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fhandstand%20push%20ups%2Fhandstand-push-ups-1000x1000.jpg?alt=media&token=e0ecdaa2-fa51-4689-a440-2f8709ffcc75"),
            "kJnsOWIA1SM",
            "How many reps of Handstand Push Ups can the average lifter do? The average male lifter can do 12 reps of Handstand Push Ups. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Shoulders"
        ),
        Exercise(
            0,
            "Log Press",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Flog%20press%2Flog-press-1000x1000.jpg?alt=media&token=b4cc1b79-4bc1-444e-b0ad-956c00011f0e"),
            "",
            "What is the average Log Press? The average Log Press weight for a male lifter is 97 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Log Press? Male beginners should aim to lift 44 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Shoulders"
        ),
        Exercise(
            0,
            "Machine Lateral Raise",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fmachine%20lateral%20raise%2Fmachine-lateral-raise-1000x1000.jpg?alt=media&token=ebb4ecfa-9464-47b6-9ae0-fb4edc63f03a"),
            "xMEs3zEzS8s",
            "What is the average Machine Lateral Raise? The average Machine Lateral Raise weight for a male lifter is 57 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Machine Lateral Raise? Male beginners should aim to lift 15 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Shoulders"
        ),
        Exercise(
            0,
            "Landmine Press",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Flandmine%20press%2Flandmine-press-1000x1000.jpg?alt=media&token=484ccb4a-7ee5-48fc-b798-32607fd4aa34"),
            "Y8_gWLQGkvY",
            "What is the average Landmine Press? The average Landmine Press weight for a male lifter is 58 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Landmine Press? Male beginners should aim to lift 18 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Shoulders"
        ),
        Exercise(
            0,
            "Neck Extension",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fneck%20extemsion%2Fneck-extension-1000x1000.jpg?alt=media&token=b0769cd4-b34c-41b7-ab14-3ad05729e00d"),
            "jg3Q7bkabu4",
            "What is the average Neck Extension? The average Neck Extension weight for a male lifter is 39 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Neck Extension? Male beginners should aim to lift 2 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Shoulders"
        ),
        Exercise(
            0,
            "Z Press",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fz%20press%2Fz-press-1000x1000.jpg?alt=media&token=499d95a2-d989-4e2e-903c-f0209d2cfe85"),
            "cp__wvXJcDQ",
            "What is the average Z Press? The average Z Press weight for a male lifter is 58 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Z Press? Male beginners should aim to lift 26 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Shoulders"
        ),
        Exercise(
            0,
            "Viking Press",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fviking%20press%2Fviking-press-1000x1000.jpg?alt=media&token=5df7d415-b63b-47e0-91ad-d84f5f2bae78"),
            "DVSiHNI81UA",
            "What is the average Viking Press? The average Viking Press weight for a male lifter is 109 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Viking Press? Male beginners should aim to lift 33 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Shoulders"
        ),
        Exercise(
            0,
            "Shoulder Pin Press",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fshoulder%20pin%20press%2Fshoulder-pin-press-1000x1000.jpg?alt=media&token=f0c2107f-e78c-4005-a85a-99360196019d"),
            "",
            "What is the average Shoulder Pin Press? The average Shoulder Pin Press weight for a male lifter is 67 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Shoulder Pin Press? Male beginners should aim to lift 30 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Shoulders"
        ),
        Exercise(
            0,
            "Dumbbell Z Press",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fdumbbell%20z%20press%2Fdumbbell-z-press-1000x1000.jpg?alt=media&token=7e417971-24c2-4228-856b-3667c4aebad2"),
            "LYLlIFRh0F8",
            "What is the average Dumbbell Z Press? The average Dumbbell Z Press weight for a male lifter is 28 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Dumbbell Z Press? Male beginners should aim to lift 9 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Shoulders"
        ),
        Exercise(
            0,
            "Dumbbell External Rotation",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fdumbbell%20external%20rotation%2Fdumbbell-external-rotation-1000x1000.jpg?alt=media&token=692f6789-57fc-41ed-9e9a-391cef32f45c"),
            "BJepHlhbbmg",
            "What is the average Dumbbell External Rotation? The average Dumbbell External Rotation weight for a male lifter is 17 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Dumbbell External Rotation? Male beginners should aim to lift 4 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Shoulders"
        ),
        Exercise(
            0,
            "Dumbbell Push Press",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fdumbbell%20push%20press%2Fdumbbell-push-press-1000x1000.jpg?alt=media&token=a6b5fd50-d41b-4c40-9d2b-e30b1e3761bd"),
            "oGw5Udj0uTo",
            "What is the average Dumbbell Push Press? The average Dumbbell Push Press weight for a male lifter is 32 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Dumbbell Push Press? Male beginners should aim to lift 10 kg (1RM) which is still impressive compared to the general population",
            52,
            "Shoulders"
        ),
        Exercise(
            0,
            "Dumbbell Face Pull",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fdumbbell%20face%20pull%2Fdumbbell-face-pull-1000x1000.jpg?alt=media&token=274ac15f-d21d-4f54-ab92-ca5898112134"),
            "EV0qi179Ba8",
            "What is the average Dumbbell Face Pull? The average Dumbbell Face Pull weight for a male lifter is 21 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Dumbbell Face Pull? Male beginners should aim to lift 5 kg (1RM) which is still impressive compared to the general population",
            52,
            "Shoulders"
        ),
        Exercise(
            0,
            "One Arm Landmine Press",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fone%20arm%20landmine%20press%2Fone-arm-landmine-press-1000x1000.jpg?alt=media&token=8679de56-599a-4194-b50e-8988521d1ceb"),
            "Y8_gWLQGkvY",
            "What is the average One Arm Landmine Press? The average One Arm Landmine Press weight for a male lifter is 27 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good One Arm Landmine Press? Male beginners should aim to lift 9 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Shoulders"
        ),
        Exercise(
            0,
            "Pike Push Up",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fpike%20push%20up%2Fpike-push-up-1000x1000.jpg?alt=media&token=dab3b480-9d2c-4b2f-9d07-24ddb392c7e4"),
            "XckEEwa1BPI",
            "How many reps of Pike Push Up can the average lifter do? The average male lifter can do 19 reps of Pike Push Up. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Shoulders"
        ),
        Exercise(
            0,
            "Cable External Rotation",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/shoulders%2Fcable%20external%20rotation%2Fcable-external-rotation-1000x1000.jpg?alt=media&token=18bb0092-b4e0-425e-aa68-451265fb8f32"),
            "gOU1npAJTro",
            "What is the average Cable External Rotation? The average Cable External Rotation weight for a male lifter is 19 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Cable External Rotation? Male beginners should aim to lift 2 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Shoulders"
        ),

        //Core---------------

        Exercise(
            0,
            "Sit Ups ",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/core%2Fsit%20ups%2Fsit-ups-1-1000x1000%20(1).jpg?alt=media&token=cdc27d06-f2c6-4dad-b9ad-af30069f5828",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/core%2Fsit%20ups%2Fsit-ups-2-1000x1000.jpg?alt=media&token=0efa585d-52e1-44b2-ae15-e7af6b384867",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/core%2Fsit%20ups%2Fsit-ups-1-1000x1000%20(1).jpg?alt=media&token=cdc27d06-f2c6-4dad-b9ad-af30069f5828"
            ),
            "f9Yi_74xF_c",
            "Sit Ups work your core through a large range of motion providing a good workout in one exercise, covering your core and part of your hips. How many reps of Sit Ups can the average lifter do? The average male lifter can do 60 reps of Sit Ups. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Core"
        ),
        Exercise(
            0,
            "Cable Crunch",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/core%2Fcable%20crunch%2Fcable-crunch-1000x1000.jpg?alt=media&token=9518c4df-9c91-4d32-9752-59420e90e96a"),
            "2ndlUfl5JPo",
            "What is the average Cable Crunch? The average Cable Crunch weight for a male lifter is 77 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Cable Crunch? Male beginners should aim to lift 18 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Core"
        ),
        Exercise(
            0,
            "Crunches ",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/core%2Fcrunches%2Fcrunches-1-1000x1000%20(1).jpg?alt=media&token=c0812f5b-93d8-4d8e-9aa4-fe6d2c32c482",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/core%2Fcrunches%2Fcrunches-2-1000x1000.jpg?alt=media&token=d5e30335-b842-446a-b139-e8f5df2a5095",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/core%2Fcrunches%2Fcrunches-1-1000x1000%20(1).jpg?alt=media&token=c0812f5b-93d8-4d8e-9aa4-fe6d2c32c482"
            ),
            "wVDdmq6fekE",
            "Crunches are an easy classic way for developing your abs How many reps of Crunches can the average lifter do? The average male lifter can do 55 reps of Crunches. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Core"
        ),
        Exercise(
            0,
            "Dumbbell Side Bend",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/core%2Fdumbbell%20side%20bend%2Fdumbbell-side-bend-1000x1000.jpg?alt=media&token=5f21a3fa-906e-44b0-81c8-54c74047f807"),
            "zdH0ZzNOECc",
            "What is the average Dumbbell Side Bend? The average Dumbbell Side Bend weight for a male lifter is 37 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Dumbbell Side Bend? Male beginners should aim to lift 4 kg (1RM) which is still impressive compared to the general population",
            52,
            "Core"
        ),
        Exercise(
            0,
            "Cable Woodchopper",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/core%2Fcable%20woodchopper%2Fcable-woodchopper-1000x1000.jpg?alt=media&token=c519e65d-4272-4d13-94cb-cbe190496403"),
            "c880lqjLJX4",
            "What is the average Cable Woodchopper? The average Cable Woodchopper weight for a male lifter is 40 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Cable Woodchopper? Male beginners should aim to lift 7 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Core"
        ),
        Exercise(
            0,
            "Hanging Leg Raise",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/core%2Fhanging%20leg%20rise%2Fhanging-leg-raise-1000x1000.jpg?alt=media&token=2121d32e-6a06-48a3-8f3a-4d873509fde6"),
            "rFE2T5CumXs",
            "How many reps of Hanging Leg Raise can the average lifter do? The average male lifter can do 18 reps of Hanging Leg Raise. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Core"
        ),
        Exercise(
            0,
            "Russian Twist",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/core%2Frussian%20twist%2Frussian-twist-1000x1000.jpg?alt=media&token=85b30a6b-a652-489d-8846-82ddb0d2974e"),
            "7SNgCmafDRk",
            "How many reps of Russian Twist can the average lifter do? The average male lifter can do 45 reps of Russian Twist. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Core"
        ),
        Exercise(
            0,
            "Lying Leg Raise",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/core%2Flying%20leg%20raise%2Flying-leg-raise-1000x1000.jpg?alt=media&token=af3182c9-db14-4887-915b-0f31c5466cbe"),
            "VzmVHRo6gzk",
            "How many reps of Lying Leg Raise can the average lifter do? The average male lifter can do 33 reps of Lying Leg Raise. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Core"
        ),
        Exercise(
            0,
            "Ab Wheel Rollout ",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/core%2Fabb%20wheel%20rollout%2Fab-wheel-rollout-1000x1000.jpg?alt=media&token=4e28b687-3cde-4324-a076-fe4a94cfe1dd"),
            "D0bmQUzrIqs",
            "How many reps of Ab Wheel Rollout can the average lifter do? The average male lifter can do 21 reps of Ab Wheel Rollout. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Core"
        ),
        Exercise(
            0,
            "Toes To Bar",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/core%2Ftoes%20to%20bar%2Ftoes-to-bar-1000x1000.jpg?alt=media&token=9704e407-9959-4a5a-8692-930387dd66a5"),
            "dIp1GMj2S6A",
            "How many reps of Toes To Bar can the average lifter do? The average male lifter can do 16 reps of Toes To Bar. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Core"
        ),
        Exercise(
            0,
            "Scissor Kicks",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/core%2Fscissor%20kicks%2Fscissor-kicks-1000x1000.jpg?alt=media&token=df043757-0181-4571-a3a2-a54d7e2c58fa"),
            "DP9gjA82WdY",
            "How many reps of Scissor Kicks can the average lifter do? The average male lifter can do 35 reps of Scissor Kicks. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Core"
        ),
        Exercise(
            0,
            "Hanging Knee Raise",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/core%2Fhanging%20knee%20raise%2Fhanging-knee-raise-1000x1000.jpg?alt=media&token=e7435b18-d76c-4c36-9339-42c737f3808f"),
            "B3nDnw_GJgc",
            "How many reps of Hanging Knee Raise can the average lifter do? The average male lifter can do 20 reps of Hanging Knee Raise. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Core"
        ),
        Exercise(
            0,
            "Decline Sit Up",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/core%2Fdecline%20sit%20up%2Fdecline-sit-up-1000x1000.jpg?alt=media&token=19950a7f-298f-4c6e-8255-87a894466d81"),
            "1rSEUpLYpYU",
            "How many reps of Decline Sit Up can the average lifter do? The average male lifter can do 37 reps of Decline Sit Up. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Core"
        ),
        Exercise(
            0,
            "Decline Crunch",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/core%2Fdecline%20crunch%2Fdecline-crunch-1000x1000.jpg?alt=media&token=15c91dad-2f11-4f80-b705-6ba9366479a3"),
            "H3driyimm0k",
            "How many reps of Decline Crunch can the average lifter do? The average male lifter can do 29 reps of Decline Crunch. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Core"
        ),
        Exercise(
            0,
            "Jumping Jack",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/core%2Fjumoing%20jack%2Fjumping-jack-1000x1000.jpg?alt=media&token=593b8872-f8ad-40c9-bbad-22c5bd87ace5"),
            "R_pczc0y1TI",
            "How many reps of Jumping Jack can the average lifter do? The average male lifter can do 87 reps of Jumping Jack. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Core"
        ),
        Exercise(
            0,
            "Bicycle Crunch",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/core%2Fbicycle%20crunch%2Fbicycle-crunch-1000x1000.jpg?alt=media&token=40d9f1ea-840f-438f-b56e-aff5abf49f68"),
            "LFSU9Jsv7Bk",
            "How many reps of Bicycle Crunch can the average lifter do? The average male lifter can do 42 reps of Bicycle Crunch. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Core"
        ),
        Exercise(
            0,
            "Flutter Kicks",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/core%2Fflutter%20kicks%2Fflutter-kicks-1000x1000.jpg?alt=media&token=bac4a246-9e3c-42ea-92cd-e67fd24535db"),
            "wgq78rYko-M",
            "How many reps of Flutter Kicks can the average lifter do? The average male lifter can do 73 reps of Flutter Kicks. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Core"
        ),
        Exercise(
            0,
            "Mountain Climbers",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/core%2Fmountain%20climbers%2Fmountain-climbers-1000x1000.jpg?alt=media&token=0b1b2192-f7d8-46a8-888a-c5e64e40882d"),
            "DnB85HkfEMM",
            "How many reps of Mountain Climbers can the average lifter do? The average male lifter can do 42 reps of Mountain Climbers. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Core"
        ),
        Exercise(
            0,
            "High Pulley Crunch",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/core%2Fhigh%20pulley%20crunch%2Fhigh-pulley-crunch-1000x1000.jpg?alt=media&token=e898d419-8341-4b73-b725-67658cf70d98"),
            "gQT76pz_X9Y",
            "What is the average High Pulley Crunch? The average High Pulley Crunch weight for a male lifter is 62 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good High Pulley Crunch? Male beginners should aim to lift 26 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Core"
        ),
        Exercise(
            0,
            "Superman",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/core%2Fsuperman%2Fsuperman-1000x1000.jpg?alt=media&token=c10017c0-2b30-45c0-94a0-51c05b148f86"),
            "7CUTJ1naz5U",
            "How many reps of Superman can the average lifter do? The average male lifter can do 28 reps of Superman. This makes you Intermediate on Strength Level and is a very impressive achievement",
            52,
            "Core"
        ),
        Exercise(
            0,
            "Roman Chair Side Bend",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/core%2Froman%20chair%20side%20bend%2Froman-chair-side-bend-1000x1000.jpg?alt=media&token=d6cfa6b0-e9d5-4cd6-b57e-0d318521297e"),
            "Pn2030IzFB8",
            "How many reps of Roman Chair Side Bend can the average lifter do? The average male lifter can do 28 reps of Roman Chair Side Bend. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Core"
        ),
        Exercise(
            0,
            "Standing Cable Crunch",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/core%2Fstanding%20cable%20crunch%2Fstanding-cable-crunch-1000x1000.jpg?alt=media&token=ce77f489-c72c-4327-bae1-8c9147f84710"),
            "WoQyx5AL_LA",
            "What is the average Standing Cable Crunch? The average Standing Cable Crunch weight for a male lifter is 78 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Standing Cable Crunch? Male beginners should aim to lift 22 kg (1RM) which is still impressive compared to the general population",
            52,
            "Core"
        ),
        Exercise(
            0,
            "Side Crunch",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/core%2Fside%20crunch%2Fside-crunch-1000x1000.jpg?alt=media&token=00547dfb-8eba-41ea-a7d6-7e76bf3d1b92"),
            "wi6YprZOBjs",
            "How many reps of Side Crunch can the average lifter do? The average male lifter can do 47 reps of Side Crunch. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Core"
        ),

        //Full body-------

        Exercise(
            0,
            "Deadlift",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fdeadlift%2Fdeadlift-1-1000x1000%20(1).jpg?alt=media&token=577182d0-8621-403d-b52e-5166c6dc07b0",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fdeadlift%2Fdeadlift-2-1000x1000.jpg?alt=media&token=a1a35ff8-1be1-4703-9f5a-6e53812f2a88",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fdeadlift%2Fdeadlift-1-1000x1000%20(1).jpg?alt=media&token=577182d0-8621-403d-b52e-5166c6dc07b0"
            ),
            "Ts1_AynZSTE",
            "Deadlift is a fundamental hip hinge exercise to develop the ability to lift a heavy weight off the ground. Performing deadlifts increases whole body strength, confidence and can increase testosterone levels in the body. What is the average Deadlift? The average Deadlift weight for a male lifter is 152 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Deadlift? Male beginners should aim to lift 78 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Power Clean",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fpower%20clean%2Fpower-clean-1-1000x1000.jpg?alt=media&token=48348241-beb6-4bcd-ab0f-887a853b48cf",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fpower%20clean%2Fpower-clean-2-1000x1000.jpg?alt=media&token=1f564811-9a28-4665-9d7d-073e06e825f9",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fpower%20clean%2Fpower-clean-3-1000x1000.jpg?alt=media&token=135bbe85-caf9-4e38-857c-15b5727404a4",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fpower%20clean%2Fpower-clean-4-1000x1000.jpg?alt=media&token=219a1d3c-db76-428e-b423-80492d1cf4a8"
            ),
            "EFDWZbVxMKM",
            "Power Clean develops serious sport-specific power and helps you become a better athlete by developing your posterior chain. What is the average Power Clean? The average Power Clean weight for a male lifter is 92 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Power Clean? Male beginners should aim to lift 46 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Hex Bar Deadlift",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fhex%20bar%20deadlift%2Fhex-bar-deadlift-1-1000x1000%20(1).jpg?alt=media&token=66e1c1b0-1cba-4ba4-aa82-483029c69dc9",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fhex%20bar%20deadlift%2Fhex-bar-deadlift-2-1000x1000.jpg?alt=media&token=9b106438-7a02-4edf-8c89-5aa4c5bfee89",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fhex%20bar%20deadlift%2Fhex-bar-deadlift-1-1000x1000%20(1).jpg?alt=media&token=66e1c1b0-1cba-4ba4-aa82-483029c69dc9"
            ),
            "bdVaD-U33dk",
            "Hex Bar Deadlift is a safer version of Deadlift that allows you to lift a similar weight completely vertically with neutral arms. It avoids the bar rubbing on your shins and focuses more on the front of the legs. What is the average Hex Bar Deadlift? The average Hex Bar Deadlift weight for a male lifter is 167 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Hex Bar Deadlift? Male beginners should aim to lift 91 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Sumo Deadlift",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fsumo%20deadlift%2Fsumo-deadlift-1-1000x1000%20(1).jpg?alt=media&token=1e69488f-7ce6-4cf9-9485-58b9a4ad2c12",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fsumo%20deadlift%2Fsumo-deadlift-1-1000x1000.jpg?alt=media&token=49765cf3-0727-4440-9c64-758225d92850",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fsumo%20deadlift%2Fsumo-deadlift-1-1000x1000%20(1).jpg?alt=media&token=1e69488f-7ce6-4cf9-9485-58b9a4ad2c12"
            ),
            "LH5YvPXuaUI",
            "Sumo Deadlift is a wide stance Deadlift that targets the thigh muscles to a greater extent. Depending on your body type, the wide stance can reduce the range of motion allowing you to lift more weight. What is the average Sumo Deadlift? The average Sumo Deadlift weight for a male lifter is 165 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Sumo Deadlift? Male beginners should aim to lift 87 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Romanian Deadlift ",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fromanian%20deadlift%2Fromanian-deadlift-1-1000x1000.jpg?alt=media&token=3d9e9b62-32a1-4d49-90f0-56eaf987e774",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fromanian%20deadlift%2Fromanian-deadlift-2-1000x1000%20(1).jpg?alt=media&token=07292bf6-e9d9-4517-8d88-42a6295049d6"
            ),
            "2bmuYtv4HbQ",
            "Romanian Deadlift focuses more on the posterior chain allowing you to develop the hamstrings/hips with lighter loads than conventional Deadlift. This makes it great for sports where you need to develop your posterior chain while avoiding injury. What is the average Romanian Deadlift? The average Romanian Deadlift weight for a male lifter is 120 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Romanian Deadlift? Male beginners should aim to lift 55 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Clean and Jerk",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fclean%20and%20jerk%2Fclean-and-jerk-1-1000x1000.jpg?alt=media&token=92ce8286-27fc-4c3c-ae33-7ce50b62fb7c",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fclean%20and%20jerk%2Fclean-and-jerk-2-1000x1000.jpg?alt=media&token=34312f97-f65d-43e8-83b8-a50b64b480c3",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fclean%20and%20jerk%2Fclean-and-jerk-3-1000x1000.jpg?alt=media&token=4d0ad1b9-38fa-4f1e-be7a-c2424b910513",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fclean%20and%20jerk%2Fclean-and-jerk-4-1000x1000.jpg?alt=media&token=9f35c296-34ad-4c89-a82a-278ba0ea2b82",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fclean%20and%20jerk%2Fclean-and-jerk-5-1000x1000.jpg?alt=media&token=b1700680-3264-45dd-a849-f91f5c7245f4",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fclean%20and%20jerk%2Fclean-and-jerk-6-1000x1000.jpg?alt=media&token=c8bdf462-6d0b-4b03-8c69-c96b601e5a8e",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fclean%20and%20jerk%2Fclean-and-jerk-7-1000x1000.jpg?alt=media&token=071c2c27-b417-4610-a89a-69866e3574cd"
            ),
            "SBIYhfoN8zc",
            "The Clean and Jerk is a complex multi-stage Olympic movement to lift the heaviest weight possible above your head using a barbell. What is the average Clean and Jerk? The average Clean and Jerk weight for a male lifter is 92 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Clean and Jerk? Male beginners should aim to lift 44 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Snatch ",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fsnatch%2Fsnatch-1-1000x1000.jpg?alt=media&token=71dc07bf-7908-4609-a6e9-6240db61a695",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fsnatch%2Fsnatch-2-1000x1000.jpg?alt=media&token=79c68766-44e2-47d5-a262-6869ce74d17a",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fsnatch%2Fsnatch-3-1000x1000.jpg?alt=media&token=24b23f96-6cc0-4305-8ef9-0bb74d10ff1e",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fsnatch%2Fsnatch-4-1000x1000.jpg?alt=media&token=9e0ab8de-7022-4b00-adcd-e1ef84ff8c27"
            ),
            "i1EKpyahAZI",
            "The Snatch is a complex Olympic movement that requires flexibility, coordination and strength. What is the average Snatch? The average Snatch weight for a male lifter is 76 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Snatch? Male beginners should aim to lift 35 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Clean",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fclean%2Fclean-1-1000x1000.jpg?alt=media&token=75dbfc6d-c16e-4c65-b34a-24228ec39448",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fclean%2Fclean-2-1000x1000.jpg?alt=media&token=b71f1750-0c92-44a9-ab4c-63854b3b84bb",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fclean%2Fclean-3-1000x1000.jpg?alt=media&token=034c0a2f-def9-4be0-8834-a5a5b3b9095d",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fclean%2Fclean-4-1000x1000.jpg?alt=media&token=bc82cb5c-e3db-4785-b528-bc7de3ad6d32"
            ),
            "A0_v4nDdmjQ",
            "The Clean is the strongest way to get a heavy weight to shoulder height and a fundamental movement in Olympic lifting. What is the average Clean? The average Clean weight for a male lifter is 94 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Clean? Male beginners should aim to lift 50 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Clean and Press",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fclean%20and%20press%2Fclean-and-press-1-1000x1000.jpg?alt=media&token=0e7ef8a5-4699-4278-ac25-e3067e0b2fa5",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fclean%20and%20press%2Fclean-and-press-2-1000x1000.jpg?alt=media&token=9c75e325-e217-49bc-981c-5bf0f3060bf3",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fclean%20and%20press%2Fclean-and-press-3-1000x1000.jpg?alt=media&token=b3bad498-95d1-4ac5-ac51-18577d8e0e9d",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fclean%20and%20press%2Fclean-and-press-4-1000x1000.jpg?alt=media&token=e5189177-b730-4cf6-9d05-a229307ca9b1"
            ),
            "x7PD0WfrZ8Q",
            "Clean and Press combines the advantages of Power Clean and Shoulder Press into a single workout busting movement that develops your posterior chain and shoulders. What is the average Clean and Press? The average Clean and Press weight for a male lifter is 80 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Clean and Press? Male beginners should aim to lift 36 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Rack Pull",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fpack%20pull%2Frack-pull-1000x1000.jpg?alt=media&token=ece94466-f861-48a2-828b-a7bfbd066948"),
            "jiF2sZx1PYk",
            "What is the average Rack Pull? The average Rack Pull weight for a male lifter is 190 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Rack Pull? Male beginners should aim to lift 93 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Dumbbell Romanian Deadlift",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fdumbbell%20romanian%20deadlift%2Fdumbbell-romanian-deadlift-1000x1000.jpg?alt=media&token=921f329b-042e-4d2e-b3e6-ab423e041f5a"),
            "7v3WMF1VDU4",
            "What is the average Dumbbell Romanian Deadlift? The average Dumbbell Romanian Deadlift weight for a male lifter is 41 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Dumbbell Romanian Deadlift? Male beginners should aim to lift 12 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Hang Clean",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fhang%20clean%2Fhang-clean-1000x1000.jpg?alt=media&token=e6026f12-79cf-4458-8fe5-357934342e57"),
            "LLFo2TxLOLo",
            "What is the average Hang Clean? The average Hang Clean weight for a male lifter is 86 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Hang Clean? Male beginners should aim to lift 45 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Stiff Leg Deadlift",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fstiff%20leg%20deadlift%2Fstiff-leg-deadlift-1000x1000.jpg?alt=media&token=d31c46b6-d128-41e0-9dfe-548b8d91adf1"),
            "fRIp2EYkAvQ",
            "What is the average Stiff Leg Deadlift? The average Stiff Leg Deadlift weight for a male lifter is 124 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Stiff Leg Deadlift? Male beginners should aim to lift 54 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Muscle Ups",
            listOf(
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fmuscle%20ups%2Fmuscle-ups-1-1000x1000%20(1).jpg?alt=media&token=e2f5e88b-4aa2-48b0-a40d-a1d28d6a1525",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fmuscle%20ups%2Fmuscle-ups-2-1000x1000.jpg?alt=media&token=65ed46c2-07fd-4e91-93b7-b395e654e34f",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fmuscle%20ups%2Fmuscle-ups-3-1000x1000.jpg?alt=media&token=4b779780-5030-4492-b544-b78bdb90797b",
                "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fmuscle%20ups%2Fmuscle-ups-1-1000x1000.jpg?alt=media&token=822c8a58-ac59-4535-b871-11e5cdec9b4a"
            ),
            "HgrawhIXcQI",
            "Muscles Ups are a challenging combination of Pull Ups and Dips, normally using momentum to allow you to raise yourself above the bar further than you would do with a Pull Up. How many reps of Muscle Ups can the average lifter do? The average male lifter can do 7 reps of Muscle Ups. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Thruster ",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fthruster%2Fthruster-1-1000x1000%20(1).jpg?alt=media&token=edbbc496-8ff7-409c-b9e8-1c5906b6a873",
            "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fthruster%2Fthruster-2-1000x1000.jpg?alt=media&token=608160e3-b714-458f-9c51-8de291ef610e",
            "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fthruster%2Fthruster-3-1000x1000.jpg?alt=media&token=dd79a944-eed2-4e07-889c-60e7e68eb8bb",
            "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fthruster%2Fthruster-1-1000x1000%20(1).jpg?alt=media&token=edbbc496-8ff7-409c-b9e8-1c5906b6a873"),
            "pXi8OuQcVxs",
            "Thrusters start from a full squat, increasing the contribution from the legs compared to a Push Press. What is the average Thruster? The average Thruster weight for a male lifter is 77 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Thruster? Male beginners should aim to lift 29 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Power Snatch",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fpower%20snatch%2Fpower-snatch-1000x1000.jpg?alt=media&token=804f0b61-cd3a-4c37-92d2-8cb7455272b0"),
            "i1EKpyahAZI",
            "What is the average Power Snatch? The average Power Snatch weight for a male lifter is 72 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Power Snatch? Male beginners should aim to lift 32 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Push Jerk",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fpush%20jerk%2Fpush-jerk-1-1000x1000%20(1).jpg?alt=media&token=3176b788-ef64-4c27-9423-38a4b8a62acf",
            "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fpush%20jerk%2Fpush-jerk-2-1000x1000.jpg?alt=media&token=a5b73142-94c8-43f8-95ad-30662131093d",
            "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fpush%20jerk%2Fpush-jerk-3-1000x1000.jpg?alt=media&token=866c2f4c-c151-4d44-b31b-34e2d46ed707",
            "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fpush%20jerk%2Fpush-jerk-4-1000x1000.jpg?alt=media&token=6d67d954-599c-4f36-941c-5e5b88dfb30e",
            "https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fpush%20jerk%2Fpush-jerk-1-1000x1000%20(1).jpg?alt=media&token=3176b788-ef64-4c27-9423-38a4b8a62acf"),
            "zHIK_7tO_-c",
            "Push Jerk allows you to lift more than a Push Press as you lower your body as you press instead of keeping straight, reducing the effort from the shoulders. What is the average Push Jerk? The average Push Jerk weight for a male lifter is 89 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Push Jerk? Male beginners should aim to lift 42 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Dumbbell Deadlift",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fdumbbell%20deadlift%2Fdumbbell-deadlift-1000x1000.jpg?alt=media&token=89e834cd-d0fa-4e7a-9580-3657132b2e36"),
            "YoWv3T4IGwc",
            "What is the average Dumbbell Deadlift? The average Dumbbell Deadlift weight for a male lifter is 44 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Dumbbell Deadlift? Male beginners should aim to lift 13 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Deficit Deadlift",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fdeficit%20deadlift%2Fdeficit-deadlift-1000x1000.jpg?alt=media&token=e287d02a-0ea2-4cc1-b7ea-2dda0b8f54ab"),
            "b_uwLgvm6P0",
            "What is the average Deficit Deadlift? The average Deficit Deadlift weight for a male lifter is 166 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Deficit Deadlift? Male beginners should aim to lift 90 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Single Leg Romanian Deadlift",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fsingle%20leg%20romanian%20deadlift%2Fsingle-leg-romanian-deadlift-1000x1000.jpg?alt=media&token=7d426563-160e-4bf9-ad65-9447ed20ec6f"),
            "pJewPISyHjw",
            "What is the average Single Leg Romanian Deadlift? The average Single Leg Romanian Deadlift weight for a male lifter is 53 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Single Leg Romanian Deadlift? Male beginners should aim to lift 6 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Split Jerk",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fsplit%20jerk%2Fsplit-jerk-1000x1000.jpg?alt=media&token=0e6d8f85-5ef8-42e4-82ce-f4c8d01b883a"),
            "TGHdmx7GThs",
            "What is the average Split Jerk? The average Split Jerk weight for a male lifter is 94 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Split Jerk? Male beginners should aim to lift 49 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Clean High Pull ",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fclean%20high%20pull%2Fclean-high-pull-1000x1000.jpg?alt=media&token=2622e905-1c41-4a12-8320-74762acc75ee"),
            "h-IVRKEu48s",
            "What is the average Clean High Pull? The average Clean High Pull weight for a male lifter is 86 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Clean High Pull? Male beginners should aim to lift 31 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Hang Power Clean",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fhang%20power%20clean%2Fhang-power-clean-1000x1000.jpg?alt=media&token=f94d35f2-205c-4018-ab7a-9c2b8aa1c286"),
            "5xVcZOPywNI",
            "What is the average Hang Power Clean? The average Hang Power Clean weight for a male lifter is 84 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Hang Power Clean? Male beginners should aim to lift 42 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Snatch Deadlift",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fsnatch%20deadlift%2Fsnatch-deadlift-1000x1000.jpg?alt=media&token=305cd859-9da1-49ce-abcf-90b3b5a2db4a"),
            "",
            "What is the average Snatch Deadlift? The average Snatch Deadlift weight for a male lifter is 144 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Snatch Deadlift? Male beginners should aim to lift 72 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Clean Pull",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fclean%20pull%2Fclean-pull-1000x1000.jpg?alt=media&token=deaaef39-85a4-4638-a45f-a8b38adb31c8"),
            "dhY4CIAaAXM",
            "What is the average Clean Pull? The average Clean Pull weight for a male lifter is 106 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Clean Pull? Male beginners should aim to lift 40 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Burpees",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fburpies%2Fburpees-1000x1000.jpg?alt=media&token=1483adae-eda0-48b0-95bb-a7cd8f82bc15"),
            "fx-oEm1M5Z0",
            "How many reps of Burpees can the average lifter do? The average male lifter can do 36 reps of Burpees. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Dumbbell Snatch",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fdumbbell%20snatch%2Fdumbbell-snatch-1000x1000.jpg?alt=media&token=a641a9cd-9ddf-47dc-9931-bc29a5e97641"),
            "xA_DpewzL7c",
            "What is the average Dumbbell Snatch? The average Dumbbell Snatch weight for a male lifter is 35 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Dumbbell Snatch? Male beginners should aim to lift 11 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Pause Deadlift",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fpause%20deadlift%2Fpause-deadlift-1000x1000.jpg?alt=media&token=55b5ec0e-c89a-4397-b797-2ff48b7c8b5f"),
            "NWUAx0XH50k",
            "What is the average Pause Deadlift? The average Pause Deadlift weight for a male lifter is 165 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Pause Deadlift? Male beginners should aim to lift 93 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Jefferson Deadlift",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fjefferson%20deadlift%2Fjefferson-deadlift-1000x1000.jpg?alt=media&token=38804312-3724-42fb-ad29-afd23eb086ec"),
            "wcfgi6fpLAg",
            "What is the average Jefferson Deadlift? The average Jefferson Deadlift weight for a male lifter is 155 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Jefferson Deadlift? Male beginners should aim to lift 65 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Muscle Snatch",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fmuscle%20snatch%2Fmuscle-snatch-1000x1000.jpg?alt=media&token=32eb1ef3-bbef-4de9-b7b4-c7ade6073c17"),
            "Q8vZOhTngiQ",
            "What is the average Muscle Snatch? The average Muscle Snatch weight for a male lifter is 67 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Muscle Snatch? Male beginners should aim to lift 23 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Snatch Pull",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fsnatch%20pull%2Fsnatch-pull-1000x1000.jpg?alt=media&token=894697f4-733a-4b64-8c26-217fc6eda1e6"),
            "2UNdh3ZrrpE",
            "What is the average Snatch Pull? The average Snatch Pull weight for a male lifter is 81 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Snatch Pull? Male beginners should aim to lift 40 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Wall Ball",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fwall%20ball%2Fwall-ball-1000x1000.jpg?alt=media&token=3af7c47f-3438-408b-b67d-4943fb9483ce"),
            "ZRO2yxaibc0",
            "What is the average Wall Ball? The average Wall Ball weight for a male lifter is 20 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Wall Ball? Male beginners should aim to lift 5 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Single Leg Dumbbell Deadlift",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fsingle%20leg%20dumbbell%20deadlift%2Fsingle-leg-dumbbell-deadlift-1000x1000.jpg?alt=media&token=a18de87f-abd7-4561-8be1-3732fd540153"),
            "HEqKtXTOKXc",
            "What is the average Single Leg Dumbbell Deadlift? The average Single Leg Dumbbell Deadlift weight for a male lifter is 39 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Single Leg Dumbbell Deadlift? Male beginners should aim to lift 13 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Dumbbell Clean and Press",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fdumbbell%20clean%20and%20press%2Fdumbbell-clean-and-press-1000x1000.jpg?alt=media&token=f8896061-ec75-4557-a24b-2642b56cadf0"),
            "2L2T3XT1h4Y",
            "What is the average Dumbbell Clean and Press? The average Dumbbell Clean and Press weight for a male lifter is 30 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Dumbbell Clean and Press? Male beginners should aim to lift 12 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Ring Muscle Ups",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fring%20muscle%20ups%2Fring-muscle-ups-1000x1000.jpg?alt=media&token=23b005fd-ca69-444c-bed4-a2ea40940186"),
            "",
            "How many reps of Ring Muscle Ups can the average lifter do? The average male lifter can do 8 reps of Ring Muscle Ups. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Dumbbell High Pull",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fdumbbell%20high%20pulls%2Fdumbbell-high-pull-1000x1000.jpg?alt=media&token=2b9d8bfc-4825-4048-83f1-db4cc7ede4b4"),
            "yOhnPEl57x4",
            "What is the average Dumbbell High Pull? The average Dumbbell High Pull weight for a male lifter is 28 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Dumbbell High Pull? Male beginners should aim to lift 9 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Dumbbell Thruster",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fdumbbell%20thruster%2Fdumbbell-thruster-1000x1000.jpg?alt=media&token=ab2537f8-6322-4b32-a2d2-17a3f97f1d38"),
            "sLIswEpOHng",
            "What is the average Dumbbell Thruster? The average Dumbbell Thruster weight for a male lifter is 30 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Dumbbell Thruster? Male beginners should aim to lift 12 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Dumbbell Hang Clean",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fdumbbell%20hang%20clean%2Fdumbbell-hang-clean-1000x1000.jpg?alt=media&token=8f22102d-7337-41ed-8b73-26ca2cfed46e"),
            "eqWXWX7O4DI",
            "What is the average Dumbbell Hang Clean? The average Dumbbell Hang Clean weight for a male lifter is 32 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Dumbbell Hang Clean? Male beginners should aim to lift 11 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Hang Snatch",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fhang%20snatch%2Fhang-snatch-1000x1000.jpg?alt=media&token=ee842df0-ad57-4fb8-b56a-2e00fd297154"),
            "8HLVc0vP-a8",
            "What is the average Hang Snatch? The average Hang Snatch weight for a male lifter is 80 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Hang Snatch? Male beginners should aim to lift 39 kg (1RM) which is still impressive compared to the general population",
            52,
            "Full Body"
        ),
        Exercise(
            0,
            "Squat Thrust ",
            listOf("https://firebasestorage.googleapis.com/v0/b/gtrain-197b9.appspot.com/o/full%2Fsquat%20thrust%2Fsquat-thrust-1000x1000.jpg?alt=media&token=72edde9b-e8ab-4a43-af04-171e89bf3a87"),
            "VyVqvmUofvA",
            "How many reps of Squat Thrust can the average lifter do? The average male lifter can do 30 reps of Squat Thrust. This makes you Intermediate on Strength Level and is a very impressive achievement.",
            52,
            "Full Body"
        ),
        )

}

