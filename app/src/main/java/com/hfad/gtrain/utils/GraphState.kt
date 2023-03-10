package com.hfad.gtrain.utils

enum class GraphState(val state: String, val description: String) {
    DisplayWeight("Weight Change", "Chart shows how your weights lifting strength progressed"),
    DisplayReps("Repetitions Change", "Chart shows how your lifting repetitions progressed"),
    DisplayPerformance("Overall Performance", "Chart shows your overall performance progress based on repetitions and weights")
}