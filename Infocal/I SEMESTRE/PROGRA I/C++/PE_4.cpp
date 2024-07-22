//	Ingrese 8 números en una matriz de 2X4 y obtenga el promedio aritmético Realízalo en c++
#include <iostream>
using namespace std;

static void averageFunction(int array[][4]){
	for(int c = 1 ; c <= 8 ; c++){
		for(int i = 0 ; i < 2 ; i++){
			for(int j = 0 ; j < 4 ; j++){
				cout << "| Ingrese el valor (" << c << ") [" << i << "][" << j << "] de la matriz" << endl;
				cout << " -> "; cin >> array[i][j];
				c++;
			}
		}
	}
	
	float averageArray;
	float sumArray = 0;
	
	for(int i = 0 ; i < 2 ; i++){
		for(int j = 0 ; j < 4 ; j++){
			sumArray = sumArray + array[i][j];
		}
	}
	
	averageArray = sumArray / 8;
	
	cout << endl;
	cout << "        ====   MATRIZ   =====" << endl;
	for(int c = 1 ; c <= 8 ; c++){
		for(int i = 0 ; i < 2 ; i++){
			for(int j = 0 ; j < 4 ; j++){
				if(c == 1 || c == 5){
					cout << endl;
				}
				cout << "    | " << array[i][j] << " | ";
				c++;
			}
		}
	}
	
	cout << endl;
	cout << endl;
	cout << "   ===============================================" << endl;
	cout << "   |      -> LA SUMA DE LA MATRIZ ES = " << sumArray << endl;
	cout << "   ===============================================" << endl;
	cout << endl;
	cout << "   ===============================================" << endl;
	cout << "   |   -> EL PROMEDIO DE LA MATRIZ ES = " << averageArray << endl;
	cout << "   ===============================================" << endl;
	
}

int main(){
	cout << "=================================" << endl;
	cout << "===  PROMEDIO ARITMETICO 2X4  ===" << endl;
	cout << "=================================" << endl;
	cout << "INGRESA 8 VALORES PARA LA MATRIZ" << endl;
	cout << "=================================" << endl;
	int array[2][4];
	averageFunction(array);
}
