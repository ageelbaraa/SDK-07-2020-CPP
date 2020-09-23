#include <iostream>
#include <cmath>

using namespace std;

class Education {
private:
	string mEdutype;
public:
	void setEdutype(string str) {
		this->mEdutype = str;
	}
	string setEdutype() {
		return this->mEdutype;
	}
};

class School : public Education {
public:
	string schoolName;
	int yearClasification;
};

class Courses {
public:
	int mCourseID;
	string mCourseName;
	int mCourseCridt;
	bool haveReqired;
};

class Student : public Education, public School, public Courses {
public:
	int mStudentID;
	string mStudentName;
	string mStudentGender;
	string mStudentAge;
	string mStudentCourseTaken;
};


// Base class
class Shape {
public:
	// pure virtual function providing interface framework.
	virtual double getArea() = 0;
	void setWidth(double w) {
		width = w;
	}

	void setHeight(double h) {
		height = h;
	}

protected:
	double width;
	double height;
};

// Derived classes
class Rectangle : public Shape {
public:
	double getArea() {
		return (width * height);
	}
};

class Triangle : public Shape {
public:
	double getArea() {
		return (width * height) / 2;
	}
};
