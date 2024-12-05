FROM gradle:jdk17-jammy AS builder
WORKDIR /app/grc-backend
COPY settings.gradle .
COPY build.gradle .
COPY src src
RUN gradle clean assemble

FROM amazoncorretto:17-alpine
RUN apk update && apk upgrade
WORKDIR /app
COPY --from=builder /app/grc-backend/build/libs/grc-backend.jar .
ENTRYPOINT ["java", "-Xms512m", "-Xmx1024m", "-XX:ActiveProcessorCount=4", "-jar", "grc-backend.jar"]
