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

package com.simple.codeeditor.extensions

fun doIf(condition: Boolean, action: () -> Unit) {
    if (condition) action()
}

fun doIfNotNull(value: Any?, action: () -> Unit) {
    if (value != null) action()
}

fun doIfNull(value: Any?, action: () -> Unit) {
    if (value == null) action()
}

infix fun String.makePluralIf(condition: Boolean): String {
    return "$this${if (condition) "s" else ""}"
}
