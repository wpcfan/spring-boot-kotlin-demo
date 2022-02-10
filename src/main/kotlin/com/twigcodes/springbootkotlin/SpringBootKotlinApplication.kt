package com.twigcodes.springbootkotlin

import com.twigcodes.springbootkotlin.config.BlogProps
import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProps::class)
class SpringBootKotlinApplication

fun main(args: Array<String>) {
    runApplication<SpringBootKotlinApplication>(*args){
        setBannerMode(Banner.Mode.OFF)
    }
}
