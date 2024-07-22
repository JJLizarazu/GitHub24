//	Dado el número de un mes, devolver el mes en letras, realizalo en C++
#include <iostream>
using namespace std;
int main() {
	int num;
	cout << "==== NUMERO - MESES ====" << endl;
	cout << "Ingrese un numero para compararlo con un mes " << endl;
	cout << ": " ; cin >> num;
	if (num == 1){
		cout << "=======" << endl;
		cout << " ENERO " << endl;
		cout << "=======" << endl;
	} else if (num == 2){
		cout << "=========" << endl;
		cout << " FEBRERO " << endl;
		cout << "=========" << endl;
	} else if (num == 3){
		cout << "=======" << endl;
		cout << " MARZO " << endl;
		cout << "=======" << endl;
	} else if (num == 4){
		cout << "=======" << endl;
		cout << " ABRIL " << endl;
		cout << "=======" << endl;
	} else if (num == 5){
		cout << "======" << endl;
		cout << " MAYO " << endl;
		cout << "======" << endl;
	} else if (num == 6){
		cout << "=======" << endl;
		cout << " JUNIO " << endl;
		cout << "=======" << endl;
	} else if (num == 7){
		cout << "=======" << endl;
		cout << " JULIO " << endl;
		cout << "=======" << endl;
	} else if (num == 8){
		cout << "========" << endl;
		cout << " AGOSTO " << endl;
		cout << "========" << endl;
	} else if (num == 9){
		cout << "============" << endl;
		cout << " SEPTIEMBRE " << endl;
		cout << "============" << endl;
	} else if (num == 10){
		cout << "=========" << endl;
		cout << " OCTUBRE " << endl;
		cout << "=========" << endl;
	} else if (num == 11){
		cout << "===========" << endl;
		cout << " NOVIEMBRE " << endl;
		cout << "===========" << endl;
	} else if (num == 12){
		cout << "===========" << endl;
		cout << " DICIEMBRE " << endl;
		cout << "===========" << endl;
	} else if (num < 1 || num > 12){
		cout << "===================" << endl;
		cout << " ESE MES NO EXISTE " << endl;
		cout << "===================" << endl;
	}
}
