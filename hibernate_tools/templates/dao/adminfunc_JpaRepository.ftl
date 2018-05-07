${pojo.getPackageDeclaration()?replace("domain","repository")}

<#assign declarationName = pojo.importType(pojo.getDeclarationName())>
<#assign pkFqcn = pojo.getJavaTypeName(clazz.identifierProperty, true) />
/*
 *
 * Generated ${date} by Hibernate Tools ${version}
 * FreeMarker ${.version}
 */;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ${pojo.getQualifiedDeclarationName()};

@${pojo.importType("org.springframework.stereotype.Repository")} ("${declarationName?uncap_first}Repository.eservice2")
public interface ${declarationName}Repository extends JpaRepository<${declarationName},${pkFqcn}>{
}
