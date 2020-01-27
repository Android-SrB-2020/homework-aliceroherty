package com.example.android.navigation


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.android.navigation.databinding.FragmentTitleBinding

/**
 * A simple [Fragment] subclass.
 */
class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding: FragmentTitleBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_title, container, false)

        //Play Button Click Listener
        binding.playButton.setOnClickListener {
            //Navigate to the Game Fragment
            it.findNavController().navigate(R.id.action_titleFragment_to_gameFragment)
        }

        binding.aboutButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_titleFragment_to_aboutFragment)
        }

        binding.rulesButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_titleFragment_to_rulesFragment)
        }

        //Enabling Options Menu
        setHasOptionsMenu(true)

        return binding.root
    }

    /**
     * If the option doesn't navigate where you want it to, make sure the options ID is the same as the fragments ID
     */

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)

        //Inflating Options Menu
        inflater.inflate(R.menu.options_menu, menu)
    }

    //Onclick for Option
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, view!!.findNavController()) || super.onOptionsItemSelected(item)
    }
}
