#!/bin/bash

#pegar o nome e a idade
function ola(){
echo "Poderia me dar seu nome e sua idade?"
echo "Qual é o seu nome?"
read NOME
echo "Qual é a sua idade?"
read IDADE

#segunda pessoa
echo "Me de mais um nome"
read NOME
echo "Qual é a idade dessa pessoa?"
read IDADE

#Terceira pessoa
echo "Me outro nome"
read NOME
echo "Qual é a idade dessa pessoa?"
read IDADE
}

ola
#comparando a idade das 3 pessoas 


#mostrar o resultado das comparações
