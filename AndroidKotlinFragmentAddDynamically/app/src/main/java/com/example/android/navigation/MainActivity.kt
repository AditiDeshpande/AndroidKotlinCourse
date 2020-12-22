/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.navigation

import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.commit
import com.example.android.navigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        @Suppress("UNUSED_VARIABLE")
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        if(savedInstanceState == null){
            //Foll. code needs Java 8 I am using Java 11
            /*supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<SimpleFragment>(R.id.fragmentContainer)
            }*/
            //Foll. code is compatible with Java 11

        //Updated / latest code
            val fragment = SimpleFragment.newInstance("Simple Fragment")
            val ft:FragmentTransaction = supportFragmentManager.beginTransaction()
            ft.add(R.id.fragmentContainer , fragment , "SIMPLEFRAGMENT")
            ft.commit()

        }
    }


     fun onRadioButtonClicked(view: View) {

        if (view is RadioButton) {

            val checked = view.isChecked
            //Foll TextView is from Fragment's layout it's npt accessible here will refactor the code
            //later to make this work
            //val textView: TextView = rootView!!.findViewById<TextView>(R.id.fragment_header)
            //Check which radio button was clicked
            when (view.getId()) {
                R.id.radio_button_yes ->
                    if (checked) {
                        //textView.setText(R.string.yes_message)
                        Toast.makeText( applicationContext, R.string.yes_message , Toast.LENGTH_SHORT).show()

                    }
                R.id.radio_button_no ->
                    if (checked) {
                        //textView.setText(R.string.no_message)
                        Toast.makeText( applicationContext, R.string.no_message , Toast.LENGTH_SHORT).show()
                    }

            }

        }
    }
}
