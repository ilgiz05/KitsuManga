package com.ilgiz.kitsu.presentation.ui.fragments.authentication

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.ilgiz.kitsu.R
import com.ilgiz.kitsu.presentation.base.BaseFragment
import com.ilgiz.kitsu.databinding.FragmentSignInBinding
import com.ilgiz.kitsu.presentation.exntensions.mainNavController
import com.ilgiz.kitsu.presentation.exntensions.safeNavigation
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignInFragment :
    BaseFragment<FragmentSignInBinding, SignInViewModel>(R.layout.fragment_sign_in) {
    override val binding by viewBinding(FragmentSignInBinding::bind)
    override val viewModel: SignInViewModel by viewModels()

    override fun setupObservers() {
        subscribeToAuthorization()
    }

    private fun subscribeToAuthorization() {
        viewModel.signInState.collectUiState(
            gatherIfSucceed = {
                it.setupVisibility(binding.signInContainer, binding.progressbar)
            },
            success = {

                mainNavController().safeNavigation(R.id.action_signInFlowFragment_to_mainFlowFragment)

            })
    }

    override fun setupListeners() {

        binding.btnSignIn.setOnClickListener {
            viewModel.signIn(binding.etEmail.text.toString(), binding.etPassword.text.toString())
        }
    }
}