import { Component } from '@angular/core';
import {Test} from "../../models/Test";
import {ActivatedRoute, Router} from "@angular/router";
import {HttpServiceService} from "../../services/http-service.service";

@Component({
  selector: 'app-test-form',
  templateUrl: './test-form.component.html',
  styleUrls: ['./test-form.component.scss']
})
export class TestFormComponent {
  test: Test;

  constructor(
    private rout: ActivatedRoute,
    private router: Router,
    private service: HttpServiceService
  ) {
    this.test = new Test();
  }

  onSubmit() {
    this.service.save(this.test).subscribe(result => this.gotoUserList());
  }

  gotoUserList() {
    this.router.navigate(['/tests']);
  }
}
