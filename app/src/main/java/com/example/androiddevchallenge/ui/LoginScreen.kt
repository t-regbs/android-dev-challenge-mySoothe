/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.shapes

@Composable
fun Login(navController: NavController) {
    Surface(color = MaterialTheme.colors.background) {
        Box {
            val bg = if (isSystemInDarkTheme()) painterResource(id = R.drawable.dark_welcome)
            else painterResource(id = R.drawable.light_welcome)
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = bg,
                contentDescription = "background"
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "LOG IN",
                    modifier = Modifier
                        .paddingFromBaseline(top = 200.dp)
                        .fillMaxWidth(),
                    color = MaterialTheme.colors.onBackground,
                    style = MaterialTheme.typography.h1,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.padding(32.dp))
                TextField(
                    value = "Email address", onValueChange = { },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp),
                    textStyle = MaterialTheme.typography.body1,
                    colors = TextFieldDefaults.textFieldColors(
                        textColor = MaterialTheme.colors.onSurface,
                        focusedIndicatorColor = MaterialTheme.colors.background,
//                            unfocusedIndicatorColor = MaterialTheme.colors.background,
                    ),
                    shape = MaterialTheme.shapes.small
                )
                Spacer(modifier = Modifier.padding(8.dp))
                TextField(
                    value = "Password", onValueChange = { },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp),
                    textStyle = MaterialTheme.typography.body1,
                    colors = TextFieldDefaults.textFieldColors(
                        textColor = MaterialTheme.colors.onSurface,
                        focusedIndicatorColor = MaterialTheme.colors.background,
                    ),
                    shape = MaterialTheme.shapes.small
                )
                Spacer(modifier = Modifier.padding(8.dp))
                Button(
                    onClick = {
                        navController.navigate("home_screen")
                    },
                    modifier = Modifier
                        .height(72.dp)
                        .fillMaxWidth()
                        .clip(shapes.medium),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = MaterialTheme.colors.primary,
                        contentColor = MaterialTheme.colors.onPrimary
                    )
                ) {
                    Text(
                        text = "LOG IN",
                        style = MaterialTheme.typography.button,
                        color = MaterialTheme.colors.onPrimary
                    )
                }
                val textValue = with(AnnotatedString.Builder()) {
                    append("Don't have an account? ")
                    pushStyle(SpanStyle(textDecoration = TextDecoration.Underline))
                    append("Sign up")
                    toAnnotatedString()
                }
                Text(
                    text = textValue,
                    modifier = Modifier
                        .paddingFromBaseline(top = 32.dp)
                        .fillMaxWidth(),
                    color = MaterialTheme.colors.onSurface,
                    style = MaterialTheme.typography.body1,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}
