package com.example.actividad2.data.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Healing
import androidx.compose.material.icons.filled.Medication
import androidx.compose.material.icons.filled.Opacity
import androidx.compose.material.icons.filled.Vaccines
import androidx.compose.ui.graphics.vector.ImageVector

/** A treatment the user has registered, as shown in "Mis Medicamentos". */
data class Medication(
    val id: String,
    val name: String,
    val dosageLabel: String,
    val purpose: String,
    val frequencyLabel: String,
    val icon: ImageVector,
    val tint: MedicationTint
)

/** Maps each medication to one of the container/icon color pairs used in the mockups. */
enum class MedicationTint {
    PRIMARY,
    SECONDARY,
    ERROR,
    TERTIARY
}

object SampleMedications {
    val all = listOf(
        Medication(
            id = "lisinopril",
            name = "Lisinopril",
            dosageLabel = "10mg",
            purpose = "Presión arterial",
            frequencyLabel = "Cada 24h",
            icon = Icons.Filled.Medication,
            tint = MedicationTint.PRIMARY
        ),
        Medication(
            id = "metformina",
            name = "Metformina",
            dosageLabel = "500mg",
            purpose = "Diabetes",
            frequencyLabel = "Con comidas",
            icon = Icons.Filled.Vaccines,
            tint = MedicationTint.SECONDARY
        ),
        Medication(
            id = "ibuprofeno",
            name = "Ibuprofeno",
            dosageLabel = "400mg",
            purpose = "Dolor",
            frequencyLabel = "Si hay dolor",
            icon = Icons.Filled.Healing,
            tint = MedicationTint.ERROR
        ),
        Medication(
            id = "vitaminaD3",
            name = "Vitamina D3",
            dosageLabel = "Gotas",
            purpose = "Suplemento",
            frequencyLabel = "Cada mañana",
            icon = Icons.Filled.Opacity,
            tint = MedicationTint.TERTIARY
        )
    )
}
