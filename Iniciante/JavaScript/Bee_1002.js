// Entrada de dados
// Inserir os dados no arquivo 'stdin'
var input = require('fs').readFileSync('dev/stdin', 'utf-8');
var valores = input.split('\n');

var n = 3.14159;
var raio = parseFloat(valores);

var area = n * Math.pow(raio, 2);

console.log("A=" + area.toFixed(4));