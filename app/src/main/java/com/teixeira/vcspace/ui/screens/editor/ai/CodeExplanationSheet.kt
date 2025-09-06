/*
 * This file is part of Simple Code Editor.
 *
 * Simple Code Editor is free software: you can redistribute it and/or modify it under the terms of
 * the GNU General Public License as published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 *
 * Simple Code Editor is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with Simple Code Editor.
 * If not, see <https://www.gnu.org/licenses/>.
 */

package com.simple.codeeditor.ui.screens.editor.ai

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.google.ai.client.generativeai.type.GenerateContentResponse
import com.simple.codeeditor.app.strings
import dev.jeziellago.compose.markdowntext.MarkdownText

@Composable
fun CodeExplanationSheet(
    response: GenerateContentResponse,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier
) {
    AiResponseSheet(
        title = stringResource(strings.code_explanation),
        response = response,
        onDismissRequest = onDismissRequest,
        modifier = modifier,
        subtitle = {
            MarkdownText(
                markdown = stringResource(strings.caution_code_explanation),
                style = TextStyle(
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Light,
                    color = MaterialTheme.colorScheme.error
                )
            )
        }
    )
}
