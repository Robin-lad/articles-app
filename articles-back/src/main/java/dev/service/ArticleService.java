/**
 * 
 */
package dev.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import dev.entites.Article;
import dev.repository.ArticleRepository;

/**
 * @author robin
 *
 */
@Service
@Transactional
public class ArticleService {
	
	private ArticleRepository articleRepository;

	public ArticleService(ArticleRepository articleRepository) {
		super();
		this.articleRepository = articleRepository;
	}

	public List<Article> getListArticles() {
		return articleRepository.findAll();
	}

	public Article creer(String libelle, int prix) {
		Article tmp = new Article(libelle, prix);
		Article art = this.articleRepository.save(tmp);
		
		return art;
	}
	
	
}
