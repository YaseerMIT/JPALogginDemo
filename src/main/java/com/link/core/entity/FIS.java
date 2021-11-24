package com.link.core.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FIS {
    @Id
    private Long id;
    private String name;
    private String url;
    private String iconUrl;
    private boolean oAuthEnabled;
}
