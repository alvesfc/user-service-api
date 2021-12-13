package org.alvesfc.userservice.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class UserServiceApiApplication

fun main(args: Array<String>) {
	runApplication<UserServiceApiApplication>(*args)
}
