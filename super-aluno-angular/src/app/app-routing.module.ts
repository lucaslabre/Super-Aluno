import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AlunosPageComponent } from './features/alunos/pages/alunos-page/alunos-page.component';

const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: '/alunos' },
  { path: 'alunos', component: AlunosPageComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
