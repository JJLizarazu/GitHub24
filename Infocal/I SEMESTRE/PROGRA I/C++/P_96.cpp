//	Hallar el Área y el perímetro un de un Cuadrado, cree un procedimiento para realizar de dicha tarea. Realízalo en c++
#include <iostream>
using namespace std;

static void areaFuction (int length){
	int areaSquare;
	areaSquare = length * length;
	cout << "=========================" << endl;
	cout << "El area del cuadrado es " << endl;
	cout << "--> " << areaSquare << endl;
	cout << "=========================" << endl;
	cout << endl;
}

static void perimeterFuction (int length){
	int perimeterSquare;
	perimeterSquare = length * 4;
	cout << "=========================" << endl;
	cout << "El perimetro del cuadrado es " << endl;
	cout << "--> " << perimeterSquare << endl;
	cout << "=========================" << endl;
	cout << " " << endl;
}

int main(){
	int length;
	cout << "=====================================" << endl;
	cout << "=== AREA Y PERIMETRO DEL CUADRADO ===" << endl;
	cout << "=====================================" << endl;
	cout << "Ingrese el lado del cuadrado " << endl;
	cout << "--> " ;
	cin >> length;
	cout << "=====================================" << endl;
	areaFuction(length);
	perimeterFuction(length);
}
