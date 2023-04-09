package com.github.sarqyt.sarqytApp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import com.github.sarqyt.sarqytApp.CreateNewPassword.CreateNewPassword
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

                }
            }
        }
    }
}

//view model
//UI state