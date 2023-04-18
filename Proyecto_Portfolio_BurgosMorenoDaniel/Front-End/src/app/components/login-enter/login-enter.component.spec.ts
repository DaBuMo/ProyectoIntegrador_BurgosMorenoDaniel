import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoginEnterComponent } from './login-enter.component';

describe('LoginEnterComponent', () => {
  let component: LoginEnterComponent;
  let fixture: ComponentFixture<LoginEnterComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LoginEnterComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LoginEnterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
