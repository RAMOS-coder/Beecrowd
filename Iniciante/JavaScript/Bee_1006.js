let input = require('fs').readFileSync("dev/stdin", "utf-8");
let values = input.split("\n");

let A = parseFloat(values.shift());
let B = parseFloat(values.shift());
let C = parseFloat(values.shift());

let media = (A*2.0 + B*3.0 + C*5.0) / (2.0 + 3.0 + 5.0);

console.log("MEDIA = " + media.toFixed(1));