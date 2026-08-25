package com.example.actividad2.ui.screens.today

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.actividad2.R
import com.example.actividad2.data.model.DoseStatus
import com.example.actividad2.data.model.SampleDoses
import com.example.actividad2.ui.components.DailyProgressCard
import com.example.actividad2.ui.components.DoseListItem

@Composable
fun TodayScreen() {
    var doses by remember { mutableStateOf(SampleDoses.today) }
    val takenCount = doses.count { it.status == DoseStatus.TAKEN }

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = androidx.compose.foundation.layout.PaddingValues(20.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        item {
            Column {
                Text(
                    text = stringResource(R.string.today_greeting),
                    style = MaterialTheme.typography.headlineMedium
                )
                Text(
                    text = stringResource(R.string.today_subtitle),
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
        item {
            DailyProgressCard(
                taken = takenCount,
                total = doses.size,
                title = stringResource(R.string.today_progress_title),
                subtitle = stringResource(R.string.today_progress_subtitle)
            )
        }
        items(doses, key = { it.id }) { dose ->
            DoseListItem(
                dose = dose,
                onMarkTaken = {
                    doses = doses.map {
                        if (it.id == dose.id) it.copy(status = DoseStatus.TAKEN) else it
                    }
                }
            )
        }
    }
}
