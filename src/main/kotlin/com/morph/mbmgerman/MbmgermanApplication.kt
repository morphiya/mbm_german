package com.morph.mbmgerman

import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component

private val logger = KotlinLogging.logger {}

@SpringBootApplication
class MbmgermanApplication

fun main(args: Array<String>) {
	runApplication<MbmgermanApplication>(*args)
}

@Component
class AfterStartup() : ApplicationListener<ApplicationReadyEvent> {
	override fun onApplicationEvent(event: ApplicationReadyEvent) {
		logger.info { "Application started" }
	}
}
