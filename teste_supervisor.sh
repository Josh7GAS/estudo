#!/bin/bash
#Organizar saida em variaveis 
DOCKER=$(sudo docker ps -a |awk -F ' ' '{print $1, "\t\t"}')
COUNTER=$(sudo docker ps -a |awk -F ' ' '{print $1, "\t\t"}'|wc -l)
LINHA=$(sudo docker ps -a |awk '{print$1}'|head -n1 | tail -1)
CONSTANTE=$(seq 1 ${COUNTER})



# echo ${DOCKER}
# echo ${COUNTER}
# echo ${LINHA}
# echo ${CONSTANTE}
echo -n '{"data":['



for VAR1 in ${DOCKER};
    do
  
    # LINHA=$(sudo docker ps -a |awk '{print$1}'|head -n${VAR1} | tail -1)
    echo -n "{\"{Tipo}\": \"${VAR1}\"},"
    
done | sed -e 's:\},$:\}:'

# echo -n ']}'



# echo -n '{"data":['
# ​
# for (TE VIRA)
# 	(TE VIRA)
# 	(TE VIRA)
#   echo -n "{\"{NOME-DO-SEU-CORAÇÃO}\": \"${VARIAVEL-DO-SEU-CORAÇÃO}\"},"
# done | sed -e 's:\},$:\}:'
# ​
# echo -n ']}'


# {
#   "data": [
#     {
#       "{#NOME-DO-SEU-CORAÇÃO}": "CONTAINER"
#     },
#     {
#       "{#NOME-DO-SEU-CORAÇÃO}": "fd86cc03c681"
#     }
#   ]
# }