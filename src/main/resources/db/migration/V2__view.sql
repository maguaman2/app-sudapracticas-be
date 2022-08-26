CREATE VIEW tutor_view as
    select t.*,c.name empresa
    from tutor t JOIN company c
    ON t.company_id = c.id;
CREATE VIEW student_view as
    select s.*,ca.name carrera
    from student s JOIN career ca
    ON s.career_id=ca.id;

CREATE VIEW carrera_view as
    select c.*,t.name profesor
    from career c JOIN teacher t
    ON c.teacher_id =t.id;

 CREATE VIEW activity_view as
    select ac.*,c.name carrera
    from activity ac JOIN career c
    ON ac.career_id=c.id;

CREATE VIEW practice_view as
    select  p.*,s.name estudiante , t.name profesor, tu.name tutor, c.name empresa,st.lastname apellido
    from practice p JOIN teacher t ON p.teacher_id =t.id
                    JOIN tutor tu ON p.tutor_id =tu.id
                    JOIN student s ON p.student_id =s.id
                    JOIN student st ON p.student_id=st.id
                    JOIN company c ON c.id=tu.company_id;

CREATE VIEW activity_detail_view as
  select ad.*,a.description actividad
 from activity_detail ad JOIN activity a ON ad.activities_id = a.id;










