package org.factoriaf5.films.entity;
import lombok.*;
import  javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="film")
public class Film {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String name;
        private String status;
        private  String image;
        private String origin;
        private String location;
    }

