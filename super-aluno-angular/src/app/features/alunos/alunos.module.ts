import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AlunosPageComponent } from './pages/alunos-page/alunos-page.component';
import { SharedModule } from '../../shared/shared.module';
import { IncluirAlunoDialogComponent } from './components/incluir-aluno-dialog/incluir-aluno-dialog.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';



@NgModule({
  declarations: [
    AlunosPageComponent,
    IncluirAlunoDialogComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    SharedModule
  ]
})
export class AlunosModule { }
