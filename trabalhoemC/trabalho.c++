#include <stdio.h>

int main()
{
    float salario, plLiquido;
    printf("Informe o salario em reais: ");
    scanf("%f", &salario);
    if (salario <= 300)
    {
        plLiquido = (salario * 0.7 + 500) - (salario * 0.7 + 500) * 0.25;
    }
    else if (salario >= 300 && salario <= 1000)
    {
        plLiquido = (salario * 0.5 + 200) - (salario * 0.5 + 200) * 0.25;
    }
    else
    {
        plLiquido = (salario * 0.3) - (salario * 0.3) * 0.25;
    }
    printf("PL Liquido e igual a %1.2f", plLiquido);
    return 0;
}