# NAME

Export Acceptance

This is the service provided by Champ Cargosystems to facilitate acceptance of cargo for warehouse agents

# VERSION

Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 1.0
- Package version: 
- Build package: io.swagger.codegen.languages.AkkaScalaClientCodegen

# Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-client:1.0.0"
```

### SBT users

```scala
libraryDependencies += "io.swagger" % "swagger-client" % "1.0.0"
```

## Documentation for API Endpoints

All URIs are relative to *http://api-dev.champ.aero/acceptance/v1.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AcceptanceServiceApiApi* | [**getAirwaybillGivenAirwaybillNumber**](AcceptanceServiceApiApi.md#getAirwaybillGivenAirwaybillNumber) | **GET** /airwaybills/{airwaybillId} | Retrieve airwaybill for acceptance using airwaybill number.
*AcceptanceServiceApiApi* | [**saveAcceptance**](AcceptanceServiceApiApi.md#saveAcceptance) | **POST** /airwaybills/ | Save acceptance.


## Documentation for Models

 - [AirwaybillPart](AirwaybillPart.md)
 - [AirwaybillPost](AirwaybillPost.md)
 - [AirwaybillSplit](AirwaybillSplit.md)
 - [AirwaybillSub](AirwaybillSub.md)
 - [AirwaybillView](AirwaybillView.md)
 - [AmountUnit](AmountUnit.md)
 - [Dimension](Dimension.md)
 - [DimensionConstant](DimensionConstant.md)
 - [ErrorResponse](ErrorResponse.md)
 - [ErrorResponseGlobalErrors](ErrorResponseGlobalErrors.md)
 - [HandlingInformation](HandlingInformation.md)
 - [HouseAirwaybill](HouseAirwaybill.md)
 - [HouseAirwaybillView](HouseAirwaybillView.md)
 - [HouseairwaybillSplitSub](HouseairwaybillSplitSub.md)
 - [HouseairwaybillSub](HouseairwaybillSub.md)
 - [Itinerary](Itinerary.md)
 - [Link](Link.md)
 - [OCI](OCI.md)
 - [OciConstant](OciConstant.md)
 - [SHC](SHC.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:


# BUILDING YOUR LIBRARY

See the homepage `https://github.com/swagger-api/swagger-codegen` for full details.
But briefly, clone the git repository, build the codegen codebase, set up your build
config file, then run the API build script. You will need git, Java 7 or 8 and Apache
maven 3.0.3 or better already installed.

Your library files will be built under `WWW::MyProjectName`.

          $ git clone https://github.com/swagger-api/swagger-codegen.git
          $ cd swagger-codegen
          $ mvn package
          $ java -jar modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate \
    -i [URL or file path to JSON swagger API spec] \
    -l akka-scala \
    -c /path/to/config/file.json \
    -o /path/to/output/folder

Bang, all done. Run the `autodoc` script in the `bin` directory to see the API
you just built.

## Author

cspdevmobileteam@champcargosystems.onmicrosoft.com
