let input = require('fs').readFileSync('dev/stdin', 'utf-8');
let values = input.split('\n');

let x = parseInt(values.shift());
let y = parseInt(values.shift());

let PROD = x * y;

console.log("PROD = " + PROD);