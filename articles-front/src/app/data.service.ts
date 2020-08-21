import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Article } from './models/Article';
import { Observable } from 'rxjs';
import { HttpHeaders } from '@angular/common/http';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json'
  })
};

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http: HttpClient) { }

  getListArticles(): Observable<Article[]> {
    return this.http.get<Article[]>(`http://localhost:8081/articles`);
  }

  addArticle(article: Article): Observable<void> {
    return this.http.post<void>(`http://localhost:8081/articles`, article, httpOptions);
  }
}
