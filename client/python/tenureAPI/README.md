# swagger-client
This is a simple API which is used to as a demo for using OpenAPI to define specifications.

This Python package is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 0.0.1
- Package version: 1.0.0
- Build package: io.swagger.codegen.v3.generators.python.PythonClientCodegen
For more information, please visit [https://github.com/JayanSmart/span-oapi-techtalk](https://github.com/JayanSmart/span-oapi-techtalk)

## Requirements.

Python 2.7 and 3.4+

## Installation & Usage
### pip install

If the python package is hosted on Github, you can install directly from Github

```sh
pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git
```
(you may need to run `pip` with root permission: `sudo pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git`)

Then import the package:
```python
import swagger_client 
```

### Setuptools

Install via [Setuptools](http://pypi.python.org/pypi/setuptools).

```sh
python setup.py install --user
```
(or `sudo python setup.py install` to install the package for all users)

Then import the package:
```python
import swagger_client
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
id = 56 # int | ID of employee whose tenure is to be returned

try:
    # get tenure by ID
    api_response = api_instance.get_tenure_by_id(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->get_tenure_by_id: %s\n" % e)

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))

try:
    # List API versions
    api_instance.list_versions()
except ApiException as e:
    print("Exception when calling DefaultApi->list_versions: %s\n" % e)

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
id = 56 # int | ID of employee whose tenure is to be returned
start_date = 'start_date_example' # str | The date (YYYY-MM-DD) on which the employee started. If not provided, the current date will be used.

try:
    # Update the start date of an employee.
    api_response = api_instance.patch_tenure(id, start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->patch_tenure: %s\n" % e)

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
employee_name = 'employee_name_example' # str | The name of the new Employee
start_date = '2013-10-20' # date | The date (YYYY-MM-DD) on which the employee started. If not provided, the current date will be used. (optional)

try:
    # POST new employee information
    api_response = api_instance.post_tenure(employee_name, start_date=start_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->post_tenure: %s\n" % e)
```

## Documentation for API Endpoints

All URIs are relative to *https://api.server.test/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**get_tenure_by_id**](docs/DefaultApi.md#get_tenure_by_id) | **GET** /tenure | get tenure by ID
*DefaultApi* | [**list_versions**](docs/DefaultApi.md#list_versions) | **GET** / | List API versions
*DefaultApi* | [**patch_tenure**](docs/DefaultApi.md#patch_tenure) | **PATCH** /tenure | Update the start date of an employee.
*DefaultApi* | [**post_tenure**](docs/DefaultApi.md#post_tenure) | **POST** /tenure | POST new employee information

## Documentation For Models

 - [EmployeeInfoSchema](docs/EmployeeInfoSchema.md)
 - [InputError](docs/InputError.md)
 - [ServerError](docs/ServerError.md)

## Documentation For Authorization

 All endpoints do not require authorization.


## Author

jayan.smart@spandigital.com