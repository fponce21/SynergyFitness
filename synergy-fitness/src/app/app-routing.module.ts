import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BuildGuideComponent } from './build-guide/build-guide.component';
import { CalorieComponent } from './calorie/calorie.component';
import { HomeComponent } from './home/home.component';
import { ProfileComponent } from './profile/profile.component';
import { SignupComponent } from './signup/signup.component';

const routes: Routes = [
  { path:'', component: HomeComponent },
  { path:'user', component: ProfileComponent  },
  { path: 'signup', component: SignupComponent },
  { path: 'calorietracker', component: CalorieComponent },
  { path: 'build-guide', component: BuildGuideComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
