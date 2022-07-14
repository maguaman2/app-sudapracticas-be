
CREATE TABLE IF NOT EXISTS practice_detail(
    id serial,
    activities_id int,,
    dates date not null,
    start_hours time NOT NULL,
    end_hours time,
    observations varchar (200),
    status BOOLEAN,
    PRIMARY KEY (id),

