int sum(int x, int y)
{
	return x + y;
}

int mul(int i, int j)
{
	return i + j;
}

float sum(float p,float q)//redeclare
{
	return p + q;
}
int main()
{
	int a;
	int b;
	a = 1;
	b = 1;
	c = sum(a,b); //undefine
	return 0;
}
