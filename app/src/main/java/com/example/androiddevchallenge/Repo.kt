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
package com.example.androiddevchallenge

data class Collection(
    val title: String,
    val imageUrl: String
)

fun getCollections() = listOf(
    Collection(
        title = "Short mantras",
        imageUrl = "https://images.pexels.com/photos/3560168/pexels-photo-3560168.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
    ),
    Collection(
        title = "Stress and anxiety",
        imageUrl = "https://images.pexels.com/photos/1557238/pexels-photo-1557238.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
    ),
    Collection(
        title = "Overwhelmed",
        imageUrl = "https://images.pexels.com/photos/3560044/pexels-photo-3560044.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
    ),
    Collection(
        title = "Nature Meditations",
        imageUrl = "https://images.pexels.com/photos/3571551/pexels-photo-3571551.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
    ),
    Collection(
        title = "Self-massage",
        imageUrl = "https://images.pexels.com/photos/1029604/pexels-photo-1029604.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
    ),
    Collection(
        title = "Nightly wind down",
        imageUrl = "https://images.pexels.com/photos/924824/pexels-photo-924824.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
    )
)

fun getBodies() = listOf(
    Collection(
        title = "Inversions",
        imageUrl = "https://images.pexels.com/photos/317157/pexels-photo-317157.jpeg?cs=srgb&dl=pexels-chevanon-photography-317157.jpg&fm=jpg"
    ),
    Collection(
        title = "Quick yoga",
        imageUrl = "https://images.pexels.com/photos/1812964/pexels-photo-1812964.jpeg?cs=srgb&dl=pexels-agung-pandit-wiguna-1812964.jpg&fm=jpg"
    ),
    Collection(
        title = "Stretching",
        imageUrl = "https://images.pexels.com/photos/4056723/pexels-photo-4056723.jpeg?cs=srgb&dl=pexels-cliff-booth-4056723.jpg&fm=jpg"
    ),
    Collection(
        title = "Tabata",
        imageUrl = "https://images.pexels.com/photos/4662438/pexels-photo-4662438.jpeg?cs=srgb&dl=pexels-elly-fairytale-4662438.jpg&fm=jpg"
    ),
    Collection(
        title = "HIIT",
        imageUrl = "https://images.pexels.com/photos/999309/pexels-photo-999309.jpeg?cs=srgb&dl=pexels-the-lazy-artist-gallery-999309.jpg&fm=jpg"
    ),
    Collection(
        title = "Pre-natal yoga",
        imageUrl = "https://images.pexels.com/photos/396133/pexels-photo-396133.jpeg?cs=srgb&dl=pexels-freestocksorg-396133.jpg&fm=jpg"
    )
)

fun getMinds() = listOf(
    Collection(
        title = "Meditate",
        imageUrl = "https://images.pexels.com/photos/3822622/pexels-photo-3822622.jpeg?cs=srgb&dl=pexels-elly-fairytale-3822622.jpg&fm=jpg"
    ),
    Collection(
        title = "With kids",
        imageUrl = "https://images.pexels.com/photos/3094230/pexels-photo-3094230.jpeg?cs=srgb&dl=pexels-valeria-ushakova-3094230.jpg&fm=jpg"
    ),
    Collection(
        title = "Aromatherapy",
        imageUrl = "https://images.pexels.com/photos/4498318/pexels-photo-4498318.jpeg?cs=srgb&dl=pexels-karolina-grabowska-4498318.jpg&fm=jpg"
    ),
    Collection(
        title = "On the go",
        imageUrl = "https://images.pexels.com/photos/1241348/pexels-photo-1241348.jpeg?cs=srgb&dl=pexels-suraphat-nueaon-1241348.jpg&fm=jpg"
    ),
    Collection(
        title = "With pets",
        imageUrl = "https://images.pexels.com/photos/4056535/pexels-photo-4056535.jpeg?cs=srgb&dl=pexels-cottonbro-4056535.jpg&fm=jpg"
    ),
    Collection(
        title = "High stress",
        imageUrl = "https://images.pexels.com/photos/897817/pexels-photo-897817.jpeg?cs=srgb&dl=pexels-nathan-cowley-897817.jpg&fm=jpg"
    )
)
