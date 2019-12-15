package com.sadova.domain;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "country", nullable = false)
    private String country;
    @Column(name = "city", nullable = false)
    private String city;
    @Column(name = "area")
    private String area;
    @OneToOne(mappedBy = "address")
    private User user;
//    @OneToOne
//    @JoinColumn(name = "user_id", referencedColumnName = "id")
//    private User user;


}
