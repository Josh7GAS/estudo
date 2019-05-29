#!/bin/bash

function encontrar_worker()
{

echo -n '{"data":['

    for DOCKER in $(sudo docker ps -a |awk -F ' ' '{print $1, "\t\t"}'); do
    echo -n "{\"{#DOCKER}\": \"${DOCKER}\"},"

    done | sed -e 's:\},$:\}:'

echo -n ']}'

}

encontrar_worker
encontrar_status

function encontrar_status()
{
     SUPERVISOR_WORKER=${1}
     supervisorctl status ${DOCKER} |awk -F ' ' '{print $2, "\t\t"}' 
}


opt arg
