#!/bin/bash

file_full_name=$1

# Make sure only root can run this script
if [[ $EUID -ne 0 ]]; then
   echo "This script must be run as root" 1>&2
   exit 1
fi

if [ $file_full_name != "" ]; then
    echo "Executing restore script from dump file ${file_full_name}"
else
    echo "You must pass dump file full path as script argument! Exiting execution!"
    exit 1
fi

cd /tmp
echo "Dropping existing echodb"
sudo -u postgres dropdb echodb
echo "Recreating echodb"
sudo -u postgres createdb --owner echo --template template1 echodb
echo "Restoring echodb using dump file ${file_full_name}"
sudo -u postgres pg_restore --dbname echodb $file_full_name
echo "echodb successfully restored"