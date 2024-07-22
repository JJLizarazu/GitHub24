//	Escribir una función que reciba dos matrices cuadradas como parámetros y devuelva la suma de ambas matrices.
#include <iostream>
using namespace std;

static void separators(){
	cout << "     ======================" << endl;
}

static void showArrays(int arrayA[], int arrayB[], int arrayC[]){
	cout << "          MATRIZ A         +          MATRIZ B          =         MATRIZ C" << endl;
	for (int c = 1 ; c <= 6 ; c++){
		for(int i = 0 ; i < 4 ; i++){
			// SALTO DE LINEA
			if (c == 1 || c == 6){
				cout << endl;
			}
			if (c == 1){
				cout << "    |  | " << arrayA[i] << " |  | " << arrayA[i + 1] << " |  |     +     |  | " << arrayB[i] << " |  | " << arrayB[i + 1] << " |  |     =     |  | " << arrayC[i] << " |  | " << arrayC[i + 1] << " |  |"; 
				i++;
			}
			if (c == 6){
				cout << "    |  | " << arrayA[i] << " |  | " << arrayA[i + 1] << " |  |           |  | " << arrayB[i] << " |  | " << arrayB[i + 1] << " |  |           |  | " << arrayC[i] << " |  | " << arrayC[i + 1] << " |  |"; 
			}
		}
		c++;
	}
}

static void sumOfArrays(int arrayA[], int arrayB[]){
	int arrayC[4];
	
	// MATRIZ A + MATRIZ B = MATRIZ C

	for(int i = 0 ; i < 4 ; i++){
		arrayC[i] = arrayA[i] + arrayB[i];
	}
	
	showArrays(arrayA, arrayB, arrayC);
	
	
}

static void arrays(){
	
	// ARRAY A
	
	int arrayA[4];
	
	cout << endl;
	separators();
	cout << "            MATRIZ A" << endl;
	separators();
	
	for(int i = 0 ; i < 4 ; i++){
		cout << "INGRESA EL VALOR [" << i + 1 << "] DE LA MATRIZ A" << endl; 	
		cout << "-> " ; cin >> arrayA[i];
	}
	
	// ARRAY B
	
	int arrayB[4];
	
	cout << endl;
	separators();
	cout << "            MATRIZ B" << endl;
	separators();
	
	for(int i = 0 ; i < 4 ; i++){
		cout << "INGRESA EL VALOR [" << i + 1 << "] DE LA MATRIZ b" << endl; 	
		cout << "-> " ; cin >> arrayB[i];
	}
	
	sumOfArrays(arrayA, arrayB);
}

static void menu(){
	separators();
	cout << "     == SUMA DE MATRICES ==" << endl;
	separators();
	cout << "        INGRESE EL VALOR   " << endl;
	cout << "         DE 2 MATRICES     " << endl;
	separators();
	cout << endl;
}

int main(){
	menu();
	arrays();
}
