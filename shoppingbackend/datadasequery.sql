CREATE TABLE category(
id IDENTITY,
name VARCHAR(255),
desc VARCHAR(255),
image_url VARCHAR(50),
is_active BOOLEAN,
constraint pk_category_id primary key(id)

); 