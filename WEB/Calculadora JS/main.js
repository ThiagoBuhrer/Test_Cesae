let currentInput = "";  // Stores current input
let previousInput = ""; // Stores the previous input
let operator = "";      // Stores the current operator

// Append a number or operator to the display
function append(value) {
    currentInput += value;
    document.getElementById('display').value = currentInput;
}

// Clear the display and reset values
function clearDisplay() {
    currentInput = "";
    previousInput = "";
    operator = "";
    document.getElementById('display').value = "";
}

// Set the operator and prepare for next input
function operate(op) {
    if (previousInput && currentInput) calculate();
    operator = op;
    previousInput = currentInput;
    currentInput = "";
}

// Perform the calculation based on the operator
function calculate() {
    let result;
    const num1 = parseFloat(previousInput);
    const num2 = parseFloat(currentInput);

    if (operator === "+") result = num1 + num2;
    else if (operator === "-") result = num1 - num2;
    else if (operator === "*") result = num1 * num2;
    else if (operator === "/") result = num2 !== 0 ? num1 / num2 : "Error";

    document.getElementById('display').value = result;
    currentInput = result.toString();
    operator = "";
}
