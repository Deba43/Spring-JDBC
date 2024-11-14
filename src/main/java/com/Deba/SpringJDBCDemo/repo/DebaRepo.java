package com.Deba.SpringJDBCDemo.repo;

import com.Deba.SpringJDBCDemo.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DebaRepo {
    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    @Autowired

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void save(Student s) {
        String sql = "insert into Student(id, age, name, tech) values(?,?,?,?)";
        int rows = template.update(sql, s.getId(), s.getAge(), s.getName(), s.getTech());
        System.out.println(rows + "rows affected");

    }

    public List<Student> findAll() {

        String sql = "Select * from Student";

        List<Student> s2 = template.query(sql, (rs, row) -> {

            Student stud = new Student();

            stud.setId(rs.getInt(1));
            stud.setAge(rs.getInt(2));
            stud.setName(rs.getString(3));
            stud.setTech(rs.getString(4));

            return stud;

        });

        return s2;

    }
}
