import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DescripcionExperienciasComponent } from './descripcion-experiencias.component';

describe('DescripcionExperienciasComponent', () => {
  let component: DescripcionExperienciasComponent;
  let fixture: ComponentFixture<DescripcionExperienciasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DescripcionExperienciasComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DescripcionExperienciasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
