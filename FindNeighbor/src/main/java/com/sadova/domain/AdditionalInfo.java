package com.sadova.domain;

import lombok.*;

import javax.persistence.*;
@Data
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "additional_info")
public class AdditionalInfo {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "age")
    private int age;
    @Column(name = "bad_habits")
    private boolean badHabits;
    @Column(name = "kind_of_activity")
    private boolean kindOfActivity;
    @Column(name = "marital_status")
    private boolean maritalStatus;
    @Column(name = "more_about_yourself", length = 250)
    private String moreAboutYourself;
    @Column(name = "number_of_neighbor")
    private int numberOfNeighbor;
    @Column(name = "participating")
    private boolean participating;
    @Column(name = "pets")
    private boolean pets;
    @Column(name = "sex")
    private boolean sex;
    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
