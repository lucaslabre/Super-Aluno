import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AlunosPageComponent } from './pages/alunos-page/alunos-page.component';
import { SharedModule } from '../../shared/shared.module';



@NgModule({
  declarations: [
    AlunosPageComponent
  ],
  imports: [
    CommonModule,
    SharedModule
  ]
})
export class AlunosModule { }
