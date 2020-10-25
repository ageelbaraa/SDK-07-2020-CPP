#include <iostream>
#include <cmath>


using namespace std;

int main() {

	/*
	int const size = 10;
	float pi[size];
	// input with loop
	for (int i = 0; i < size;i++) {
		cout << "pi[" << i << "] = ";
		cin >> pi[i];
	}
	cout << "********************************" << endl;
	// output with loop
	for (int i = 0; i < size;i++) {
		cout << "pi[" << i << "] = " << pi[i] << endl;
	}
	

	int numbers[8] = { 354,524,2165,25,351,215,4,5465 };
	int minElement = 0, minElementIndex = 0;

	minElement = numbers[0];
	int i = 1;
	for (int i = 0; i < 8;i++) {
		if (numbers[i] < minElement) {
			minElement = numbers[i];
			minElementIndex = i;
		}
	}


	cout << minElement << endl;
	cout << minElementIndex << endl;


	cout << "**********************\n";

	int array[10];
	int negativeValue = 0;
	for (int i = 0; i < 10;i++) {
		cout << "array[" << i << "] = ";
		cin >> array[i];
		if (array[i] < 0) {
			negativeValue = array[i];
		}
	}

	cout << negativeValue << endl;

	cout << "**********************\n";


	for (int i = 0;i < 10;i++) {
		if (array[i] < 0) {
			negativeValue = array[i];
		}
	}

	cout << negativeValue << endl;



	cout << "**********************\n";


	int array2[5];
	for (int i = 0;i < 5;i++) {
		cout << "array[" << i << "] = ";
		cin >> array2[i];
		int x = array2[i];
		cout << x;
		for (int j = 0;j < x;j++) {
			cout << "*";
		}
		cout << endl;
	}
	*/

	int array2d[2][3] = { {1,2,3},{4,5,6} };
	cout << array2d[0][0] << endl;
	cout << array2d[0][1] << endl;
	cout << array2d[0][2] << endl;
	cout << array2d[1][0] << endl;
	cout << array2d[1][1] << endl;
	cout << array2d[1][2] << endl << endl;

	// input 2 dimntional array 
	for (int i = 0; i < 2;i++) { // row
		for (int j = 0;j < 3;j++) {// column
			cin >> array2d[i][j];
		}

	}


	// output 2 dimntional array 
	for (int i = 0; i < 2;i++) { // row
		for (int j = 0;j < 3;j++) {// column
			cout << array2d[i][j] << endl;
		}

	}






	

}



