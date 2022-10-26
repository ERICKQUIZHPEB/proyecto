package com.example.demo.comtroller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class Practice {

   @GetMapping
    fun index():String{
        val  age:Int = 18
        if(age < 18){
            return("Hola mundo desde kotlin tengo $age años")
        }

        return("Hola mundo desde kotlin tengo $age años")

    }

    @GetMapping("/{age}")
    fun indexAge(@PathVariable age:Long): String {
        when(age) {
            in 0..11 -> println("niño")
            in 12..17 -> println("adolecente")
            in 18..21 -> println("adulto joven")
            in 22..64 -> println("adulto")
            in 65..150 -> println("adulto mayor")
        }
            return ("Hola mundo desde kotlin tengo $age años")
    }
}