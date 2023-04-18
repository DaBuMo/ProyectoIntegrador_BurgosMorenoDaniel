export class persona
{
    id?: Number;
    nombre: String;
    apellido: String;
    img: String;

    constructor(nombre:string,appellido:string,img:string)
    {
        this.nombre = nombre;
        this.apellido =appellido;
        this.img = img;
    }
}