package domain.model

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.timetogether.R

class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrartion)

        val userLogin: EditText =findViewById(R.id.user_login)
        val userEmail: EditText =findViewById(R.id.user_email)
        val userPassword: EditText =findViewById(R.id.user_password)
        val buttonReg: Button =findViewById(R.id.button_reg_complete)

        buttonReg.setOnClickListener {
            val login = userLogin.text.toString().trim()
            val email = userEmail.text.toString().trim()
            val password = userPassword.text.toString().trim()

            if (login == "" ||email == "" || password == "") {
                Toast.makeText(this, "Заполните все поля", Toast.LENGTH_LONG).show()
            }
            else {

                buttonReg.setOnClickListener{
                    val intent =  Intent(this, MainPage::class.java)
                    startActivity(intent)
                }
            }




        }
    }
}