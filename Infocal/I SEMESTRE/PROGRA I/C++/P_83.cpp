//	Lea un número del 1 al 7 y devuelva el día de la semana, considere que 1 es Lunes., realizalo en C++
#include <iostream>
using namespace std;
int main(){
	int num;
	cout << "==== NUMERO - DIAS ====" << endl;
	cout << "Ingrese un numero para compararlo con un dia " << endl;
	cout << ": " ; cin >> num;
	if (num == 1){
		cout << "=======" << endl;
		cout << " LUNES " << endl;
		cout << "=======" << endl;
	} else if (num == 2){
		cout << "========" << endl;
		cout << " MARTES " << endl;
		cout << "========" << endl;
	} else if (num == 3){
		cout << "===========" << endl;
		cout << " MIERCOLES " << endl;
		cout << "===========" << endl;
	} else if (num == 4){
		cout << "========" << endl;
		cout << " JUEVES " << endl;
		cout << "========" << endl;
	} else if (num == 5){
		cout << "=========" << endl;
		cout << " VIERNES " << endl;
		cout << "=========" << endl;
	} else if (num == 6){
		cout << "========" << endl;
		cout << " SABADO " << endl;
		cout << "========" << endl;
	} else if (num == 7){
		cout << "=========" << endl;
		cout << " DOMINGO " << endl;
		cout << "=========" << endl;
	} else if (num < 1 || num > 7){
		cout << "===================" << endl;
		cout << " ESE DIA NO EXISTE " << endl;
		cout << "===================" << endl;
	}
}
