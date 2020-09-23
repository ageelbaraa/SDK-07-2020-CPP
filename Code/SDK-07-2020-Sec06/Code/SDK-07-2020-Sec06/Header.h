#include<iostream>
#include<string>
using namespace std;

int fuctorial(int n);
int power(int n);
string PrintMyName(string name);
int SumIclu(int n1, int n2);
bool perfect(int);
double digit(int x);
int mirror(int x);

class KIA
{
public:
	int CarColor;
	string CarName;
	string CarVersion;

	void info(string Parent) {
		cout << "{" << Parent << "Class}" << endl;
	}

	void PickColor(int color) {
		this->CarColor = color;
	}

	virtual void MotorCapacity(string MC){}

	virtual void BodyType() = 0;
};

class K1 : public KIA
{
public:
	int BodyNumber;
	bool isAddtion;
	string MotorCapacity_P;

	void info() {
		cout << "{K1 Class}" << endl;
	}

	void MotorCapacity(string MC) {
		this->MotorCapacity_P = MC;
	}

	 void BodyType() {
		cout << "Type c" << endl;
	}
	

};
