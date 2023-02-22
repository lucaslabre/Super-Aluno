import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Aluno } from '../models/aluno.model';

@Injectable({
  providedIn: 'root'
})
export class AlunoService {

  private API = 'http://localhost:8080/alunos';

  constructor(private http: HttpClient) { }

  findAllAluno() {
    return this.http.get<Array<Aluno>>(`${this.API}`);
  }

  findAlunoById(idAluno: number) {
    return this.http.get<Aluno>(`${this.API}/${idAluno}`);
  }

  createAluno(aluno: Aluno) {
    return this.http.post<Aluno>(`${this.API}`, aluno);
  }

}
