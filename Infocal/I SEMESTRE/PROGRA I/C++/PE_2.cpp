//	Dado los siguientes operadores aritméticos Suma, Resta, Multiplicación  y  División, devuelva el símbolo del operador(+-*/). realízalo en c++
#include <iostream>
#include <String>
using namespace std;

static void symbol(string operation){
	cout << endl;
	if(operation == "suma" || operation == "SUMA"){
		cout << "  ==========" << endl;
		cout << "  -> | + | <-" << endl;
		cout << "  ==========" << endl;
	} else if (operation == "resta" || operation == "RESTA"){
		cout << "  ==========" << endl;
		cout << "  -> | - | <-" << endl;
		cout << "  ==========" << endl;
	} else if(operation == "multiplicacion" || operation == "MULTIPLICACION"){
		cout << "  ==========" << endl;
		cout << "  -> | * | <-" << endl;
		cout << "  ==========" << endl;
	} else if(operation == "division" || operation == "DIVISION"){
		cout << "  ==========" << endl;
		cout << "  -> | / | <-" << endl;
		cout << "  ==========" << endl;
	}
}

int main(){
	cout << "============================" << endl;
	cout << "== OPERADORES ARITMETICOS ==" << endl;
	cout << "============================" << endl;
	cout << "    INGRESE UN OPERADOR     " << endl;
	cout << "  PARA DEVOLVER SU SIMBOLO  " << endl;
	cout << "============================" << endl;
	string operation;
	cout << " -> " ; cin >> operation;
	symbol(operation);
}
