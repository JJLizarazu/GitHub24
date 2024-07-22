//	Dada una cantidad de milímetros, expresarlo en metros, decímetros, centímetros, y milímetros., realizalo en C++
#include <iostream>
using namespace std;
int main(){
	float milimeters;
	cout << "==== CONVERSOR DE LONGITUDES ====" << endl;
	cout << "Ingrese la cantidad de milimetros a convertir " << endl;
	cout << "-> " ; cin >> milimeters;
	double meters = milimeters / 1000;
	double decimeters = milimeters / 100;
	double centimeters = milimeters / 10;
	cout << "=====================" << endl;
	cout << milimeters << " milimetros son: " << endl;
	cout << "=====================" << endl;
	cout << meters << " metros." << endl;
	cout << decimeters << " decimetros." << endl;
	cout << centimeters << " centimetros." << endl;
	cout << "=====================" << endl;
}
