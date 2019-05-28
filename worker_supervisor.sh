#!/bin/bash
echo -n '{"data":['

for WORKER in $(supervisorctl status all |awk -F ' ' '{print $1, "\t\t"}'); do
    echo -n "{\"{#SUPERVISOR}\": \"${WORKER}\"},"

done | sed -e 's:\},$:\}:'

echo -n ']}'


tira os execos pegar os scripts e fazer um só cada  um é uma função comando em parametros -os

aprender a usar função 
e usar