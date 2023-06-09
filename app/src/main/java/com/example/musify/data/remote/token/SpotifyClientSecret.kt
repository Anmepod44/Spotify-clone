package com.example.musify.data.remote.token

import com.example.musify.BuildConfig
import com.example.musify.data.encoder.Base64Encoder

/**
 * A function that uses the [base64Encoder] to get an encoded
 * spotify client secret.
 */
fun getSpotifyClientSecret(base64Encoder: Base64Encoder): String {
    val clientId = "a9aa5b89ba8e461fb4b49402d78a9dcd"
    val clientSecret = "b32528fbbe8f477bb9fa556656de70ed"
    val encodedString = base64Encoder.encodeToString("$clientId:$clientSecret".toByteArray())
    return "Basic $encodedString"
}
