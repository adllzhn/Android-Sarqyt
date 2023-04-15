package com.github.sarqyt.sarqytApp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import com.github.sarqyt.sarqytApp.ChooseEmailOrNumber.ForgotPasswordPage
import com.github.sarqyt.sarqytApp.ChooseEmailOrNumber.InputView
import com.github.sarqyt.sarqytApp.CreateNewPassword.CreateNewPassword
import com.github.sarqyt.sarqytApp.LandingPage.LandingPage
import com.github.sarqyt.sarqytApp.OTPview.ContentView
import com.github.sarqyt.sarqytApp.OTPview.requesterList
import com.github.sarqyt.sarqytApp.OTPview.textList
import com.github.sarqyt.sarqytApp.ui.theme.SarqytAppTheme

class MainActivity : ComponentActivity() {

    companion object {
        const val TEST_VERIFY_CODE = "3414"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SarqytAppTheme {
                Surface {
                    ForgotPasswordPage()
                }
            }
        }
    }
}

//view model
//UI state