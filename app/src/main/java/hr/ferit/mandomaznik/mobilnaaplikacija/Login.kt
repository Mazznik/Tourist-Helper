package hr.ferit.mandomaznik.mobilnaaplikacija

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class Login : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen)

        val user = findViewById<EditText>(R.id.editUser)
        val pass = findViewById<EditText>(R.id.editPass)
        val logButton = findViewById<Button>(R.id.logButton)

        logButton.setOnClickListener{
            if(user.text.toString() == "Maznik" && pass.text.toString() == "1234"){
                Toast.makeText(applicationContext, "Login Sucessfull!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainScreen::class.java)
                startActivity(intent)
            }
            else{
                user.setText("")
                pass.setText("")
                Toast.makeText(applicationContext, "Login failed!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}