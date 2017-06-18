# jee7demo
A project aiming to prototype some simple JEE 7 based applications. Runtime is Java8. JSON-B reference implementation (not included with JEE 7) is used.

## domain
Domain entities and data access objects. Tests conversion of db <-> java <-> json. Minimal boilerplate, just the entity declaration and a generic DAO implementation  that does the heavy lifting. A couple converters to get JPA in line with Java8 date APIs are included.

## rest-api
Exposes restful resources for performing read / write operations on domain entities. Implementation leverages domain EJBs.

## jsf-ui
Some JSF UI on top of the domain EJBs. Will test some primefaces components.



