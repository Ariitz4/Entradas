package com.example.entradas2

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import com.example.entradas2.R

class HistoryDialog : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.dialog_history, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val historyTextView = view.findViewById<TextView>(R.id.historyTextView)

        // Obtener el historial desde SharedPreferences
        val sharedPreferences = requireContext().getSharedPreferences("WebCheckerHistory", Context.MODE_PRIVATE)
        val history = sharedPreferences.getString("history", "No hay historial disponible.")

        historyTextView.text = history
    }
}