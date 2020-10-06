#include<iostream>
#include<string>
#include"Header.h"
#include "BanckAccount.h"
#include "Student.h"

using namespace std;

class Employee {
public:
	int salary;
	void PrintSalary() {
		cout << salary << endl;
	}
};

class Caculator {
private:
	string info;
public:
	Caculator(string info) {
		this->info = info;
		cout << info << endl;
	}
	
	int sum(int n1, int n2) {
		return n1 + n2;
	}

	int sum(int n1, int n2,int n3) {
		return n1 + n2 + n3;
	} 

	double sum(double n1, double n2) {
		return n1 + n2;
	}


	int subtract(int n1, int n2) {
		return n1 - n2;
	}

	int multiply(int n1, int n2) {
		return n1 * n2;
	}

	int divison(int n1, int n2) {
		return n1 / n2;
	}

	int reminder(int n1, int n2) {
		return n1 % n2;
	}


};




int main() {

	K1 chaild;
	Student student(3, "ali");

	cout << "ID : " << student.getID() << endl;
	cout << "Name : " << student.getName() << endl;

	student.setID(5);
	student.setName("Ahmad");

	cout << "ID : " << student.getID() << endl;
	cout << "Name : " << student.getName() << endl;


	chaild.info();

	chaild.PickColor(0x458fa);

	cout << chaild.CarColor << endl;

	chaild.MotorCapacity("16c");
	cout << chaild.MotorCapacity_P << endl;

	chaild.BodyType();

	Caculator caculator("This is Simple Calculator");
	cout << caculator.sum(12, 15) << endl;
	cout << caculator.sum(12.5, 15.3) << endl;
	cout << caculator.sum(12, 15,11) << endl;


	/*
	BanckAccount ac;
	Student student;
	Employee employee;

	ac.number = 10;
	ac.SayHi();
	ac.PrintPrivateData();
	ac.setPassword(123);

	cout << ac.getPassword() << endl;

	student.setName("Eman");
	cout << student.getName() << endl;

	employee.salary = 500;
	employee.PrintSalary();
	*/
	
	/*
	int x[5] = { 10, 20, 30, 40, 50 }, * p, y = 0;
	p = &y;
	*p += 2;
	p = &x[0] + 2;
	cout << (x + 2) << endl;
	cout << *(x + 2) << endl;
	*p = *(x + 2) + x[0] / 2;
	cout << p[y] << endl << p[y]++ << endl;
	p[y]++;
	p -= 1;
	*p -= 5;
	for (int i = 0; i <= y * 2; i++)
		cout << p[i - 1] << ' ';
	*/
	
	/*
	int score = 5;
	cout << &score << endl;

	int* ip;
	int* ip2;
	double* dp;
	float* fp;
	char* ch;

	ip = &score;
	ip2 = ip;

	cout << ip2 << endl;

	cout << endl;
	cout << endl;


	int var = 50;
	int* p;
	p = &var;

	cout << var << endl;  // 50
	cout << p << endl; // address of var
	cout << *p << endl; // 50


	int x = 5;
	int* p2 = &x;
	x = x + 4;
	x = *p2 + 4;
	*p2 = *p2 + 4;

	cout << x;
	*/

	/*
	const int size = 8;
	int arr[size];

	for (int i = 0; i < size ; i++)
	{
		cout << "arr[" << i << "] = ";
		cin >> arr[i];
	}
	cout << endl;
	cout << endl;
	cout << endl;

	for (int i = 0; i < size; i++)
	{
		cout << "arr[" << i << "] = ";
		cout << arr[i] << endl;
	}

	*/

	/*


	int Numbers = 145982;
	cout <<"The Avg of 145982 even No in is : " <<digit(Numbers);

	cout << endl << endl;

	int mi = 145982;

	cout << "The Mirror Of 145982 is : " << mirror(mi);


	cout << endl << endl;

	int n = 6;
	cout << n << "! = " << fuctorial(n) << endl;
	cout << "2^" << n << " = " << power(n) << endl;

	// String , char , bool
	// bool : true , false
	// char : take an sigle charcter / with single cotation
	// string : take an serise of charcters (array of char) /  with double cotation

	bool isStudent = true;
	bool isTeacher = false;

	char letter = 'A';
	char digit = '2';

	string word = "Hey There";
	string course = "C++";

	cout << isStudent << endl;
	cout << isTeacher << endl;
	cout << letter << endl;
	cout << digit << endl;
	cout << word << endl;
	cout << course << endl;

	int n1;

	int arr[6];
	int arr2[] = { 4,9,10,37,45,-1,88 };
	int arr3[3] = { -1,-2,-3 };

	n1 = 6;
	arr[0] = 12;
	arr[1] = 5;

	for (int i = 0; i < 6; i++)
	{
		arr[i] = i + 1;
		cout << arr[i] << endl;
	}

	cout << arr;

	int x;
	bool y;
	cout << "Enter a positive integer: ";
	cin >> x;
	y = perfect(x);
	if (y == true)
		cout << x << " is perfect." << endl;
	else
		cout << x << " is not perfect." << endl;


	*/
}