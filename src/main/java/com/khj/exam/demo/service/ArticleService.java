package com.khj.exam.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.khj.exam.demo.repository.ArticleRepository;
import com.khj.exam.demo.vo.Article;

@Service
public class ArticleService {
	ArticleRepository articleRepository;
	
	public ArticleService(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	}

	public int writeArticle(String title, String body) {
		articleRepository.writeArticle(title, body);
		
		return articleRepository.getLastInsertId();
	}
	
	public List<Article> getArticles() {
		return articleRepository.getArticles();
	}

	public Article getArticle(int id) {
		return articleRepository.getArticle(id);
	}

	public void deleteArticle(int id) {
		articleRepository.deleteArticle(id);

	}

	public void modifyArticle(int id, String title, String body) {
		articleRepository.modifyArticle(id, title, body);
	}
}
