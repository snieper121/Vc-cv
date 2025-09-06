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

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.core.app.ActivityOptionsCompat
import com.simple.codeeditor.file.File
import java.io.File as JFile

fun <T> Context.open(clazz: Class<T>, newTask: Boolean = false) {
    val intent = Intent(this, clazz)
    if (newTask)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK

    startActivity(intent, getEmptyActivityBundle())
}

fun Context.getEmptyActivityBundle(): Bundle? {
    return ActivityOptionsCompat.makeCustomAnimation(
        this,
        android.R.anim.fade_in,
        android.R.anim.fade_out
    ).toBundle()
}

fun Context.openFile(file: File) {
    val uri = file.uri(this)
    val mimeType = contentResolver.getType(uri)

    Intent(Intent.ACTION_VIEW).apply {
        setDataAndType(uri, mimeType)
        addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
        startActivity(this)
    }
}

val Context.tmpDir: JFile
    get() {
        return JFile(filesDir.parentFile, "tmp").also {
            if (!it.exists()) {
                it.mkdirs()
            }
        }
    }

val Context.localDir: JFile
    get() {
        return JFile(filesDir.parentFile, "local").also {
            if (!it.exists()) {
                it.mkdirs()
            }
        }
    }

val Context.localBinDir: JFile
    get() {
        return JFile(filesDir.parentFile, "local/bin").also {
            if (!it.exists()) {
                it.mkdirs()
            }
        }
    }

val Context.localLibDir: JFile
    get() {
        return JFile(filesDir.parentFile, "local/lib").also {
            if (!it.exists()) {
                it.mkdirs()
            }
        }
    }

val Context.alpineDir: JFile
    get() {
        return JFile(localDir, "alpine").also {
            if (!it.exists()) {
                it.mkdirs()
            }
        }
    }
