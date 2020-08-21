import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { ListeArticleComponent } from './liste-article/liste-article.component';
import { HttpClientModule } from '@angular/common/http';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { AjoutArticleComponent } from './ajout-article/ajout-article.component';

const ROUTES: Routes = [
  { path: 'listeart', component: ListeArticleComponent },
  { path: 'ajout', component: AjoutArticleComponent },
  { path: '', pathMatch: 'full', redirectTo: '/listeart' },
];

@NgModule({
  declarations: [
    AppComponent,
    ListeArticleComponent,
    NavBarComponent,
    AjoutArticleComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    NgbModule,
    RouterModule.forRoot(ROUTES)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
