

# CSIVolumeSource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**driver** | **String** | Driver is the name of the CSI driver that handles this volume. Consult with your admin for the correct name as registered in the cluster. |  [optional]
**fsType** | **String** |  |  [optional]
**nodePublishSecretRef** | [**io.kubernetes.client.models.V1LocalObjectReference**](io.kubernetes.client.models.V1LocalObjectReference.md) |  |  [optional]
**readOnly** | **Boolean** |  |  [optional]
**volumeAttributes** | **Map&lt;String, String&gt;** |  |  [optional]



