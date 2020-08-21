/**
 * 
 */
package dev.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.dto.CreerArticleDto;
import dev.entites.Article;
import dev.service.ArticleService;

/**
 * @author robin
 *
 */
@CrossOrigin
@RestController
@RequestMapping("articles")
public class ArticleController {
	
	private ArticleService articleService;

	public ArticleController(ArticleService articleService) {
		super();
		this.articleService = articleService;
	}
	
	@GetMapping
	public List<Article> getAllArticles(){
		return articleService.getListArticles();
	}
	
	@PostMapping
	public Article creerArticle(@RequestBody @Valid CreerArticleDto a, BindingResult result) {
		
		if(result.hasErrors()) {
			throw new RuntimeException("Données incorrectes pour la création d'un client.");
		}
		
		Article article = articleService.creer(a.getLibelle(), a.getPrix());
		
		return article;
	}
}
