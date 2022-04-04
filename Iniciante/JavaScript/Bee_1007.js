let input = require('fs').readFileSync("dev/stdin", "utf-8");
let values = input.split("\n");

let A = parseInt(values.shift());
let B = parseInt(values.shift());
let C = parseInt(values.shift());
let D = parseInt(values.shift());

let diferenca = A*B - C*D;

console.log("DIFERENCA = " + diferenca);