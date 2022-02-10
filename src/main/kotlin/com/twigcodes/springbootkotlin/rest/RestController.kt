package com.twigcodes.springbootkotlin.rest

import com.twigcodes.springbootkotlin.repos.ArticleRepository
import com.twigcodes.springbootkotlin.repos.UserRepository
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/api/article")
class ArticleRestController(private val repository: ArticleRepository) {
    @GetMapping("/")
    fun findAll() = repository.findAllByOrderByAddedAtDesc()

    @GetMapping("/{slug}")
    fun findOne(@PathVariable slug: String) = repository.findBySlug(slug) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND, "This article does not exist")
}

@RestController
@RequestMapping("/api/user")
class UserRestController(private val repository: UserRepository) {
    @GetMapping("/")
    fun findAll() = repository.findAll()

    @GetMapping("/{login}")
    fun findOne(@PathVariable login: String) = repository.findByLogin(login) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND, "The user does not exist")
}