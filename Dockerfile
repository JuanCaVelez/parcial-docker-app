# Etapa 1: Construcción
FROM maven:3.9.4-eclipse-temurin-17 AS builder
WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

# Etapa 2: Imagen final
FROM eclipse-temurin:17-jdk-jammy

# Crear usuario no root
RUN useradd -ms /bin/bash appuser

WORKDIR /app

# Copiar .jar y asignar permisos al nuevo usuario
COPY --from=builder --chown=appuser:appuser /app/target/*.jar /app/app.jar

# Cambiar al usuario no root
USER appuser

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
