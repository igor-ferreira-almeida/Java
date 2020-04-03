## Functional Interfaces

https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

## JPA

Referência: https://www.devmedia.com.br/tipos-de-heranca-no-hibernate/28641

### How to inherit properties from a base class entity using @MappedSuperclass with JPA and Hibernate

Referência: https://vladmihalcea.com/how-to-inherit-properties-from-a-base-class-entity-using-mappedsuperclass-with-jpa-and-hibernate/

```
@MappedSuperclass
public class BaseEntity {
 
    @Id
    @GeneratedValue
    private Long id;
 
    @Version
    private Integer version;
 
    //Getters and setters omitted for brevity
}
```
