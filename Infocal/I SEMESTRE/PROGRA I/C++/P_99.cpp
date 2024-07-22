//	Crear una función que tome un número entero como argumento y verifique si es primo
#include <iostream>
using namespace std;

static void separators(){
	cout << "=============================" << endl;
}

static void fuctionPrimeNumber(int primeNumber){
	if (primeNumber % 2 != 0 || primeNumber == 2){
		separators();		
		cout << "  EL NUMERO " << primeNumber << " ES PRIMO" << endl;
		separators();		
	} else {
		separators();		
		cout << "  EL NUMERO " << primeNumber << " NO ES PRIMO" << endl;
		separators();
	}
}

int main(){
	separators();
	cout << "== N U M E R O   P R I M O ==" << endl;
	separators();
	cout << "    INTRODUCE UN NUMERO \n PARA DETERMINAR SI ES PRIMO" << endl;
	separators();
	//	VARIABLE NUMERO PRIMO
	int primeNumber;
	cout << "--> " ; cin >> primeNumber;
	separators();
	cout << endl;
	fuctionPrimeNumber(primeNumber);
}
