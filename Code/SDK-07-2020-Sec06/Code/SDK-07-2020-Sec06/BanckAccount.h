#pragma once
#include <iostream>
using namespace std;

class BanckAccount
{
public:
	void SayHi() {
		cout << "Hi" << endl;
		cout << number << endl;
	}
	int number;
	void PrintPrivateData() {
		SomeFunction();
		cout << age << endl;
	}

	void setPassword(int password ) {
		this->password = password;
	}

	/*int getPassword() {
		return this->password;
	}*/

private:
	int password;
	int age;
	void SomeFunction() {
		cout << "SomeData" << endl;
	}
};

