package com.simple.codeeditor.events

import com.simple.codeeditor.app.Folder
import com.simple.codeeditor.file.File

data class OnDeleteFileEvent(val file: File, val openedFolder: File)

data class OnCreateFileEvent(val file: File, val openedFolder: File)

data class OnCreateFolderEvent(val file: File, val openedFolder: File)

data class OnRefreshFolderEvent(val openedFolder: File)

data class OnRenameFileEvent(val oldFile: File, val newFile: File, val openedFolder: File)

data class OnOpenFolderEvent(val folder: Folder)
