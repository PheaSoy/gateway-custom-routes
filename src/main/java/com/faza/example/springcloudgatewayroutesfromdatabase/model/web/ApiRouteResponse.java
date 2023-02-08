package com.faza.example.springcloudgatewayroutesfromdatabase.model.web;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ApiRouteResponse {

  private Long id;
  private String service;
  private String path;
  private String method;
  private String uri;
  private Boolean enabled;
  private Long createdAt;
  private Long updatedAt;
  private Long connectTimeout;
  private Long readTimeout;
}
