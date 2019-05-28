#!/bin/bash
echo -n '{"data":['

for STATUS in $(supervisorctl status all |awk -F ' ' '{print $2, "\t\t"}'); do
    echo -n "{\"{#STATUS}\": \"${STATUS}\"},"

done | sed -e 's:\},$:\}:'

echo -n ']}'