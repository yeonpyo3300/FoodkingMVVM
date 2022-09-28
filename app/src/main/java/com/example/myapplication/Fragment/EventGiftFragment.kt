package com.example.myapplication.Fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.myapplication.Adapter.EventGiftDialog
import com.example.myapplication.Adapter.EventGiftDialogInterface
import com.example.myapplication.R
import kotlinx.android.synthetic.main.fragment_event_gift.*


class EventGiftFragment : Fragment(), EventGiftDialogInterface {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "EventGiftFragment - onCreate() called")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_event_gift, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        eventGiftImageClicked()

    }

    companion object {
        const val TAG : String = "Test log"

        fun newInstance(): EventGiftFragment {
            return EventGiftFragment()
        }
    }

    //Image / Fragment clicked
    private fun eventGiftImageClicked() {

        image_gift.setOnClickListener {
            Log.d(TAG, "EventGiftFragment - eventGiftImageClicked() called")
            val eventGiftDialog = EventGiftDialog(requireContext(), this)
            eventGiftDialog.show()
        }
    }

    override fun onSaveButtonClicked() {
        Log.d(TAG, "EventGiftFragment - onSaveButtonClicked() called")
        Toast.makeText(requireContext(), "Save button clicked", Toast.LENGTH_SHORT).show()

    }

    override fun onCancelButtonClicked() {
        Log.d(TAG, "EventGiftFragment - onCancelButtonClicked() called")
        Toast.makeText(requireContext(), "Cancel button clicked", Toast.LENGTH_SHORT).show()

    }

}