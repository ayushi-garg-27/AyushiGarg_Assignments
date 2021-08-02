INSERT INTO users(username,password, enabled)
values('ayushi',
	'user',
	true);
	
INSERT INTO users(username,password, enabled)
values('Amit',
	'admin',
	true);
	
INSERT INTO authorities(username, authority)
	values('user','ROLE_USER');
	
INSERT INTO authorities(username, authority)
	values('admin','ROLE_ADMIN');