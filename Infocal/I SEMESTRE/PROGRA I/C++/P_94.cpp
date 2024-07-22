//	Cree una matriz de 4X3 y obtenga los números mayores de cada columna. Realízalo en c++
#include <iostream>
using namespace std;
int main(){
	cout << "===============================" << endl;
	cout << "=== MAYOR NUMERO EN COLUMNA ===" << endl;
	cout << "===============================" << endl;
	cout << " " << endl;
	
	int array [4][3];
	int arrayMajor [3];
	
	// INGRESAR LOS VALORES DEL ARRAY
	for (int c = 0 ; c < 12 ; c++){
		for (int i = 0 ; i < 4 ; i++){
			for (int j = 0 ; j < 3 ; j++){
				cout << "=====================================================" << endl;
				cout << "Ingrese el valor (" << c + 1 << ") [" << i << "][" << j << "] de la matriz" << endl; 
				cout << "--> " ; cin >> array[i][j];
				c++;
			}
		}
	}
	
	// CONVERTIR LOS VALORES DE K A 0
	for (int k = 0 ; k < 3 ; k++){
		arrayMajor[k] = 0;
	}
	
	for (int i = 0 ; i < 4 ; i++){
		if(array[i][0] > arrayMajor[0]){
			arrayMajor[0] = array[i][0];
		}
		if(array[i][1] > arrayMajor[1]){
			arrayMajor[1] = array[i][1];
		}
		if(array[i][2] > arrayMajor[2]){
			arrayMajor[2] = array[i][2];
		}
	}
	
	// MOSTRAR LA MATRIZ
	cout << " " << endl;
	cout << "    ======= MATRIZ =======" << endl;
	for (int c = 0 ; c < 12 ; c++){
		for(int i = 0 ; i < 4 ; i++){
			for(int j = 0 ; j < 3 ; j++){
				if (c == 3 || c == 6 || c == 9){
					cout << " " << endl;
				}
				if (c == 0 || c == 3 || c == 6 || c == 9){
					cout << "    " ;
				}
				cout << " | " << array[i][j]<< " | ";
				c++;
			}
		}
				cout << " " << endl;
	}
	cout << "    ======================" << endl;
	
	//	MOSTRAR LOS NUMEROS MAYORES  
	for (int c = 0 ; c < 3 ; c++){
		for (int k = 0 ; k < 3 ; k++){	
			if (c == 0){
				cout << "    " ;
			}
			cout << " | " << arrayMajor[k] << " | ";
			c++;
		}
	}
	cout << " " << endl;
}
