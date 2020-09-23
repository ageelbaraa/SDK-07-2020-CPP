#pragma once
#include <iostream>
using namespace std;

class Student {
private:
	int ID;
	string Name;
public:
	Student(int id, string name) {
		this->ID = id;
		this->Name = name;
	}

	void setID(int id) {
		this->ID = id;
	}
	void setName(string name) {
		this->Name = name;
	}

	int getID() {
		return this->ID;
	}
	string getName() {
		return this->Name;
	}
};

