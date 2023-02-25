# Microservice Outdoor API Project

This is a project consisting of three microservices built with Spring Boot for managing orders, inventory, and products related to an outdoor activity store.

## Services

### Service Order

This microservice handles the management of orders placed by customers. It allows customers to place new orders, modify existing orders, and view the status of their orders.

The API endpoints provided by this service are:

- `POST /orders`: Place a new order
- `GET /orders/{orderId}`: Get details of a specific order
- `PUT /orders/{orderId}`: Update the status of an order
- `GET /orders`: Get a list of all orders

### Service Inventory

This microservice handles the management of inventory for the store. It allows the store to add new products to inventory, update existing products, and view the current stock of each product.

The API endpoints provided by this service are:

- `POST /inventory`: Add a new product to inventory
- `GET /inventory/{productId}`: Get details of a specific product
- `PUT /inventory/{productId}`: Update the details of a product
- `GET /inventory`: Get a list of all products in inventory

### Service Product

This microservice handles the management of products available in the store. It allows the store to add new products to their catalog, update existing products, and view the details of each product.

The API endpoints provided by this service are:

- `POST /products`: Add a new product to the catalog
- `GET /products/{productId}`: Get details of a specific product
- `PUT /products/{productId}`: Update the details of a product
- `GET /products`: Get a list of all products in the catalog

## Getting Started

To get started with this project, you will need to clone this repository and run each of the microservices separately. Each microservice is contained in its own directory with its own `pom.xml` file for managing dependencies.

You will also need to set up a database for each microservice. The database configuration can be found in the `application.properties` file for each microservice.

## Dependencies

This project is built with Spring Boot and uses the following dependencies:

- Spring Web
- Spring Data JPA
- H2 Database (for testing)
- MySQL (for production)

## Contributing

Contributions to this project are welcome. If you find a bug or would like to suggest a new feature, please create an issue on the project's GitHub repository.

## License

This project is licensed under the MIT License. See the `LICENSE` file for more information.
