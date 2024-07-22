//	Dado un rango de números determine cuántos números primos contiene. Realízalo en c++
#include <iostream>
using namespace std;
int main() {
	int firstNumber, lastNumber, primeNumber = 0;
	cout << "== RANGO DE NÚMEROS ==" << endl;
	cout << "Determine un rango de numeros: " << endl;
	cout << "=============================" << endl;
	cout << "Ingrese el primer numero: " ; cin >> firstNumber;
	cout << "Ingrese el ultimo numero: " ; cin >> lastNumber;
	cout << "=============================" << endl;
	cout << " " << endl;
	for (int i = firstNumber ; i <= lastNumber ; i++){
		if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 || i == 3 || i == 5){
			primeNumber++;
		}
	}
	cout << "Entre " << firstNumber << " y " << lastNumber << " existen: " << primeNumber << " numeros primos." << endl;
}
