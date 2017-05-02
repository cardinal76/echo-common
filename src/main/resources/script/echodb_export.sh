#!/bin/bash

remote_server="dev.neclab.it"
#remote_server="192.168.1.128"
dump_dir="/tmp/echodb_dump/"
timestamp=$(date "+%Y%m%d%H%M%S")
filename="${timestamp}_echodb.bak"
file_full_path=$dump_dir$filename

# Make sure only root can run this script
if [[ $EUID -ne 0 ]]; then
   echo "This script must be run as root" 1>&2
   exit 1
fi

# avoid permission issues executing the script from /tmp
cd /tmp
echo "creating echodb dump storage directory ${dump_dir} if not already existing"
mkdir -p $dump_dir
echo "writing dump file at ${file_full_path}"
sudo -u postgres pg_dump -Fc echodb > $file_full_path
echo "copying dump ${file_full_path} to remote server ${remote_server}"
scp -i ~/.ssh/id_rsa $file_full_path root@$remote_server:$dump_dir
echo "executing remote restore script on server ${remote_server} using dump file ${file_full_path}"
ssh root@$remote_server ~/script/echodb_restore.sh $file_full_path
echo "script execution finished"