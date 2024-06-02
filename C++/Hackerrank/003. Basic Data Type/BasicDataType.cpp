#include <iostream>
#include <cstdio>
using namespace std;

int main()
{
    // Complete the code.
    int i;
    char ch;
    long lg;
    float fl;
    double dl;
    scanf("%d %ld %c %f %lf", &i, &lg, &ch, &fl, &dl);
    // printf("%d %ld %c %f %lf", i, lg, ch, fl, dl);
    printf("%d\n", i);
    printf("%ld\n", lg);
    printf("%c\n", ch);
    printf("%.3f\n", fl);
    printf("%.9lf\n", dl);
    return 0;
}