import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Test } from "../models/Test";
import { Observable } from "rxjs";

@Injectable()
export class HttpServiceService {
  private testUrls: string;

  constructor(private http: HttpClient) {
    this.testUrls = 'http://localhost:8012/test/tests';
  }

  public findAll(): Observable<Test[]> { return this.http.get<Test[]>(this.testUrls); }
  public save(test: Test) { return this.http.post<Test>(this.testUrls, test); }

  // getWord() { return this.http.get('/api/words') }
  // getAllTests(){ return this.http.get('/test/hello') }
  // addTest(test: Test) {
  //   const headers = {'content-type': 'application/json'}
  //   const body = JSON.stringify(test)
  //   return this.http.post('test/tests', body, {'headers': headers})
  //   }
}
