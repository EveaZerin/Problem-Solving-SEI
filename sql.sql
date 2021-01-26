SELECT courses.name, teachers.name  
FROM courses
JOIN teachers
ON courses.id=teachers.id
ORDER BY courses.id;


SELECT teacher.name 
  FROM teachers 
  WHERE id=( SELECT MAX(courses.teacher_id) FROM courses GROUP BY courses.teacher_id);


SELECT teacher.name 
  FROM teachers 
  WHERE id NOT IN = ( SELECT courses.teacher_id FROM courses);


