package dev.bitflow.kfox

@Target(AnnotationTarget.FUNCTION)
annotation class Command(
    val name: String,
    val description: String, // TODO: Localize these two
    val guildId: Long = 0L,
)

@Target(AnnotationTarget.FUNCTION)
annotation class SubCommand(
    val parent: String
)

annotation class Group(
    val name: String,
    val description: String
)

@Target(AnnotationTarget.VALUE_PARAMETER)
annotation class Parameter(
    val name: String, // TODO: Localize these two
    val description: String
)

@Target(AnnotationTarget.VALUE_PARAMETER)
annotation class Choices(
    val list: Array<String>
)

@Target(AnnotationTarget.FUNCTION)
annotation class Button(
    val callbackId: String
)

@Target(AnnotationTarget.FUNCTION)
annotation class SelectMenu(
    val callbackId: String
)

@Target(AnnotationTarget.FUNCTION)
annotation class Modal(
    val callbackId: String
)

@Target(AnnotationTarget.VALUE_PARAMETER)
annotation class ModalValue(
    val customId: String
)
