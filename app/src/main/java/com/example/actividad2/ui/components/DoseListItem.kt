package com.example.actividad2.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.example.actividad2.R
import com.example.actividad2.data.model.DoseStatus
import com.example.actividad2.data.model.MedicationDose

/** A single scheduled dose row on the "Hoy" screen. */
@Composable
fun DoseListItem(dose: MedicationDose, onMarkTaken: () -> Unit) {
    val isTaken = dose.status == DoseStatus.TAKEN
    val isNow = dose.status == DoseStatus.NOW

    val iconBackground = when (dose.status) {
        DoseStatus.TAKEN -> MaterialTheme.colorScheme.secondaryContainer
        DoseStatus.NOW -> MaterialTheme.colorScheme.surfaceContainerHigh
        DoseStatus.UPCOMING -> MaterialTheme.colorScheme.surfaceContainer
    }
    val iconTint = when (dose.status) {
        DoseStatus.TAKEN -> MaterialTheme.colorScheme.onSecondaryContainer
        else -> MaterialTheme.colorScheme.onSurfaceVariant
    }
    val timeColor = if (isNow) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurfaceVariant

    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceContainerLowest),
        elevation = CardDefaults.cardElevation(defaultElevation = if (isNow) 3.dp else 1.dp)
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
                    .background(iconBackground),
                contentAlignment = Alignment.Center
            ) {
                Icon(dose.icon, contentDescription = null, tint = iconTint)
            }
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 16.dp)
            ) {
                Text(
                    text = dose.time,
                    style = MaterialTheme.typography.labelLarge,
                    color = timeColor
                )
                Text(
                    text = dose.medicationName,
                    style = MaterialTheme.typography.titleLarge,
                    textDecoration = if (isTaken) TextDecoration.LineThrough else TextDecoration.None
                )
                Text(
                    text = "${dose.dosageLabel} • ${dose.instructions}",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            if (isNow) {
                Button(
                    onClick = onMarkTaken,
                    shape = RoundedCornerShape(50),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.primary,
                        contentColor = MaterialTheme.colorScheme.onPrimary
                    )
                ) {
                    Text(
                        text = stringResource(R.string.today_mark_taken),
                        style = MaterialTheme.typography.labelLarge
                    )
                }
            }
        }
    }
}
