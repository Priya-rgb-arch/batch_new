#!/bin/bash

# Define the necessary variables according to your setup
data_file="/path/to/data_file.csv"
database_name="DATABASE_NAME"
table_name="TABLE_NAME"
username="USERNAME"
password="PASSWORD"

# Run the SQL script to import data into the database
mysql -u $username -p$password $database_name << EOF
LOAD DATA INFILE '$data_file'
INTO TABLE $table_name
FIELDS TERMINATED BY ',' 
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;
EOF
