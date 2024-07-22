//	Dado 6 números y almacénelo en un vector, luego obtenga cuantos números multiplos de n ha ingresado. Realízalo en c++
#include <iostream>
using namespace std;
int main(){
	cout << "===============================" << endl;
	cout << "===   MULTIPLOS EN VECTOR   ===" << endl;
	cout << "===============================" << endl;
	cout << "Ingrese los valores del vector: " << endl;
	cout << " " << endl;
	
	int array [3][2];
	int multiply, aux = 0;
	
	for (int i = 0 ; i < 3 ; i++){
		for (int j = 0 ; j < 2 ; j++){
			cout << "Ingrese el valor [" << i << "][" << j << "] del vector" << endl;
			cout << "-> " ; cin >> array[i][j];
		}
	}
	
	cout << " " << endl;
	cout << "Ingrese un numero para determinar cuantos multiplos de este existen en el vector" << endl;
	cout << "--> " ; cin >> multiply;
	
	for (int i = 0 ; i < 3 ; i++){
		for ( int j = 0 ; j < 2 ; j++){
			if (array[i][j] % multiply == 0){
				aux++;
			}
		}
	} 
	cout << "=================================================================" << endl;
	cout << "En la matriz hay  -> " << aux << " <-  numeros multiplos de " << multiply << endl;
	cout << "=================================================================" << endl;
}
