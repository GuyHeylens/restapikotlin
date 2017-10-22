package be.kotlin.restapibeers.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import java.util.concurrent.atomic.AtomicLong

class GreetingController{

    val counter = AtomicLong()

    @GetMapping("/api/Greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) =
            Greeting(counter.incrementAndGet(), "Hello, $name")
}