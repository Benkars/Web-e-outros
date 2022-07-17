#include <iostream>
#include <locale.h>

using namespace std;
int main()
{
    setlocale (LC_ALL, "Portuguese");
    float salario, plLiquido;
    cout << "Informe o salário em reais: ";
    cin >> salario;
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
    cout << "PL Líquido é igual a R$ " << plLiquido;
    return 0;
}