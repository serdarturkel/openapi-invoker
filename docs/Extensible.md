

# Extensible

Base Extensible schema for use in TMForum Open-APIs - When used for in a schema it means that the Entity described by the schema  MUST be extended with the @type

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**atType** | **String** | When sub-classing, this defines the sub-class Extensible name |  |
|**atBaseType** | **String** | When sub-classing, this defines the super-class |  [optional] |
|**atSchemaLocation** | **String** | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional] |


## Implemented Interfaces

* Serializable


