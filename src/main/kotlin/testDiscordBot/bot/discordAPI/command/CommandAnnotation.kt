package testDiscordBot.bot.discordAPI.command

@Target(AnnotationTarget.CLASS,AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@Repeatable
annotation class CommandAnnotation(val prefix :String)
