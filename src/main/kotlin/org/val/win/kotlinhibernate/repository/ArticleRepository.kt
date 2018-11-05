package org.`val`.win.kotlinhibernate.repository

import org.`val`.win.kotlinhibernate.model.Article
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ArticleRepository : JpaRepository<Article, Long>