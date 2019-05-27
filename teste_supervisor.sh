#!/bin/bash
#Organizar saida em variaveis 
DOCKER=`sudo docker ps -a |awk -F ' ' '{print $1, "\t\t"}'`
COUNTER=`sudo docker ps -a |awk -F ' ' '{print $1, "\t\t"}'|wc -l`
echo ${DOCKER}
echo ${COUNTER}
echo -n '{"data":['



for var1 in ${COUNTER}
    do
    echo -n "{\"{NOME-DO-SEU-CORAÇÃO}\": \"${DOCKER}\"},"
done | sed -e 's:\},$:\}:'

echo -n ']}'


Untitled 
echo -n '{"data":['
​
for (TE VIRA)
	(TE VIRA)
	(TE VIRA)
  echo -n "{\"{NOME-DO-SEU-CORAÇÃO}\": \"${VARIAVEL-DO-SEU-CORAÇÃO}\"},"
done | sed -e 's:\},$:\}:'
​
echo -n ']}'


{
  "data": [
    {
      "{#NOME-DO-SEU-CORAÇÃO}": "CONTAINER"
    },
    {
      "{#NOME-DO-SEU-CORAÇÃO}": "fd86cc03c681"
    }
  ]
}