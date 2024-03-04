function add(a,b){
    return a+b;
}

function sub(a,b){
    return a-b;
}
function mul(a,b){
    return a*b;
}
function div(a,b){
    return a/b;
}

let calc=(operation, a,b) => operation(a,b);

console.log(calc(add, 10, 5));
console.log(calc(sub, 10, 2));
console.log(calc(mul, 10, 3));
console.log(calc(div, 20, 4));