import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TopBarComponent } from './components/top-bar/top-bar.component';
import { MaterialModule } from './material/material.module';


const components = [
  TopBarComponent
]

@NgModule({
  declarations: [
    ...components
  ],
  imports: [
    CommonModule,
    MaterialModule
  ],
  exports: [
    ...components,
    MaterialModule
  ]
})
export class SharedModule { }
