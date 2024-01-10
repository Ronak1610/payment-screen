package com.example.paymentscreen

import android.graphics.fonts.FontStyle
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontFamily
import com.example.paymentscreen.ui.theme.PaymentScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PaymentScreenTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                     homeScreen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
  fun homeScreen()
{
      Column (verticalArrangement = Arrangement.Top,
          modifier = Modifier.fillMaxSize()){
          Spacer(modifier = Modifier.size(15.dp))
          Row (){
              OutlinedButton(onClick = { /*TODO*/ }) {
                  Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "")
                  
              }
              Spacer(modifier = Modifier.width(200.dp))
              Row (verticalAlignment = Alignment.Top){
                  ElevatedButton(onClick = { /*TODO*/ },
                      colors = ButtonDefaults.buttonColors(
                          containerColor = Color.Blue
                      )) {
                      Text(text = "Scan card")


                  }
              }
          }
          Column (verticalArrangement = Arrangement.SpaceEvenly){
              Text(text = "Pay with a new card", fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Bold, fontSize = 35.sp, modifier  = Modifier.padding(25.dp),
              )
              Text(text = "We accept Visa,Mastercard and Rupay", fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.W500,modifier = Modifier

                  .padding(25.dp)

              )
              Column {
                  Text(text = "card number", fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.W700, modifier = Modifier.padding(20.dp))

                 OutlinedTextField(value = "XXXXXX7352", onValueChange = {}, modifier = Modifier
                     .fillMaxWidth()
                     .padding(16.dp))

              }

              Column (modifier = Modifier.padding(20.dp)){
                  Text(text = "Expiry Date")
                  Spacer(modifier = Modifier.size(20.dp))
                  Row {


                      OutlinedTextField(value = " MM", onValueChange = {},modifier = Modifier.width(80.dp),colors = TextFieldDefaults.outlinedTextFieldColors(
                          focusedBorderColor = Green,
                          unfocusedBorderColor = Black))
                      Spacer(modifier = Modifier.size(20.dp))
                      Row {
                          OutlinedTextField(value = " YY", onValueChange = {},modifier = Modifier.width(110.dp),colors = TextFieldDefaults.outlinedTextFieldColors(
                              focusedBorderColor = Green,
                              unfocusedBorderColor = Black))
                      }
                  }
              }


          }
      }


}


@Preview(showBackground = true)
@Composable
fun homeScreenpreview()
{
    PaymentScreenTheme {
        homeScreen()
    }
}