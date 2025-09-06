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

package com.simple.codeeditor.ui.screens

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.simple.codeeditor.resources.R

sealed class PluginScreens(
    val route: String,
    val title: String,
    val icon: (@Composable () -> Unit)? = null
) {
    data object Installed : PluginScreens(
        route = "installed",
        title = "Installed",
        icon = {
            Icon(ImageVector.vectorResource(R.drawable.ic_download), contentDescription = null)
        }
    )
}