# CONFIG

* Java 8
* Gradle 8
* Intellij Idea Community

## INFO

* Folder 'libs' for the jars to use offline

## DOX

* **Types of Configuration**:

```
- api – used to make the dependencies explicit and expose them in the classpath. For instance, when implementing a 
library to be transparent to the library consumers
- implementation – required to compile the production source code and are purely internal. They aren't exposed outside the package
- compileOnly – used when they need to be declared only at compile-time, such as source-only annotations or annotation processors. 
They don't appear in the runtime classpath or the test classpath
- compileOnlyApi – used when required at compile time and when they need to be visible in the classpath for consumers
- runtimeOnly – used to declare dependencies that are required only at runtime and aren't available at compile time
- testImplementation – required to compile tests
- testCompileOnly – required only at test compile time
- testRuntimeOnly – required only at test runtime
```