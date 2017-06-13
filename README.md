# jee7demo
A project aiming to prototype some simple JEE 7 based applications.

## rest-api
A web application that exposes CRUD operations of a sample entity with a REST API. This means to demonstrate JPA, JAX-RS, JAXB interactions. JSON-B reference implementation (not included with JEE 7) is used to simplify entity <-> JSON conversions. The goal is to write zero boilerplate code and have everything handled by the framework. The developer should not need to be aware of the intricacies of entity DB persistence or JSON serialization.
