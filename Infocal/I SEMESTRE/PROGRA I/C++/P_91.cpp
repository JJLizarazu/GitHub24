//	ingrese 6 números en una matriz de 3X2 y obtenga el promedio aritmético Realízalo en c++
#include <iostream>
using namespace std;
int main(){
	cout << "==============================================" << endl;
	cout << "==  P R O M E D I O  E N  U N  V E C T O R  ==" << endl;
	cout << "==============================================" << endl;
	cout << "| INGRESE 6 VALORES PARA OBTENER SU PROMEDIO |" << endl;
	cout << "==============================================" << endl;
	cout << " " << endl;
	
	int array[3][2];
	float sumVector = 0;
	double averageVector;
	
	for (int c = 0 ; c < 6 ; c++){
		for (int i = 0 ; i < 3 ; i++){
			for (int j = 0 ; j < 2 ; j++){
				cout << "| Ingrese el valor (" << c + 1 << ") [" << i << "][" << j << "] del Vector" << endl;
				cout << "| --> " ; cin >> array[i][j];
				c++;
			}
		}
	}
	
	for (int i = 0 ; i < 3 ; i++){
		for (int j = 0 ; j < 2 ; j++){
			sumVector = sumVector + array[i][j];
		}
	}
	
	averageVector = sumVector / 6;
	cout << "===================================" << endl;
	cout << "-->  EL PROMEDIO DEL VECTOR ES  <--" << endl;
	cout << "              | " << averageVector << " |    " << endl;
	cout << "===================================" << endl;
	
}
