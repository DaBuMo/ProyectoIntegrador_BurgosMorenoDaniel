import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DescripcionEstudiosComponent } from './descripcion-estudios.component';

describe('DescripcionEstudiosComponent', () => {
  let component: DescripcionEstudiosComponent;
  let fixture: ComponentFixture<DescripcionEstudiosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DescripcionEstudiosComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DescripcionEstudiosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
