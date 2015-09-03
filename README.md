#[![Build Status](https://drone.io/github.com/clairton/localdate-jpa-converter/status.png)](https://drone.io/github.com/clairton/localdate-jpa-converter/latest)
JPA 2.1 converte for javatime

Register in persistence.xml

```xml
<persistence>
	<persistence-unit>
		<class>br.eti.clairton.converter.LocalDateConverter</class>
	</persistence-unit>
</persistence>
```

```	
	Download através do maven, dependência:
```xml
<dependeny>
	<groupId>br.eti.clairton</groupId>
	<artifactId>localdate-jpa-converter</artifactId>
	<version>0.1.0</version>
</dependency>
```
	E adicionar o repositório
```xml
<repository>
	<id>mvn-repo-releases</id>
	<url>https://raw.github.com/clairton/mvn-repo/releases</url>
</repository>
```

