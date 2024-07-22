#include <iostream>
using namespace std;

// Funciones para las operaciones básicas
double suma(double a, double b) {
    return a + b;
}

double resta(double a, double b) {
    return a - b;
}

double multiplicacion(double a, double b) {
    return a * b;
}

double division(double a, double b) {
    if (b != 0) {
        return a / b;
    } else {
        cout << "Error: División por cero no permitida." << endl;
        return 0;
    }
}

int main() {
    double num1, num2;
    char operacion;

    cout << "Bienvenido a la calculadora básica en C++" << endl;
    cout << "Ingrese la operación que desea realizar (+, -, *, /): ";
    cin >> operacion;

    cout << "Ingrese el primer número: ";
    cin >> num1;

    cout << "Ingrese el segundo número: ";
    cin >> num2;

    double resultado;

    // Selección de la operación a realizar
    switch (operacion) {
        case '+':
            resultado = suma(num1, num2);
            cout << "Resultado: " << resultado << endl;
            break;
        case '-':
            resultado = resta(num1, num2);
            cout << "Resultado: " << resultado << endl;
            break;
        case '*':
            resultado = multiplicacion(num1, num2);
            cout << "Resultado: " << resultado << endl;
            break;
        case '/':
            resultado = division(num1, num2);
            if (num2 != 0) {
                cout << "Resultado: " << resultado << endl;
            }
            break;
        default:
            cout << "Operación no válida" << endl;
            break;
    }

    return 0;
}

