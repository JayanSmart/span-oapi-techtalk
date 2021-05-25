import connexion
import six
import json

from swagger_server.models.employee_info_schema import EmployeeInfoSchema  # noqa: E501
from swagger_server.models.input_error import InputError  # noqa: E501
from swagger_server.models.server_error import ServerError  # noqa: E501
from swagger_server import util

import swagger_server.core.tenure


def get_tenure_by_id(id):  # noqa: E501
    """get tenure by ID

    return the tenure of some given employee, when given the ID of that employee # noqa: E501

    :param id: ID of employee whose tenure is to be returned
    :type id: int

    :rtype: EmployeeInfoSchema
    """
    json_data = None
    with open("../data/employee_data.json", 'r') as file:
        json_data = json.dumps(file)

    employees = json_data['employees']

    for i in employees:
        if i.id == id:
            return EmployeeInfoSchema(id, i.name, swagger_server.core.tenure.calculate_tenure(i.start_date))

    return InputError("There are no employees using id: " + id)


def list_versions():  # noqa: E501
    """List API versions

     # noqa: E501


    :rtype: None
    """
    return 'do some magic!'


def patch_tenure(id, start_date):  # noqa: E501
    """Update the start date of an employee.

    Update the startDate value of some employee by providing their id and the new start date. # noqa: E501

    :param id: ID of employee whose tenure is to be returned
    :type id: int
    :param start_date: The date (YYYY-MM-DD) on which the employee started. If not provided, the current date will be used.
    :type start_date: str

    :rtype: EmployeeInfoSchema
    """
    return 'do some magic!'


def post_tenure(employee_name, start_date=None):  # noqa: E501
    """POST new employee information

    Upload new employee information to the server # noqa: E501

    :param employee_name: The name of the new Employee
    :type employee_name: str
    :param start_date: The date (YYYY-MM-DD) on which the employee started. If not provided, the current date will be used.
    :type start_date: str

    :rtype: EmployeeInfoSchema
    """
    start_date = util.deserialize_date(start_date)
    
    
    new_employee = swagger_server.core.tenure.add_employee(employee_name, start_date)
    
    return new_employee
