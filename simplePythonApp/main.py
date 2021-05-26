from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# I added these two lines
configuration = swagger_client.Configuration()
configuration.host = 'http://127.0.0.1:8080/v1'

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
id = 1 # int | ID of employee whose tenure is to be returned

try:
    # get tenure by ID
    api_response = api_instance.get_tenure_by_id(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->get_tenure_by_id: %s\n" % e)

# create an instance of the API class
api_instance = swagger_client.DefaultApi(swagger_client.ApiClient(configuration))
id = 1 # int | ID of employee whose tenure is to be returned
start_date = '2000-12-25' # str | The date (YYYY-MM-DD) on which the employee started. If not provided, the current date will be used.

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