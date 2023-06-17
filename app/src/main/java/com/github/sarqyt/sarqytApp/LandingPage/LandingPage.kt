package com.github.sarqyt.sarqytApp.LandingPage

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.github.sarqyt.sarqytApp.R
import com.github.sarqyt.sarqytApp.BottomSheetCompose.OutlinedEditor

@Composable
fun LandingPage() {
    var search by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp, bottom = 40.dp)
            .verticalScroll(state = ScrollState(1))
    ) {
        Header()
        HelloUser()
        Spacer(modifier = Modifier.height(10.dp))
//        OutlinedTextField(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 10.dp),
//            value = search,
//            onValueChange = { search = it },
//            placeholder = {
//                Row(modifier = Modifier.fillMaxWidth()) {
//                    Icon(
//                        painter = painterResource(id = R.drawable.baseline_search_24),
//                        contentDescription = "Search..."
//                    )
//                    Spacer(modifier = Modifier.width(10.dp))
//                    Text("Search")
//                }
//            },
//            colors = TextFieldDefaults.textFieldColors(backgroundColor = colorBackgroundTextField)
//        )
        OutlinedEditor(Selected = {})
        Spacer(modifier = Modifier.height(20.dp))
        Recommended()
        Spacer(modifier = Modifier.height(20.dp))
        Promotion()
        HotelCard()
    }
}

@Composable
fun ImageWithoutClick() {
    Image(
        painter = painterResource(id = R.drawable.baseline_list_24),
        contentDescription = "Just Image"
    )
}







