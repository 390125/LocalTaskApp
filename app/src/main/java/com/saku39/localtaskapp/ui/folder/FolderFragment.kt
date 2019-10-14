package com.saku39.localtaskapp.ui.folder

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.saku39.localtaskapp.R

class FolderFragment : Fragment() {

    private lateinit var folderViewModel: FolderViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        folderViewModel =
            ViewModelProviders.of(this).get(FolderViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_folder, container, false)
        val textView: TextView = root.findViewById(R.id.text_folder)
        folderViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}