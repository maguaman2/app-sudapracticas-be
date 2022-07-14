CREATE VIEW tutor_view as
    select t.*,c.name empresa
    from tutor t JOIN company c
    ON t.company_id = c.id;

CREATE VIEW carrera_view as
    select c.*,t.name profesor
    from career c JOIN teacher t
    ON c.teacher_id =t.id;

CREATE VIEW practice_view as
    select  p.*,s.name estudiante , t.name profesor, tu.name tutor
    from practice p JOIN teacher t ON p.teacher_id =t.id
                    JOIN tutor tu ON p.tutor_id =tu.id
                    JOIN student s ON p.student_id =s.id;







