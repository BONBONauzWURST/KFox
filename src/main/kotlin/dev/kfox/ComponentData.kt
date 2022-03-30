package dev.kfox

import dev.kord.common.entity.ComponentType
import kotlin.reflect.KFunction

data class ComponentCallback(
    val callbackId: String,
    val ephemeral: Boolean = false,
    val function: KFunction<*>,
    val type: ComponentType
)
