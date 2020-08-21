/**
 * 
 */
package dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entites.Article;

/**
 * @author robin
 *
 */
public interface ArticleRepository extends JpaRepository<Article, Integer>{

}
