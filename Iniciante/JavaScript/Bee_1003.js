let input = require('fs').readFileSync('dev/stdin', 'utf-8');
let values = input.split('\n');

let A = parseInt(values.shift());
let B = parseInt(values.shift());

let SOMA = A + B;

console.log("SOMA = " + SOMA);