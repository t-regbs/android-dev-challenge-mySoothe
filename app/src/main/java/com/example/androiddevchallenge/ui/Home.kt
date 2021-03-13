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

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.Collection
import com.example.androiddevchallenge.getBodies
import com.example.androiddevchallenge.getCollections
import com.example.androiddevchallenge.getMinds
import com.example.androiddevchallenge.ui.theme.MyTheme
import dev.chrisbanes.accompanist.glide.GlideImage

@Composable
fun Home() {
    Surface(color = MaterialTheme.colors.background) {
        Column(Modifier.padding(16.dp)) {
            Spacer(modifier = Modifier.padding(56.dp))
            Search()
            FavoriteCollections()
            AlignBody()
            AlignMind()
        }
    }
}

@Composable
fun FavoriteCollections() {
    val collections = getCollections()
    val firstRow = collections.filterIndexed { index, _ -> index <= 2 }
    val secondRow = collections.filterIndexed { index, _ -> index > 2 }
    Column {
        Text(
            "FAVORITE COLLECTIONS",
            style = MaterialTheme.typography.h2,
            color = MaterialTheme.colors.onSurface,
            modifier = Modifier.paddingFromBaseline(top = 40.dp)
        )
        Spacer(modifier = Modifier.padding(top = 8.dp))
        Column {
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                content = {
                    items(firstRow.size) { index ->
                        CollectionCard(firstRow[index])
                    }
                }
            )
            Spacer(modifier = Modifier.height(8.dp))
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                content = {
                    items(secondRow.size) { index ->
                        CollectionCard(secondRow[index])
                    }
                }
            )
        }
    }
}

@Composable
fun AlignBody() {
    val bodies = getBodies()
    Column {
        Text(
            "ALIGN YOUR BODY",
            style = MaterialTheme.typography.h2,
            color = MaterialTheme.colors.onSurface,
            modifier = Modifier.paddingFromBaseline(top = 40.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            items(bodies.size) { index ->
                CircularItemRow(bodies[index])
            }
        }
    }
}

@Composable
fun AlignMind() {
    val mindList = getMinds()
    Column {
        Text(
            "ALIGN YOUR MIND",
            style = MaterialTheme.typography.h2,
            color = MaterialTheme.colors.onSurface,
            modifier = Modifier.paddingFromBaseline(top = 40.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            items(mindList.size) { index ->
                CircularItemRow(mindList[index])
            }
        }
    }
}

@Composable
fun CircularItemRow(collection: Collection) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        GlideImage(
            data = collection.imageUrl,
            contentDescription = "",
            modifier = Modifier
                .clip(CircleShape)
                .height(88.dp)
                .aspectRatio(1f),
            contentScale = ContentScale.Crop
        )
        Box(
            modifier = Modifier.height(24.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Text(collection.title)
        }
    }
}

@Composable
fun CollectionCard(collection: Collection) {
    Surface(
        modifier = Modifier
            .size(192.dp, 56.dp),
        shape = MaterialTheme.shapes.small
    ) {
        Row(
//            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            GlideImage(
                data = collection.imageUrl,
                contentDescription = null,
                modifier = Modifier
                    .padding(end = 16.dp)
                    .size(56.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = collection.title,
                style = MaterialTheme.typography.h2,
                color = MaterialTheme.colors.primary
            )
        }
    }
}

@Composable
fun Search() {
    TextField(
        value = "Search", onValueChange = { },
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp),
        leadingIcon = {
            Icon(
                Icons.Outlined.Search,
                contentDescription = null,
                modifier = Modifier.padding(start = 18.dp),
                tint = MaterialTheme.colors.onSurface,
            )
        },
        textStyle = MaterialTheme.typography.body1,
        colors = TextFieldDefaults.textFieldColors(
            textColor = MaterialTheme.colors.onSurface,
            focusedIndicatorColor = MaterialTheme.colors.background,
        ),
        shape = MaterialTheme.shapes.small
    )
}

@Preview("Light Theme")
@Composable
fun LightPreview() {
    MyTheme {
        val col = getCollections()[1]
        CollectionCard(collection = col)
    }
}
