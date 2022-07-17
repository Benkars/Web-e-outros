#include <iostream>
#include <locale.h>
using namespace std;
int main()
{
    setlocale(LC_ALL, "portuguese");
    char nome[80];
    cout << "Qual o seu nome? ";
    cin >> nome;
    cout << "Olá " << nome << ", tudo bem?\n";
    return 0;
}
