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
            "",
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
            "",
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
            "",
            "What is the average Lying Cable Curl? The average Lying Cable Curl weight for a male lifter is 54 kg (1RM). This makes you Intermediate on Strength Level and is a very impressive lift.\n" +
                    "\n" +
                    "What is a good Lying Cable Curl? Male beginners should aim to lift 13 kg (1RM) which is still impressive compared to the general population.",
            52,
            "Biceps"
        )

    )

}

