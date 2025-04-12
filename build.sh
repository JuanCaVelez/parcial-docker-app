#!/bin/bash

echo "Deteniendo contenedores activos"
docker compose down

echo "Construyendo imagen y levantando contenedores"
docker compose up --build -d

echo "contenedores levantados"
docker container ls -a
