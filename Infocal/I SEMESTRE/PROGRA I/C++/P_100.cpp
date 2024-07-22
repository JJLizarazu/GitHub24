//	Implementar una función que reciba un número entero como parámetro y determine si es un número perfecto. 
//	Un número perfecto es aquel cuya suma de sus divisores propios (excluyendo al propio número) es igual al número mismo. 
//	Por ejemplo, el número 6 es perfecto, ya que sus divisores propios son 1, 2 y 3, y su suma es 6.
#include <iostream>
using namespace std;
//	SEPARADORES
static void separators(){
	cout << "    ========================" << endl;
}
//	MOSTRAR SI ES PERFECTO EL NUMERO O NO ES PERFECTO EL NUMERO
static void perfectNumberFuction(int sumOfDivisors, int perfectNumber){
	if(sumOfDivisors == perfectNumber){
    	separators();
    	cout << "    | SUMA DE LOS DIVISORES | -> " << sumOfDivisors << endl; 
		cout << "    | EL NUMERO ES PERFECTO |"  << endl;
		separators();
	} else {
		cout << "    ============================" << endl;
		cout << "    |   SUMA DE LOS DIVISORES  | -> " << sumOfDivisors << endl; 
		cout << "    | EL NUMERO NO ES PERFECTO |"  << endl;
		cout << "    ============================" << endl;
	}
	cout << endl;
}

// MOSTRAR DIVISORES Y REALIZAR LA SUMA
static void showArray(int array[], int perfectNumber, int numberOfArray){
	
	int sumOfDivisors = 0;
	cout << "    | DIVISORES DEL " << perfectNumber << " | " << endl;
	cout << endl;
	for (int i = 0 ; i < numberOfArray ; i++){
		cout << "    | " << array[i] << " | " ;
		sumOfDivisors = sumOfDivisors + array[i];
	}
	cout << endl;
	cout << endl;
	
	perfectNumberFuction(sumOfDivisors, perfectNumber);
}
//	HALLAR LOS DIVISORES DEL NUMERO Y ALMACENARLOS EN UNA MATRIZ
static void divisorsNumber(int perfectNumber){
	int numberOfArray = 0;
	for (int divisor = 1 ; divisor < perfectNumber ; divisor++){
		if(perfectNumber % divisor == 0){
			numberOfArray++;
		}
	}
	
	int array[numberOfArray];
	
	int i = 0;
	for (int divisor = 1 ; divisor < perfectNumber ; divisor++){
		if(perfectNumber % divisor == 0){
			if(i < numberOfArray){
				array[i] = divisor;
				i++;
			}
		}
	}
	
	showArray(array, perfectNumber, numberOfArray);
}

//MAIN
int main(){
	separators();
	cout << "    ==  NUMERO  PERFECTO  ==" << endl;
	separators();
	cout << "      INTRODUCE UN NUMERO \n  PARA DETERMINAR SI ES PERFECTO" << endl;
	separators();
	int perfectNumber;
	cout << "    ---> " ; cin >> perfectNumber;
	cout << endl;
	divisorsNumber(perfectNumber);		
}
