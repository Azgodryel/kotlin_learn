package com.my.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.my.calculator.R.id

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val getText = findViewById<TextView>(id.operation)
        val button0=findViewById<Button>(R.id.btn_0)
        var savefirstnum:String;
        var savetry:Double=0.02;
        var action:Char = '-'
        button0.setOnClickListener {
            getText.text=getText.text.toString()+"0"
        }
        val button1=findViewById<Button>(R.id.btn_1)
        button1.setOnClickListener {
            getText.text=getText.text.toString()+"1"
        }
        val button2=findViewById<Button>(R.id.btn_2)
        button2.setOnClickListener {
            getText.text=getText.text.toString()+"2"
        }
        val button3=findViewById<Button>(R.id.btn_3)
        button3.setOnClickListener {
            getText.text=getText.text.toString()+"3"
        }
        val button4=findViewById<Button>(R.id.btn_4)
        button4.setOnClickListener {
            getText.text=getText.text.toString()+"4"
        }
        val button5=findViewById<Button>(R.id.btn_5)
        button5.setOnClickListener {
            getText.text=getText.text.toString()+"5"
        }
        val button6=findViewById<Button>(R.id.btn_6)
        button6.setOnClickListener {
            getText.text=getText.text.toString()+"6"
        }
        val button7=findViewById<Button>(R.id.btn_7)
        button7.setOnClickListener {
            getText.text=getText.text.toString()+"7"
        }
        val button8=findViewById<Button>(R.id.btn_8)
        button8.setOnClickListener {
            getText.text=getText.text.toString()+"8"
        }
        val button9=findViewById<Button>(R.id.btn_9)
        button9.setOnClickListener {
            getText.text=getText.text.toString()+"9"
        }
        val buttonPlus=findViewById<Button>(R.id.btn_sum)
        buttonPlus.setOnClickListener {
            savefirstnum = getText.text.toString();
            savetry= savefirstnum.toDouble()
            getText.text=""
             action= '+'
        }
        val buttonMinus=findViewById<Button>(R.id.btn_min)
        buttonMinus.setOnClickListener {
            savefirstnum = getText.text.toString();
            savetry= savefirstnum.toDouble()
            getText.text=""
            action= '-'
        }
        val buttonUmn=findViewById<Button>(R.id.btn_umn)
        buttonUmn.setOnClickListener {
            savefirstnum = getText.text.toString();
            savetry= savefirstnum.toDouble()
            getText.text=""
            action= '*'
        }
        val buttonDiv=findViewById<Button>(R.id.btn_del)
        buttonDiv.setOnClickListener {
            savefirstnum = getText.text.toString();
            savetry= savefirstnum.toDouble()
            getText.text=""
            action= '/'
        }
        val buttonResult=findViewById<Button>(R.id.btn_ravno)
        buttonResult.setOnClickListener {
           val savefirstnum2 = getText.text.toString();
            val savetry1=savetry;
            val savetry2: Double = savefirstnum2.toDouble()
            val actionthis=action.toString();
            var actionfinal: Double;
            when (actionthis) {
                "+" ->{ actionfinal=savetry1 + savetry2
                getText.text="${actionfinal}";}
                "-" ->{ actionfinal=savetry1 - savetry2
                    getText.text="${actionfinal}";}
                "*" ->{ actionfinal=savetry1 * savetry2
                    getText.text="${actionfinal}";}
                "/" ->{ actionfinal=savetry1 / savetry2
                    getText.text="${actionfinal}";}
                }


        }
    }


}