package com.example.actividad2.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.actividad2.data.model.Medication
import com.example.actividad2.data.model.MedicationTint

@Composable
private fun MedicationTint.containerColor() = when (this) {
    MedicationTint.PRIMARY -> MaterialTheme.colorScheme.primaryContainer
    MedicationTint.SECONDARY -> MaterialTheme.colorScheme.secondaryContainer
    MedicationTint.ERROR -> MaterialTheme.colorScheme.errorContainer
    MedicationTint.TERTIARY -> MaterialTheme.colorScheme.tertiaryContainer
}

@Composable
private fun MedicationTint.onContainerColor() = when (this) {
    MedicationTint.PRIMARY -> MaterialTheme.colorScheme.onPrimaryContainer
    MedicationTint.SECONDARY -> MaterialTheme.colorScheme.onSecondaryContainer
    MedicationTint.ERROR -> MaterialTheme.colorScheme.onErrorContainer
    MedicationTint.TERTIARY -> MaterialTheme.colorScheme.onTertiaryContainer
}

@Composable
fun MedicationCard(medication: Medication, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceContainerLowest),
        elevation = CardDefaults.cardElevation(defaultElevation = 1.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .background(medication.tint.containerColor()),
                contentAlignment = Alignment.Center
            ) {
                Icon(medication.icon, contentDescription = null, tint = medication.tint.onContainerColor())
            }
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 16.dp)
            ) {
                Text(text = medication.name, style = MaterialTheme.typography.labelLarge.copy(fontSize = 16.sp))
                Text(
                    text = "${medication.dosageLabel} • ${medication.purpose}",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            Column(horizontalAlignment = Alignment.End) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(50))
                        .background(MaterialTheme.colorScheme.surfaceContainer)
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                ) {
                    Text(
                        text = medication.frequencyLabel,
                        style = MaterialTheme.typography.labelLarge.copy(fontSize = 11.sp),
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.outlineVariant
                )
            }
        }
    }
}
