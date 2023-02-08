package com.faza.example.springcloudgatewayroutesfromdatabase.model.database;

import com.faza.example.springcloudgatewayroutesfromdatabase.model.constant.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(TableName.API_ROUTE)
public class ApiRoute {

    @Id
    private Long id;
    private String service;
    private String path;
    private String method;
    private String uri;
    private Date createdAt;
    private Date updatedAt;
    private Long connectTimeout;
    private Long readTimeout;
    private Boolean enabled;

}
