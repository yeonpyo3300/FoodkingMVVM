package com.example.myapplication.Fragment

import android.os.Bundle
import android.provider.ContactsContract
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import com.example.myapplication.Adapter.ProfileRecyclerAdapter
import com.example.myapplication.Adapter.RestaurantListAdapter
import com.example.myapplication.Model.Payment
import com.example.myapplication.R
import com.example.myapplication.ViewModel.PaymentsViewModel
import kotlinx.android.synthetic.main.activity_restaraunt_list.*
import kotlinx.android.synthetic.main.fragment_profile.*
import kotlinx.android.synthetic.main.fragment_profile.view.*
import kotlin.random.Random


class ProfileFragment : Fragment() {

    private lateinit var paymentsViewModel: PaymentsViewModel
    private lateinit var profileAdapter: ProfileRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"ProfileFragment - onCreate() called")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

//        val adapter = ProfileRecyclerAdapter
//        val recyclerView = view.recyclerview
//        recyclerView.adapter = sd

        profileAdapter = ProfileRecyclerAdapter()

        paymentsViewModel = ViewModelProvider(this).get(PaymentsViewModel::class.java)
        paymentsViewModel.getPayments.observe(viewLifecycleOwner, Observer { payment ->
            profileAdapter.setData(payment as ArrayList<Payment>)
        })
        view.profile_recycler.apply {
            layoutManager =
                LinearLayoutManager(this.context, LinearLayoutManager.VERTICAL, false)
            adapter = profileAdapter
        }
        view.btn_add_payment.setOnClickListener {
            insertDataToDatabase()
        }

        view.btn_delete_all_payment.setOnClickListener {
            deleteAllData()
        }


        // Inflate the layout for this fragment
        return view
    }


    companion object {
        const val TAG : String = "Test log"

        fun newInstance(): ProfileFragment {
            return ProfileFragment()
        }
    }

    private fun insertDataToDatabase() {
        val paymentInfo = Payment("I'm not a developer + ${Random.nextInt(0,10000)}")
            paymentsViewModel.insert(paymentInfo)
            Toast.makeText(requireContext(),"Successfully added!", Toast.LENGTH_LONG).show()
    }

    private fun deleteAllData() {
        paymentsViewModel.deleteAll()
    }
}