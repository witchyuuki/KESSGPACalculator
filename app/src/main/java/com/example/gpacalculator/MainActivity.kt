package com.example.gpacalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        OK.setOnClickListener {
            var eiei06 = 0
            var kess1 = name1.text.toString()
            var kess2 = name2.text.toString()
            var kess3 = name3.text.toString()
            var kess4 = name4.text.toString()
            var kess5 = name5.text.toString()
            var kess001 = cr1.text.toString()
            var kess002 = cr2.text.toString()
            var kess003 = cr3.text.toString()
            var kess004 = cr4.text.toString()
            var kess005 = cr5.text.toString()
            var kess00001 = p1.text.toString()
            var kess00002 = p2.text.toString()
            var kess00003 = p3.text.toString()
            var kess00004 = p4.text.toString()
            var kess00005 = p5.text.toString()

            if (kess1 == "" || kess2 == "" || kess3 == "" || kess4 == "" || kess5 == "" || kess001 == "" || kess002 == "" || kess003 == "" || kess004 == "" || kess005 == "" || kess00001 == "" || kess00002 == "" || kess00003 == "" || kess00004 == "" || kess00005 == "") {
                Toast.makeText(
                    applicationContext,
                    "Please Input All text Box Before press OK !!",
                    Toast.LENGTH_SHORT
                ).show()
                name1.setText("")
                name2.setText("")
                name3.setText("")
                name4.setText("")
                name5.setText("")
                cr1.setText("")
                cr2.setText("")
                cr3.setText("")
                cr4.setText("")
                cr5.setText("")
                p1.setText("")
                p2.setText("")
                p3.setText("")
                p4.setText("")
                p5.setText("")
            } else if (kess001.toDouble() >= 4 || kess002.toDouble() >= 4 || kess003.toDouble() >= 4 || kess004.toDouble() >= 4 || kess005.toDouble() >= 4) {
                Toast.makeText(
                    applicationContext,
                    "max poit Credit = 4",
                    Toast.LENGTH_SHORT
                ).show()
                cr1.setText("")
                cr2.setText("")
                cr3.setText("")
                cr4.setText("")
                cr5.setText("")
            } else if (kess00001.toDouble() >= 4 || kess00002.toDouble() >= 4 || kess00003.toDouble() >= 4 || kess00004.toDouble() >= 4 || kess00005.toDouble() >= 4) {
                Toast.makeText(
                    applicationContext,
                    "max Credit = 4",
                    Toast.LENGTH_SHORT
                ).show()
                p1.setText("")
                p2.setText("")
                p3.setText("")
                p4.setText("")
                p5.setText("")
            } else {
                var kess01 = kess001.toDouble()
                var kess02 = kess002.toDouble()
                var kess03 = kess003.toDouble()
                var kess04 = kess004.toDouble()
                var kess05 = kess005.toDouble()
                var kess0001 = kess00001.toDouble()
                var kess0002 = kess00002.toDouble()
                var kess0003 = kess00003.toDouble()
                var kess0004 = kess00004.toDouble()
                var kess0005 = kess00005.toDouble()
                var kess007 = kess01 + kess02 + kess03 + kess04 + kess05
                to.setText(kess007.toString())
                var kess000001 = kess0001 * kess01
                var kess000002 = kess0002 * kess02
                var kess000003 = kess0003 * kess03
                var kess000004 = kess0004 * kess04
                var kess000005 = kess0005 * kess05
                var kesseiei007 = kess000001 + kess000002 + kess000003 + kess000004 + kess000005
                var sinclair = kesseiei007 / kess007
                var summon = "%.2f".format(sinclair)
                GPA.setText(summon.toString())
            }
        }
        CLEAR.setOnClickListener{
            name1.setText("")
            name2.setText("")
            name3.setText("")
            name4.setText("")
            name5.setText("")
            cr1.setText("")
            cr2.setText("")
            cr3.setText("")
            cr4.setText("")
            cr5.setText("")
            p1.setText("")
            p2.setText("")
            p3.setText("")
            p4.setText("")
            p5.setText("")
        }
    }
}

