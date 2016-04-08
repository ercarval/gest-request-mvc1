create schema guest_request;

CREATE USER 'guest_request'@'localhost' IDENTIFIED BY 'guest_request';

GRANT ALL PRIVILEGES ON *.* TO 'guest_request'@'localhost' IDENTIFIED BY 'guest_request' WITH GRANT OPTION;
FLUSH PRIVILEGES;