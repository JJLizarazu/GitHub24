//	lngrese 6 números en una matriz de 3X2 y obtenga la suma de cada fila Realízalo en c++
#include <iostream>
using namespace std;
int main(){
	
	cout << "==================================" << endl;
	cout << "==  SUMA DE FILAS EN UN VECTOR  ==" << endl;
	cout << "==================================" << endl;
	cout << " " << endl;
	cout << "| INGRESE LOS VALORES DEL VECTOR |" << endl;
	cout << " " << endl;
	
	int array[3][2];
	int sumVector[3];
	
	// Ingresar valores del Vector:
	
	for	(int c = 1 ; c <= 6 ; c++){
		for (int i = 0 ; i < 3 ; i++){
			for (int j = 0 ; j < 2 ; j++){
				cout << "| Ingrese el valor (" << c << ") [" << i << "][" << j << "] del vector |" << endl;
				cout << "| --> " ; cin >> array[i][j];
				c++;
			}
		}
	}

	// Realizar la suma de las filas del Vector:

	for (int k = 0 ; k < 3 ; k++){
		for (int i = 0 ; i < 3 ; i++){
				sumVector[k] = array[i][0] + array[i][1];
				k++;
		}
	}
	
	// Mostrar el vector con la suma hecha : 
	cout << " " << endl;
	cout << "=====   V E C T O R   =====" << endl;
	cout << " " << endl;
	for	(int c = 0 ; c < 6 ; c++){
		for (int k = 0 ; k < 3 ; k++){		
			for (int i = 0 ; i < 3 ; i++){
				for (int j = 0 ; j < 2 ; j++){
					if (c == 2 || c == 4){
						cout << "  =   " << sumVector[k] << "  " << endl;
						k++;
					}
					if (c == 1 || c == 3 || c == 5){
						cout << " + " ;
					}
					cout << "| | " << array[i][j] << " | |";
					c++;
				}
			}
			
			cout << "  =   " << sumVector[k] << "  " << endl;
		
		}
	}
}
