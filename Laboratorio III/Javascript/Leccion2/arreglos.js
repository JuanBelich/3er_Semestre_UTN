//Creacion de arrays o arreglos

// let autos = new Array("Ferrari", "Renault", "BMW"); sintaxis antigua

const autos = ["Ferrari", "Renault", "BMW"];
console.log(autos);

//recorremos elementos de un arreglo
console.log(autos[0]);
console.log(autos[2]);

for(let i = 0 ; i < autos.length;i++){
    console.log(i+" :"+autos[i]);
}

//modificamos los elementos del arreglo
autos[1] = "Volvo";
console.log(autos[2]);

//agregar nuevos valores al arreglo
autos.push("Audi") //agregamos elemento al final del arreglo
console.log(autos);

//otras formas de agregar elementos al arreglo
autos[autos.length] = "Porsche"
console.log(autos)

//tercer forma de agf
autos[6] = "Renault";
console.log(autos)

//como preguntar si es un arreglo
console.log(Array.isArray(autos)); //devuelve un booleano

console.log(autos instanceof Array); //preguintamos si la variable es instancia de la clase arragy

