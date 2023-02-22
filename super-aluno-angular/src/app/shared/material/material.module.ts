import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatTableModule } from '@angular/material/table';
import { MatCardModule } from '@angular/material/card';
import { MatButtonModule } from '@angular/material/button';
import { MatDialogModule } from '@angular/material/dialog';
import { MatInputModule } from '@angular/material/input';




const MATERIAL = [
  MatTableModule,
  MatCardModule,
  MatButtonModule,
  MatDialogModule,
  MatInputModule
]

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    ...MATERIAL
  ],
  exports: [
    ...MATERIAL
  ]
})
export class MaterialModule { }
