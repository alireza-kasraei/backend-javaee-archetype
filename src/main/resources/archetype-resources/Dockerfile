FROM library/websphere-liberty:8.5.5.8-webProfile7
RUN mkdir -p /opt/db2/lib
COPY /libs/db2/db2jcc4.jar /opt/db2/lib
COPY /libs/db2/db2jcc4_license_cisuz.jar /opt/db2/lib
COPY /libs/db2/db2jcc4_license_cu.jar /opt/db2/lib
COPY ${rootArtifactId}-web/src/main/wlp/server.xml /config/
COPY /docker/docker-bootstrap.properties /config/bootstrap.properties
COPY ${rootArtifactId}-web/target/${project.build.finalName}.war /config/apps/
ENV LICENSE accept