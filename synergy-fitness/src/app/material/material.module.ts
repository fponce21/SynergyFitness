import { NgModule } from '@angular/core';
import {MatButtonModule} from '@angular/material/button';
import {MatDialogConfig, MatDialogModule} from '@angular/material/dialog';
import {MatIcon, MatIconModule} from '@angular/material/icon';
import { MatCardModule} from '@angular/material/card';

const MaterialComponents = [
  MatButtonModule,
  MatDialogModule,
  MatIconModule,
  MatCardModule
];

@NgModule({
  imports: [MaterialComponents],
  exports: [MaterialComponents]
})
export class MaterialModule { }
