import { Component, OnInit, ChangeDetectorRef } from '@angular/core';
import { AlunoService } from '../../../../shared/services/aluno.service';
import { Aluno } from '../../../../shared/models/aluno.model';
import { MatDialog } from '@angular/material/dialog';
import { IncluirAlunoDialogComponent } from '../../components/incluir-aluno-dialog/incluir-aluno-dialog.component';


@Component({
  templateUrl: './alunos-page.component.html',
  styleUrls: ['./alunos-page.component.scss']
})

export class AlunosPageComponent implements OnInit {

  allAluno = new Array<Aluno>;

  colunas: string[] = ['idAluno', 'nomeAluno'];

  constructor(
    private cdr: ChangeDetectorRef,
    private alunoService: AlunoService,
    public dialog: MatDialog
  ) { }

  ngOnInit(): void {
    this.alunoService.findAllAluno().subscribe(alunos => {
      this.allAluno = alunos;
    });
  }

  createAluno() {
    console.log("Método: createAluno()");

    const dialogRef = this.dialog.open(IncluirAlunoDialogComponent);

    dialogRef.afterClosed().subscribe((result: Aluno) => {
      console.log(`Dialog result: ${JSON.stringify(result)}`);
      if(result) {
        this.allAluno = [...this.allAluno, result];
      }
    });
  }

}
