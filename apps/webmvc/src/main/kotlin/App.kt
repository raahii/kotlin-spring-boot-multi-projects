/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example.webmvc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class App

@RestController
class Controller {
    @GetMapping("/webmvc/hello")
    fun hello(): String =
        "Hello, world!"
}

fun main() {
    runApplication<App>()
}
