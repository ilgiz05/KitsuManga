package com.ilgiz.domain.repositories

import com.ilgiz.domain.either.Either
import com.ilgiz.domain.models.authentication.TokenModel
import kotlinx.coroutines.flow.Flow

interface AuthenticationRepository {
    fun authenticate(username: String, password:String): Flow<Either<String, TokenModel>>
}