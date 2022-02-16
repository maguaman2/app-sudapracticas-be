CREATE TABLE IF NOT EXISTS  student(
  id serial,
  nui VARCHAR(13) NOT NULL UNIQUE,
  name VARCHAR(45) NOT NULL,
  lastname VARCHAR(45) NOT NULL,
  email VARCHAR(45) NOT NULL UNIQUE,
  phone VARCHAR(12) NOT NULL UNIQUE,
  status BOOLEAN,
  PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS  company(
  id serial,
  name VARCHAR(45) NOT NULL,
  phone VARCHAR(12),
  contact VARCHAR(100),
  status BOOLEAN,
  PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS  tutor(
  id serial,
  name VARCHAR(45) NOT NULL,
  email VARCHAR(45) NOT NULL,
  phone VARCHAR(12) NOT NULL,
  alternative VARCHAR(50),
  status BOOLEAN,
  company_id int NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (company_id) references company (id)
);

CREATE TABLE IF NOT EXISTS  teacher(
  id serial,
  name VARCHAR(45) NOT NULL,
  phone VARCHAR(12),
  status BOOLEAN,
  PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS  practice(
  id serial,
  activities varchar (200),
  start_date date NOT NULL,
  hours int,
  end_date date,
  observations varchar (200),
  student_id int not null,
  tutor_id int not null,
  teacher_id int not null,
  status BOOLEAN,
  PRIMARY KEY (id),
  FOREIGN KEY (student_id) references student (id),
  FOREIGN KEY (tutor_id) references tutor (id),
  FOREIGN KEY (teacher_id) references teacher (id)
);

CREATE TABLE IF NOT EXISTS  tracking(
  id serial,
  visit_date date NOT NULL,
  observations varchar (200) NOT NULL,
  practice_id int not null,
  status BOOLEAN,
  PRIMARY KEY (id),
  FOREIGN KEY (practice_id) references practice (id)
);

CREATE TABLE IF NOT EXISTS carrera(
    id serial,
    name VARCHAR(50),
    teacher_id int
);

CREATE TABLE IF NOT EXISTS convenio(
  id serial,
  tipo VARCHAR(10) not null,
  fecha_firma date not null,
  fecha_vencimiento date not null,
  estado BOOLEAN,
  carrera_id int not null,
  company_id int not null
);