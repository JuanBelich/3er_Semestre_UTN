let x = 10; // variable tipo primitiva
console.log(x.length);
console.log("Tipos primitivos")
//Objeto
let persona = {
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad:30,
    nombreCompleto: function(){ //metodo o funcion en javascripts
        return this.nombre+" "+this.apellido
    }
}




console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona)
console.log(persona.nombreCompleto())
console.log("Ejecutando con un objeto")

let persona2 = new Object(); //debe crear un nuevo objeto en memoria
persona2.nombre= 'juan';
persona2.direccion = 'Salada 14';
persona2.telefono = '654651215';
console.log(persona2.telefono);

console.log("Creamos un nuevo objeto")
console.log(persona['apellido']); //accedemos como si fuera un arreglo

// for in y accedemos al objeto como si fuera una arreglo

console.log("usamos el ciclo for in")
for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad])
}

console.log("cambiamos y eliminamos un error")
persona.apellida = 'Betancud' // cambiamos dinamicamente el valor de un objeto
delete persona.apellida; // Eliminamos el error
console.log(persona);

//Distintas formas de imprimir un objeto
//numero 1: la mas sencilla: concatenar cada propiedad
console.log("Distintas formas de imprimir un objeto: forma 1");
console.log(persona.nombre+", "+persona.apellido)

//numero 2: a traves de inm for in
console.log("Distintas formas de imprimir un objeto: forma 2");
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

//numero 3: La funcion Object.values()
console.log("Distintas formas de imprimir un objeto: forma 3");
let personaArray = Object.values(persona);
console.log(personaArray)

//Numero 4: Utilizamos el metodo JSON.stringify
console.log("Distintas formas de imprimir un objeto: forma 4");
let personaString = JSON.stringify(persona);
console.log(personaString)
