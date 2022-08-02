CREATE VIEW tutor_view as
    select t.*,c.name empresa
    from tutor t JOIN company c
    ON t.company_id = c.id;

CREATE VIEW carrera_view as
    select c.*,t.name profesor
    from career c JOIN teacher t
    ON c.teacher_id =t.id;

CREATE VIEW practice_view as
    select  p.*,s.name estudiante , t.name profesor, tu.name tutor, c.name empresa
    from practice p JOIN teacher t ON p.teacher_id =t.id
                    JOIN tutor tu ON p.tutor_id =tu.id
                    JOIN student s ON p.student_id =s.id
                    JOIN company c ON c.id=tu.company_id;
--CREATE VIEW activity_view as
  --  select ac.*,a.description descripcion
    --from activity_detail ac JOIN activity a
    --ON ac.activities_id=a.id*/>










