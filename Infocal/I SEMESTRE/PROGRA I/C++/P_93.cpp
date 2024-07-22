//	Cree una matriz de A de 2X2 y otra B de2X2 y obtenga una matriz C = A * B. Realízalo en c++
#include <iostream>
using namespace std;
int main(){
	cout << "=====================================================" << endl;
	cout << "==========   MULTIPLICACION  DE  MATRICES  ==========" << endl;
	cout << "=====================================================" << endl;
	cout << "INGRESE LOS VALORES DE LAS DOS MATRICES A MULTIPLICAR" << endl;
	cout << "=====================================================" << endl;
	cout << " " << endl;
	
	int arrayA [2][2];
	int arrayB [2][2];
	int arrayC [2][2];
	
	cout << "          ------>  MATRIZ A  <------" << endl;
	for (int c = 1 ; c <= 4 ; c++){
		for (int i = 0 ; i < 2 ; i++){
			for (int j = 0 ; j < 2 ; j++){
				cout << "=====================================================" << endl;
				cout << "Ingrese el valor (" << c << ") [" << i << "][" << j << "] de la matriz A" << endl; 	
				cout << "--> " ; cin >> arrayA[i][j];
				c++;
			}
		}
	}
	
	cout << " " << endl;
	cout << "          ------>  MATRIZ B  <------" << endl;
	for (int c = 1 ; c <= 4 ; c++){
		for (int i = 0 ; i < 2 ; i++){
			for (int j = 0 ; j < 2 ; j++){
				cout << "=====================================================" << endl;
				cout << "Ingrese el valor (" << c << ") [" << i << "][" << j << "] de la matriz B" << endl; 	
				cout << "--> " ; cin >> arrayB[i][j];
				c++;
			}
		}
	}
	
	cout << " " << endl;
	cout << "==== MULTIPLICACION MATRIZ A * B ====" << endl;
	cout << " " << endl;
	
	for (int c = 1 ; c <= 4 ; c++){
		for (int i = 0 ; i < 2 ; i++){
			for (int j = 0 ; j < 2 ; j++){
				if (c == 3){
					cout << " " << endl;
				}
				if (c == 1 || c == 3){
					cout << "     " ;
				}
				arrayC[i][j] = arrayA[i][j] * arrayB[i][j];
				cout << " | " << arrayC[i][j] << " | " ;
				c++;
			}
		}
		cout << " " << endl;
	}
	
}
