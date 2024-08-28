package com.jaehyeon.basic.snackbar

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

/**
 * Created by jaehyeon.
 * Date: 2024. 8. 28.
 */
class ScreenAViewModel: ViewModel() {

    fun showSnackbar() {
        viewModelScope.launch {
            SnackbarController.sendEvent(
                event = SnackbarEvent(
                    message = "Hello from ViewModel",
                    action = SnacbarAction(
                        name = "Click me!",
                        action = {
                            SnackbarController.sendEvent(
                                event = SnackbarEvent(
                                    message = "Action pressed!"
                                )
                            )
                        }
                    )
                )
            )
        }
    }
}