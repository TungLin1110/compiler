int sum(int x, int y)
{
  return x + y;
}

int mul(int i, int j)
{
  return i * j;
}


int main()
{

  int a;
  char b;
  a = add(1, 2);
  b = mul(1, 2);//type not match
  c = mul(1, 2);//undeclare
}
