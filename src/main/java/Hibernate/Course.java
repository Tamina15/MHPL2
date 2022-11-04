/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author Tran Minh Nhat
 */
@Data
@Entity
@Table(name = "Course")

public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CourseId;

    @Column
    private String Title;

    @Column
    private int Credits;

    @Column
    private int DepartmentID;

}
