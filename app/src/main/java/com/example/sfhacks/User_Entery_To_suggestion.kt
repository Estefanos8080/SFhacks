package com.example.sfhacks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.*
import com.google.firebase.ml.naturallanguage.smartreply.FirebaseTextMessage
import com.google.mlkit.nl.smartreply.SmartReply
import com.google.mlkit.nl.smartreply.SmartReplyGenerator
import com.google.mlkit.nl.smartreply.SmartReplySuggestionResult
import com.google.mlkit.nl.smartreply.TextMessage
import com.google.mlkit.nl.smartreply.TextMessage.createForRemoteUser
import kotlin.collections.ArrayList


class User_Entery_To_suggestion: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_user__entery__to_suggestion)


        val btn_o = findViewById(R.id.CheckBox) as Button
        val btn_t = findViewById(R.id.CheckBox2) as Button
        val btn_s = findViewById(R.id.CheckBox3) as Button
        val btn_f = findViewById(R.id.CheckBox4) as TextView
        val btn_e = findViewById(R.id.CheckBox4) as TextView
        val text1 = R.id.user_input


        btn_o.setOnClickListener{
//            The response is happy to this button. Create a function keep the user happy
            getMessage(text1.toString())
        }
        btn_t.setOnClickListener{
//           The response is S_happy, create a function find a way to connect this repsonse with the MI_model
            getResponse()
        }
        btn_s.setOnClickListener{

        }

        btn_f.setOnClickListener{
            getResponse()
        }
        btn_e.setOnClickListener{
            getResponse()
        }








    }


    val conversation = ArrayList<TextMessage>()


    private fun getResponse() {


        val smartReply = SmartReply.getClient()

        smartReply.suggestReplies(conversation)
            .addOnSuccessListener { result ->
                if (result.getStatus() == SmartReplySuggestionResult.STATUS_NOT_SUPPORTED_LANGUAGE) {
                    print("Language not supported")
                } else if (result.getStatus() == SmartReplySuggestionResult.STATUS_SUCCESS) {
                    print(result.suggestions[0].text)
                    print(result.suggestions[1].text)

                }
            }
            .addOnFailureListener {
                print(it)
            }
    }

    private fun getMessage(text: String) {
        conversation.add(TextMessage.createForRemoteUser(
            text, System.currentTimeMillis(), "Gchat"))

    }
}









