FROM alpine
RUN apk upgrade
RUN apk update && apk add --no-cache openjdk17-jdk bash coreutils

RUN adduser -D appuser

RUN chmod o-rx /root /home /media /mnt /opt /srv /var /sbin /run || true

RUN mkdir -p /app

USER appuser

WORKDIR /app

COPY ../demo3/target/demo-0.0.1-SNAPSHOT.jar /app/demo.jar

EXPOSE 8080

CMD ["java", "-jar", "/app/demo.jar"]
