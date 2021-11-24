package com.link.core.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "FIS_DTLS")
public class FIS_DTLS {

  @Id
  @Column(name = "FIS_ID")
  private Long fisId;

  @Column(name = "FIS_NAME")
  private String fisName;

  @Column(name = "EXTERNAL_REF_ID")
  private String externalRefId;

  @Column(name = "EXTERNAL_REF_TYPE")
  private String externalRefType;

  @Column(name = "OAUTH_ENABLED")
  private boolean oauthEnabled;

  @Column(name = "PROVIDER")
  private String provider;

  @Column(name = "LOGO_URL")
  private String logoUrl;

  @Column(name = "STATUS")
  private String status;

  @Column(name = "PRIORITY")
  private int priority;

  @Column(name = "CREATION_DATE")
  private String creationDate;

  @Column(name = "LAST_MODIFIED_DATE")
  private String lastModifiedDate;
}
