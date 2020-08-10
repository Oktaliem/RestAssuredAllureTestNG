<h1 align="center"><img src="https://user-images.githubusercontent.com/26521948/72658109-63a1d400-39e7-11ea-9667-c652586b4508.png" alt="Apache JMeter logo" /></h1>
<h4 align="center">SOFTWARE TESTING ENTHUSIAST</h4>
<br>

# RestAssuredAllureTestNG

## Run Test & Generate Allure report with Maven plugin
```
$ mvn clean test -Dtest=GetEmployee
$ mvn allure:report
```

or both together
```
$ mvn clean test -Dtest=GetEmployee allure:report
```
<details>
<summary>
LOGS
</summary>
<p></p>

```maven
okta@okta:~/Documents/GitHub/RestAssuredAllureTestNG$ mvn clean test -Dtest=GetEmployee allure:report
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.google.inject.internal.cglib.core.$ReflectUtils$1 (file:/usr/share/maven/lib/guice.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int,java.security.ProtectionDomain)
WARNING: Please consider reporting this to the maintainers of com.google.inject.internal.cglib.core.$ReflectUtils$1
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
[INFO] Scanning for projects...
[WARNING] 
[WARNING] Some problems were encountered while building the effective model for com.oktaliem:RestAssuredAllureTestNG:jar:1.0-SNAPSHOT
[WARNING] 'build.plugins.plugin.version' for org.apache.maven.plugins:maven-compiler-plugin is missing. @ line 25, column 21
[WARNING] 
[WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
[WARNING] 
[WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
[WARNING] 
[INFO] 
[INFO] ----------------< com.oktaliem:RestAssuredAllureTestNG >----------------
[INFO] Building RestAssuredAllureTestNG 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[WARNING] The POM for com.sun.xml.bind:jaxb-osgi:jar:2.2.10 is invalid, transitive dependencies (if any) will not be available, enable debug logging for more details
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ RestAssuredAllureTestNG ---
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ RestAssuredAllureTestNG ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 0 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ RestAssuredAllureTestNG ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ RestAssuredAllureTestNG ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/okta/Documents/GitHub/RestAssuredAllureTestNG/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ RestAssuredAllureTestNG ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /home/okta/Documents/GitHub/RestAssuredAllureTestNG/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:3.0.0-M4:test (default-test) @ RestAssuredAllureTestNG ---
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.oktaliem.GetEmployee
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
HTTP/1.1 200 OK
Cache-Control: no-cache, private, max-age=31536000
Content-Type: application/json
Date: Mon, 10 Aug 2020 07:17:46 GMT
Display: staticcontent_sol
Expires: Tue, 10 Aug 2021 07:17:44 GMT
Host-Header: c2hhcmVkLmJsdWVob3N0LmNvbQ==
Referrer-Policy: 
Response: 200
Server: nginx/1.16.0
Vary: Accept-Encoding
Vary: Accept-Encoding,User-Agent,Origin
X-Ezoic-Cdn: Miss
X-Middleton-Display: staticcontent_sol
X-Middleton-Response: 200
X-Ratelimit-Limit: 60
X-Ratelimit-Remaining: 59
X-Sol: pub_site
Content-Length: 179

{
    "status": "success",
    "data": {
        "id": 1,
        "employee_name": "Tiger Nixon",
        "employee_salary": 320800,
        "employee_age": 61,
        "profile_image": ""
    },
    "message": "Successfully! Record has been fetched."
}
{
    "status": "success",
    "data": {
        "id": 1,
        "employee_name": "Tiger Nixon",
        "employee_salary": 320800,
        "employee_age": 61,
        "profile_image": ""
    },
    "message": "Successfully! Record has been fetched."
}
{
    "status": "success",
    "data": {
        "id": 1,
        "employee_name": "Tiger Nixon",
        "employee_salary": 320800,
        "employee_age": 61,
        "profile_image": ""
    },
    "message": "Successfully! Record has been fetched."
}
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.311 s - in com.oktaliem.GetEmployee
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- allure-maven:2.10.0:report (default-cli) @ RestAssuredAllureTestNG ---
[INFO] Allure installation directory /home/okta/Documents/GitHub/RestAssuredAllureTestNG/.allure
[INFO] Try to finding out allure 2.7.0
[INFO] Generate Allure report (report) with version 2.7.0
[INFO] Generate Allure report to /home/okta/Documents/GitHub/RestAssuredAllureTestNG/target/site/allure-maven-plugin
[INFO] Found results directory /home/okta/Documents/GitHub/RestAssuredAllureTestNG/target/allure-results
[INFO] Can't find information about categories.
[INFO] Generate report to /home/okta/Documents/GitHub/RestAssuredAllureTestNG/target/site/allure-maven-plugin
Report successfully generated to /home/okta/Documents/GitHub/RestAssuredAllureTestNG/target/site/allure-maven-plugin
[INFO] Report generated successfully.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  10.171 s
[INFO] Finished at: 2020-08-10T15:17:48+08:00
[INFO] ------------------------------------------------------------------------


```

then go and open target/site/allure-maven-plugin/index.html

## Generate Allure report without Maven plugin
Run the test by disable this plugin

```
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>${maven-surefire-plugin.version}</version>
                <configuration>
                    <suiteXmlFiles>
                        <suiteXmlFile>src/test/resources/testng.xml</suiteXmlFile>
                    </suiteXmlFiles>
                    <argLine>
                        -javaagent:"${settings.localRepository}/org/aspectj/aspectjweaver/${aspectj.version}/aspectjweaver-${aspectj.version}.jar"
                    </argLine>
                    <systemPropertyVariables>
                        <allure.results.directory>${project.build.directory}/allure-results</allure.results.directory>
                    </systemPropertyVariables>
                </configuration>
                <dependencies>
                    <dependency>
                        <groupId>org.aspectj</groupId>
                        <artifactId>aspectjweaver</artifactId>
                        <version>${aspectj.version}</version>
                    </dependency>
                </dependencies>
            </plugin>
```

```
$ mvn clean test -Dtest=GetWeather
$ allure serve
```
Then allure report will be opened automatically


Sample Report:

