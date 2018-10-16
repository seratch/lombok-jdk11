package example;

import lombok.*;

// ./gradlew test
// 
// Execution failed for task ':test'.
// > failed to read class file /path/to/lombok-jdk11/build/classes/java/test/example/Sample.class
//
// The failure doesn't happen when you place the class under src/main/java

//@Builder(toBuilder = true)
@Builder
public class Sample {
    private Integer id;
    private String name;
}
