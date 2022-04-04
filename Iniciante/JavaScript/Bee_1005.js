let input = require('fs').readFileSync("dev/stdin", "utf-8");
let values = input.split("\n");

let A = parseFloat(values.shift());
let B = parseFloat(values.shift());

let media = (A * 3.5 + B * 7.5) / (3.5 + 7.5);

console.log("MEDIA = " + media.toFixed(5));