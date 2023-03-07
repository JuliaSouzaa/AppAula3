package com.example.appaula3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtNome:EditText = findViewById(R.id.edtNome)   //Nome
        val edtEnd:EditText = findViewById(R.id.edtEnd)        //Endereço
        val edtBairro:EditText = findViewById(R.id.edtBairro)     //Bairro
        val edtEst:EditText = findViewById(R.id.edtEst)         //Estado
        val edtCid: EditText = findViewById(R.id.edtCid)       //Cidade
        val edtCep: EditText = findViewById(R.id.edtCep)          //Cep
        val btnCadastrar:Button = findViewById(R.id.btnCadastrar)
        btnCadastrar.setOnClickListener{
        }

        val texto: String = edtNome.text.toString() +  edtEnd.text.toString() +  edtBairro.text.toString() +  edtEst.text.toString() +  edtCid.text.toString() +  edtCep.text.toString()
        val toast = Toast.makeText(this, texto, Toast.LENGTH_SHORT)
        toast.show()



    }
}