package com.viniro.kafka.connect.s3Sink.integration.glue

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GlueApplication

fun main(args: Array<String>) {
	runApplication<GlueApplication>(*args)
}
