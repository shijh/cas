---
layout: default
title: CAS - Monitoring
---

# CAS Spring Boot Administration

CAS takes advantage of the [Spring Boot Admin](https://github.com/codecentric/spring-boot-admin) to manage and monitor its internal state visually. As a Spring Boot Admin client, CAS registers itself with the Spring Boot Admin server over HTTP and reports back its status and health to the server's web interface.

## Admin Server

To run the Eureka discovery server, please use [this WAR overlay](https://github.com/apereo/cas-bootadmin-overlay).

Note that the admin server's API endpoints MUST be secured. To learn more about options, please [see this guide](http://codecentric.github.io/spring-boot-admin/1.5.0/#securing-spring-boot-admin).

Here is a sample screenshot of the CAS server reporting status to the Admin server:

![image](https://cloud.githubusercontent.com/assets/1205228/25130035/eba2e902-2455-11e7-809f-8d71105bd6d8.png)

## CAS Server as Client

Each individual CAS server is given the ability to auto-register itself with the admin server, provided configuration is made available to instruct the CAS server how to locate and connect to the discover server service.

Support is added by including the following dependency in the WAR overlay:

```xml
<dependency>
    <groupId>org.apereo.cas</groupId>
    <artifactId>cas-server-support-bootadmin-client</artifactId>
    <version>${cas.version}</version>
</dependency>
```

Note that CAS server's actuator endpoints are by default secured. In order to allow secure communication between the CAS server and the Spring Boot Admin server, [please see guide](http://codecentric.github.io/spring-boot-admin/1.5.0/#_securing_client_actuator_endpoints).

## Configuration

To see the relevant list of CAS properties, please [review this guide](Configuration-Properties.html#ldap-connection-pool).