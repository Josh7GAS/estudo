#!/bin/bash

#Imprimir a primeira colunba do Docker
DOCKER = `$sudo docker ps -a |awk -F ' ' '{print $1, "\t\t"}'`

echo "${DOCKER}"

#Organizar saida em variaveis 

#Imprimir dentro de uma estrutura JSON

# echo -n '{"data":['

# for 