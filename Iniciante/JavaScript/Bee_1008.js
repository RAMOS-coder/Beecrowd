let input = require('fs').readFileSync("dev/stdin", "utf-8");
let values = input.split("\n");

let id = parseInt(values.shift());
let horasTrab = parseInt(values.shift());
let valorHora = parseFloat(values.shift());

let salario = horasTrab * valorHora;

console.log("NUMBER = " + id);
console.log("SALARY = U$ " + salario.toFixed(2));