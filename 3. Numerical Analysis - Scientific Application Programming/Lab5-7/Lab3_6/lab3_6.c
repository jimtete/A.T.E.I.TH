#include <stdio.h>
#include <math.h>

#define f(x) ((x) * (x) -num)
#define fp(x) (2 * (x))

int main(int argc, char *argv[])
{
    float num;

    printf("Dose arithmo: ");
    scanf("%f", &num);

    float x = num;
    float oldx = 0;

    printf("\nnum = %f, \nx = %f, \nsqrt(num) = %f\n", num, x, sqrt(num));

    while(fabs(x - oldx) > pow(10, -15))
    {
        oldx = x;
        x = x - (f(x) / fp(x));
    }

    printf("\nnum = %f, \nx = %f, \nsqrt(num) = %f\n", num, x, sqrt(num));
    return 0;
}
