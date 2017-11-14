CREATE TABLE HIGHWAY_INCIDENTS (
   HIGHWAY_INCIDENT_ID INT(10) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
   USER_ID INT(10) UNSIGNED NOT NULL,
   HIGHWAY_ID INT(10) UNSIGNED NOT NULL,
   HIGHWAY_INCIDENT_NAME VARCHAR(100),
   HIGHWAY_INCIDENT_TYPE VARCHAR(100),
   HIGHWAY_INCIDENT_DISTANCE DECIMAL(10,2),

   FOREIGN KEY (USER_ID) REFERENCES USERS (USER_ID),
   FOREIGN KEY (HIGHWAY_ID) REFERENCES HIGHWAYS (HIGHWAY_ID)
   )

