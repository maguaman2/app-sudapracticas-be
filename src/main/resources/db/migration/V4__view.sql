CREATE VIEW formulary_view as
    select f.*,t.name teacher
    from formulary f JOIN teacher t
    ON f.teacher_id =t.id;

    select f.*,s.name student
        from formulary f JOIN student s
        ON f.student_id =s.id;

    select f.*,t.name tutor
        from formulary f JOIN tutor t
        ON f.tutor_id = t.id;

