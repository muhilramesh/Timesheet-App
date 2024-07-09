package com.app.timersheet

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import java.text.SimpleDateFormat
import java.util.*


class AddEditTimeSheetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_edit_time_sheet)

        val tv_client = findViewById<AutoCompleteTextView>(R.id.tv_client)
        val items = listOf("Technocrats Domain")
        val adapter = ArrayAdapter(this, R.layout.list_item, items)
        tv_client.setAdapter(adapter)

        val tv_project = findViewById<AutoCompleteTextView>(R.id.tv_project)
        val items_two = listOf("Timesheet Testing App")
        val adapter_two = ArrayAdapter(this, R.layout.list_item, items_two)
        tv_project.setAdapter(adapter_two)

        val tv_manager = findViewById<AutoCompleteTextView>(R.id.tv_manager)
        val items_three = listOf("Venu Gunda")
        val adapter_three = ArrayAdapter(this, R.layout.list_item, items_three)
        tv_manager.setAdapter(adapter_three)

        val et_week_start = findViewById<TextInputEditText>(R.id.et_week_start)
        et_week_start.setOnClickListener {
            val newCalendar: Calendar = Calendar.getInstance()
            DatePickerDialog(
                this,
                { view, year, monthOfYear, dayOfMonth ->
                    val newDate: Calendar = Calendar.getInstance()
                    newDate.set(year, monthOfYear, dayOfMonth)
                    val sdf = SimpleDateFormat("MM/dd/yyyy")
                    et_week_start.setText(sdf.format(newDate.getTime()))
                },
                newCalendar.get(Calendar.YEAR),
                newCalendar.get(Calendar.MONTH),
                newCalendar.get(Calendar.DAY_OF_MONTH)
            ).show()

        }


    }

}