${pojo.getPackageDeclaration()}

<#assign declarationName = pojo.importType(pojo.getDeclarationName())>/**

/*
 *
 * Generated ${date} by Hibernate Tools ${version}
 * FreeMarker ${.version}
 */;
import ${pojo.getQualifiedDeclarationName()};

@${pojo.importType("org.springframework.stereotype.Repository")} ("${declarationName?uncap_first}Repository.eservice2")
public interface ${declarationName}Repository extends JpaRepository<${declarationName},${clazz.identifierProperty}>{

}
