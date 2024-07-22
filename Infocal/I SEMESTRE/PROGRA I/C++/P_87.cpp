//	Dado 4 números y almacénelo en un vector, luego obtenga la suma y el promedio de los valores almacenados. Realízalo en c++
#include <iostream>
using namespace std;
int main(){
	int vector[4];
	int sum = 0;
	double average;
	cout << "== SUMA DE UN VECTOR ==" << endl;
	cout << "==================================" << endl;
	for (int i = 0 ; i < 4 ; i++){
		cout << "Introduzca el numero " << i + 1 << " del vector" << endl;
		cout << "---> " ; cin >> vector[i];
		sum = sum + vector[i];
		cout << "==================================" << endl;
	}
	average = sum / 4;
	cout << " " << endl;
	cout << "======================" << endl;
	cout << "La suma del vector es: " << endl;
	cout << "     --> " << sum << " <--" << endl;
	cout << "======================" << endl;
	cout << " " << endl;
	cout << "============================" << endl;
	cout << "El promedio del vector es: " << endl;
	cout << "     --> " << average << " <--" << endl;
	cout << "============================" << endl;
}
