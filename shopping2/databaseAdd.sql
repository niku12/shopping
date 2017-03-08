create table Address
(id IDENTITY,
 billing varchar(20),
	 shipping varchar(20),
	 city varchar(20),
	 pin varchar(20),

constraint pk_Address_id primary key(id)

)