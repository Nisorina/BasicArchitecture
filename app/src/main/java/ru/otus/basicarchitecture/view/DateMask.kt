package ru.otus.basicarchitecture.view

import android.os.Build
import android.text.Editable
import android.text.TextWatcher
import androidx.annotation.RequiresApi
import ru.otus.basicarchitecture.viewmodel.NameViewModel

class DateMask(var vm: NameViewModel) :TextWatcher {
    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
       // TODO("Not yet implemented")
    }

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        //TODO("Not yet implemented")
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun afterTextChanged(editable: Editable?) {
        vm.onDateChanged(editable)
    }

}