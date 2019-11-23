package com.lbosoft.letsplaysoccer.registration;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * registration of users to a football Match1Ssjjjj
 */
@Getter
@Setter
@Entity
@Table(name = "REGISTRATION")
@AssociationOverrides({
        @AssociationOverride(name = "pk.match", joinColumns = @JoinColumn(name = "MATCH_ID")),
        @AssociationOverride(name = "pk.user", joinColumns = @JoinColumn(name = "USER_ID"))
})
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    private Long matchId;
    private Long userId;
    private Integer nbFriends;
    private Integer order;
}
