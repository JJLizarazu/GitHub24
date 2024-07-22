//	Dado 7 números y almacénelo en un vector, luego obtenga la suma y el promedio de los valores almacenados. Realízalo en c++
#include <iostream>
using namespace std;

static void averageFunctionVector(float sumVector){
	double averageVector = sumVector / 7;
	cout << endl;
	cout << "   ===============================================" << endl;
	cout << "   |   -> EL PROMEDIO DEL VECTOR ES = " << averageVector << endl;
	cout << "   ===============================================" << endl;
}

static void sumFunctionVector(int vector[]){
	float sumVector = 0;
	for(int i = 0 ; i < 7 ; i++){
		sumVector = sumVector + vector[i];
	}
	cout << endl;
	cout << "   ===============================================" << endl;
	cout << "   |      -> LA SUMA DEL VECTOR ES = " << sumVector << endl;
	cout << "   ===============================================" << endl;
	averageFunctionVector(sumVector);
}

static void vectorFunction(int vector[]){
	cout << endl;
	cout << "   ===============================================" << endl;
	for(int i = 0 ; i < 7 ; i++){
		cout << "   | Ingrese el [" << i + 1 << "] valor del vector" << endl;
		cout << "   -> "; cin >> vector[i];
	}
	sumFunctionVector(vector);
}

int main(){
	cout << "==================================" << endl;
	cout << "== SUMA Y PROMEDIO DE UN VECTOR ==" << endl;
	cout << "==================================" << endl;
	cout << "   INGRESE 7 VALORES AL VECTOR    " << endl;
	cout << "==================================" << endl;
	int vector[7];
	vectorFunction(vector);
}
