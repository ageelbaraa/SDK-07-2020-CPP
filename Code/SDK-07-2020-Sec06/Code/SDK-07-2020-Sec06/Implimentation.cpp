#include<iostream>
#include<string>
#include"Header.h"
using namespace std;

int fuctorial(int n)
{
	if (n == 1)
	{	return 1; }

	return n * fuctorial(n - 1);

}

int power(int n) {
	if (n == 0) {
		return 1;
	}
	return 2 * power(n - 1);
}

string PrintMyName(string name) {
	return name;
}

int SumIclu(int n1, int n2) {
	int min, max, sum = 0;
	if (n1 < n2) {
		min = n1;
		max = n2;
	}
	else {
		max = n1;
		min = n2;
	}

	for (int i = min; i < max; i++)
	{
		sum += i;
	}
	return sum;
}

bool perfect(int x)
{
	int i, sum = 0;
	for (i = 1; i <= x / 2; i++)
		if (x % i == 0)
			sum += i;
	if (sum == x)
		return true;
	return false;
}

double digit(int x) {
	int d, sum = 0, count = 0;
	while (x != 0) {
		d = x % 10;
		if(d % 2 == 0) {
			sum += d;
			count++;

		}
		x /= 10;
	}

	if (count == 0) {
		return 0;
	}

	return sum * 1.0 / count;
}

int mirror(int x)
{
	int d, m = 0;
	while (x != 0)
	{
		d = x % 10;
		m = m * 10 + d;
		x /= 10;
	}
	return m;
}