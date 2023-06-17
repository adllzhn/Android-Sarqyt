package com.github.sarqyt.sarqytApp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Surface
import com.github.sarqyt.sarqytApp.BottomBar.MainScreen
import com.github.sarqyt.sarqytApp.ui.theme.SarqytAppTheme
class MainActivity : ComponentActivity() {

    companion object {
        const val TEST_VERIFY_CODE = "3414"
    }
    @OptIn(ExperimentalMaterialApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SarqytAppTheme {
                Surface {
                    MainScreen()
                    //CreateNewPassword()
                    //ContentView(textList = textList, requesterList = requesterList)
                    //WelcomeActivity()
                }
            }
        }
    }
}