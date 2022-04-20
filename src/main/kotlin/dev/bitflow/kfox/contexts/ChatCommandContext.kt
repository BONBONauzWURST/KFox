package dev.bitflow.kfox.contexts

import dev.bitflow.kfox.ComponentRegistry
import dev.kord.core.Kord
import dev.kord.core.behavior.interaction.response.EphemeralMessageInteractionResponseBehavior
import dev.kord.core.behavior.interaction.response.PublicMessageInteractionResponseBehavior
import dev.kord.core.event.interaction.ChatInputCommandInteractionCreateEvent

open class CmdContextChat(
    client: Kord,
    @Suppress("unused")
    val event: ChatInputCommandInteractionCreateEvent,
    registry: ComponentRegistry
) : CommandContext(client, registry)

class CmdContextPublic(
    client: Kord,
    @Suppress("unused")
    val response: PublicMessageInteractionResponseBehavior,
    event: ChatInputCommandInteractionCreateEvent,
    registry: ComponentRegistry
) : CmdContextChat(client, event, registry)

class CmdContextEphemeral(
    client: Kord,
    @Suppress("unused")
    val response: EphemeralMessageInteractionResponseBehavior,
    event: ChatInputCommandInteractionCreateEvent,
    registry: ComponentRegistry
) : CmdContextChat(client, event, registry)
