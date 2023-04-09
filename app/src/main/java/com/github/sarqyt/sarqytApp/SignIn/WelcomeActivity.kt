package com.github.sarqyt.sarqytApp

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WelcomeActivity() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
    ) {
        Spacer(modifier = Modifier.height(60.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Let's you in",
                fontSize = 40.sp,
                fontWeight = FontWeight.W400,
            )
        }
        Spacer(modifier = Modifier.height(60.dp))
        ContinueItem(
            onClick = { ContinueWithFacebook() },
            R.drawable.facebook_logo,
            "Facebook logo",
            "Continue with Facebook"
        )
        Spacer(modifier = Modifier.height(15.dp))
        ContinueItem(
            onClick = { ContinueWithApple() },
            R.drawable.apple_logo,
            "Apple logo",
            "Continue with Apple"
        )
        Spacer(modifier = Modifier.height(15.dp))
        ContinueItem(
            onClick = { ContinueWithGoogle() },
            R.drawable.google_logo,
            "Google logo",
            "Continue with Google"
        )
        Spacer(modifier = Modifier.height(30.dp))
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "or")
        }
        Spacer(modifier = Modifier.height(30.dp))
        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp)
            .clickable { SignInWithPassword() }
        ) {
            Text(
                modifier = Modifier
                    .background(Color.Green)
                    .padding(vertical = 15.dp),
                text = "Sign in with Password",
                color = Color.White,
                textAlign = TextAlign.Center
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center) {
            Text(
                modifier = Modifier
                    .alpha(0.2f),
                text = "Don't have an account? "
            )
            Text(
                modifier = Modifier.clickable {},
                text = "Sign up")
        }
    }
}
private fun ContinueWithFacebook() {}
private fun ContinueWithGoogle() {}
private fun ContinueWithApple() {}
private fun SignInWithPassword() {}