package com.streamside.webnote

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@SpringBootApplication
class WebnoteApplication

fun main(args: Array<String>) {
	runApplication<WebnoteApplication>(*args)
}