package com.company.app.domain.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
@Entity
@Table(name = "USER_ACTION_LOG")
public class UserActionLog {

    @Id
    @GeneratedValue
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "USER_ID", nullable = false)
    private User user;

    @Column(name = "SOURCE")
    private String source;

    @Column(name = "TARGET")
    private String target;

    @Column(name = "MESSAGE")
    private String message;

    @Column(name = "DATE")
    private Date date;

}