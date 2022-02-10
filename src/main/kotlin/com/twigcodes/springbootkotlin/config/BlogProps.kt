package com.twigcodes.springbootkotlin.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties("blog")
data class BlogProps(var title: String, val banner: Banner) {
    data class Banner(val title: String? = null, val content: String)
}