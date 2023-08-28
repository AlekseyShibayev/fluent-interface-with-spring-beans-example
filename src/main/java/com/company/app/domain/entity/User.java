package com.company.app.domain.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NUMBER")
    private String number;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "USER_INFO_ID")
    private UserInfo userInfo;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<UserActionLog> userActionLogs;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "USER_SUBSCRIPTIONS")
    private List<Subscription> subscriptions;

}
