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

    @Column(name = "SUBSCRIPTION_TYPE")
    private String type;

    @Column(name = "ACTION")
    private String action;

    @Column(name = "DATE")
    private Date date;

}