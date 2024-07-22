#include <iostream>
//	Realizar un algoritmo que pida números 
// (se pedirá por teclado la cantidad de números a introducir). 
//	El programa debe informar de cuantos números introducidos son mayores que 0, menores que 0 e iguales a 0.
using namespace std;
int main(){
	int quantityNumbers;
	int num;
	int counterMay = 0, counterMin = 0, counterZero = 0;
	cout << "==== NÚMEROS ====" << endl;
	cout << "Ingrese la cantidad de números a introducir: "; cin >> quantityNumbers;
	cout << "==================================" << endl;
	for (int i = 1 ; i <= quantityNumbers ; i++){
		cout << "Ingrese el " << i << "o numero a introducir: "; cin >> num;
		if (num > 0){
			counterMay++;
		} else if (num < 0){
			counterMin++;
		} else if (num == 0){
			counterZero++;
		}
	}
	cout << "===============================" << endl;
	cout << "Hay " << counterMay << " numero/s mayor/es a 0" << endl;
	cout << "Hay " << counterMin << " numero/s menor/es a 0" << endl;
	cout << "Hay " << counterZero << " numero/s igual/es a 0" << endl;
	cout << "=================================" << endl;
}
