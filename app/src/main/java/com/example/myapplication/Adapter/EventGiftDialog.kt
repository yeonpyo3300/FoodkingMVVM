package com.example.myapplication.Adapter

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.myapplication.R
import kotlinx.android.synthetic.main.event_gift_dialog.*

class EventGiftDialog(context: Context, eventGiftDialogInterface: EventGiftDialogInterface) :
    Dialog(context), View.OnClickListener {

    val TAG: String = "Test"

    private var eventGiftDialogInterface: EventGiftDialogInterface? = null

    init {
        this.eventGiftDialogInterface = eventGiftDialogInterface
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.event_gift_dialog)

        window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        gift_save.setOnClickListener(this)
        gift_cancel.setOnClickListener(this)


    }

    override fun onClick(view: View?) {
        when (view) {
            gift_save -> {
                this.eventGiftDialogInterface?.onSaveButtonClicked()
            }

            gift_cancel -> {
                this.eventGiftDialogInterface?.onCancelButtonClicked()
                this.dismiss()
            }
        }
    }


}