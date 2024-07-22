//	Crear una función que reciba un arreglo de números enteros y determine cuántos de ellos son pares.
#include <iostream>
using namespace std;

static void arrayOfNumbers(int numbersArray){
	int array[numbersArray];
	for (int i = 0 ; i < numbersArray ; i++){
		cout << "Introduzca el valor (" << i + 1 << ") de la matriz" << endl;
		cout << "--> " ; cin >> array[i];
	}
	
	int counterPairs = 0;
	for (int i = 0 ; i < numbersArray ; i++){
		if (array[i] % 2 == 0){
			counterPairs++;
		}
	}
	cout << "Hay -> " << counterPairs << " numeros pares" << endl;
}

int main(){
	cout << "================" << endl;
	cout << "--> MATRIZ <--" << endl;
	cout << "================" << endl;
	cout << "Ingrese la cantidad de numeros que tendra la matriz" << endl;
	int numbersArray;
	cout << "--> " ; cin >> numbersArray;
	arrayOfNumbers(numbersArray);
}
