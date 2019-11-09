package com.example.slider_fragments.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.slider_fragments.R
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_main.view.*

/**
 * A placeholder fragment containing a simple view.
 */
class PlaceholderFragment : Fragment() {

    private lateinit var pageViewModel: PageViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pageViewModel = ViewModelProviders.of(this).get(PageViewModel::class.java).apply {
            setIndex(arguments?.getInt(ARG_SECTION_NUMBER) ?: 1)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_main, container, false)
       // handle all slides

        // if condition will be our slides handler
        if(arguments?.getInt(ARG_SECTION_NUMBER)==1){
       /* Set title of text view
       * set image address
       * Set all added widgets in it */
           root.title_tv.text="Walpaper One"
            root.image_iv.setImageResource(R.drawable.pic1)

        }
        if(arguments?.getInt(ARG_SECTION_NUMBER)==2){
            /* Set title of text view
            * set image address
            * Set all added widgets in it */
            root.title_tv.text="Walpaper Two"
            root.image_iv.setImageResource(R.drawable.pic2)

        }
        if(arguments?.getInt(ARG_SECTION_NUMBER)==3){
            /* Set title of text view
            * set image address
            * Set all added widgets in it */
            root.title_tv.text="Walpaper Three"
            root.image_iv.setImageResource(R.drawable.pic3)

        }
        if(arguments?.getInt(ARG_SECTION_NUMBER)==4){
            /* Set title of text view
            * set image address
            * Set all added widgets in it */
            root.title_tv.text="Walpaper Four"
            root.image_iv.setImageResource(R.drawable.pic4)

        }
        if(arguments?.getInt(ARG_SECTION_NUMBER)==5){
            /* Set title of text view
            * set image address
            * Set all added widgets in it */
            root.title_tv.text="Walpaper Five"
            root.image_iv.setImageResource(R.drawable.pic5)

        }

        return root
    }

    companion object {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private const val ARG_SECTION_NUMBER = "section_number"

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        @JvmStatic
        fun newInstance(sectionNumber: Int): PlaceholderFragment {
            return PlaceholderFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, sectionNumber)
                }
            }
        }
    }
}