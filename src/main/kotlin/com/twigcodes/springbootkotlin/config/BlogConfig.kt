package com.twigcodes.springbootkotlin.config

import com.twigcodes.springbootkotlin.entities.Article
import com.twigcodes.springbootkotlin.entities.User
import com.twigcodes.springbootkotlin.repos.ArticleRepository
import com.twigcodes.springbootkotlin.repos.UserRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BlogConfig {

    @Bean
    fun databaseInitializer(userRepository: UserRepository, articleRepository: ArticleRepository) = ApplicationRunner {
        val author = userRepository.save(User(
            "wpcfan",
            "Peng",
            "Wang"
        ))
        articleRepository.save(Article(
            title = "Reactor Bismuth is out",
            headline = "Lorem ipsum",
            content = "dolor sit amet",
            author
        ))
        articleRepository.save(Article(
            title = "Reactor Aluminium has landed",
            headline = "Lorem ipsum",
            content = "dolor sit amet",
            author
        ))
    }
}