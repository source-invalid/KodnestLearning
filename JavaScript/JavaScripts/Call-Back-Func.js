function greet(){
    return "Good Morning";
}

function display(x){
    return x();
}

console.log(display(greet));