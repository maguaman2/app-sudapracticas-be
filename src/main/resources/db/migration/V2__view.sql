CREATE VIEW tutor_view as
    select t.*,c.name empresa
    from tutor t JOIN company c
    ON t.company_id = c.id;
CREATE VIEW carrera_view as
    select c.*,t.name profesor
    from carrera c JOIN teacher t
    ON c.teacher_id =t.id;

CREATE VIEW practice_view as
    select p.*,t.name teacher
    from practice p JOIN teacher t
    ON p.teacher_id =t.id;

    select p.*,s.name student
        from practice p JOIN student s
        ON p.student_id =s.id;

    select p.*,t.name tutor
        from practice p JOIN tutor t
        ON p.tutor_id = t.id;





