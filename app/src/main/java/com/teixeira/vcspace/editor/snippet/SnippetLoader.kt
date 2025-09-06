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

package com.simple.codeeditor.editor.snippet

import com.google.gson.Gson
import com.simple.codeeditor.extensions.toFile

object SnippetLoader {
    @JvmStatic
    fun loadSnippets(filePath: String): List<Snippet> {
        val file = filePath.toFile()
        if (!file.exists()) return emptyList()

        val snippetFile = Gson().fromJson(file.readText(), SnippetFile::class.java)
        return snippetFile.snippets
    }
}