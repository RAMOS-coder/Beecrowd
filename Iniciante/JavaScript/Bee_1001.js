let input = require('fs').readFileSync('dev/stdin', 'utf-8');
let values = input.split('\n');

let A = parseInt(values.shift());
let B = parseInt(values.shift());

let X = A + B;

console.log("X = " + X);