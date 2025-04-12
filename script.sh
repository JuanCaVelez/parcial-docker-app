#!/bin/bash

#Endpoint
PARCIAL_ENDPOINT="http://localhost:8080/products"

#Consumir el endpoint
echo "Consumir endpoint:"
curl -X GET "$PARCIAL_ENDPOINT"
echo -e"\n"
