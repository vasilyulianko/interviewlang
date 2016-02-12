CREATE DATABASE IF NOT EXISTS auditservice;

CREATE TABLE event (
id INT(11) AUTO_INCREMENT,
event_time DATETIME,
school VARCHAR(255),
user INT(11),
user_role VARCHAR(255),
affected_user INT(11),
component VARCHAR(255),
feature VARCHAR(255),
subfeature VARCHAR(255),
action VARCHAR(255),
quanity DECIMAL(8,2)
payload LONGTEXT,
primary key (id),
INDEX `schoolIndx` (`school`),
INDEX `userInde` (`user`),
INDEX `eventInde` (`event_time`),
INDEX `componentInde` (`component`)
)