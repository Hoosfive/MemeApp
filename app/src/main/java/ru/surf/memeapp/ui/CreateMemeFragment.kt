package ru.surf.memeapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.surf.memeapp.R

class CreateMemeFragment : Fragment() {

    companion object {
        fun newInstance(): Fragment {
            return CreateMemeFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_create_meme, container, false)
    }
}