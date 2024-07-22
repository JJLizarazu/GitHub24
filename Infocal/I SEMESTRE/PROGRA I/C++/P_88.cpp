//	Dado 4 números, almacénelo en un vector, determine cual es el número mayor y menor. Realízalo en c++
#include <iostream>
using namespace std;
int main (){
	int vector[4];
	int tempVectorMajor = 0;
	int tempVectorMinor = 10000;
	cout << "== MAYOR NUMERO EN UN VECTOR ==" << endl;
	cout << "=======================================" << endl;
	for (int i = 0 ;  i < 4 ; i++){
		cout << "Introduzca el numero " << i + 1 << " del vector" << endl;
		cout << "-->  " ; cin >> vector[i];
		cout << "=======================================" << endl;
	}
	for (int i = 0 ; i < 4 ; i++){
		if (vector[i] > tempVectorMajor){
			tempVectorMajor = vector[i];
		}
	}
	for (int i = 0 ; i < 4 ; i++){
		if (vector[i] < tempVectorMinor){
			tempVectorMinor = vector[i];
		}
	}
	cout << " " << endl;
	cout << "=============================" << endl;
	cout << "El mayor numero es  -> " << tempVectorMajor << " <-" << endl;
	cout << "=============================" << endl;
	cout << " " << endl;
	cout << "=============================" << endl;
	cout << "El menor numero es  -> " << tempVectorMinor << " <-" << endl;
	cout << "=============================" << endl;
}
