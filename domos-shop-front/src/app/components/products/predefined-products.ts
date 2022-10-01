import { Component, OnInit } from '@angular/core';

export interface Product {
  id: number;
  name: string;
  price: number;
  description: string;
}

export const products = [
  {
    id: 1,
    name: 'Montre bleu',
    price: 130,
    description: null
  },
  {
    id: 2,
    name: 'casque bluetooth',
    price: 59.99,
    description: 'Un casque bluetooth de très bonne qualité'
  },
  {
    id: 3,
    name: 'Souris gamer',
    price: 24.99,
    description: 'Souris gamer avec boutons programmables'
  }
];
