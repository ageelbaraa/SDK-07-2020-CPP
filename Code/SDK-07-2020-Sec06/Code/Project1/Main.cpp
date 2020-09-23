#define _USE_MATH_DEFINES
#include <iostream>
#include <cmath>
#include "Header1.h"

using namespace std;

int main() {
	Student student;

	Rectangle Rect;
	Triangle  Tri;

	double pi = M_PI;
	cout << pi << endl;

	Rect.setWidth(5);
	Rect.setHeight(7);

	// Print the area of the object.
	cout << "Total Rectangle area: " << Rect.getArea() << endl;

	Tri.setWidth(5);
	Tri.setHeight(7);

	// Print the area of the object.
	cout << "Total Triangle area: " << Tri.getArea() << endl;


}