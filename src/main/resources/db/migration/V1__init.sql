CREATE TABLE IF NOT EXISTS career(
    id serial,
    name VARCHAR(50),
    coordinator VARCHAR (50),
    PRIMARY KEY (id),
    teacher_id INT
);

CREATE TABLE IF NOT EXISTS  student(
    id serial,
    nui VARCHAR(13) NOT NULL UNIQUE,
    name VARCHAR(45) NOT NULL,
    lastname VARCHAR(45) NOT NULL,
    email VARCHAR(45) NOT NULL UNIQUE,
    phone VARCHAR(12) NOT NULL UNIQUE,
    status BOOLEAN,
    career_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (career_id) references career (id)
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
    career_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (career_id) REFERENCES career (id)
);




CREATE TABLE IF NOT EXISTS  practice(
  id serial,
  start_date date NOT NULL,
  end_date date,
  hours int,
  student_id int not null,
  tutor_id int not null,
  teacher_id int not null,
  status BOOLEAN,
  PRIMARY KEY (id),
  FOREIGN KEY (student_id) references student(id),
  FOREIGN KEY (tutor_id) references tutor(id),
  FOREIGN KEY (teacher_id) references teacher(id)
);

CREATE TABLE IF NOT EXISTS activity(
    id serial,
    description varchar(50) not null,
    observation varchar (100),
    career_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (career_id) REFERENCES career (id)
);


CREATE TABLE IF NOT EXISTS practice_detail(
    id serial,
    actual_date date not null,
    start_time time NOT NULL,
    end_time time NOT NULL,
    total_hours int,
    observations varchar (200),
    practice_id int,
    PRIMARY KEY (id),
    FOREIGN KEY (practice_id) REFERENCES practice (id)
);
CREATE TABLE IF NOT EXISTS activity_detail(
    id serial,
    activities_id int,
    detail_id int,
    PRIMARY KEY (id),
    FOREIGN KEY (activities_id) REFERENCES activity (id),
    FOREIGN KEY (detail_id) REFERENCES practice_detail (id)
);

ALTER TABLE career ADD UNIQUE (teacher_id);
ALTER TABLE career ADD FOREIGN KEY (teacher_id) REFERENCES teacher(id);
