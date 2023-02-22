import { ChangeDetectionStrategy, Component, Output } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { AlunoService } from '../../../../shared/services/aluno.service';
import { Aluno } from '../../../../shared/models/aluno.model';

@Component({
  selector: 'app-incluir-aluno-dialog',
  templateUrl: './incluir-aluno-dialog.component.html',
  styleUrls: ['./incluir-aluno-dialog.component.scss'],
  changeDetection: ChangeDetectionStrategy.OnPush
})

export class IncluirAlunoDialogComponent {

  @Output() includedAluno = new Aluno();
  form!: FormGroup;

  constructor(
    private alunoService: AlunoService,
    private formBuilder: FormBuilder
  ) { }

  ngOnInit(): void {
    this.createForm(this.includedAluno);
  }

  createForm(aluno: Aluno) {
    console.log("Método: createForm")
    this.form = this.formBuilder.group({
      nomeAluno: [aluno.nomeAluno],
      emailAluno: [aluno.emailAluno],
      cpfAluno: [aluno.cpfAluno],
      contatoAluno: [aluno.contatoAluno]
    })
  }

  createAluno() {
    console.log("Método: createAluno")
    this.includedAluno = this.form.value;
    this.alunoService.createAluno(this.includedAluno).subscribe(aluno => this.includedAluno = aluno);
    console.log(this.includedAluno);
  }

}
