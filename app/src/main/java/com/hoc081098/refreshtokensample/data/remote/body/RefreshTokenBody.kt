package com.hoc081098.refreshtokensample.data.remote.body

import com.squareup.moshi.Json

data class RefreshTokenBody(
  @Json(name = "refreshToken") val refreshToken: String,
  @Json(name = "username") val username: String,
)
