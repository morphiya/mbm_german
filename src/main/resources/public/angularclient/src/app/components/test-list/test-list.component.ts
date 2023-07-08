import {Component, OnInit} from '@angular/core';
import {Test} from "../../models/Test";
import {HttpServiceService} from "../../services/http-service.service";

@Component({
  selector: 'app-test-list',
  templateUrl: './test-list.component.html',
  styleUrls: ['./test-list.component.scss']
})
export class TestListComponent implements OnInit {
  tests: Test[] = [];

  constructor(private service: HttpServiceService) {  }

  ngOnInit() {
    this.service.findAll().subscribe(data=> {this.tests = data})
  }
}
