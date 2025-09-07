package com.simple.codeeditor.dialogs

import android.content.Context
import android.content.DialogInterface
import android.view.LayoutInflater
import androidx.annotation.StringRes
import androidx.appcompat.app.AlertDialog
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.simple.codeeditor.resources.databinding.LayoutProgressDialogBinding

class ProgressDialogBuilder(val context: Context) {

    private val binding = LayoutProgressDialogBinding.inflate(LayoutInflater.from(context))
    private val _builder = MaterialAlertDialogBuilder(context).setView(binding.root)

    val builder: MaterialAlertDialogBuilder
        get() = _builder

    fun setPositiveButton(text: String, listener: DialogInterface.OnClickListener) = apply {
        _builder.setPositiveButton(text, listener)
    }

    fun setPositiveButton(@StringRes text: Int, listener: DialogInterface.OnClickListener) = apply {
        _builder.setPositiveButton(text, listener)
    }

    fun setNegativeButton(text: String, listener: DialogInterface.OnClickListener) = apply {
        _builder.setNegativeButton(text, listener)
    }

    fun setNegativeButton(@StringRes text: Int, listener: DialogInterface.OnClickListener) = apply {
        _builder.setNegativeButton(text, listener)
    }

    fun setNeutralButton(text: String, listener: DialogInterface.OnClickListener) = apply {
        _builder.setNeutralButton(text, listener)
    }

    fun setNeutralButton(@StringRes text: Int, listener: DialogInterface.OnClickListener) = apply {
        _builder.setNeutralButton(text, listener)
    }

    fun show(): AlertDialog = _builder.show()

    fun create(): AlertDialog = _builder.create()

    fun setTitle(title: String) = apply { _builder.setTitle(title) }

    fun setTitle(@StringRes title: Int) = apply { _builder.setTitle(title) }

    fun setMessage(message: String) = apply { binding.message.text = message }

    fun setMessage(@StringRes message: Int) = apply { binding.message.setText(message) }

    fun setProgress(progress: Int) = apply { binding.indicator.setProgressCompat(progress, true) }

    fun setMax(max: Int) = apply { binding.indicator.setMax(max) }

    fun setMin(min: Int) = apply { binding.indicator.setMin(min) }

    fun setCancelable(cancelable: Boolean) = apply { _builder.setCancelable(cancelable) }

    fun setIndeterminate(indeterminate: Boolean = true) = apply {
        binding.indicator.isIndeterminate = indeterminate
    }
}
