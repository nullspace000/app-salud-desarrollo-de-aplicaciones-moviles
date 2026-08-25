package com.example.actividad2.data.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bedtime
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Medication
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.ui.graphics.vector.ImageVector

enum class DoseStatus {
    TAKEN,
    NOW,
    UPCOMING
}

/** One scheduled intake for today, as shown on the "Hoy" screen. */
data class MedicationDose(
    val id: String,
    val medicationName: String,
    val dosageLabel: String,
    val instructions: String,
    val time: String,
    val icon: ImageVector,
    val status: DoseStatus
)

object SampleDoses {
    val today = listOf(
        MedicationDose(
            id = "dose-paracetamol",
            medicationName = "Paracetamol",
            dosageLabel = "500mg",
            instructions = "Con desayuno",
            time = "08:00 AM",
            icon = Icons.Filled.CheckCircle,
            status = DoseStatus.TAKEN
        ),
        MedicationDose(
            id = "dose-ibuprofeno",
            medicationName = "Ibuprofeno",
            dosageLabel = "400mg",
            instructions = "Después de comer",
            time = "02:00 PM • Ahora",
            icon = Icons.Filled.Medication,
            status = DoseStatus.NOW
        ),
        MedicationDose(
            id = "dose-vitaminac",
            medicationName = "Vitamina C",
            dosageLabel = "1000mg",
            instructions = "Efervescente",
            time = "08:00 PM",
            icon = Icons.Filled.Schedule,
            status = DoseStatus.UPCOMING
        ),
        MedicationDose(
            id = "dose-melatonina",
            medicationName = "Melatonina",
            dosageLabel = "5mg",
            instructions = "Antes de dormir",
            time = "10:00 PM",
            icon = Icons.Filled.Bedtime,
            status = DoseStatus.UPCOMING
        )
    )
}
