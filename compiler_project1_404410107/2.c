#include <stdio.h>

void test(long long x)
{
	for (; x > 0; x = x >> 1)
		printf("%lld\n", x);
	return;
}

int main() 
{
	long long ya;
	scanf("%lld", &ya);
	test(ya);
	return 0;
}
