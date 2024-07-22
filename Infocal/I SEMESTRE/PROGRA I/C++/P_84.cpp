//	Dado los siguientes operadores aritméticos +, -, *  y  /, devuelva el nombre del operador. realízalo en c++
#include <iostream>
#include <string>
using namespace std;
int main(){
	string operacion;
	cout << "==== OPERADORES ARITMETICOS ====" << endl;
	cout << "Ingrese un operador aritmetico " << endl;
	cout << "       ( + ; - ; * ; / )       " << endl;
	cout << "-> " ; cin >> operacion;
	if (operacion == "+"){
		cout << "==========" << endl;
		cout << "suma - mas" << endl;
		cout << "==========" << endl;
	} else if (operacion == "-"){
		cout << "=============" << endl;
		cout << "resta - menos" << endl;
		cout << "=============" << endl;
	} else if (operacion == "*"){
		cout << "====================" << endl;
		cout << "multiplicacion - por" << endl;
		cout << "====================" << endl;
	} else if (operacion == "/"){
		cout << "================" << endl;
		cout << "division - entre" << endl;
		cout << "================" << endl;
	} else {
		cout << "======================" << endl;
		cout << "ESE OPERADOR NO EXISTE" << endl;
		cout << "======================" << endl;
	}
}
