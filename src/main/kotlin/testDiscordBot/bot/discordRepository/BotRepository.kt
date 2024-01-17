package testDiscordBot.bot.discordRepository

import jakarta.annotation.Priority
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import testDiscordBot.bot.discordEntity.Task
import java.time.LocalDateTime

@Repository
interface BotRepository : CrudRepository<Task, Long> {
    fun findAllByUserId(userId: String): List<Task>

}