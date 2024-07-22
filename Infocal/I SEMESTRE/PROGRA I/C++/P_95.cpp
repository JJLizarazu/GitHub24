//	Dado 3 números obtener la suma. Cree una función para resolver el problema.
#include <iostream>
using namespace std;

int sumFuction (int num1, int num2, int num3){
	int sumNumbers;
	sumNumbers = num1 + num2 + num3;
	return sumNumbers;
}

int main(){
	cout << "================================" << endl;
	cout << "====  SUMA  CON  FUNCIONES  ====" << endl;
	cout << "================================" << endl;
	cout << " " << endl;
	int num1, num2, num3;
	cout << "Ingrese el primer numero" << endl;
	cout << "--> " ; cin >> num1;
	cout << "Ingrese el segundo numero" << endl;
	cout << "--> " ; cin >> num2;
	cout << "Ingrese el tercer numero" << endl;
	cout << "--> " ; cin >> num3;
	cout << " " << endl;
	cout << "===========================================" << endl;
	cout << "La suma de los valores es --> " << sumFuction(num1, num2, num3) << " <--" << endl;
	cout << "===========================================" << endl;
}

