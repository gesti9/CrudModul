package kz.gesti9.crud.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name= "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "patronymic")
    private String patronymic;
    @Column(name = "gender")
    private String gender;
    @Column(name = "phone_number")
    private Integer phoneNumber;
    @Column(name = "email")
    private String email;
    @Column(name = "nation")
    private String nation;
}
