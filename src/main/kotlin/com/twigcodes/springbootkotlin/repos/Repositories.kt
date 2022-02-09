package com.twigcodes.springbootkotlin.repos

import com.twigcodes.springbootkotlin.entities.Article
import com.twigcodes.springbootkotlin.entities.User
import org.springframework.data.repository.CrudRepository

interface ArticleRepository : CrudRepository<Article, Long> {
    fun findBySlug(slug: String): Article?
    fun findAllByOrderByAddedAtDesc(): Iterable<Article>
}

interface UserRepository : CrudRepository<User, Long> {
    fun findByLogin(login: String): User?
}