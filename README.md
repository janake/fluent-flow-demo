# fluent-flow-demo

Spring Boot (Maven) demo project: Fluent Flow that delegates each step to other Spring services.

Uses Lombok for constructor injection and boilerplate reduction (enable annotation processing in IntelliJ if needed).

## Run
- IntelliJ: run `FluentFlowDemoApplication`
- CLI: `mvn spring-boot:run`

## Try
POST http://localhost:8080/api/orders
Content-Type: application/json

{
  "userId": 1,
  "productId": 10,
  "quantity": 2
}
