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
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.shapes

@Composable
fun Welcome(navController: NavController) {
    Surface(color = MaterialTheme.colors.background) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            val bg = if (isSystemInDarkTheme()) painterResource(id = R.drawable.dark_welcome)
            else painterResource(id = R.drawable.light_welcome)
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = bg,
                contentDescription = "background"
            )
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                val logo = if (isSystemInDarkTheme()) painterResource(id = R.drawable.dark_logo)
                else painterResource(id = R.drawable.light_logo)
                Image(
                    modifier = Modifier.fillMaxWidth(),
                    painter = logo,
                    contentDescription = "logo"
                )
                Spacer(modifier = Modifier.padding(32.dp))
                Button(
                    onClick = {
//                        navController.navigate("login")
                    },
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                        .height(72.dp)
                        .fillMaxWidth()
                        .clip(shapes.medium),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = MaterialTheme.colors.primary,
                        contentColor = MaterialTheme.colors.onPrimary
                    )
                ) {
                    Text(
                        text = "SIGN UP",
                        style = MaterialTheme.typography.button,
                        color = MaterialTheme.colors.onSecondary
                    )
                }
                Button(
                    onClick = {
                        navController.navigate("login")
                    },
                    modifier = Modifier
                        .height(72.dp)
                        .fillMaxWidth()
                        .clip(shapes.medium),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = MaterialTheme.colors.secondary,
                        contentColor = MaterialTheme.colors.onSecondary
                    )
                ) {
                    Text(
                        text = "LOG IN",
                        style = MaterialTheme.typography.button,
                        color = MaterialTheme.colors.onSecondary
                    )
                }
            }
        }
    }
}
