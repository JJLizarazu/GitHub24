//	Calcular la suma y el producto de los N primeros números naturales múltiplos de 3. Realízalo en c++
#include <iostream>
using namespace std;
int main(){
	int number, sum = 0, multiplicator = 1;
	cout << "== SUMA Y PRODUCTO =="	<< endl;
	cout << "Ingrese el numero de multiplos de 3 que desea " << endl;
	cout << "--> " ; cin >> number;
	for (int i = 1 ; i <= number ; i++ ){
		sum = sum + (i * 3);
		multiplicator = multiplicator * (i * 3);
	}
	cout << "La suma de los " << number << " primeros numeros naturales es: " << sum << endl;
	cout << "El producto de los " << number << " primeros numeros naturales es: " << multiplicator << endl;
}
