//	//  Cree un menú interactivo para realizar el llenado de una matriz de 2X2 de nombres con las siguientes opciones:
//1.-Agregar nombre
//2-Buscar nombre
//3.- Mostrar nombres
//4.- Salir
//Debe controlar que al momento de agregar un nombre verifique haya espacio en la matriz,
// si no hay debe devolver un mensaje que diga no se puede registrar mas.
//El menú debe mostrarse hasta que el usuario decida finalizarlo con la 4 opción, Recomendación utiliza un do-While para el menú.
#include <iostream>
#include <string>
using namespace std;
int main(){
	string array [4] ;
	int operationSelector;
	int i = 0;
	string searchedName;
	int name = 0;
	do {
		cout << "===================================" << endl;
		cout << "|   == MENU INTERACTIVO - C++ ==  |" << endl;
		cout << "===================================" << endl;
		cout << "|( SELECCIONE UNA OPCION (1 - 4) )|" << endl;
		cout << "===================================" << endl;
		cout << "|      1.- AGREGAR NOMBRES        |" << endl;
		cout << "|      2.- BUSCAR NOMBRES	      |" << endl;
		cout << "|      3.- MOSTRAR NOMBRES        |" << endl;
		cout << "|      4.- SALIR DEL MENU         |" << endl;
		cout << "===================================" << endl;
		cout << "--> " ; cin >> operationSelector ;
		cout << "===================================" << endl;
		cout << " " << endl;
		switch (operationSelector){
			case 1:
				cout << "=================================" << endl;
				cout << "|      1.- AGREGAR NOMBRES      |" << endl;
				cout << "=================================" << endl;
				cout << " " << endl;
				if ( i >= 4 ){
					cout << "==============================================" << endl;
					cout << "| MATRIZ LLENA, NO PUEDE AGREGAR MAS NOMBRES |" << endl;
					cout << "==============================================" << endl;
					cout << " " << endl;
				} else {
					cout << "=====================================" << endl;
					cout << "| INGRESE EL NOMBRE " << i + 1 << " EN LA MATRIZ |" << endl;
					cout << "--> " ; cin >> array [i];
					cout << "=====================================" << endl;
					cout << " " << endl;
					cout << "===========================================" << endl;
					cout << "|      NOMBRE INGRESADO CORRECTAMENTE     |" << endl;
					cout << "===========================================" << endl;
					cout << " " << endl;
					i++;
				}
				break;
			case 2:
				cout << "=================================" << endl;
				cout << "|      2.- BUSCAR NOMBRES   |" << endl;
				cout << "=================================" << endl;
				cout << " " << endl;
				cout << "===========================================" << endl;
				cout << "| INGRESE UN NOMBRE A BUSCAR EN LA MATRIZ |" << endl;
				cout << "--> " ; cin >> searchedName;
				cout << "===========================================" << endl;
				cout << " " << endl;
				for (i = 0 ; i < 4 ; i++){
					if (array[i] == searchedName){
						name++;
					}
				}
				if (name >= 1){
					cout << "===================================================" << endl;
					cout << "| EL NOMBRE " << searchedName << " SI ESTA EN LA MATRIZ |" << endl;
					cout << "===================================================" << endl;
					cout << " " << endl;
				} else if (name <= 0) {
					cout << "===================================================" << endl;
					cout << "| EL NOMBRE " << searchedName << " NO ESTA EN LA MATRIZ |" << endl;
					cout << "===================================================" << endl;
					cout << " " << endl;
				}
				name = 0;
				break;
			case 3:
				cout << "=================================" << endl;
				cout << "|      3.- MOSTRAR NOMBRES      |" << endl;
				cout << "=================================" << endl;
				cout << " " << endl;
				for (i = 0 ; i < 4 ; i++){
					if (i % 2 == 0 || i == 2){
						cout << " " << endl;
					}
					cout << "	|	" << array[i] << " 	 |    " ;
					if (i == 3){
						cout << " " << endl;
					}
				}
				cout << " " << endl;
				cout << " " << endl;
				break;
			case 4:
				cout << "=================================" << endl;
				cout << "|     GRACIAS, VUELVA PRONTO    |" << endl;
				cout << "=================================" << endl;
				cout << " " << endl;
				break;
		}
	} while (operationSelector != 4);
}












