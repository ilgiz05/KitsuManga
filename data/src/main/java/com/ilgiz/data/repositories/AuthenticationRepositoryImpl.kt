package com.ilgiz.data.repositories

import com.ilgiz.data.local.preferences.PreferencesHelper
import com.ilgiz.data.remote.apiservice.AuthenticationApiService
import com.ilgiz.data.remote.dtos.authentication.AuthDto
import com.ilgiz.data.remote.dtos.authentication.toDomain
import com.ilgiz.data.repositories.base.BaseRepository
import com.ilgiz.domain.models.authentication.TokenModel
import com.ilgiz.domain.repositories.AuthenticationRepository
import javax.inject.Inject

class AuthenticationRepositoryImpl @Inject constructor(
    private val authenticationApiService: AuthenticationApiService,
    private val preferencesHelper: PreferencesHelper,
) : BaseRepository(), AuthenticationRepository {

    override fun authenticate(
        username: String,
        password: String,
    ) = sendRequest(this::saveToken) {
        authenticationApiService.authenticate(AuthDto(username = username, password = password))
            .toDomain()
    }

    private fun saveToken(tokenModel: TokenModel) {
        preferencesHelper.accessToken = tokenModel.accessToken
        preferencesHelper.refreshToken = tokenModel.refreshToken
        preferencesHelper.isAuthenticated = true
    }
}