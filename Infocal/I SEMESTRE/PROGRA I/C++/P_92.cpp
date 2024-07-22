//	En una matriz de 2X3 ingrese 6 números y multiplique su contenido por un valor K y obtenga la suma de los números de la matriz. Realízalo en c++
#include <iostream>
using namespace std;
int main(){
	cout << "====================================" << endl;
	cout << "======    K  *  M A T R I Z   ======" << endl;
	cout << "====================================" << endl;
	cout << " INGRESE LOS VALORES PARA LA MATRIZ " << endl;
	cout << "====================================" << endl;
	cout << " " << endl;
	int array [2][3];
	int multiply, sumArray = 0, sumArrayMultiplicated = 0;
	
	for (int c = 1 ; c <= 6 ; c++){
		for(int i = 0 ; i < 2 ; i++){
			for(int j = 0 ; j < 3 ; j++){
				cout << "=================================================" << endl;
				cout << "Ingresa el valor (" << c << ") [" << i << "][" << j << "] de la matriz" << endl; 
				cout << "--> " ; cin >> array[i][j];
				sumArray = sumArray + array[i][j];
				c++;
			}
		}
	}
	cout << " " << endl;
	cout << "===================================================" << endl;
	cout << "INGRESE UN NUMERO PARA QUE MULTIPLIQUE A LA MATRIZ:" << endl;
	cout << "--> " ; cin >> multiply;
	cout << "===================================================" << endl;
	cout << " " << endl;
	cout << "========================================" << endl;
	cout << "-------------> MATRIZ * " << multiply << " <-----------" << endl;
	cout << "=======================================" << endl;
	cout << " " << endl;
	
	for (int c = 1 ; c <= 6 ; c++){
		for(int i = 0 ; i < 2 ; i++){
			for(int j = 0 ; j < 3 ; j++){
				if (c == 4){
					cout << " " << endl;
				}
				if (c == 1 || c == 4){
					cout << "    " ;
				}
				cout << " | " << (array[i][j]) * multiply << " | ";
				sumArrayMultiplicated = sumArrayMultiplicated + ((array[i][j]) * multiply);
				c++;
			}
		}
				cout << " " << endl;
	}
	cout << " " << endl;
	cout << "======================================" << endl;
	cout << "--------> SUMA DE LA MATRIZ <---------" << endl;
	cout << "------------->  " << sumArray << "  <--------------" << endl;
	cout << "======================================" << endl;
	cout << " " << endl;
	cout << "======================================" << endl;
	cout << "->  SUMA DE LA MATRIZ MULTIPLICADA  <-" << endl;
	cout << "---------> " << sumArrayMultiplicated << " <---------" << endl;
	cout << "======================================" << endl;
	cout << " " << endl;
}
