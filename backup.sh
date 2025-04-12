#!/bin/bash

DATE=$(date +%Y-%m-%d)
BACKUP_NAME="backup_$DATE.sql"

docker exec mariadb-container \
  sh -c 'exec mysqldump-uroot -p"12345" parcial' > $BACKUP_NAME


echo "Respaldo creado: $BACKUP_NAME"
