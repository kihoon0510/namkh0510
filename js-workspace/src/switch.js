var n = 2;

switch(n){
    case 1:
        console.log("One");
        break;
    case 2:
        console.log("Two");
        break;
    case 3:
        console.log("Three");
        break;
    default:
        console.log("Other");
}

function binaryOperation(a,b,operator){
    switch(operator){
        case "+": return a+b;
        case "-": return a-b;
        case "*": return a*b;
        case "/": return a/b;
        case "%": return a%b;
        case "^": return Math.pow(a,b);
        default: return NaN;
    }
}

console.log(binaryOperation(2,3,"+"));  // 5