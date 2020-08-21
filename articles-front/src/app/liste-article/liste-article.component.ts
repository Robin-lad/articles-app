import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';
import { Article } from '../models/Article';

@Component({
  selector: 'app-liste-article',
  templateUrl: './liste-article.component.html',
  styleUrls: ['./liste-article.component.css']
})
export class ListeArticleComponent implements OnInit {

  listArticles: Article[];

  constructor(private dataServ: DataService) { }

  ngOnInit(): void {
    this.listArticles = [];

    this.dataServ.getListArticles().subscribe(
      v => this.listArticles = v,
      err => { },
      () => { }
    );
  }
}
