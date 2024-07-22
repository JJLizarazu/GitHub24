//	Escribir una función que reciba dos matrices cuadradas como parámetros y devuelva la suma de ambas matrices.
#include <iostream>
using namespace std;

static void showAndSumOfArrays(int arrayA[], int arrayB[]){
	/*
	
	a11  a12     b11  b12    c11  c12
	a21  a22     b21  b22    c21  c22 
	 
	
	
	for (int fila =¨0; fila < 4; fila++ ) {
		for (int col =¨0; col < 4; col++ ) {		
		c[fila][col] = a[fila][col] + b[fila][col];
	}
	}
	
	*/
	
	//
	int arrayC[4];
	for (int k = 0 ; k < 4 ; k++){
		for (int i = 0 ; i < 4 ; i++){
			for (int j = 0 ; j < 4 ; j++){
				arrayC[k] = arrayA[i] + arrayB[j];
				k++;
				i++;
			}
		}
	}
	
	cout << endl;
	cout << "  -- MATRIZ A --   +   -- MATRIZ B --   =   -- MATRIZ C --" << endl;
	cout << endl;
	for (int c = 1 ; c <= 12 ; c++){
		for (int i = 0 ; i < 4 ; i++){
			for (int j = 0 ; j < 4 ; j++){
				for (int k = 0 ; k < 4 ; k++){		
					if(c == 1 || c == 6){
						cout << endl;
					}
					if(c == 1){
						cout << "     | " << arrayA[i] << " | " << arrayA[i + 1] << " |    +    | " << arrayB[j] << " | " << arrayB[j + 1] << " |    =    | " << arrayC[k] << " | " << arrayC[k + 1] << " | ";
						i+=2;
						j++;
						k++;
					}
					if(c == 6){
						cout << "     | " << arrayA[i] << " | " << arrayA[i + 1] << " |         | " << arrayB[j] << " | " << arrayB[j + 1] << " |         | " << arrayC[k] << " | " << arrayC[k + 1] << " | ";
						i++;
						j++;
						k++;
					}
					c++;
				}
			}
		}
		cout << endl;
	}
	//
}

static void arrays(){
	int arrayA[4];
	cout << "	==================================" << endl;
	cout << "	INGRESE LOS VALORES DE LA MATRIZ A" << endl;
	cout << "	==================================" << endl;	
	cout << endl;
	for (int i = 0 ; i < 4 ; i++){
		cout << " | Ingrese el valor " << i + 1 << endl;
		cout << " | --> " ; cin >> arrayA[i];
	}
	cout << endl;
	int arrayB[4];
	cout << "	==================================" << endl;
	cout << "	INGRESE LOS VALORES DE LA MATRIZ B" << endl;
	cout << "	==================================" << endl;
	cout << endl;
	
	for (int j = 0 ; j < 4 ; j++){
		cout << " | Ingrese el valor " << j + 1 << endl;
		cout << " | --> " ; cin >> arrayB[j];
	}
	
	showAndSumOfArrays(arrayA, arrayB);
}

static void menu(){
	cout << "	=================================" << endl;
	cout << "	=== SUMA MATRICES - FUNCIONES ===" << endl;
	cout << "	=================================" << endl;
	cout << endl;
	cout << "      = INGRESE LOS VALORES DE DOS MATRICES =" << endl;
	cout << endl;
}

int main(){
	menu();
	arrays();
}
