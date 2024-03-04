function sayHello(name){
    return "Good Morning "+name;
}

let x= function display(x,name){
        return x(name);
        
    }

console.log(x(sayHello,'Anuj'));