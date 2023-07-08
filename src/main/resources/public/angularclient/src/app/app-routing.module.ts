import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {TestListComponent} from "./components/test-list/test-list.component";
import {TestFormComponent} from "./components/test-form/test-form.component";

const routes: Routes = [
  { path: 'tests', component: TestListComponent },
  { path: 'add-test', component: TestFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
