import { DataService } from './../data.service';
import { Component, OnInit } from '@angular/core';
import { Article } from '../models/Article';

@Component({
  templateUrl: './ajout-article.component.html',
  styleUrls: ['./ajout-article.component.css']
})
export class AjoutArticleComponent implements OnInit {

  ajoutFait: boolean;

  constructor(private dataServ: DataService) { }

  ngOnInit(): void {
    this.ajoutFait = false;
  }

  ajouterArticle(addLibelle: HTMLInputElement, addPrix: HTMLInputElement): void {
    if ((addLibelle.value !== '') && (addPrix.value !== '')) {
      const art: Article = {
        libelle: addLibelle.value,
        prix: parseInt(addPrix.value, 10)
      };

      this.dataServ.addArticle(art).subscribe(
        () => { this.ajoutFait = true; },
        err => { }
      );
    }
  }
}
