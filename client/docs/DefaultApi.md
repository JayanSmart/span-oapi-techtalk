# swagger_client.DefaultApi

All URIs are relative to *https://api.server.test/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_tenure_by_id**](DefaultApi.md#get_tenure_by_id) | **GET** /tenure/{id} | get tenure by ID
[**patch_tenure**](DefaultApi.md#patch_tenure) | **PATCH** /tenure | Update the start date of an employee.
[**post_tenure**](DefaultApi.md#post_tenure) | **POST** /tenure | POST new employee information

# **get_tenure_by_id**
> EmployeeInfoSchema get_tenure_by_id(id)

get tenure by ID

return the tenure of some given employee, when given the ID of that employee

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.DefaultApi()
id = 56 # int | ID of employee whose tenure is to be returned

try:
    # get tenure by ID
    api_response = api_instance.get_tenure_by_id(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->get_tenure_by_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| ID of employee whose tenure is to be returned | 

### Return type

[**EmployeeInfoSchema**](EmployeeInfoSchema.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch_tenure**
> EmployeeInfoSchema patch_tenure(id, start_date)

Update the start date of an employee.

Update the startDate value of some employee by providing their id and the new start date.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.DefaultApi()
id = 56 # int | ID of employee whose tenure is to be returned
start_date = 'start_date_example' # str | The date (YYYY-MM-DD) on which the employee started. If not provided, the current date will be used.

try:
    # Update the start date of an employee.
    api_response = api_instance.patch_tenure(id, start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->patch_tenure: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| ID of employee whose tenure is to be returned | 
 **start_date** | **str**| The date (YYYY-MM-DD) on which the employee started. If not provided, the current date will be used. | 

### Return type

[**EmployeeInfoSchema**](EmployeeInfoSchema.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_tenure**
> EmployeeInfoSchema post_tenure(employee_name, start_date=start_date)

POST new employee information

Upload new employee information to the server

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.DefaultApi()
employee_name = 'employee_name_example' # str | The name of the new Employee
start_date = '2013-10-20' # date | The date (YYYY-MM-DD) on which the employee started. If not provided, the current date will be used. (optional)

try:
    # POST new employee information
    api_response = api_instance.post_tenure(employee_name, start_date=start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->post_tenure: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **employee_name** | **str**| The name of the new Employee | 
 **start_date** | **date**| The date (YYYY-MM-DD) on which the employee started. If not provided, the current date will be used. | [optional] 

### Return type

[**EmployeeInfoSchema**](EmployeeInfoSchema.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

