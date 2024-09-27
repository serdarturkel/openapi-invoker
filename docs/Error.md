

# Error

Used when an API throws an Error, typically with a HTTP error response-code (3xx, 4xx, 5xx)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**atType** | **String** | When sub-classing, this defines the sub-class Extensible name |  |
|**atBaseType** | **String** | When sub-classing, this defines the super-class |  [optional] |
|**atSchemaLocation** | **String** | A URI to a JSON-Schema file that defines additional attributes and relationships |  [optional] |
|**code** | **String** | Application relevant detail, defined in the API or a common list. |  |
|**reason** | **String** | Explanation of the reason for the error which can be shown to a client user. |  |
|**message** | **String** | More details and corrective actions related to the error which can be shown to a client user. |  [optional] |
|**status** | **String** | HTTP Error code extension |  [optional] |
|**referenceError** | **String** | URI of documentation describing the error. |  [optional] |


## Implemented Interfaces

* Serializable


