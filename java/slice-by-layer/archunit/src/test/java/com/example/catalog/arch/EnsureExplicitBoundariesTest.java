package com.example.catalog.arch;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.syntax.elements.ClassesShouldConjunction;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;
import static com.tngtech.archunit.library.Architectures.layeredArchitecture;
import static com.tngtech.archunit.library.Architectures.onionArchitecture;

@AnalyzeClasses(packages = "com.example.catalog")
public class EnsureExplicitBoundariesTest {
    @Test
    public void ensureDependenciesFlowUnidirectional() {
        JavaClasses catalogClasses = new ClassFileImporter().importPackages("com.example.catalog");

        ArchRule layers = layeredArchitecture()
            .layer("Core").definedBy("com.example.catalog.core")
            .layer("Adapter").definedBy("com.example.catalog.adapter")
            .layer("Delivery").definedBy("com.example.catalog.delivery")

            .whereLayer("Core").mayOnlyBeAccessedByLayers("Adapter", "Delivery")
            .whereLayer("Adapter").mayOnlyBeAccessedByLayers("Delivery")
            .whereLayer("Delivery").mayNotBeAccessedByAnyLayer();

        layers.check(catalogClasses);
    }
}
