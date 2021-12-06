package com.example.secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class EncryptFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_encrypt, container, false)
        val encryptedView = view.findViewById<TextView>(R.id.tv_encrypted_message)

        val message: String = EncryptFragmentArgs.fromBundle(requireArguments()).message

        encryptedView.text = message.reversed()

        return view
    }

}