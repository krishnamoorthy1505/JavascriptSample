import { Component, OnInit } from '@angular/core';
import { Recipe } from '../recipe.model';
@Component({
  selector: 'app-recipe-list',
  templateUrl: './recipe-list.component.html',
  styleUrls: ['./recipe-list.component.css']
})
export class RecipeListComponent implements OnInit {
  recipes: Recipe[]=[
    new Recipe('A New Recipe','A List of Recipe','https://picturetherecipe.com/wp-content/uploads/2018/06/Chicken-Cutlets-by-PictureTheRecipe-Featured-395x500.jpg'),
    new Recipe('A New Recipe','A List of Recipe','https://picturetherecipe.com/wp-content/uploads/2018/06/Chicken-Cutlets-by-PictureTheRecipe-Featured-395x500.jpg')

  ];
  constructor() { }

  ngOnInit(): void {
  }

}
